
public class Place {

	private float lgr; 
	private float lar; 
	private int num;
	
	public Place(){
		lgr= 4; 
		lar=2.5f; 
		num=0; 
	}
	
	public Place(float lgr, float lar, int num){
		this.lgr=lgr; 
		this.lar=lar; 
		this.num=num; 
	}
	
	public float getLgr() {
		return lgr;
	}
	public void setLgr(float lgr) {
		this.lgr = lgr;
	}
	public float getLar() {
		return lar;
	}
	public void setLar(float lar) {
		this.lar = lar;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	} 
	
}
