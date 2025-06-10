function empty() {}

function printAll(arr) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        console.log(elem);
    }
}

// shouldPrint is a function that takes
// an element, and returns a boolean.
// If the boolean is true, we print the element.
function printSome(arr, shouldPrint) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        if (shouldPrint(elem)) {
            console.log(elem);
        }
    }
}

function printLessThan(arr, value) {
    // printSome(arr,
    //           function (e) {
    //               return e < value;
    //           });
    printSome(arr, (e) => e < value);
}

function printLessThan7(arr) { printLessThan(arr, 7); }
function printLessThan8(arr) { printLessThan(arr, 8); }

function printGreaterThan(arr, value) {
    // printSome(arr,
    //           function (e) {
    //               return e > value;
    //           });
    printSome(arr, (e) => e > value);
}

function add(x, y) {
    return x + y;
}

function delayedAdd(x) {
    return (y) => x + y;
}

function callMe(foo) {
    return foo();
}

function printHello() {
    console.log("hello");
}

function printGoodbye() {
    console.log("goodbye");
}

function indirectIf(bool, firstFunc, secondFunc) {
    if (bool) {
        return firstFunc();
    } else {
        return secondFunc();
    }
}

// def indirectWhile(firstFunc: () => Boolean,
//                   secondFunc: () => Unit): Unit
function indirectWhile(firstFunc, secondFunc) {
    if (firstFunc()) {
        secondFunc();
        indirectWhile(firstFunc, secondFunc);
    }
}
