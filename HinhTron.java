package bai1;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
	public float bankinh;

	public HinhTron(){
		ten="Hinh Tron";
	}
	public void nhapbankinh(){
		System.out.print("Nhap ban kinh: ");
		Scanner nhap = new Scanner(System.in);
		bankinh = nhap.nextFloat();
	}
	public void tinhchuvi(){
		chuvi=Pi*2*bankinh;
	}
	
	public void tinhdientich(){
		dientich=Pi*bankinh*bankinh;
	}
}
