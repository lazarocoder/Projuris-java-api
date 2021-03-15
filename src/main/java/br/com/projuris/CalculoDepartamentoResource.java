package br.com.projuris;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculoDepartamentoResource {
	private List<Funcionario> listaFuncionario;
	private Calculo calculo;

	public CalculoDepartamentoResource() {
		calculo = new MyCalculo();
		listaFuncionario = new FuncionarioResource().getListaFuncionario();
	}

	@RequestMapping(value="/calculo/departamento", method = RequestMethod.GET)
	public ResponseEntity<List<CustoDepartamento>> listar()
	{
		return new ResponseEntity<List<CustoDepartamento>>(calculo.custoPorDepartamento(listaFuncionario), HttpStatus.OK);
	}
}
