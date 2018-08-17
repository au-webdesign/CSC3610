package Chapter21;

public class Pokemon {
	String name;
	int id;
	String Ability;
	int HP;
	Pokemon( int id, String name, String Ability, int HP){
		this.id = id;
		this.name = name;
		this.Ability = Ability;
		this.HP = HP;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAbility() {
		return Ability;
	}
	public void setAbility(String ability) {
		Ability = ability;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
}
