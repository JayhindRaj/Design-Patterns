/**
 * 
 */
package com.jay.structural.facade;

import java.sql.Connection;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class HelperFacade {

	public static void generateReport(DBTypes dbTypes, ReportTypes reportTypes, String tableName) {
		Connection connection = null;

		switch (dbTypes) {
		case MYSQL:
			connection = MySQLHelper.getMySQLDBConnection();
			MySQLHelper helper = new MySQLHelper();

			switch (reportTypes) {
			case HTML:
				helper.generateMySQLHTMLReport(tableName, connection);
				break;

			case PDF:
				helper.generateMySQLPDFReport(tableName, connection);
				break;
			}

			break;

		case ORACLE:

			connection = OracleHelper.getOracleDBConnection();
			OracleHelper helper2 = new OracleHelper();

			switch (reportTypes) {
			case HTML:
				helper2.generateOracleHTMLReport(tableName, connection);
				break;

			case PDF:
				helper2.generateOraclePDFReport(tableName, connection);
				break;
			}
			break;
		}
	}
}
