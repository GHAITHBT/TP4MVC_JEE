package modele;

public class Numberbean {
	private int number;
	public double getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Numberbean() {
		setNumber(0);
		
	}
public static double GetRandom(String nombresaisi) {
	int nombresaisi1=Integer.parseInt(nombresaisi);
	return Math.random()*nombresaisi1;
}
}
