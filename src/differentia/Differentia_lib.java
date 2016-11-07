package differentia;

public class Differentia_lib implements Differential_inf {
private double a,h;

	public Differentia_lib(double a, double h) {
	this.a = a;
	this.h = h;
}

	@Override
	public double Dx() {
		// TODO 自動生成されたメソッド・スタブ
	
		double dx=((a+h)*(a+h)-a*a)/h;
		return dx;
					}

	@Override
	public double Rx() {
		// TODO 自動生成されたメソッド・スタブ
		double rx= 2*this.a;
		return rx;
	}

}
