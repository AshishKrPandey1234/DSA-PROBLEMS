/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    n=n-1;
    
    return function() {
        //postfix increment syntax it will firstly return than increase
        return ++n;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */