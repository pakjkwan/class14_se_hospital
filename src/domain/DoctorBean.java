package domain;

public class DoctorBean extends MemberBean{
	private String docPosition,majorTreat,profileImg;
	
	public String getDocPosition() {
		return docPosition;
	}

	public void setDocPosition(String docPosition) {
		this.docPosition = docPosition;
	}

	public String getMajorTreat() {
		return majorTreat;
	}

	public void setMajorTreat(String majorTreat) {
		this.majorTreat = majorTreat;
	}
	

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	@Override
	public String toString() {
		return String.format(
				"의사ID: %s\n"
				+ "담당진료과목: %s\n"
				+ "성명: %s\n"
				+ "성별: %s\n"
				+ "전화번호: %s\n"
				+ "이메일: %s\n"
				+ "직급: %s\n",
				"");
	}
	
}
