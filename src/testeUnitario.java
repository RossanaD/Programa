import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class testeUnitario {

	@Test
	void test() {
		Pessoas p = new Pessoas("Teste", "Sobrenome");
		assertEquals("Teste", p.getNome());
		assertEquals("Sobrenome", p.getSobrenome());
	}
	
	@Test
	void test1() {
		Pessoas p = new Pessoas("Teste", "Sobrenome");
		Sala s = new Sala("SalaTeste", 2);
		EspacoCafe ec = new EspacoCafe("EspaçoTeste", 2);
		p.setSala(s);
		p.setCafe(ec);
		assertEquals("SalaTeste", s.getNomeSala());
		assertEquals("EspaçoTeste", ec.getNomeCafe());
		assertEquals(2, ec.getLotacaoCafe());
		assertEquals(2, s.getLotacao());
	}

	@Test
	void test2() {
		Pessoas p = new Pessoas("Teste", "Sobrenome");
		Sala s = new Sala("SalaTeste", 2);
		EspacoCafe ec = new EspacoCafe("EspaçoTeste", 2);
		p.setSala(s);
		p.setCafe(ec);
		s.addPessoa(p);
		ec.addPessoa(p);
		String str = s.exibir();
		String str1 = ec.exibir();
		assertEquals("Nome: Teste Sobrenome\n", str);
		assertEquals("Nome: Teste Sobrenome\n", str1);
	}
	
	@Test
	void test3() {
		Pessoas p = new Pessoas("Teste", "Sobrenome");
		Sala s = new Sala("SalaTeste", 2);
		EspacoCafe ec = new EspacoCafe("EspaçoTeste", 2);
		Pessoas p1 = new Pessoas("Teste1", "Sobrenome1");
		p.setSala(s);
		p.setCafe(ec);
		p1.setSala(s);
		p1.setCafe(ec);
		s.addPessoa(p);
		ec.addPessoa(p);
		s.addPessoa(p1);
		ec.addPessoa(p1);
		String str = s.exibir();
		String str1 = ec.exibir();
		assertEquals("Nome: Teste Sobrenome\nNome: Teste1 Sobrenome1\n", str);
		assertEquals("Nome: Teste Sobrenome\nNome: Teste1 Sobrenome1\n", str1);
	}
}
