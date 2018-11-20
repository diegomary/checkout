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
public class Checkout {   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Phase 1 Product acquisition
        Product prA = new Product("A", 0.5 ,new SpecialOffer("A",true,3, 1.30));        
        Product prB = new Product("B",0.30,new SpecialOffer("B",true,2,0.45));  
        Product prC = new Product("C",2.0,new SpecialOffer("C",false,1,2.0));  
        Product prD = new Product("D",0.75,new SpecialOffer("D",false,1,0.75));
        //Phase 2 Initialization of purchase session
        List<Product> FlowOfProductsInSession = new ArrayList<Product>();
        // Phase 3 Starting Purchase        
        FlowOfProductsInSession.add(prA);
        FlowOfProductsInSession.add(prD);
        FlowOfProductsInSession.add(prC);
        FlowOfProductsInSession.add(prB);        
        FlowOfProductsInSession.add(prA);
        FlowOfProductsInSession.add(prA);
        FlowOfProductsInSession.add(prA);
        FlowOfProductsInSession.add(prB);
        // Phase 4 Checkout
        // Phase 4A Initialization of SKUs for purchase session and list of products bought       
        List<String> productOccurrencies = new ArrayList<String>();        
        Set<String> uniqueSkus = new HashSet<>();        
        FlowOfProductsInSession.forEach(pr ->  {
            uniqueSkus.add(pr.getSku());
            productOccurrencies.add(pr.getSku());
        });
        // Phase 4B Declaring grand total variable
        double totalPrice = 0;
 
        // Phase 4C calculating sum of each product and adding it to the grand total
        for(String usku :uniqueSkus) {
            
            int singleProductOccurrency = Collections.frequency(productOccurrencies, usku);  //3         
            Product candidateProduct = FlowOfProductsInSession.stream().filter(pr -> usku.equals(pr.getSku())).findAny().orElse(null);
            if(candidateProduct.getOffer().getIsOnOffer()) {
                
                int offerQuantity = candidateProduct.getOffer().getQuantityOnOffer();
                double offerPrice = candidateProduct.getOffer().getOfferPrice();
                double productPrice = candidateProduct.getUnitPrice();
                int totalOfferQuantities = Math.round(singleProductOccurrency/offerQuantity);  
                double discountForSingleOffer = ( productPrice * offerQuantity ) - offerPrice;
                double discountForTotal = discountForSingleOffer * totalOfferQuantities;
                double totalPriceForProduct = (singleProductOccurrency * productPrice) - discountForTotal;
                totalPrice += totalPriceForProduct;
                
            }
            else {
                double productPrice = candidateProduct.getUnitPrice(); 
                double totalPriceForProduct = productPrice * singleProductOccurrency;
                totalPrice += totalPriceForProduct;
            }
        
        }
        
        System.out.println(totalPrice);
     
    }
    
}