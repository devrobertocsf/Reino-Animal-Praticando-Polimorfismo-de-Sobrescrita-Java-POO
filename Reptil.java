package aula12;

public class Reptil extends Animal {
// atributo  de reptil
private String corEscama;

//metodos da classe abstrata de animal com override
@Override
public void locomover() {
	System.out.println("Rastejando");
}

@Override
public void alimentar() {
	System.out.println("Comendo vegetais");
}

@Override
public void emitirSom() {
	System.out.println("som de RÉPTIL");
}


//get/set de reptil
public String getCorEscama() {
	return corEscama;
}

public void setCorEscama(String corEscama) {
	this.corEscama = corEscama;
}



}

