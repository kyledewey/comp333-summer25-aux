function AddThis(x) {
    this.x = x;
}
AddThis.prototype.add = function (y) {
    return this.x + y;
}
AddThis.prototype.sub = function (y) {
    return y - this.x;
}
    
let withOne = new AddThis(1);  // { x: 1 }
let withFive = new AddThis(5); // { x: 5 }
console.log(withOne.add(1));  // 2
console.log(withFive.add(2)); // 7

let originalPrototype = AddThis.prototype;
AddThis.prototype = {};
AddThis.prototype.__proto__ = originalPrototype;
AddThis.prototype.mul = function (y) {
    return this.x * y;
};

let withSix = new AddThis(6);
// withSix.mul(2); // ok
// withOne.mul(2); // NOT ok
