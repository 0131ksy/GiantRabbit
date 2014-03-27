package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import exception.EmpnoNotExistException;
import view.EmpFailView;
import view.EmpSuccessView;
import model.dao.EmpDAO;
import model.domain.Emp;

public class EmpController {
	//��� ������ �˻�
	public static void getAllEmp(){
		try {
			EmpSuccessView.printAll(EmpDAO.getAllEmp());
		} catch (SQLException e) {
			e.printStackTrace();
			EmpFailView.failMsg("��� �˻� ����");
		}
	}
	
	//�ϳ��� ������ �˻�
	public static void getOneEmp(int empno){
		try {
			EmpSuccessView.printEmp(EmpDAO.getOneEmp(empno));
		} catch (SQLException e) {
			e.printStackTrace();
			EmpFailView.failMsg("�˻� ����");
		}
	}
	
	//�߰�
	public static void insertEmp(Emp e){
		try {
			if(EmpDAO.insertEmp(e)){
				EmpSuccessView.successMsg("������ �߰� ����");
			}else{
				EmpFailView.failMsg("������ �߰� ����");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
			EmpFailView.failMsg("������ �߰� ���� �ٽ� �õ��ϼ���");
		}
	}
	
	//����
	public static void deleteEmp(int empno){
		
			try {
				if(EmpDAO.deleteEmp(empno)){
					EmpSuccessView.successMsg("���� ����");
				}else{
					EmpFailView.failMsg("���� ����");
				}
			} catch (EmpnoNotExistException e) {
				e.printStackTrace();
				EmpFailView.failMsg(e.getMessage());
			} catch (SQLException e) {
				e.printStackTrace();
				EmpFailView.failMsg("���� ���� �ٽ� �õ��ϼ���");
			}
	}
	//����
	public static void updateEmp(int empno, String ename, String job){
		try {
			if(EmpDAO.updateEmp(empno, ename, job)){
				EmpSuccessView.successMsg("���� ����");
			}else{
				EmpFailView.failMsg("���� ����");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
			EmpFailView.failMsg("���� ���� �ٽ� �õ��ϼ���");
		}
	}
}
