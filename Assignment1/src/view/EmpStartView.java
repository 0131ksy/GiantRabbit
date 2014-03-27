package view;

import java.sql.SQLException;

import controller.EmpController;
import model.dao.EmpDAO;
import model.domain.Emp;

public class EmpStartView {
	public static void main(String[] args) {
		System.out.println("����hihello");
		System.out.println("����õ��ٺ�");
		//emp01 ������ ��� ���
		System.out.println("*** emp01 ������ ��� ��� ***");
		EmpController.getAllEmp();
		
		System.out.println();
		System.out.println("*** empno:7369 ������ ��� ***");
		EmpController.getOneEmp(7369);
		
		System.out.println();
		System.out.println("*** empno:7369 ������ ���� ***");
		EmpController.deleteEmp(7369);
		
		System.out.println();
		System.out.println("*** ���� �� empno:7369 ������ ��� ***");
		EmpController.getOneEmp(7369);
		
		System.out.println();
		System.out.println("*** ������ �߰� ***");
		EmpController.insertEmp(new Emp(1,"Im","programer", 11,  11, 22, 33));
		
		System.out.println();
		System.out.println("*** �߰��� ������ ��� ***");
		EmpController.getOneEmp(1);
		
		System.out.println();
		System.out.println("*** ���� �� empno:7934 ������ ��� ***");
		EmpController.getOneEmp(7934);
		
		System.out.println("*** empno:7934 ������ ���� ***");
		EmpController.updateEmp(7934, "ucamp", "manager");
		
		System.out.println();
		System.out.println("*** ���� �� empno:7934 ������ ��� ***");
		EmpController.getOneEmp(7934);
		
	}
}
