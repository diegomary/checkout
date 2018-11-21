const product = require('./productObject.js');
const checkout = require('./checkout.js')


// Initializing a list of products
let prA = product('A', 0.5, true, 1.30, 3);
let prB = product('B', 0.3, true, 0.45, 2);
let prC = product('C', 2, false);
let prD = product('D', 0.75, false);

// Initializing array of products bought
let productsBought = [];

productsBought.push(prA);
productsBought.push(prA);
productsBought.push(prC);
productsBought.push(prB);
productsBought.push(prD);
productsBought.push(prA);
productsBought.push(prB);
productsBought.push(prB);
productsBought.push(prB);

//Should return 4.95
let total = checkout(productsBought);

console.log(total);