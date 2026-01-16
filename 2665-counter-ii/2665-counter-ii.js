/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let currVal=init;
    function increment(){
        return ++currVal;
    }
    function decrement(){
        return --currVal;
    }
    function reset(){
        return (currVal=init);
    }
    return {increment,decrement,reset};
    
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */