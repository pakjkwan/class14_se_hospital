package view;
import javax.swing.JOptionPane;

import controller.AdminController;
import controller.PatientController;
import enums.Butt;
public class Index {
	public static void main(String[] args) {
		Butt[] buttons = {Butt.EXIT,Butt.PAT_INTRO,Butt.ADMIN_INTRO};
		Butt select = (Butt)JOptionPane.showInputDialog(
				null, // frame
				"INTRO PAGE", // frame title
		        "SELECT INTRO MENU",  // order
		        JOptionPane.QUESTION_MESSAGE, // type
		        null, // icon
		        buttons, // Array of choices
		        buttons[2] // default
		        );
		switch(select){
		case EXIT: return;
		case PAT_INTRO: new PatientController().start();break;
		case ADMIN_INTRO: new AdminController().start();break;
		}
	}
}
