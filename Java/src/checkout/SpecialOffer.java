/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkout;

import java.math.BigDecimal;

/**
 *
 * @author Diego
 */
public class SpecialOffer {
    
    private final String  sku;
    private  boolean  isOnOffer;
    private int quantityOnOffer;
    private double offerPrice;
    
    public SpecialOffer(String _sku, boolean _isOnOffer, int  _quantityOnOffer , double _offerPrice){
        this.sku = _sku;
        this.isOnOffer = _isOnOffer;
        this.quantityOnOffer = _quantityOnOffer;
        this.offerPrice = _offerPrice;
    } 
    
    public String getSku() {
        return this.sku;
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