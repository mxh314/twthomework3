package homework3;

public class homework3 {

}
abstract class CPU{
    public abstract void speak();
    String name;
    String coreNum;
    int price;
}
class Intel extends CPU{
    public final void speak(){
        System.out.print("Intel"+"work");
    };
    String name;
    String coreNum;
    int price;
}
class AMD extends CPU{
    public final void speak(){
        System.out.print("AMD"+"work");
    };
    String name;
    String coreNum;
    int price;
}



abstract class InternalStorage{
    public abstract void speak();
    String name;
    String volume;
    int price;

}

class Sumsung extends InternalStorage{
    public  void speak(){
        System.out.print("Sumsung"+"work");
    };
    String name;
    String volume;
    int price;

}
class Kingston extends InternalStorage{
    public  void speak(){
        System.out.print("Kingston"+"work");
    };

    String name;
    String volume;
    int price;

}