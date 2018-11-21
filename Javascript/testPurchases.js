const productsArray = require('./productsRepository');
// we send by reference to demonstrate the robustness of the distinct algorithm line 27 to 32 of checkout.js
module.exports = () => ({
    test1 : () => {
        let flow1 = [];
        flow1.push(productsArray()[0]); // SKU A First purchase  SCANNED
        flow1.push(productsArray()[3]); // SKU D Second purchase    "  
        flow1.push(productsArray()[2]); // SKU C Third purchase     "  
        flow1.push(productsArray()[1]); // SKU B Fourth purchase    "  
        flow1.push(productsArray()[0]); // SKU A Fifth purchase     "  
        flow1.push(productsArray()[0]); // SKU A Sixth purchase     "  
        flow1.push(productsArray()[0]); // SKU A Seventh purchase   "  
        flow1.push(productsArray()[1]); // SKU B Heighth purchase   "
        return flow1;
    },

    test2 : () => {
        let flow2 = []
        flow2.push(productsArray()[1]); // SKU B First purchase  SCANNED
        flow2.push(productsArray()[1]); // SKU B Second purchase    "  
        flow2.push(productsArray()[1]); // SKU B  Third purchase    " 
        flow2.push(productsArray()[1]); // SKU B Fourth purchase    "  
        flow2.push(productsArray()[0]); // SKU A Fifth purchase     "  
        flow2.push(productsArray()[0]); // SKU A Sixth purchase     "  
        flow2.push(productsArray()[0]); // SKU A Seventh purchase   "  
        flow2.push(productsArray()[1]); // SKU B Heighth purchase   " 
        return flow2;
    },

    test3 : () => {
        let flow3 = [];
        
        flow3.push(productsArray()[3]); // SKU D First purchase  SCANNED
        flow3.push(productsArray()[3]); // SKU D Second purchase    "  
        flow3.push(productsArray()[3]); // SKU D  Third purchase    "  
        flow3.push(productsArray()[3]); // SKU D Fourth purchase    "  
        flow3.push(productsArray()[3]); // SKU D Fifth purchase     "  
        flow3.push(productsArray()[3]); // SKU D Sixth purchase     "  
        flow3.push(productsArray()[3]); // SKU D Seventh purchase   "  
        flow3.push(productsArray()[3]); // SKU D Heighth purchase   " 
        return flow3;
    },
    test4 : () => {
        let flow4 = [];

        flow4.push(productsArray()[0]); // SKU A First purchase  SCANNED
        flow4.push(productsArray()[1]); // SKU B Second purchase    "  
        flow4.push(productsArray()[3]); // SKU D Third purchase    "  
        flow4.push(productsArray()[3]); // SKU D Fourth purchase    "  
        flow4.push(productsArray()[3]); // SKU D Fifth purchase     "  
        flow4.push(productsArray()[3]); // SKU D Sixth purchase     "  
        flow4.push(productsArray()[3]); // SKU D Seventh purchase   "  
        flow4.push(productsArray()[3]); // SKU D Heighth purchase   " 
        return flow4;
    },
    test5 : () => {
        let flow5 = [];
        flow5.push(productsArray()[0]); // SKU A First purchase  SCANNED (8 purchases OF A ) (odd)
        flow5.push(productsArray()[0]); // SKU A   
        flow5.push(productsArray()[0]); // SKU A 
        flow5.push(productsArray()[0]); // SKU A 
        flow5.push(productsArray()[0]); // SKU A 
        flow5.push(productsArray()[0]); // SKU A  
        flow5.push(productsArray()[0]); // SKU A  
        flow5.push(productsArray()[0]); // SKU A 
        flow5.push(productsArray()[1]); // SKU B (7 purchases OF B ) (even)
        flow5.push(productsArray()[1]); // SKU B 
        flow5.push(productsArray()[1]); // SKU B   
        flow5.push(productsArray()[1]); // SKU B 
        flow5.push(productsArray()[1]); // SKU B 
        flow5.push(productsArray()[1]); // SKU B  
        flow5.push(productsArray()[1]); // SKU B 
        flow5.push(productsArray()[2]); // SKU C   
        flow5.push(productsArray()[3]); // SKU D 
        return flow5;   
    }

});