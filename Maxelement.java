public class Maxelement {
    public static void main(String[] args) {
        int arr[]={9,8,9,6,9,6,8};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
}
