public class targetsum {
    public static void main(String[] args) {
        int arr[]= {4,6,3,5,8,2};
        int target=13;
        int ans=0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = i+2; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }

        }
        System.out.println(ans);
    }
}
