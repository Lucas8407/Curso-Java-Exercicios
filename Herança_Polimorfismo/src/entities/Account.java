package entities;

public abstract class Account { // o abstract não permite que a classe seja instanciada, evitando erros. Para instanciar basta remover o abstract
	
	private Integer number;
	private String holder;
	protected Double balance; //protected: será acessado pela classe BusinessAcount tb, que herda essa clase
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw (double ammount) {
		balance -= ammount + 5.0;
	}
	
	
	public void deposit (double ammount) {
		balance += ammount;
	}
	
	
	
}
