package lib1;

public class InvertCase {

	public static void main(String[] args) {
		StringBuffer st = new StringBuffer("AbcDefXY");

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (Character.isUpperCase(ch))
				st.setCharAt(i, Character.toLowerCase(ch));
			else if (Character.isLowerCase(ch))
				st.setCharAt(i, Character.toUpperCase(ch));
		}

		System.out.println(st);
	}
}
