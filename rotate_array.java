import java.util.Scanner;

public class rotate_array {
        static void rotate(int []arr,int n,int k){
            k=k%n;
            int j=0;
            int []ans=new int[n];
            for (int i = n-k; i <n; i++) {
                ans[j++]=arr[i];
            }
            for (int i = 0; i <n-k; i++) {
                ans[j++]=arr[i];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        static void swap(int []arr,int i,int j){
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        //By reverse method without using extra space
    static void rotate_reverse(int []arr,int n,int k){
        k=k%n;
        swap(arr,0,n-k-1);
        swap(arr,n-k,n-1);
        swap(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. for rotate of an array");
        int k=sc.nextInt();
        int []arr={1,2,3,4,5};
        int n=arr.length;
        rotate(arr,n,k);
        rotate_reverse(arr,n,k);
    }
}
