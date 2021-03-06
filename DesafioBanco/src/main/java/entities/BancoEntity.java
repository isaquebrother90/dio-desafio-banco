package entities;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import services.ContaService;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BancoEntity {

	private static final String NOME = "Ita?";
	private List<ContaService> contas;
	private ContaService cs;

}
