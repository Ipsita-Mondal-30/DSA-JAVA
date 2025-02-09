public class CountOccurances {
    public static void main(String[] args){
        int n=6789905;
        int count=0;
        while(n>0){
            if(n%10==9){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
