package checkout;

import TDD.TestPurchase1;
import TDD.TestPurchase2;
import TDD.TestPurchase3;
/**
 *
 * @author Diego
 */
public class Checkout {   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Should return a Grand Total of 5.0
        ProductScanner scanner = new ProductScanner(TestPurchase1.Purchase());
        System.out.println("Test 1 Grand Total : " + scanner.GrandTotal()); 
        
        //Should return a Grand Total of 2.5
        scanner = new ProductScanner(TestPurchase2.Purchase());
        System.out.println("Test 2 Grand Total : "+ scanner.GrandTotal());  
        
        //Should return a Grand Total of 6.0
        scanner = new ProductScanner(TestPurchase3.Purchase());
        System.out.println("Test 2 Grand Total : "+ scanner.GrandTotal()); 
        
    }
}