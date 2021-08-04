package Homework;

public class Odev32 {
//    public static void evenOddNums (String number){
//
//        int sum = 0;    //  liping solution. 2.1
//        for (int i = 0; i < number.length(); i++) {
//            int integerNum = Integer.parseInt(number.charAt(i) + "");
//            if (integerNum % 2 == 0)
//                sum += integerNum;
//            else
//                sum -= integerNum;
//        }
//        System.out.println(sum);
//}
//    public static int removeDuplicate(int[] intArray) { // 2.3 sinan hoca
//
//        int counter = 1;
//        for (int i = 0; i <= intArray.length; i++) {
//            for (int j = i + 1; j < intArray.length; j++) {
//                if (intArray[i] != intArray[j])
//                    counter++;
//                break;
//            }
//
//        }
//
//        return counter;
//        public static int removeDuplicate (int[] arr){ //2.3 liping
//
//            int counter = 1;
//            for (int i = 0; i < arr.length-1; i++) {
//                if (arr[i] != arr[i+1])
//                    counter++;
//            }return counter;

    public static int addDigits (int num){  // 2.4 liping

        int sum = 0;
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return  (sum < 10) ? sum : addDigits(sum);
    }
//
//            public static boolean isPalindrome(String str){ //2.5 sinan hoca
//                boolean isPalindrome = false;
//                String reversed = "";
//                for (int i = str.length()-1; i>=0  ; i--) {
//                    reversed += str.charAt(i);
//                }
//                if(reversed.equalsIgnoreCase(str)){
//                    isPalindrome = true;
//                }
//                return isPalindrome;
//            }
}