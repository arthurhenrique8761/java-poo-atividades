package SalaryExceptionProject;

public class BusinessLogicException extends Exception {
    private int detail;

    public BusinessLogicException(int a) {
        detail = a;
    }

    public String toString() {
        return String.valueOf("BusinessLogicException[" + detail + "]");
    }
}
