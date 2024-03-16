package com.github.GabrielPl1.thymeleaf.repository;

import java.util.List;
import java.util.ArrayList;

import com.github.GabrielPl1.thymeleaf.model.Pessoa;

public class PessoaRepositoryMockup {
	public List<Pessoa> list(){
		List<Pessoa> result = new ArrayList<>();
		Pessoa pessoa = new Pessoa(1L,"Pelé",'M');
		result.add(pessoa);
		
		pessoa = new Pessoa(2L,"Rainha Elizabeth",'F');
		result.add(pessoa);
		
		pessoa = new Pessoa(3L,"Madonna",'F');
		result.add(pessoa);
		
		return result;
	}

}
