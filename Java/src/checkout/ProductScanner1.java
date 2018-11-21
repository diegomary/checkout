/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Diego
 */
public class ProductScanner1 {
    
    public double totalPrice;
    private final List<Product> flowOfProductsInSession; 
    // Here for semplicity I am dependency injecting a simple list but in a real environment we can inject a product repo of purchases
    public ProductScanner1( List<Product> FlowOfProductsInSession ){ flowOfProductsInSession = FlowOfProductsInSession; };
    
    public double GrandTotal(){        
        List<String> productOccurrences = new ArrayList<String>();        
        Set<String> uniqueSkus = new HashSet<>();        
        flowOfProductsInSession.forEach(pr -> {
            uniqueSkus.add(pr.getSku());
            productOccurrences.add(pr.getSku());
        });
       
        uniqueSkus.forEach((usku) -> {
            int singleProductOccurrency = Collections.frequency(productOccurrences, usku);     
            Product candidateProduct = flowOfProductsInSession.stream().filter(pr -> usku.equals(pr.getSku())).findAny().orElse(null);
            if(candidateProduct.getIsOnOffer()) {
                
                int offerQuantity = candidateProduct.getQuantityOnOffer();                
                int totalOfferQuantities = Math.round(singleProductOccurrency/offerQuantity);                
                int rem = singleProductOccurrency % offerQuantity;                
                this.totalPrice += ((candidateProduct.getOfferPrice() * totalOfferQuantities) + (candidateProduct.getUnitPrice() * rem));
            }
            else {
                double productPrice = candidateProduct.getUnitPrice(); 
                double totalPriceForProduct = productPrice * singleProductOccurrency;
                this.totalPrice += totalPriceForProduct;
            }
        });
        
       return this.totalPrice;  
    }
    
}

