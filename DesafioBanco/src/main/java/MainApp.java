import entities.BancoEntity;
import entities.ClienteEntity;
import entities.ContaCorrenteEntity;
import entities.ContaPoupancaEntity;
import services.ContaService;

public class MainApp {

	public static void main(String[] args) {
		
		ClienteEntity c1 = new ClienteEntity();
		c1.setNome("Fernando");

		ContaService cc = new ContaCorrenteEntity(c1);
		cc.depositar(100);
		
		ContaService cp = new ContaPoupancaEntity(c1);
		
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}

}
