package checkout;
/**
 *
 * @author Diego
 */
public class Checkout {   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductScanner scanner = new ProductScanner(TestPurchase1.Purchase());
        System.out.println(scanner.GrandTotal());
        
    }
}