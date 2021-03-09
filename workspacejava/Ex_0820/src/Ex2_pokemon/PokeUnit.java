package Ex2_pokemon;

public class PokeUnit {
	
	String name = "";
	String type = "";
	int cp = 0;
	
	public void myPokemon(String name, String type, int cp) {//메서드 첫 글자는 반드시 소문자
		System.out.println("이름 : " + name);
		System.out.println("타입 : " + type);
		System.out.println("cp : " + cp);
		System.out.println("---------------------------");
	}
	
}
