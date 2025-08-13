/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public static boolean isDigitSumPalindrome(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        int rev = 0;
        int sumCopy = sum;
        while (sumCopy > 0) {
            rev = rev * 10 + (sumCopy % 10);
            sumCopy /= 10;
        }
        return sum == rev;
    }

    public static void main(String[] args) {
        System.out.println(isDigitSumPalindrome(56));
        System.out.println(isDigitSumPalindrome(98)); 
        System.out.println(isDigitSumPalindrome(121)); 
    }
}
