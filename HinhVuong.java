package bai1;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
	public HinhVuong(){
		ten="Hinh vuong";
	}
	@Override

	public void nhapcanh(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("nhap canh: ");
		dai=nhap.nextFloat();
	}
	@Override

	public void tinhchuvi(){
		chuvi=dai*4;
	}
	@Override
	public void tinhdientich(){
		dientich=dai*dai;
	}
}
