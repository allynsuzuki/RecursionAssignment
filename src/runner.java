/**
 * Created by h205p4 on 1/15/19.
 */
public class runner {


    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + triangle(rows - 1);
    }


    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return (fibonacci(n - 2) + fibonacci(n - 1));
    }


    public int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        int count = 0;
        if (str.substring(0, 2).equals("hi")) {
            count = 1;
        }
        return count + countHi(str.substring(1));
    }

    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 10) {
            return n;
        }
        return (n % 10 + sumDigits(n / 10));

    }

    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int count = 0;
        if (str.substring(0, 3).equals("abc")) {
            count = 1;
        }
        if (str.substring(0, 3).equals("aba")) {
            count = 1;
        }
        return count + countAbc(str.substring(1));

    }

    public int strCount(String str, String sub) {

        if (sub.length() > str.length()) {
            return 0;
        }
        int count = 0;
        if (str.substring(0, sub.length()).equals(sub)) {
            count = 1;
        }
        return count + strCount(str.substring(1), sub);

    }

    public int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        if (str.substring(0, 1).equals("x")) {
            count = 1;
        }
        return count + countX(str.substring(1));
    }

    public int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        int count = 0;
        if (str.substring(0, 2).equals("hi")) {
            count = 1;
        }

        return count + countHi2(str.substring(1));
    }



}


