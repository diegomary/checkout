const product = require('./productObject.js');

module.exports = () => {
    return [
        product('A', 0.5, true, 1.30, 3),
        product('B', 0.3, true, 0.45, 2),
        product('C', 2, false),
        product('D', 0.75, false)
    ]
}