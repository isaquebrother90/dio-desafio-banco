package services;
import entities.ClienteEntity;
import interfaces.ContaInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class ContaService implements ContaInterface {
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private ClienteEntity cliente;
	
	public ContaService(ClienteEntity cliente) {
		this.agencia = ContaService.AGENCIA_PADRAO;;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	//public Conta

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(double valor, ContaInterface contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("N?mero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
