const productsArray = require('./productsRepository');
module.exports = (flowOfPurchase) => {

    let productOccurrences = skusOccObj(flowOfPurchase);  
    let productsBoughtSet = objSet(flowOfPurchase,'sku');   
    let totalPrice1 = priceTot1(productsBoughtSet, productOccurrences);
    let totalPrice2 = priceTot2(productsBoughtSet, productOccurrences);
    return {method1:totalPrice1,method2:totalPrice2};
};

const skusOccObj = (prArr) => {
    return prArr.reduce((allOcc, currOcc) => {
        if (typeof allOcc[currOcc.sku] === 'undefined') allOcc[currOcc.sku] = 1;         
        else allOcc[currOcc.sku] += 1;       
        return allOcc;
    }, {});
};

const objSet = (prArr,prop) => {
    const workOnce = prArr.map( mapObj => mapObj[prop] );
    return prArr.filter((obj, pos, arr) => workOnce.indexOf(obj[prop]) === pos)
};

const priceTot1 = (prSet, prOcc) => {
    return prSet
    .map(pr => {
        let occ = prOcc[pr.sku];
        if (pr.onOffer) {
            let offersQuantity = Math.floor(occ/pr.offerQuantity);
            let singleDiscount = (pr.unitPrice*pr.offerQuantity)-pr.offerPrice;            
            let totalProductPrice = (pr.unitPrice*occ)-(singleDiscount*offersQuantity);
            return totalProductPrice;
        }       
        return occ*pr.unitPrice;         
    })
    .reduce((totalPrice, currentProductPrice) => totalPrice + currentProductPrice);   
};

const priceTot2 = (prSet, prOcc) => {
    return prSet
    .map(pr => {
        let occ = prOcc[pr.sku];
        if (pr.onOffer) {
            let offersQuantity = Math.floor(occ/pr.offerQuantity);
            let remainQuantity = occ % pr.offerQuantity;
            let totalProductPrice = ((pr.offerPrice * offersQuantity) + (pr.unitPrice * remainQuantity));
            return totalProductPrice;
        }       
        return occ * pr.unitPrice;                
    })
    .reduce((totalPrice, currentProductPrice) => totalPrice + currentProductPrice);   
};