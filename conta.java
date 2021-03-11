package projeto_01;
//Classe
public class conta {
double saldo;
int agencia;
int conta;
String titular;

//Função 01 sem retorno mas com parametro
void depositar (double valor) {
	//Calculo
	saldo = saldo + valor;
}
//Função 02 com retorno mas sem parametro
double extrato() {
	return saldo;
}
//Função 03 com parametro e tem retorno
String sacar (double valor) {
	if(saldo>=valor) {
		saldo = saldo - valor;
		return "Valor sacado com sucesso!";
	}
	return "Valor insuficiente para sacar";
}

}
