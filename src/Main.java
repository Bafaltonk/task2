public class Main {

    public static void main(String[] args) {
        System.out.println(boxSeq(5));
    }

    public static String repeat(String s, int n){
        char arr[] = s.toCharArray();
        String result = "";
        String y = "";
        for (int i = 0; i < s.length();i++){
            for (int j= 0; j < n; j++){
                y += arr[i];
            }
            result += y;
            y = "";
        }
        return result;
    }

    public static int differenceMaxMin(int arr[]){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }else if (arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;
    }

    public static boolean isAvgWhole(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum % arr.length == 0;
    }

    public static int[] cumulativeSum(int arr[]){
        int[] new_arr = new int[arr.length];
        new_arr[0] = arr[0];

        for (int i = 1; i < arr.length; i++){
            new_arr[i] = new_arr[i-1] + arr[i];
        }
        return new_arr;
    }

    public static int getDecimalPlaces(String s){
        int index = s.lastIndexOf(".");
        if(index != -1){
            return s.substring(index+1).length();
        }else{
            return 0;
        }
    }

    public static int Fibonacci(int n){
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n+1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public static boolean isValid(String s){
        int if_1;
        try{
            if_1 = Integer.parseInt(s);
            return (s.length() == 5) & (s.lastIndexOf(" ") == -1);
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean isStrangePair(String s1, String s2){
        return (s1.substring(0,1).equals(s2.substring(s2.length()-1))) & (s2.substring(0,1).equals(s1.substring(s1.length()-1)));
    }

    public static boolean isPrefix(String s, String p){
        p = p.substring(0, p.length()-1);
        return s.indexOf(p) == 0;
    }

    public static boolean isSuffix(String s, String su){
        su = su.substring(1);
        return (s.length()-s.lastIndexOf(su)) == su.length();
    }

    public static int boxSeq(int n){
        return 3*((n+1)/2) - n/2;
    }
}