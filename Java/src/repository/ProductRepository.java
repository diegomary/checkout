/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import checkout.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ProductRepository {
    
    public static ArrayList<Product> ProducsAvailable(){
        
        Product prA = new Product("A", 0.5 ,true, 3, 1.30);        
        Product prB = new Product("B",0.30,true,2,0.45);  
        Product prC = new Product("C",2.0,false,1,2.0);  
        Product prD = new Product("D",0.75,false,1,0.75);
        ArrayList<Product> prc = new ArrayList<Product>();
        prc.add(prA);
        prc.add(prB);
        prc.add(prC);
        prc.add(prD);
        return prc;
}
    
}
