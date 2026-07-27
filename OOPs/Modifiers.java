package OOPs;

public class Modifiers {
    public static void main(String args[]){
        BankAccount account = new BankAccount();
        account.username = "brucewyane";
        account.setPassword("i'm batman");
        System.out.println("Username: " + account.username);
        System.out.println("Password: " + account.getPassword());
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }
}

