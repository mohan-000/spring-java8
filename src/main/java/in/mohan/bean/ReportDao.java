package in.mohan.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository

@Primary
public class ReportDao implements Repository1 {

	public void getData() {
		System.out.println("getting datafrom mysql database");
	}

}
