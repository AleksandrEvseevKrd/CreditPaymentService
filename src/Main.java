public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int loanAmount = 1_000_000;
        double interestRate = 9.99;
        int loanTerm = 12;
        int payment = service.calculate(loanAmount, (double) interestRate, loanTerm);

        System.out.println("Сумма кредита: " + loanAmount + "руб.");
        System.out.println("Процентная ставка: " + interestRate + "%");
        System.out.println("Срок кредита: 12 мес.");
        System.out.println("Ежемесячный платеж: " + payment + "руб.");

        System.out.println();
        System.out.println("Сумма кредита: " + loanAmount + "руб.");
        System.out.println("Процентная ставка: " + interestRate + "%");
        System.out.println("Срок кредита: 24 мес.");
        System.out.println("Ежемесячный платеж: " + service.calculate(loanAmount = 1_000_000, interestRate = 9.99, loanTerm = 24) + "руб.");

        System.out.println();
        System.out.println("Сумма кредита: " + loanAmount + "руб.");
        System.out.println("Процентная ставка: " + interestRate + "%");
        System.out.println("Срок кредита: 36 мес.");
        System.out.println("Ежемесячный платеж: " + service.calculate(loanAmount = 1_000_000, interestRate = 9.99, loanTerm = 36) + "руб.");
    }
}