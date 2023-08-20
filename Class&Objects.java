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
        System.out.print("Constructor is being called");
    }
    
    
    public static void main(String args[]){
        Applform Hari=new Applform();
        Hari.name="Hari";
        Hari.rollno=75;   //In this line we are creating an object Hari which follows the blueprint Applform.
        // The keyword new allocates new memory space in the ram whereas next one is a default construcutor;
    
    }
}