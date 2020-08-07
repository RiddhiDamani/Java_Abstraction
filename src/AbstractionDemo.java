abstract class AbstractClass
{
    abstract void abstractMethod();
}
 
class ConcreteClass extends AbstractClass
{
    void abstractMethod()
    {
        System.out.println("Abstract Method Implemented");
    }
}

 
public class AbstractionDemo
{
    public static void main(String[] args)
    {
//        AbstractClass A = new AbstractClass();  //Can't create objects to Abstract class
        ConcreteClass C = new ConcreteClass();
        C.abstractMethod();
        //ConcreteClass implements abstract method,
        //so we can create object to ConcreteClass
        AbstractClass A1 = C;
        A1.abstractMethod();
        //ConcreteClass object is auto-upcasted to AbsractClass
    }
}


//It gives compile time error - The type AbstractClass1 must be an abstract class to define abstract methods.
//class AbstractClass1
//{
//void abstractMethod();  //This method must be declared as abstract or must be defined
//abstract void abstractMethod();  //The Class must be also declared as abstract
//}


//This is OK
//abstract class AbstractClass1
//{
// abstract void abstractMethod();
//}


//abstract class AbstractClass2
//{
//    void methodOne()
//    {
//        //Concrete Method
//    }
// 
//    void methodTwo()
//    {
//        //Concrete Method
//    }
//}
// 
//public class AbstractionDemo1
//{
//    public static void main(String[] args)
//    {
//        AbstractClass2 a = new AbstractClass2();  //Compile time error
//        //You can't create objects to AbstractClass
//        //even though it does not contain any abstract methods.
//    }
//}