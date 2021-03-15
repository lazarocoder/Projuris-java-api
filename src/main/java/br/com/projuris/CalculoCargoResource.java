package br.com.projuris;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculoCargoResource {
	private List<Funcionario> listaFuncionario;
	private Calculo calculo;
	
	public CalculoCargoResource() {
		calculo = new MyCalculo();
		listaFuncionario = new FuncionarioResource().getListaFuncionario();
	}

	@RequestMapping(value="/calculo/cargo", method = RequestMethod.GET)
	public ResponseEntity<List<CustoCargo>> listar() {
		return new ResponseEntity<List<CustoCargo>>(calculo.custoPorCargo(listaFuncionario), HttpStatus.OK);
	}
}
