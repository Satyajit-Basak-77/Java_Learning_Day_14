package Java_Learning_Day_14;

public class call_guests {
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }

        //single 
        int ways1 = callGuest(n-1);

        //pair
        int ways2 = (n-1) * callGuest(n-2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n = 5;
        int ways = callGuest(n);
        System.out.println(ways);
    }
}