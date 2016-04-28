package sk.metier;

public abstract class Mammifere extends Vertebre {
public Mammifere (){
	super (); 
}

public Mammifere(String nom, float taille, float poids) {
	super(nom, taille, poids);
}
public boolean allaite(){
	return true; 
}
}
