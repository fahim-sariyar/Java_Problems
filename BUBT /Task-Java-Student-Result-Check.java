public class Main {
    public static void main(String[] args) {
        int marks = 65;

        ResultCheck rc = new ResultCheck();
        rc.checkResult(marks);
    }
}


class ResultCheck {
    void checkResult(int marks) {
        if (marks >= 80) {
            System.out.println("Excellent");
        } else if (marks >= 60) {
            System.out.println("Good");
        } else if (marks >= 40) {
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }
    }
}
