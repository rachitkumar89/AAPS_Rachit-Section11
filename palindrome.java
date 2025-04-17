import java.util.Scanner;


public class palindrome {

    public static boolean twopointer(String s1){
        int i=0;
        int l=s1.length()-1;
        while(i<=l){
            if(s1.charAt(i)!=s1.charAt(l)){
                return false;
            }
            i++;
            l--;
            
        }
        return true;
    }

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
        boolean answer1=reverse(s1);
        System.out.println(answer1);
        boolean answer2=twopointer(s1);
        System.out.println(answer2);
        
        sc.close();
    }
}
