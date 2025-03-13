package bai2;
import bai2.person;
import bai2.Customer;
import bai2.Employee;
public class mainbai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person nv1 = new Employee("Phi","DongNai",100);
		person kh1 = new Customer("Phuc","HCM",50);
		nv1.display();
		kh1.display();
	}
}
