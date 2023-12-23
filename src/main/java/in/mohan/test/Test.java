package in.mohan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.mohan.Appconfig;
import in.mohan.bean.Report;

public class Test {
public static void main(String[] args) {
	ApplicationContext   st=new AnnotationConfigApplicationContext(Appconfig.class);
	Report  service=st.getBean(Report.class);
	// service.generatereport();
}
}
