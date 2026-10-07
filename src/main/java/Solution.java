public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4)/4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int)(average + 0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        long result = Math.round(totalStock);
        return (int)(result);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int value = (int)(userDouble*100);
        int num1 = (int)(((value % 10) + 1) % 10);
        int num2 = (((value % 100)/10) + 1 ) % 10;
        int num3 = (((value % 1000)/100) + 1 ) % 10;
        int num4 = (((value % 10000)/1000) + 1 ) % 10;
        int num5 = (((value % 100000)/10000) + 1) % 10;
        int answer = (num1) + (num2 * 10) + (num3 * 100) + (num4 * 1000) + (num5 * 10000);
        return answer/100.00;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
