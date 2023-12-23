package in.mohan.bean;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class OracledbReport implements Repository1 {

	public void getData() {
		System.out.println("getting data from oracle");		
		
	}

}
