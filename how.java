abstract class laptop{
    void turnin(){
        System.out.println("hello");
    }
}
public class how extends laptop{
    public static void main(String[] args) {
        how hi=new how();
        hi.turnin();
    }
}
