const tests = require('./testPurchases');
const checkout = require('./checkout.js');


let firstFlow = tests().test1();
//Should return 5.0
let total1 = checkout(firstFlow);
console.log("Results for the 2 methods, GrandTotal: ",total1);

let secondFlow = tests().test2();
//Should return 2.5
let total2 = checkout(secondFlow);
console.log("Results for the 2 methods, GrandTotal: ", total2);

let thirdFlow = tests().test3();
//Should return 6.0
let total3 = checkout(thirdFlow);
console.log("Results for the 2 methods, GrandTotal: ", total3);

let fourthFlow = tests().test4();
//Should return 5.3
let total4 = checkout(fourthFlow);
console.log("Results for the 2 methods, GrandTotal: ", total4);

let fifthFlow = tests().test5();
//Should return 8.0
let total5 = checkout(fifthFlow);
console.log("Results for the 2 methods, GrandTotal: ", total5);