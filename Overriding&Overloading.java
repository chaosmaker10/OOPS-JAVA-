class Parent{
    char gender='M';

    public void display(){                         //This display method is overrrided by the child class's display method
        System.out.println("I am parent");
    }
}
class Child extends Parent{
    char gender='F';
    public void display(){                         //This display method overides the above method in this case
        System.out.println("I am kid");
    }
    public void display(int a){
        System.out.println("overloads the previous one");   //Overloading occurs here 
    }
    public static void main(String args[]){
        Child son=new Child();
        System.out.println(son.gender);
        son.display();

    }
}