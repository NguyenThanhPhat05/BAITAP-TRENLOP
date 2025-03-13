package bai1;
import java.util.Scanner;
import bai1.HinhHoc;
import bai1.HinhChuNhat;
import bai1.HinhTron;
import bai1.HinhTru;
import bai1.HinhVuong;
public class mainbai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc hinhtron = new HinhTron();
		HinhHoc hinhchunhat = new HinhChuNhat();
		HinhHoc hinhtru = new HinhTru();
		HinhHoc hinhvuong = new HinhVuong();
		
		hinhtron.xuatten();
		hinhtron.nhapbankinh();
		hinhtron.tinhchuvi();
		hinhtron.tinhdientich();
		hinhtron.inchuvi();
		hinhtron.indientich();
		
		hinhchunhat.xuatten();
		hinhchunhat.nhapchieudai();
		hinhchunhat.nhapchieurong();
		hinhchunhat.tinhchuvi();
		hinhchunhat.tinhdientich();
		hinhchunhat.inchuvi();
		hinhchunhat.indientich();
		
		hinhtru.xuatten();
		hinhtru.nhapchieucao();	
		hinhtru.nhapbankinh();
		hinhtru.tinhthetich();
		hinhtru.inthetich();
		
		hinhvuong.xuatten();
		hinhvuong.nhapcanh();
		hinhvuong.tinhchuvi();
		hinhvuong.tinhdientich();
		hinhvuong.inchuvi();
		hinhvuong.indientich();

	}

}
