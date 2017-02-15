package serviceImpl;

import domain.MemberBean;
import domain.PatientBean;
import service.AdminService;
import domain.DoctorBean;
import domain.NurseBean;
public class AdminServiceImpl2 implements AdminService{
	private DoctorBean[] doctorList;
	private NurseBean[] nurseList;
	private int[] countArr; // 0: docList, 1:nurList

	public AdminServiceImpl2() {
		countArr[0]=countArr[1]=0;
		doctorList = new DoctorBean[countArr[0]];
		nurseList = new NurseBean[countArr[1]];
	}
	@Override
	public String getBmi(PatientBean pat) {
		String result = "";
		double weight = Double.parseDouble(pat.getWeight());
		double height = Double.parseDouble(pat.getHeight());
		double bmi =  weight / (height* height);
		if (bmi > 30.0) {
			result = "고도비만";
		} else if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0) {
			result = "과체중";
		} else if (bmi > 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;
	}
	@Override
	public void regist(MemberBean member) {
		if (member instanceof DoctorBean) {
			DoctorBean doctor = (DoctorBean) member; 
			if (countArr[0] == doctorList.length) {
				DoctorBean[] temp = new DoctorBean[countArr[0] + 10];
				System.arraycopy(doctorList, 0, temp, 0, countArr[0]);
				doctorList = temp;
			}
			doctorList[countArr[0]++] = doctor;
		} else if (member instanceof NurseBean) { 
			NurseBean nurse = (NurseBean) member;
			if (countArr[1] == nurseList.length) {
				NurseBean[] temp = new NurseBean[countArr[1] + 10];
				System.arraycopy(nurseList, 0, temp, 0, countArr[1]);
				nurseList = temp;
			}
			nurseList[countArr[1]++] = nurse;
		}
		
	}
	@Override
	public MemberBean findById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean[] findByName(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DoctorBean[] doctorList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public NurseBean[] nurseList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void change(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean exist(MemberBean member) {
		boolean check = false;
		
		return false;
	}
	@Override
	public int countByName(MemberBean member) {
		// TODO Auto-generated method stub
		return 0;
	}
}
