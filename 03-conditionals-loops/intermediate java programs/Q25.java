public class Q25 {
    public static void main(String[] args) {
        int noofdays = 31,count = 0;
        for (int i = 1; i<=31; i++){
            if(i%2 == 0){
                count++;
            }
        } 
        System.out.println(count);
    }
}