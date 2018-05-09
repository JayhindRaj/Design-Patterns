/**
 * 
 */
package com.jay.structural.facade;

import java.sql.Connection;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class OracleHelper {
	public static Connection getOracleDBConnection() {
		return null;
	}

	public void generateOracleHTMLReport(String table, Connection connection) {
		System.out.println("Generating Oracle HTML report..");
	}

	public void generateOraclePDFReport(String table, Connection connection) {
		System.out.println("Generating Oracle PDF report..");
	}

}
