package Java_Learning_Day_14;
import java.util.*;
public class subsets {
    public static void printSubsets(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void subsetsPrint (int n, ArrayList<Integer> subset){
        if(n==0){
            printSubsets(subset);
            return;
        }

        //will add 
        subset.add(n);
        subsetsPrint(n-1, subset);

        //will not add
        subset.remove(subset.size()-1);
        subsetsPrint(n-1, subset);
    }

    public static void main(String[] args) {
        int n=10;
        ArrayList<Integer> subS = new ArrayList<>(); 
        subsetsPrint(n, subS);
    }
}
