package serviceImpl;

import domain.MemberBean;
import domain.PatientBean;
import service.AdminService;
import domain.DoctorBean;
import domain.NurseBean;
public class AdminServiceImpl implements AdminService{
	
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
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int countByName(MemberBean member) {
		String name = member.getName();

		return 0;
	}
}
