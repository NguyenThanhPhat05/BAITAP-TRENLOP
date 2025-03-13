package bai1;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
	public float dai;
	public float rong;
	public HinhChuNhat(){
		ten="Hinh chu nhat";
	}
	@Override
	public void nhapchieudai(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		dai = nhap.nextFloat();
	}
	@Override
	public void nhapchieurong(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap chieu rong: ");
		rong = nhap.nextFloat();
	}
	@Override

	public void tinhchuvi(){
		chuvi=(dai+rong)*2;
	}
	@Override

	public void tinhdientich(){
		dientich=dai*rong;
	}
}
