public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        System.out.println("......................");

        // pound to kilogram
        double p = 200d;
        double kilo = p*(0.45359237d);
        System.out.println(kilo);

        System.out.println("......................");
        
        // char and boolean...
        // char - 2 byte (as it allows  - unicode characters)
        char c1 = 'D';
        char c2  = '\u0044';
        System.out.println(c2);

        System.out.println("......................");

        // boolean in java true/ false only no 0/1...
        boolean flag = false;
        System.out.println(flag);

        System.out.println("......................");

        // string data type in java... (it's not a primitive data type it's actually a class)
        // string  - max value of int == 2.4billion

        String str = "this is a string";
        // append
        System.out.println(str+" append ");

        //string in java are immutable - new string is automatically created internally by java and return as a result...



        System.out.println("......................");
        //operator and operands and expressions...
        // + - * / %

        // avrebreation operators...
        // i++  , i-- ,  i+=2 , 

        System.out.println("......................");

        //condition logic....

        boolean isAlean = false;

        if(!isAlean) // isAlean == false 
            System.out.println("human");
        else System.out.println("Alean");

        System.out.println("......................");
        // ternary operator
        System.out.println((isAlean)?"alean":"human");
        System.out.println("......................");

        //precedense rules and associativity for java....
        

    }
}
