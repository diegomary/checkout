/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD;

import checkout.Product;
import checkout.Product;
import java.util.ArrayList;
import java.util.List;
import repository.ProductRepository;

/**
 *
 * @author Diego
 */
public class TestPurchase3 {
    
    public TestPurchase3(){}    
    public static ArrayList<Product> Purchase() {
        
        ArrayList<Product> FlowOfProductsInSession = new ArrayList<Product>();        
        FlowOfProductsInSession.add(ProductRepository.ProducsAvailable().get(3)); // SKU D First purchase  SCANNED
        FlowOfProductsInSession.add(ProductRepository.ProducsAvailable().get(3)); // SKU D Second purchase    "  
        FlowOfProductsInSession.add(ProductRepository.ProducsAvailable().get(3)); // SKU D  Third purchase    "  
        FlowOfProductsInSession.add(ProductRepository.ProducsAvailable().get(3)); // SKU D Fourth purchase    "  
        FlowOfProductsInSession.add(ProductRepository.ProducsAvailable().get(3)); // SKU D Fifth purchase     "  
        FlowOfProductsInSession.add(ProductRepository.ProducsAvailable().get(3)); // SKU D Sixth purchase     "  
        FlowOfProductsInSession.add(ProductRepository.ProducsAvailable().get(3)); // SKU D Seventh purchase   "  
        FlowOfProductsInSession.add(ProductRepository.ProducsAvailable().get(3)); // SKU D Heighth purchase   " 
        
        return FlowOfProductsInSession;
    }    
}

