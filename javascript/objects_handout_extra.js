// Foo is a constructor
// - Takes an integer
function Foo(someInteger) {
    // Foo puts a value field on the new object,
    // initialized by constructor parameter
    this.value = someInteger;

    // if directly on object
    // this.doubleIt = function() {
    //     return this.value * 2;
    // };
}

// f has a doubleIt method (somehow)
// doubleIt takes no parameters
// doubleIt returns something; doubling the
// saved value
Foo.prototype.doubleIt = function() {
    return this.value * 2;
};

let f = new Foo(3);
// Foo is a constructor
// - Takes an integer

console.log(f.value); // 3
// Foo puts a value field on the new object,
// initialized by constructor parameter

let a = f.doubleIt();
// f has a doubleIt method (somehow)
// doubleIt takes no parameters
// doubleIt returns something; doubling the
// saved value

console.log(a);       // 6
