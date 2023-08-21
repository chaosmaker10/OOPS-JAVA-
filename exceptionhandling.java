public class exceptionhandling {
    public static void main(String[] args) {
        int a=5;
        int b=0;                                     //one try can have lots of exception
        try {                                      
            System.out.println(a/b);
        } catch (Exception e) {                     //if error occurs in try statement this catch will execute
                                                    //if no error then it wont execute
            System.out.println("b is 0");
        }
        finally{
            System.out.println("This statement will execute at all conditions");
        }
        System.out.println("try & catch complete");
    }
}
