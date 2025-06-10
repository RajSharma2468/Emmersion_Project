public class prime_number {
    static void prime(int num){
        boolean flag=true;
        if (num==0 || num==1) {
            flag=false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%2==0){
                flag= false;
                break;
            }
            
        }
         if(flag==false){
            System.out.println("not prime");
         }
         else{
            System.out.println("prime");
         }
    }
    public static void main(String[] args) {
        prime(9); 
    }
}
