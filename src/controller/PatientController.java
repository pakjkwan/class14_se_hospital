package controller;

import javax.swing.JOptionPane;

import constants.Hospital;
import domain.*;
import service.AdminService;
import serviceImpl.AdminServiceImpl;
import enums.Butt;
public class PatientController {
	Butt buttons;
	public void start() {
		AdminService service = new AdminServiceImpl();
		DoctorBean doc = null;
		NurseBean nur = null;
		PatientBean pat = null;
		Butt[] buttons = {Butt.EXIT,Butt.PAT_ADD};
		Butt select = (Butt)JOptionPane.showInputDialog(
				null, // frame
				"PATIENT PAGE", // frame title
		        "SELECT PATIENT MENU",  // order
		        JOptionPane.QUESTION_MESSAGE, // type
		        null, // icon
		        buttons, // Array of choices
		        buttons[1] // default
		        );
		
			switch (select) {
			case EXIT:return;
			case PAT_ADD:
				doc = new DoctorBean();
				String docInfo = JOptionPane.showInputDialog(Hospital.DOC_SPEC);
				String[] docInfoArr = docInfo.split(",");
				doc.setUid(docInfoArr[0]);
				//doc.setMajorTreat(docInfoArr[1]);
				//doc.setName(docInfoArr[2]);
				// .....
				JOptionPane.showMessageDialog(null, doc.getUid());
				break;
			}

	}	
}