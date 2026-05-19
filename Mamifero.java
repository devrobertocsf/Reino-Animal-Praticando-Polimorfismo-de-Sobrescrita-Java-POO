package aula12;

public class Mamifero extends Animal {
// atributo de mamifero
private String corPelo;


// metodos da classe abstrata de animal com override
@Override
public void locomover() {
	System.out.println("Correndo");
}

@Override
public void alimentar() {
	System.out.println("Mamando");
}


@Override
public void emitirSom() {
	System.out.println("som de mamifero");
}


// get/set de mamifero
public String getCorPelo() {
	return corPelo;
}

public void setCorPelo(String corPelo) {
	this.corPelo = corPelo;
}


}
