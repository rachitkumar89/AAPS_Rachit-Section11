import java.util.Scanner;

public class sort0_1 {

    static void sort(int []arr,int n){
        int count_zero=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                count_zero++;
            }
        }
        for (int i = 0; i < n; i++) {
           if(i<count_zero){
               arr[i]=0;
           }
           else {
               arr[i]=1;
           }
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    static void swapmethod(int []arr,int n){
        int left=0;
        int right=n-1;
        while(left<right){
            if (arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }

            if(arr[left]==1 && arr[right]==0){
                swap(arr[left],arr[right]);
                left++;
                right--;
            }
        }
        System.out.println("Sorted array using swap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
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
        System.out.println("Original Array");
        for (int ans:arr){
            System.out.print(ans+" ");
        }
        System.out.println();
        sort(arr,n);
        swapmethod(arr,n);
    }
}
