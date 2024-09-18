import java.util.ArrayList;
import java.util.List;

public class Accounts {
    static public List<BankAccount> allAccounts = new ArrayList<>();

    static public void add(BankAccount bankAccount) {
        allAccounts.add(bankAccount);
    }

    static public boolean isAccountInList(BankAccount bankAccount) {
        for (BankAccount account : allAccounts) {
            if (account.getAccountNumber() == bankAccount.getAccountNumber()) {
                return true;
            }
        }
        return false;
    }
}
