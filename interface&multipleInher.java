interface father{
    abstract void talk();
    abstract void walk();
}
interface mother{
    abstract void cook();
    abstract void think();
}
class son implements father,mother{
    public void talk(){
        System.out.println("i am talking");
    }
    public void walk(){
        System.out.println("i am walking");
    }
    public void cook(){
        System.out.println("i am talking");
    }
    public void think(){
        System.out.println("i am talking");
    }
    public static void main(String[] args) {
        son h1=new son();
        h1.talk();

    }
}