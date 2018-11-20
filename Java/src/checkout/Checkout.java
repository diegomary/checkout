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
        Product prA = new Product("A", 0.5 ,true, 3, 1.30);        
        Product prB = new Product("B",0.30,true,2,0.45);  
        Product prC = new Product("C",2.0,false,1,2.0);  
        Product prD = new Product("D",0.75,false,1,0.75);
        
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
        
        ProductScanner scanner = new ProductScanner(FlowOfProductsInSession);
        System.out.println(scanner.GrandTotal());
}
}