package view;

import java.util.ArrayList;

import model.domain.Emp;

public class EmpSuccessView {
	public static void successMsg(String msg){
		System.out.println(msg);
	}
	
	public static void printAll(ArrayList<Emp> all){
		if(all.size()!=0){
			for (int i = 0; i < all.size(); i++) {
				System.out.println(i+"�� : "+all.get(i));
			}
		}else{
			System.out.println("EMP���� ������ ������ �ϳ��� �����ϴ�. ");
		}
	}
	
	public static void printEmp(Emp e){
		if(e!=null){
			System.out.println(e);
		}else{
			System.out.println("����Ҽ� �ִ� �����Ͱ� �����ϴ�. ");
		}
	}
}
