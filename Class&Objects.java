// How actually it exists
// package{
//     class{
//         main{

//         }
//     }
// }

// class is a blue print or a structure to a object
import java.util.*;
class Applform{
    
    String name;//By default it is default access modifier 
    int rollno;//By default it is default access modifier 
    // Default access modifier can be called anywhere but in one package only
    
    
    Applform(){
        System.out.println("Constructor is being called");
    }
    // This is method
    // Function called inside the class is called as method 
    // In java we have only methods no function exists
    public void display(){  //This is function definition
        System.out.println(name);
        System.out.println(rollno);
    }
    
    public static void main(String args[]){
        Applform Hari=new Applform();  //In this line we are creating an object Hari which follows the blueprint Applform.
        // The keyword new allocates new memory space in the ram whereas next one is a default construcutor;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print(x);
        Hari.name="Hari";
        Hari.rollno=75;
        Hari.display();//This is function call 
    }
}
