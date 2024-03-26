import java.util.Scanner;

public class factNum {
    public static int fact(int num){
        int result=0;
        if(num ==0 || num ==1){
            return 1;
        }
        if(num>0){
            result=num*fact(num-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println( fact(sc.nextInt()));
       sc.close();
    }
}
