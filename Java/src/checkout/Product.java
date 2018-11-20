package checkout;
import java.math.BigDecimal;
/**
 *
 * @author Diego
 */
public class Product {
    
    private String  sku;
    private double unitPrice;   
    private boolean  isOnOffer;
    private int quantityOnOffer;
    private double offerPrice;  
   
    
    public Product(String _sku, double  _unitPrice , boolean _isOnOffer, int  _quantityOnOffer , double _offerPrice){
        this.sku = _sku;
        this.unitPrice = _unitPrice;       
        this.isOnOffer = _isOnOffer;
        this.quantityOnOffer = _quantityOnOffer;
        this.offerPrice = _offerPrice;
    }         
     
    public String getSku() {
        return this.sku;
    }   
    
    public double getUnitPrice() {
        return this.unitPrice;
    }
    
    public boolean getIsOnOffer() {
        return this.isOnOffer;
    }   
    
    public int getQuantityOnOffer() {
        return this.quantityOnOffer;
    } 
    
     public double getOfferPrice() {
        return this.offerPrice;
    } 
    
    
}










