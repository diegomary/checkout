package checkout;
import java.math.BigDecimal;
/**
 *
 * @author Diego
 */
public class Product {
    
    private final   String  sku;
    private  double unitPrice;
    private  SpecialOffer  offer;
    
    
    public Product(String _sku, double  _unitPrice , SpecialOffer _offer){
        this.sku = _sku;
        this.unitPrice = _unitPrice;
        this.offer =  _offer;
    }         
     
    public String getSku() {
        return this.sku;
    }   
    
    public double getUnitPrice() {
        return this.unitPrice;
    }   
    
    public SpecialOffer getOffer() {
        return this.offer;
    }   
    
}










