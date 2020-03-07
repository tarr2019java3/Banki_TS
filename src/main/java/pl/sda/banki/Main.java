package pl.sda.banki;

public class Main {

    public static void main(String[] args) {


	BankAccount acc1 = new BankAccount(1,"BankDlaBogatych",5555, 6555);
	BankAccount acc2 = new BankAccount(2,"BankNowoczesny",4444,6532455);
	BankAccount acc3 = new BankAccount(3,"Bank",3333,234234);
	BankAccount acc4 = new BankAccount(4,"BigBank",2222,2342);

	User user1 = new User("Jan", "Kowalski",44,acc1);
	User user2 = new User("Marcin", "Nowak",66,acc2);
	User user3 = new User("Katarzyna","Dobroń", 33,acc3);
	User user4 = new User("Ola", "Lewandowska",33,acc4);

		System.out.println("Imie: "+user1.getName());
		System.out.println("Naziwsko: "+user1.getLastname());
		System.out.println("Wiek"+user1.getAge());
		System.out.println("Nazwa Banku: "+user1.getBank().getName());
		System.out.println("Numer konta: "+user1.getBank().getAccountNumber());
		System.out.println("Saldo komnta: "+user1.getBank().getBalance());
		

    }
}
