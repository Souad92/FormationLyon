package sk.metier;

public class PilePleineException extends PileException {

	public PilePleineException() {

	}

	public String toString() {
		return "Pile Pleine";
	}

	@Override
	public String getMessage() {
		return "Pile Pleine";
	}
}
