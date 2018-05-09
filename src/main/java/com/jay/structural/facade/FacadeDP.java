package com.jay.structural.facade;

/**
 * Provide a unified interface to a set of interfaces in a subsystem. Facade
 * Pattern defines a higher-level interface that makes the subsystem easier to
 * use.
 * 
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class FacadeDP {
	public static void main(String[] args) {
		String tableName = "Employee";
		HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
		HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.PDF, "User");
		HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, "Invoice");
		HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.HTML, tableName);
	}
}
