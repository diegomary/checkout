// Creating product object with object composition to make it easily extensible
module.exports = (sku, unitPrice, onOffer, offerPrice, offerQuantity) => {
    let productInfo = {  
        sku,
        unitPrice,
        onOffer,
        offerPrice,
        offerQuantity
    }     
    return Object.assign({}, productInfo);
};