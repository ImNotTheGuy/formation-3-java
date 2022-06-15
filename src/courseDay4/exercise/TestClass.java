package courseDay4.exercise;

public class TestClass {

    int x;
    int y;
    String u;

    public TestClass(){
        this(0,0);
    }

    public TestClass(int x){
        this(x,0, "string");

    }


    public TestClass(int a, int b){
        this.x = a;
        this.y = b;
    }

    public TestClass(int x, int y, String s){
        u = s;
        this.x = x;
        this.y = y;

    }


}
