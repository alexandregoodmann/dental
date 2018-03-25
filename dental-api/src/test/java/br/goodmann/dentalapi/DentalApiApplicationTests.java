package br.goodmann.dentalapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.goodmann.dentalapi.model.Pessoa;
import br.goodmann.dentalapi.repository.PessoaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DentalApiApplicationTests {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Test
	public void testSavePessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("alexandre");
		pessoaRepository.save(pessoa);
	}

}
