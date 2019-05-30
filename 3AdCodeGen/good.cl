class B {
    s : String <- "Hello";
    g(y:String) : Int {
        y.concat(s)
    };
    f(x:Int) : Int {
        x*2
    };
};

class A {
    a : Int;
    b : B <- new B;
    f(x:Int) : Int {
        x+a
    };
};
class Main{

f(x:Int) : Int {
        x+a
    };

   main():Object{

       f(9)


   };
};