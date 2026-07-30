package Java_Learning_Day_14;

public class tiles {
    public static int tilePlace(int n, int m){
        if(n==m){
            return 2;
        }

        if(n<m){
            return 1;
        }
        // Verticle Placement
        int vertPlace = tilePlace(n-m, m);
        // Horizontal Placement
        int horPlace = tilePlace(n-1, m);

        return vertPlace + horPlace;
    }

    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(tilePlace(n, m));
    }
}
