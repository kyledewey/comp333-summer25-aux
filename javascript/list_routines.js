function foreach(arr, func) {
    for (let index = 0; index < arr.length; index++) {
        func(arr[index]);
    }
}

function printAll(arr) {
    foreach(arr, (e) => console.log(e));
}

function printSome(arr, shouldPrint) {
    arr.filter(shouldPrint).forEach((e) => console.log(e));

    // foreach(arr, (e) => {
    //     if (shouldPrint(e)) {
    //         console.log(e);
    //     }
    // });
    
    // for (let index = 0; index < arr.length; index++) {
    //     let elem = arr[index];
    //     if (shouldPrint(elem)) {
    //         console.log(elem);
    //     }
    // }
}

function sum(arr) {
    return reduce(arr, (accum, e) => accum + e, 0);

    // return arr.reduce((accum, e) => accum + e, 0);

    // let retval = 0; // accumulator
    // for (let index = 0; index < arr.length; index++) {
    //     let elem = arr[index];
    //     retval = retval + elem;
    // }
    // return retval;
}

function product(arr) {
    return reduce(arr, (accum, e) => accum * e, 1);
    // let retval = 1;
    // for (let index = 0; index < arr.length; index++) {
    //     let elem = arr[index];
    //     retval = retval * elem;
    // }
    // return retval;
}

function concatenateAll(arr) {
    return reduce(arr, (accum, e) => accum + e, "");
    // let retval = "";
    // for (let index = 0; index < arr.length; index++) {
    //     let elem = arr[index];
    //     retval = retval + elem;
    // }
    // return retval;
}

// def reduce[ItemType, AccumType](
//    items: Seq[ItemType],
//    f: (AccumType, ItemType) => AccumType,
//    startAccum: AccumType): AccumType

// func: (currentAccumulator, currentElement) => newAccumulator
// startAccum: starting value of the accumulator
function reduce(arr, func, startAccum) {
    let accum = startAccum;
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        accum = func(accum, elem);
    }
    return accum;
}

function reduceWithImplicitStart(arr, func) {
    let accum = arr[0];
    for (let index = 1; index < arr.length; index++) {
        let elem = arr[index];
        accum = func(accum, elem);
    }
    return accum;
}

function getSmallest(arr) {
    let smallestSoFar = arr[0];
    for (let index = 1; index < arr.length; index++) {
        let currentElement = arr[index];
        smallestSoFar = (currentElement < smallestSoFar) ?
            currentElement :
            smallestSoFar;
        // if (currentElement < smallestSoFar) {
        //     smallestSoFar = currentElement;
        // } else {
        //     smallestSoFar = smallestSoFar;
        // }
    }
    return smallestSoFar;
}
