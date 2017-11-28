package cms.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import cms.Users;
import cms.admin.Admin;
import cms.complaint.Complaint;
import cms.feedback.Feedback;
import cms.status.Status;
import cms.tech.Technician;;

public class Solution {

	public static void main(String[] args) {
		Users user = new Users();
		user.setId(10);
		user.setName("");
		user.setEmailId("");
		user.setAddress("");
		user.setProductId(1);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		Technician technician = new Technician();
		technician.setTechName("");
		technician.setTechSpecialist("");
		session.save(technician);
		Complaint complaint = new Complaint(1);
		complaint.setProductId(user.getProductId());
		complaint.setComplaint("");
		session.save(complaint);
		Admin admin=new Admin();
		admin.setCid(1);
		admin.setProductId(1);
		admin.setTechId(1);
		admin.setUid(1);
		session.save(admin);
		Status status=new Status();
		session.save(status);
		Feedback fb=new Feedback();
		session.save(fb);
		session.getTransaction().commit();
		session.close();
	}

}
