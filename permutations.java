package Java_Learning_Day_14;

public class permutations {
    public static void fact(String str) {
        int n = str.length();
        int fact = 1;
        for(int i=n; i>0; i--){
            fact = fact*i;
        }
        System.out.print("No of combinations is: "+fact);
    }
    public static void printPerm(String str, String Permutation){
        if(str.length() == 0){
            System.out.print(Permutation + " ");
            return;
        }

        for (int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str. substring(i+1);
            printPerm(newStr, Permutation+currChar);
        }
    }
    public static void main(String [] args){
        String str = "abcd";
        fact(str);
        System.out.println();
        printPerm(str, "");
    }
}