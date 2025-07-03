struct Foo {
    x: u32,
    y: bool,
    z: i8
}

fn make_foo() -> Foo {
    return Foo {
        x: 12,
        y: true,
        z: -3
    };
}

fn main() {
    let f1 = make_foo();
    let f2 = f1;
    println!("{}", f1.x);
}
