import java.util.Scanner;

public class contains_query {
    static int[]makefrequency(int [] arr){
        int []freq=new int[1000005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int []freq=makefrequency(arr);
        System.out.print("Enter no. of queries: ");
        int q=sc.nextInt();
        System.out.println("Enter the elements: ");
        int []query=new int[q];
        for (int i = 0; i < q; i++) {
            query[i]= sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            System.out.print("Element Present: ");
            if(freq[query[i]]>0){
                System.out.print("Yes");
                System.out.println();
            }
            else {
                System.out.print("No");
                System.out.println();
            }
        }

    }
}
