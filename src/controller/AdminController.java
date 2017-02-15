package controller;
import javax.swing.JOptionPane;

import constants.Hospital;
import domain.DoctorBean;
import domain.NurseBean;
import domain.PatientBean;
import enums.Butt;
import service.AdminService;
import serviceImpl.AdminServiceImpl;
public class AdminController {
	
	public void start(){
		AdminService service = new AdminServiceImpl();
		DoctorBean doc = null;
		NurseBean nur = null;
		PatientBean pat = null;
		Butt[] buttons = {
				Butt.EXIT,
				Butt.DOC_ADD,Butt.DOC_FIND_BY_ID,Butt.DOC_FIND_BY_NAME,Butt.DOC_LIST,
				Butt.DOC_UPDATE,Butt.DOC_DELETE,
				Butt.NUR_ADD,Butt.NUR_FIND_BY_ID,
				Butt.NUR_FIND_BY_NAME,Butt.NUR_LIST,Butt.NUR_UPDATE,Butt.NUR_DELETE};
		while(true){
		Butt select = (Butt)JOptionPane.showInputDialog(
				null, // frame
				"PATIENT PAGE", // frame title
		        "SELECT PATIENT MENU",  // order
		        JOptionPane.QUESTION_MESSAGE, // type
		        null, // icon
		        buttons, // Array of choices
		        buttons[1] // default
		        );
		
			switch(select){
			case EXIT: 
				 JOptionPane.showConfirmDialog(null, "EXIT OK??"); 
				 return;
			case DOC_ADD:
				DoctorBean doctor = new DoctorBean();
				String[] docArr = JOptionPane.showInputDialog("ID , 이름").split(","); 
				doctor.setUid(docArr[0]);
				doctor.setName((docArr[1]));
				service.regist(doctor);
				break;
			case DOC_FIND_BY_ID:break;
			case DOC_FIND_BY_NAME:break;
			case DOC_LIST:break;
			case DOC_UPDATE:break;
			case DOC_DELETE:break;
			case NUR_ADD:
				NurseBean nurse = new NurseBean();
				String[] nurArr = JOptionPane.showInputDialog("ID , 이름").split(","); 
				nurse.setUid(nurArr[0]);
				nurse.setName((nurArr[1]));
				service.regist(nurse);
				break;
			case NUR_FIND_BY_ID:break;
			case NUR_FIND_BY_NAME:break;
			case NUR_LIST:break;
			case NUR_UPDATE:break;
			case NUR_DELETE:break;
			}
		}
	}
}
