package pl.coderslab.designpatterns.facade;

public class AtmApi {

    private BankAccount bankAccount;
    private Loan loan;
    private PhoneCard phoneCard;
    private Transfer transfer;

    public AtmApi(BankAccount bankAccount, Loan loan, PhoneCard phoneCard, Transfer transfer) {
        this.bankAccount = bankAccount;
        this.loan = loan;
        this.phoneCard = phoneCard;
        this.transfer = transfer;
    }

    public void deposit() {
        this.bankAccount.deposit();
    }
    public void layout() {
        this.bankAccount.layout();
    }
    public void recharge() {
        this.phoneCard.recharge();
    }
    public void transferMoney() {
        this.transfer.transferMoney();
    }
    public void getLoan() {
        this.loan.getLoan();
    }

}
