package pl.coderslab.designpatterns.facade;

public class MainFacade {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Loan loan = new Loan();
        PhoneCard phoneCard = new PhoneCard();
        Transfer transfer = new Transfer();

        AtmApi atmApi = new AtmApi(bankAccount, loan, phoneCard, transfer);

        atmApi.deposit();
        atmApi.recharge();
    }
}
