package constants;

public class Hospital {
	public final static String HOSPITAL_NAME="한빛 병원";
	public final static String EXE_OPTION=
			"0.EXIT" 
			+ "1.REG-DOCTOR\n" 
			+ "2.REG-NURSE\n"
			+ "3.REG-PATIENT\n"
			+ "4.CHECK BMI\n";
	public final static String DOC_SPEC=
			"INPUT AS 의사ID,담당진료과목,성명,SSN,전화번호,이메일직급";
	public final static String NUR_SPEC=
			"INPUT AS 간호사ID,담당진료과목,성명,SSN,전화번호,이메일직급";
	public final static String ADMIN_MENU="0:종료 1:의사등록 11간호사등록 ";

}
