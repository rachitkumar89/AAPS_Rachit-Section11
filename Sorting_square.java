/*Given an integer array "a" sorted in non-decreasing order, return an
array of the squares of each number sorted in non-decreasing order*/
import java.util.Scanner;
public class Sorting_square {
    static void reverse(int []ans,int n){
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;
            j--;
        }
    }
    static void square_sort(int []arr,int n){
        int left=0;
        int right=n-1;
        int ans[]=new int[n];
        int k=0;
        while (left<=right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        //reverse(ans,n);
        for(int m:ans) {
            System.out.print(m+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array: ");
        for (int ans:arr){
            System.out.print(ans+" ");
        }
        System.out.println();
        square_sort(arr,n);
    }

}
