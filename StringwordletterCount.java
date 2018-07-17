
public class Stringchoice {
	public static void main(String[] args) {
		String name = "I LOVE INDIA";

		char ch[] = name.toCharArray();// 'I' 'L'O'V'E' 'I'N'D'I'A'

		for (int i = 0; i <ch.length; i++) {//0<9
			String s = "";
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;

			}
			if (s.length() > 0)
				System.out.print(s + s.length() + " ");

		}

	}

}
