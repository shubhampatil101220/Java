import java.util.Scanner;

public class reverseword {
    public static void rword(String input){
        String output="";
        for(int i=input.length()-1;i>=0;i--){
            output=output+input.charAt(i);
        }
        System.out.println("Reverse Word");
        System.out.println(output);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input=sc.next();
    
        rword(input);
        sc.close();
    }
}
