package Task;

public class AbstractPlayer {
	protected int id;
    protected String name;
    protected String skill;
    protected int exp;
    protected String country;
    protected double overall_score;
    
	public AbstractPlayer(int id, String name, String skill, int exp, String country, double overall_score) {
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
		this.exp = exp;
		this.country = country;
		this.overall_score = overall_score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSkill() {
		return skill;
	}

	public int getExp() {
		return exp;
	}

	public String getCountry() {
		return country;
	}

	public double getOverall_score() {
		return overall_score;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setOverall_score(double overall_score) {
		this.overall_score = overall_score;
	}
    
    
}
