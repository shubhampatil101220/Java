import java.util.Scanner;

/**
 * armstrong
 */
public class armstrong {

    public static void armstrongcheck(int input){
        int origianl=input;
        double output=0;
        int len=Integer.toString(input).length();
        while(input!=0){
            int rem=input%10;
            output=output+Math.pow(rem, len);
            input=input/10;
        }
        if(output==origianl){
            System.out.println("Given no is Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        armstrongcheck(input);  
        sc.close();      
    }
    
}