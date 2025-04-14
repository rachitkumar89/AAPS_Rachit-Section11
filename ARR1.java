class array{
    void demoarray(){
        int [] age=new int[3];
        age[0]=1;
        age[1]=5;
        age[2]=3;
        System.out.println(age[0]);
        System.out.println(age.length);
        int sum=0;
        for (int i=0;i<3;i++){
            sum+=age[i];

        }
        System.out.println(sum);
        int ans=0;
        for(int i=0;i<age.length;i++){
            if(ans<age[i]){
                ans=age[i];
            }
        }
            System.out.println(ans);
        int target=15;
        int asn=-1;
        for (int i = 0; i < age.length; i++) {
            if(target==age[i]) {
                asn=i;
            }
        }
                System.out.println(asn);
    }

}


public class ARR1 {
    public static void main(String[] args) {
        array obj=new array();
        obj.demoarray();
    }
}
