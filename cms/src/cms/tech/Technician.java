package cms.tech;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Technician {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer techId;
	private String techName;
	private String techSpecialist;

	public Technician() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getTechId() {
		return techId;
	}
	public void setTechId(Integer techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public String getTechSpecialist() {
		return techSpecialist;
	}
	public void setTechSpecialist(String techSpecialist) {
		this.techSpecialist = techSpecialist;
	}


}
