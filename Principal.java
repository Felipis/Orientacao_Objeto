package projeto_01;

public class Principal {

	public static void main(String[] args) {
		conta primeiro = new conta();
		primeiro.saldo = 200;
		System.out.println("Saldo na conta incial = " + primeiro.saldo);
		primeiro.depositar(200);
		System.out.println("Saldo após o depósito = " + primeiro.extrato());
		System.out.println(primeiro.sacar(500));
		System.out.println("Saldo final da conta = " + primeiro.saldo);
		System.out.println(primeiro.extrato());
		
	}

}
