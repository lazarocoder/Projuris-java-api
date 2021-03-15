package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioResource {
	private List<Funcionario> listaFuncionario;

	public FuncionarioResource() {
		listaFuncionario = new ArrayList<>();

		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", BigDecimal.valueOf(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", BigDecimal.valueOf(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", BigDecimal.valueOf(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", BigDecimal.valueOf(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", BigDecimal.valueOf(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", BigDecimal.valueOf(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", BigDecimal.valueOf(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", BigDecimal.valueOf(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", BigDecimal.valueOf(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", BigDecimal.valueOf(13000.0));

		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5);
		listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7);
		listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9);
		listaFuncionario.add(funcionario10);
	}

	@RequestMapping(value = "/funcionarios", method = RequestMethod.GET)
	public ResponseEntity<List<Funcionario>> listar() {
		return new ResponseEntity<List<Funcionario>>(listaFuncionario, HttpStatus.OK);
	}

	@RequestMapping(value = "funcionarios/{index}", method = RequestMethod.GET)
	public ResponseEntity<Funcionario> buscar(@PathVariable("index") Integer index) {
		Funcionario funcionario;
		try {
			funcionario = listaFuncionario.get(index);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Funcionario>(funcionario, HttpStatus.OK);
	}

	public List<Funcionario> getListaFuncionario() {
		return listaFuncionario;
	}

	public void setListaFuncionario(List<Funcionario> listaFuncionario) {
		this.listaFuncionario = listaFuncionario;
	}
}
