import java.util.*;

class Account{
	int balance;
	
	public Account(int balance){
		this.balance = balance;
	}
	
	synchronized void withdraw(int amt){
		System.out.println(Thread.currentThread().getName()+"Current Balance="+balance);
		if(balance<amt)
			System.out.println("Insufficient Balance");
		else{
			balance-=amt;
			System.out.println("After Withdrawal Balance="+balance);
		}
	}
}
class Animesh implements Runnable{
	Account account;
	
	public Animesh(Account account){
		this.account = account;
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Animesh is going to withdraw");
			account.withdraw(10);
		}
	}
}
class Manas implements Runnable{
	Account account;
	
	public Manas(Account account){
		this.account = account;
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Manas is going to withdraw");
			account.withdraw(10);
		}
	}
}
public class Test6{
	public static void main(String args[]){
		Account ac = new Account(50);
		Thread a = new Thread(new Animesh(ac));
		Thread b = new Thread(new Manas(ac));
		a.start();
		b.start();
    }
}