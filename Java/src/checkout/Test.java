package checkout;
import TestPurchases.TestPurchase1;
import TestPurchases.TestPurchase2;
import TestPurchases.TestPurchase3;
import TestPurchases.TestPurchase4;
import TestPurchases.TestPurchase5;
/**
 *
 * @author Diego
 */
public class Test {   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Solution 1: TEST CASES");
        
        //Should return a Grand Total of 5.0 USing Solution 1
        ProductScanner scanner = new ProductScanner(TestPurchase1.Purchase());
        System.out.println("Solution 1: Test 1 Grand Total : " + scanner.GrandTotal()); 
        
        //Should return a Grand Total of 2.5
        scanner = new ProductScanner(TestPurchase2.Purchase());
        System.out.println("Solution 1: Test 2 Grand Total : "+ scanner.GrandTotal());  
        
        //Should return a Grand Total of 6.0
        scanner = new ProductScanner(TestPurchase3.Purchase());
        System.out.println("Solution 1: Test 2 Grand Total : "+ scanner.GrandTotal());        
        
        //Should return a Grand Total of 5.3
        scanner = new ProductScanner(TestPurchase4.Purchase());
        System.out.println("Solution 1: Test 2 Grand Total : "+ scanner.GrandTotal());
        
         //Should return a Grand Total of 8.0
        scanner = new ProductScanner(TestPurchase5.Purchase());
        System.out.println("Solution 1: Test 5 Grand Total : "+ scanner.GrandTotal());
        
        
        System.out.println("Solution 2: TEST CASES");
        
        //Should return a Grand Total of 5.0 USing Solution 1
        ProductScanner1 scanner1 = new ProductScanner1(TestPurchase1.Purchase());
        System.out.println("Solution 1: Test 1 Grand Total : " + scanner1.GrandTotal()); 
        
        //Should return a Grand Total of 2.5
        scanner1 = new ProductScanner1(TestPurchase2.Purchase());
        System.out.println("Solution 1: Test 2 Grand Total : "+ scanner1.GrandTotal());  
        
        //Should return a Grand Total of 6.0
        scanner1 = new ProductScanner1(TestPurchase3.Purchase());
        System.out.println("Solution 1: Test 3 Grand Total : "+ scanner1.GrandTotal());        
        
        //Should return a Grand Total of 5.3
        scanner1 = new ProductScanner1(TestPurchase4.Purchase());
        System.out.println("Solution 1: Test 4 Grand Total : "+ scanner1.GrandTotal());
        
        //Should return a Grand Total of 8.0
        scanner1 = new ProductScanner1(TestPurchase5.Purchase());
        System.out.println("Solution 1: Test 5 Grand Total : "+ scanner1.GrandTotal());
        
    }
}