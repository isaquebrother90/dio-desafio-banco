package entities;
import services.ContaService;

public class ContaCorrenteEntity extends ContaService {
	
	public ContaCorrenteEntity(ClienteEntity cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInformacoesComuns();
	}
	
}
