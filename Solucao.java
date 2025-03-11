import java.util.ArrayList;
import java.util.Arrays;

public class Solucao {

    static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);

    }

    // 2 3 4 5
    static int range_sum(int j, int k) {
        if (j < k) {
            return j + range_sum(j + 1, k);
        } else if (j > k) {
            return k + range_sum(j, k + 1);
        }
        return j;
    }

    static boolean pal(String val) {
        if (val.length() <= 1) {
            return true;
        }
        if (val.charAt(0) == val.charAt(val.length() - 1)) {
            return pal(val.substring(1, val.length() - 1));
        }
        return false;
    }

    // Pedro dr
    static boolean findSubStr(String str, String match) {
        if (str.length() == 0) {
            return false;
        }
        if (str.startsWith(match)) {
            return true;
        }
        return findSubStr(str.substring(1), match);
    }
    static ArrayList<String> permutations(String s){
        if (s.length() == 1){
            return new ArrayList<>(Arrays.asList([s]));
        }
        


    }


    // 1 1 3  5 2 1
    // 1 3 5 2 1
    // 3 5 2 1
    // 5 2 1
    // 5 1
    // 5
    static int findBiggest(ArrayList<Integer> ar) {
        if(ar.size() == 1){
            return ar.get(0);
        }
        if(ar.get(0) > ar.get(1)){
            ar.remove(1);
        }else {
            ar.remove(0);
        }
        return findBiggest(ar);
        
    }
    
    

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList(Arrays.asList(1, 1, 5, 2, 3));


        System.out.println(findBiggest(ar));

    }

}