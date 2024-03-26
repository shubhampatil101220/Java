import java.util.Scanner;

public class palindrome {
    public static void checkpalindrome(int num){
        int onum=num;
        int result=0;
        while(num!=0){
            int rem =num%10;
            result=(result*10)+rem;
            num=num/10;
        }
        if(onum==result){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkpalindrome(sc.nextInt());
        sc.close();
    }
}
