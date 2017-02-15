package domain;

public class PatientBean extends MemberBean{
	private String patJob,height,weight,bloodType,docId, nurId;
	
	

	public String getPatJob() {
		return patJob;
	}



	public void setPatJob(String patJob) {
		this.patJob = patJob;
	}



	public String getHeight() {
		return height;
	}



	public void setHeight(String height) {
		this.height = height;
	}



	public String getWeight() {
		return weight;
	}



	public void setWeight(String weight) {
		this.weight = weight;
	}



	public String getBloodType() {
		return bloodType;
	}



	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}



	public String getDocId() {
		return docId;
	}



	public void setDocId(String docId) {
		this.docId = docId;
	}



	public String getNurId() {
		return nurId;
	}



	public void setNurId(String nurId) {
		this.nurId = nurId;
	}



	@Override
	public String toString() {
		return String.format(
				 "%s "
				+ "님 진료 접수 되었습니다",
				name);
	}

}
