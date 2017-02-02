/**
 *   File Name: DataHelper.java<br>
 *
 *   bouimer, greg<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 30, 2017
 *
 */

package com.sqa.gb.helpers;

/**
 * DataHelper //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author bouimer, greg
 * @version 1.0.0
 * @since 1.0
 *
 */
public class DataHelper {

	// Static Method
	public static String displayData(Object[][] data) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				sb.append(data[i][j] + "\t");
			}
			sb.append("\n");
		}
		return sb.toString();

	}

	// Instance Method (Will need a constructor that takes the Object[][])
	public String displayData() {
		return null;
	}

}
