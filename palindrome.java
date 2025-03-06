import java.util.Scanner;

public class palindrome {

    public static boolean reverse(String s1){
        String s2=new StringBuilder(s1).reverse().toString();
        if(s2.toString().equals(s1.toString())){
            return true;
        }
        return false;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1=sc.nextLine();
        boolean answer=reverse(s1);
        System.out.println(answer);
    }
}
