package com.cg.jpalab.demo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

	

	@Entity
	//@Table(name = "employee_table")
	public class Author implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Id

		private int authorid;


		private String firstName;
		private String lastName;

		public String phoneNo;

		public int getAuthorid() {
			return authorid;
		}

		public void setAuthorid(int authorid) {
			this.authorid = authorid;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public Author(int authorid, String firstName, String lastName, String phoneNo) {
			super();
			this.authorid = authorid;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNo = phoneNo;
		}

		public Author() {
			super();
		}

		@Override
		public String toString() {
			return "Author [authorid=" + authorid + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
					+ phoneNo + "]";
		}
		
}

