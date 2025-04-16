public class reverse_array {
    static void reverse(int [] arr,int n){
        int rev_arr[]=new int[n];
        int j=0;
        for (int i = n-1; i >=0; i--) {
            rev_arr[j++]=arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rev_arr[i]+" ");
        }
        System.out.println();
    }
    //By Swapping without using extra space
    static void reverse_swap(int[] arr,int n){
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]+" ");

        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        reverse(arr,n);
        reverse_swap(arr,n);
    }
}
