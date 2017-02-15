package util;
import enums.Code;
public class Test {
	public static void main(String[] args) {
        System. out.println(Code.ONE + " : " + Code.valueOf("ONE").getCodeNum());
        System. out.println(Code.TWO + " : " + Code.valueOf("TWO").getCodeNum());
        System. out.println(Code.THREE + " : " + Code.valueOf("THREE").getCodeNum());
  }
}

