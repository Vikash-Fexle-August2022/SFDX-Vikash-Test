public class prime {
    public static void main(String[] args){
        int n=9,temp=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
            {
                temp++;
            }
        }
        if(temp==0){
            System.out.print("prime");
        }
        else{
            System.out.print("not prime");
        }
    }
}
