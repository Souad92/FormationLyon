package sk.metier;

public class PileVideException extends PileException {

	public PileVideException() {

	}

	public String toString() {
		return "Pile Vide";
	}

	@Override
	public String getMessage() {
		return "Pile Vide";
	}
	
}
