package differentia;
import java.util.Scanner;
//最適hは0.000000001より大きく、0.00000001未満である
//その理由は分子の計算段階で桁落ちが発生しているからと思われる
public class Differentia_main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan = new Scanner(System.in);
System.out.println("a=");
double a = Double.parseDouble(scan.next());
System.out.println("h=");
double h = Double.parseDouble(scan.next());
Differentia_lib clib = new Differentia_lib(a,h);
System.out.println(a+"の微分の理論値は"+clib.Rx());
System.out.println(a+"の"+h+"による微分の計算値は"+clib.Dx());	
h=clib.Rx()-clib.Dx();
h=100*h/clib.Rx();
h=Math.abs(h);
System.out.println("誤差は"+h+"%");
	}

}
