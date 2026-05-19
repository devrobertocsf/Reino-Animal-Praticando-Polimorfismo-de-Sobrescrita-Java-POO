package aula12;

public class Principal_12 {

	public static void main(String[] args) {
		// NAO PODE CRIAR UM OBJETO DE ANIMAL, POIS A 
		// CLASSE ANIMAL É ABSTRATA
		// Animal n1 = new Animal(); 
		Mamifero m1 = new Mamifero();
		Reptil r1 = new Reptil();
		Peixe p1 = new Peixe();
		Ave a1 = new Ave();
		Canguru c1 = new Canguru();
		Cachorro dog1 = new Cachorro();
		
		
		r1.setIdade(2);
		r1.setCorEscama("verde");
		System.out.println("======================" );
		
		// MAMIFERO
		System.out.println("MAMIFERO: ");
		m1.setPeso(85.3f);
		m1.setIdade(2);
		m1.setMembros(4);
		m1.locomover(); // Correndo
		m1.alimentar(); // mamando
		m1.emitirSom(); // som de mamifero
		System.out.println("======================" );
		
		// PEIXE
		System.out.println("PEIXE: ");
		p1.setPeso(0.35f);
		p1.setIdade(1);
		p1.setMembros(0);
		p1.setCorEscama("Azul");
		p1.soltarBolhar();
		p1.locomover(); // nadando
		p1.alimentar(); // comendo subs
		p1.emitirSom(); // nao tem som
		System.out.println("======================" );
		
		// AVE
		System.out.println("AVE: ");
		a1.setPeso(0.89f);
		a1.setIdade(2);
		a1.setMembros(2);
		a1.fazerNinho();
		a1.locomover(); // voandp
		a1.alimentar(); // come frutas
		a1.emitirSom(); // som de ave
		System.out.println("======================" );

		// CANGURU - MAMIFERO
		System.out.println(" CANGURU - MAMIFERO: ");
		c1.setPeso(55.30f);
		c1.setIdade(3);
		c1.setMembros(4);
		c1.locomover(); // SALTANDO
		c1.alimentar();
		c1.emitirSom();
		c1.usarBolsar();
		System.out.println("======================" );
		
		// CACHORRO - MAMIFERO
		System.out.println(" CACHORRO - MAMIFERO: ");
		dog1.setPeso(3.97f);
		dog1.setIdade(5);
		dog1.setMembros(4);
		dog1.locomover(); // correndo
		dog1.alimentar(); // mamando
		dog1.emitirSom(); // som de mamifero
		System.out.println("======================" );
		
}
}
