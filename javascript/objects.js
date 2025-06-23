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

function Rectangle(w, h) {
    // this = {}
    this.width = w;
    this.height = h;
    // return this;
}
