package service;
import domain.MemberBean;
import domain.PatientBean;
import domain.DoctorBean;
import domain.NurseBean;
public interface AdminService {
	public abstract String getBmi(PatientBean pat);
	// create
	public void regist(MemberBean member);
	// read
	public MemberBean findById(MemberBean member);
	public MemberBean[] findByName(MemberBean member);
	
	public DoctorBean[] doctorList();
	public NurseBean[] nurseList();
	public int count();
	// update
	public void change(MemberBean member);
	// delete
	public void remove(MemberBean member);
	// util
	// validation
	public boolean exist(MemberBean member);
	public int countByName(MemberBean member);
}
