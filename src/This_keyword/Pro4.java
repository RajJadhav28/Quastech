package This_keyword;

class B {
    A21 aRef; // Holds reference to A object

    // Constructor takes A object as argument
    B(A21 a) {
        this.aRef = a;
    }

    void display() {
        System.out.println("Value from A: " + aRef.number); // Accessing A's data
    }
}
class A21 {
    int number = 50;

    A21() {
        // Pass current A object (this) to B's constructor
        B b = new B(this);
        b.display();
    }
    class Pro4{
    public static void main(String[] args) {
        new A(); // Creates A, which creates B
    }
    }
}

//o/p-10;
//class A12{    
//A12 getA12(){    
//return this;    
//}    
//void msg(){System.out.println("Hello Java");}    
//}    
//class Main{    
//public static void main(String args[]){    
//new A().getA12().msg();    
//}    
//}    