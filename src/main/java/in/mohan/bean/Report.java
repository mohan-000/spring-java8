package in.mohan.bean;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class Report {
	
	private  ReportDao dao;
	public void generatereport() {
		dao.getData();
		System.out.println("reported generated");
	}
	public ReportDao getDao() {
		return dao;
	}
	@Autowired
	public Report() {
System.out.println("constructor");
}
	
	public void setDao(ReportDao dao) {
	System.out.println("setter");
		this.dao = dao;
	}
}
