package entities;
import services.ContaService;

public class ContaPoupancaEntity extends ContaService {
	
	public ContaPoupancaEntity(ClienteEntity cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInformacoesComuns();
	}
	
}
