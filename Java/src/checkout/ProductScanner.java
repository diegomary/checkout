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
public class ProductScanner {
    
    public double totalPrice;
    private List<Product> flowOfProductsInSession;    
    public ProductScanner( List<Product> FlowOfProductsInSession ){ flowOfProductsInSession = FlowOfProductsInSession; };
    
    public double GrandTotal(){        
        List<String> productOccurrences = new ArrayList<String>();        
        Set<String> uniqueSkus = new HashSet<>();        
        flowOfProductsInSession.forEach(pr ->  {
            uniqueSkus.add(pr.getSku());
            productOccurrences.add(pr.getSku());
        });
       
        for(String usku :uniqueSkus) {
            
            int singleProductOccurrency = Collections.frequency(productOccurrences, usku);  //3         
            Product candidateProduct = flowOfProductsInSession.stream().filter(pr -> usku.equals(pr.getSku())).findAny().orElse(null);
            if(candidateProduct.getIsOnOffer()) {
                
                int offerQuantity = candidateProduct.getQuantityOnOffer();
                double offerPrice = candidateProduct.getOfferPrice();
                double productPrice = candidateProduct.getUnitPrice();
                int totalOfferQuantities = Math.round(singleProductOccurrency/offerQuantity);  
                double discountForSingleOffer = ( productPrice * offerQuantity ) - offerPrice;
                double discountForTotal = discountForSingleOffer * totalOfferQuantities;
                totalPrice += (singleProductOccurrency * productPrice) - discountForTotal;             
                
            }
            else {
                double productPrice = candidateProduct.getUnitPrice(); 
                double totalPriceForProduct = productPrice * singleProductOccurrency;
                totalPrice += totalPriceForProduct;
            }
        
        }
        
       return this.totalPrice;  
    }
    
}
