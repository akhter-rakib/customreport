package org.openmrs.module.customreport.api.impl.serviceImpl;

import org.openmrs.module.customreport.api.dao.CustomReportDao;
import org.openmrs.module.customreport.api.service.CustomReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomReportServiceImpl implements CustomReportService {
	
	@Autowired
	private CustomReportDao customReportDao;
	
	@Override
	public String welCome() {
		return customReportDao.welCome();
	}
}
