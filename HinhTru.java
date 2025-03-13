package bai1;
import java.util.Scanner;
public class HinhTru extends HinhTron {
	public float chieucao;
	
	public HinhTru(){
		ten="Hinh tru";
	}
	@Override

	public void nhapchieucao(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap chieu cao: ");
		chieucao= nhap.nextFloat();
	}
	@Override
	public void nhapbankinh(){
		System.out.print("Nhap ban kinh: ");
		Scanner nhap = new Scanner(System.in);
		bankinh = nhap.nextFloat();
	}
	@Override
	public void tinhthetich(){
		thetich=Pi*bankinh*bankinh*chieucao;
	}
}
