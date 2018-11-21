module.exports = (arrayOfProducts) => {
    // Creating an object with skus as keys and the products occurrences as values
    let productOccurrences = skusOccObj(arrayOfProducts);    
    // Creating set of single products bought
    let productsBoughtSet = new Set(arrayOfProducts);    
    // Calculating final total price by mapping each product and calculating its individual price
    // including those with discounts, before adding them up in the final reduce function  
    // We can use two different methods: priceTot1 and priceTot2  
    let totalPrice = priceTot1(productsBoughtSet, productOccurrences);    
    return totalPrice;
};

const skusOccObj = (prArr) => {
    return prArr.reduce( (allOcc, currOcc) => {
        if (typeof allOcc[currOcc.sku] === 'undefined') {
            allOcc[currOcc.sku] = 1;
        } 
        else {
            allOcc[currOcc.sku] += 1;
        }
        return allOcc;
    }, {});
};

const priceTot1 = (prSet, prOcc) => {
    return [...prSet]
    .map(pr => {
        let occ = prOcc[pr.sku];
        if (pr.onOffer) {
            let offersQuantity = Math.floor(occ/pr.offerQuantity);
            let singleDiscount = (pr.unitPrice*pr.offerQuantity)-pr.offerPrice;            
            let totalProductPrice = (pr.unitPrice*occ) - (singleDiscount*offersQuantity);
            return totalProductPrice;
        }
        else {
            return occ*pr.unitPrice;
        }   
    })
    .reduce((a, b) => a + b);   
};

const priceTot2 = (prSet, prOcc) => {
    return [...prSet]
    .map(pr => {
        let occ = prOcc[pr.sku];
        if (pr.onOffer) {
            let offersQuantity = Math.floor(occ/pr.offerQuantity);
            let remainQuantity = occ % pr.offerQuantity;
            let totalProductPrice = ((pr.offerPrice * offersQuantity) + (pr.unitPrice * remainQuantity));
            return totalProductPrice;
        }
        else {
            return occ*pr.unitPrice;
        }   
    })
    .reduce((a, b) => a + b);   
};