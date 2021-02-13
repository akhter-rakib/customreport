package org.openmrs.module.customreport.api.impl.doaImpl;

import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.customreport.api.dao.CustomReportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomReportDaoImpl implements CustomReportDao {
	
	@Autowired
	DbSessionFactory dbSessionFactory;
	
	@Override
	public String welCome() {
		dbSessionFactory.getCurrentSession();
		return "Alhamdulillah";
	}
}
