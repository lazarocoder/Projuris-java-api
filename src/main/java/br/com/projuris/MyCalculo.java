package br.com.projuris;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCalculo implements Calculo {

	@Override
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		List<CustoCargo> listaCustoCargo = new ArrayList<CustoCargo>();
		Iterator<Funcionario> iterator = funcionarios.iterator();

		while (iterator.hasNext()) {
			Funcionario funcionario = iterator.next();

			CustoCargo custoCargo = listaCustoCargo.stream().filter(c -> c.getCargo().equals(funcionario.getCargo()))
					.findFirst().orElse(new CustoCargo());

			custoCargo.setCargo(funcionario.getCargo());
			int index = listaCustoCargo.indexOf(custoCargo);
			custoCargo.setCusto(custoCargo.getCusto() == null ? funcionario.getSalario()
					: funcionario.getSalario().add(custoCargo.getCusto()));
			if (index < 0) {
				listaCustoCargo.add(custoCargo);
			} else {
				listaCustoCargo.set(index, custoCargo);
			}
		}

		return listaCustoCargo;
	}

	@Override
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		List<CustoDepartamento> listaCustoDepartamento = new ArrayList<CustoDepartamento>();
		Iterator<Funcionario> iterator = funcionarios.iterator();

		while (iterator.hasNext()) {
			Funcionario funcionario = iterator.next();

			CustoDepartamento custoDepartamento = listaCustoDepartamento.stream().filter(c -> c.getDepartamento().equals(funcionario.getDepartamento()))
					.findFirst().orElse(new CustoDepartamento());

			custoDepartamento.setDepartamento(funcionario.getDepartamento());
			int index = listaCustoDepartamento.indexOf(custoDepartamento);
			custoDepartamento.setCusto(custoDepartamento.getCusto() == null ? funcionario.getSalario()
					: funcionario.getSalario().add(custoDepartamento.getCusto()));
			if (index < 0) {
				listaCustoDepartamento.add(custoDepartamento);
			} else {
				listaCustoDepartamento.set(index, custoDepartamento);
			}
		}

		return listaCustoDepartamento;
	}

}
