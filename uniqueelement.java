public class uniqueelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ;j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }

        }
        int ans=-1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                ans=arr[j];
                System.out.println(ans);
            }
        }
    }
}
