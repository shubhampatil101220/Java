import java.util.Scanner;

public class sumofdigit {

    public static int sumbyrecursion(int num){
        int result =0;
        if(num==0 ){
            return 0;
        }
        if(num>0){
            result= (num%10)+sumbyrecursion(num/10);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumbyrecursion(sc.nextInt()));;

        sc.close();
    }
}
