class DemoException1 {
    public static int divideAndCheck(String a, String b) {
        int num1 = Integer.parseInt(a);   // may throw NumberFormatException
        int num2 = Integer.parseInt(b);   // may throw NumberFormatException

        if (num2 == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

        return num1 / num2;
    }

    public static void main(String[] args) {
        try {
            int result = divideAndCheck("10", "0");
            System.out.println("Result = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Input must be integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception occurred.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
