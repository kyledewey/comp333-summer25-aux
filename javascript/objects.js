// temp = function() {
//     let obj = { 'foo' : 5, 'blah' : 7 };
//     delete obj.foo;
//     return obj;
// };
    
function temp() {
    let obj = { 'foo' : 5, 'blah' : 7 };
    delete obj.foo;
    return obj;
}

function makeRectangle(w, h) {
    return { 'width' : w, 'height' : h };
}

function getArea(rec) {
    return rec.width * rec.height;
}

// let rectanglePrototype = {
//     'getArea': function() {
//         return this.width * this.height;
//     }
// };

// function Rectangle(w, h) {
//     // this = {}
//     this.width = w;
//     this.height = h;
//     this.__proto__ = rectanglePrototype;
//     // return this;
// }

//      Shape
//      /  \
// Square  Rectangle
function Shape() {}

function Square(side) {
    this.side = side;
}
Square.prototype = new Shape();
Square.prototype.getArea = function() {
    return this.side * this.side;
};

function Rectangle(w, h) {
    // this = {};
    // this.__proto__ = Rectangle.prototype;
    this.width = w;
    this.height = h;
    // return this;
}
Rectangle.prototype = new Shape();
Rectangle.prototype.getArea = function() {
    return this.width * this.height;
}

