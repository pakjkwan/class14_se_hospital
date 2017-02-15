package enums;

public enum Code {
	 ONE(1), TWO(2), THREE(3);

	  Code(int num) {// 생성자
	         CodeNum = num;
	  }

	  int CodeNum;

	  public int getCodeNum(){
	          return CodeNum;
	}
}
