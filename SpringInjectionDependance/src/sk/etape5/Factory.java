package sk.etape5;

public class Factory {

	
	private boolean res;

	public Factory() throws Exception {
		Package p = this.getClass().getPackage();
		System.out.println(p.getName());
		String nomClasse = p.getName()+".B";
		// Class.forName permet de creer une instance d'une classe (avec le newInstance) grace au nom de la classe (en String)
		Class<?> c = Class.forName(nomClasse);
		I i = (I) c.newInstance();
		A a = new A(i);
		res = a.m();
	}

	public boolean isRes() {
		return res;
	}

	public void setRes(boolean res) {
		this.res = res;
	}

}
