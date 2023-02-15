package Account;

public class AccountTest {
    public static void main(String[] args) {
        Account akun1 = new Account("1", "Sari", 1000000);
        Account akun2 = new Account("2", "Angga", 1000);
        System.out.println("Saldo awal "+akun1.getName()+" : "+akun1.getBalance());
        System.out.println("Saldo akhir "+akun1.getName()+" : "+akun1.transferTo(akun2, 50000));
    }
}
