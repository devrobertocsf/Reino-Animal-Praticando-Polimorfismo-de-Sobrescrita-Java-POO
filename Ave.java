package aula12;

public class Ave extends Animal {
// atributo de ave
	private String corPena;
	
// metodo somente da ave
public void fazerNinho() {
	System.out.println("Fazendo um ninho...");
}
//metodos da classe abstrata de animal com override
	
@Override	
public void locomover() {
	System.out.println("Voando");
}
	
@Override
public void alimentar() {
	System.out.println("Comendo frutas");
}

@Override
public void emitirSom() {
	System.out.println("Som da ave");
	
}


// get/set dos atributos da ave
public String getCorPena() {
	return corPena;
}

public void setCorPena(String corPena) {
	this.corPena = corPena;
}



}
