public class Main {
    // If it's not a weekday or on vacation, it returns true.
    // If it's anything else, it returns false.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }

    // it only returns true if the monkeys are both smiling or aren't both smiling
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return ((aSmile && bSmile) || (!aSmile && !bSmile));
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;

        if (a == b) {
            sum *= 2;
        }

        return sum;
    }

    // if n is greater than 21 then it returns n - 21 multipling the difference by 2
    // else it returns 21 - n
    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }

    // if talking is equal to true And is before 7 or after 20 it returns true
    // else it returns false
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true && (hour > 20 || hour < 7)) {
            return true;
        } else {
            return false;
        }
    }

    // if a equals 10 or b equals 10 or a plus b equals 10 it returns true
    // if not, it returns false
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        } else {
            return false;
        }
    }

    // if the difference between 100 and n is less than or equal to 10
    // or the difference between 200 and n is less than or equal to 10 it returns true
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));

    }
    //if negative is true, then it returns true if a is less than 0 and b is less than 0
    // else it returns true if a is less than 0 and b is less than 0, or
    // it's false when a is greater than 0 and b is greater than 0
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}
