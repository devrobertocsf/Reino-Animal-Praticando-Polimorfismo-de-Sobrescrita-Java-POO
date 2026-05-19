package aula12;

public class Peixe extends Animal {
// atributo de peixe
private String corEscama;
	
//metodos da classe abstrata de animal com override
	
@Override
public void locomover() {
	System.out.println("Nadando");
}

@Override

public void alimentar() {
	System.out.println("Comendo substâncias");
}
@Override

public void emitirSom() {
	System.out.println("Peixe não faz som");
}

// metodo apenas do peixe
public void soltarBolhar() {
	System.out.println("Soltando bolhas...");
}


//get/set de peixe
public String getCorEscama() {
	return corEscama;
}

public void setCorEscama(String corEscama) {
	this.corEscama = corEscama;
}


}
