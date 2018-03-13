import java.util.Arrays;

public class Runner {
    public static void main(String args[]) {

        System.out.println(icyHot(2,3));
        System.out.println(stringSplosion("Isabel"));
        System.out.println(makeOutWord("pile", "neapp"));
        int[] a = {3,5};
        int[] b = {7,9};
        System.out.println(Arrays.toString(plusTwo(a,b)));
        System.out.println(teaParty(10, 30 ));
        System.out.println(blackjack(19, 22 ));
        System.out.println(repeatFront("Albinson", 5));
        System.out.println(sumDigits("aa1bc2d3"));
        int [] only14Array = {1,2,4,1,4,1,3,4};
        System.out.println(only14(only14Array));
        int[] nums = {1,3,2,4,5,3,6,4,5};
        System.out.println(Arrays.toString(fix34(nums)));
    }

    //Warmup1 > icyHot
    public static boolean icyHot(int temp1, int temp2) {
        if(temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0){
            return true;
        } else {
            return false;
        }
    }

    //Warmup2 > stringSplosion
    public static String stringSplosion(String str) {
        String result = "";
        for(int i = 0; i<str.length(); i ++){
            result += str.substring(0,i+1);
        }
        return result;
    }

    //String1 > makeOutWord
    public static String makeOutWord(String out, String word) {
        String result = "";
        result += out.substring(0, 2);
        result+= word;
        result += out.substring(2, out.length());
        return result;
    }

    //Array1 > plusTwo
    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = {a[0], a[1], b[0], b[1]};
        return result;
    }

    //Logic1 > teaParty
    public static int teaParty(int tea, int candy) {
        if(tea < 5 || candy < 5) {
            return 0;
        }
        if(tea >= 2*candy || candy >= 2*tea){
            return 2;
        }
        else if(tea >= 5 && candy >= 5){
            return 1;
        }
        return -1;

    }

    //Logic2 > blackjack
    public static int blackjack(int a, int b) {
        if(a>21 && b >21) {
            return 0;
        }
        if(21-a > 21-b){
            return a;
        }
        if(21-b > 21-a){
            return b;
        }
        if(a>21 && b<=21){
            return a;
        }
        if(b>21 && a<=21){
            return b;
        }
        return -1;
    }

    //String2 > repeatFront
    public static String repeatFront(String str, int n){
        String result = "";
        for(int i = 0; i<n; i++){
            result += str.substring(0,(n-i));
        }
        return result;
    }

    //String3 > gHappy
    public static int sumDigits(String str) {
        int result = 0;
        for(int i = 0; i < str.length(); i ++){
            if(Character.isDigit(str.charAt(i))){
                result += Integer.parseInt(str.substring(i,i+1));
            }
        }
        return result;
    }

    //Array2 > only14
    public static boolean only14(int[] nums){
        for(int i = 0; i < nums.length; i ++){
            if(nums[i]!= 1 && nums[i] != 4){
                return false;
            }
        }
        return true;
    }

    //Array3 > fix34
    public static int[] fix34(int[] nums) {
        for(int i = 0; i < nums.length; i ++){
            if(nums[i]==3 && nums[i+1] != 4){
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == 4 && nums[j-1]!= 3){
                        nums[j] = nums[i+1];
                        nums[i+1] = 4;
                    }
                }
            }
        }
        return nums;
    }

}


