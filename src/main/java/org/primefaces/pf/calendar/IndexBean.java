package org.primefaces.pf.calendar;

import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Mehmet Akif Bektaş
 */
@ManagedBean(name = "index")
@ViewScoped
public class IndexBean {

	private Date date;

	public IndexBean() {
		System.out.println("IndexBean is initialized.");
		date = Calendar.getInstance().getTime();
	}

	public String onSelect() {
		System.out.println("IndexBean - onSelect is called.");
		System.out.println("Selected Date: " + date);
		return "index";
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}
