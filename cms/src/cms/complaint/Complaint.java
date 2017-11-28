package cms.complaint;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cms.Users;

@Entity

public class Complaint extends Users {
	@Id
	@GeneratedValue(generator="assigned")
	private Integer productId;
	private String complaint;
	public Complaint() {
		super();
		
	}
	public Complaint(Integer productId) {
		super();
		this.productId = productId;
	}
	public Integer getproductId() {
		return productId;
	}
	public void setproductId(Integer productId) {
		this.productId = productId;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	
	
	
	

}
