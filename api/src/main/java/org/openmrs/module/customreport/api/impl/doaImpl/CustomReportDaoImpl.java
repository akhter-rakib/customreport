package org.openmrs.module.customreport.api.impl.doaImpl;

import org.openmrs.module.customreport.api.dao.CustomReportDao;
import org.springframework.stereotype.Repository;

@Repository
public class CustomReportDaoImpl implements CustomReportDao {
	
	@Override
	public String welCome() {
		return "Alhamdulillah";
	}
}
