public class CreditPaymentService {
    public int calculate(int loanAmount, double interestRate, int loanTerm) {
        double result;
        result = (double) (loanAmount * (interestRate / 12 / 100) * (Math.pow(1 + (interestRate / 12 / 100), loanTerm))) / ((Math.pow(1 + (interestRate / 12 / 100), loanTerm)) - 1);
        return (int) result;
    }
}