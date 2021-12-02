package com.hellokoding.tutorials.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class BookingDetails {
	@Entity
	@Table(name="booking_details")
	public class BookDetails {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int transactionid;
		private String moviename;
		private String customername;
		private String bdate;
		private String cmobile;
		private String city;
		private String mtheater;
		private String show;
		private String seat;
		public int getTransactionid() {
			return transactionid;
		}
		public void setTransactionid(int transactionid) {
			this.transactionid = transactionid;
		}
		public String getMoviename() {
			return moviename;
		}
		public void setMoviename(String moviename) {
			this.moviename = moviename;
		}
		public String getCustomername() {
			return customername;
		}
		public void setCustomername(String customername) {
			this.customername = customername;
		}
		public String getBdate() {
			return bdate;
		}
		public void setBdate(String bdate) {
			this.bdate = bdate;
		}
		public String getCmobile() {
			return cmobile;
		}
		public void setCmobile(String cmobile) {
			this.cmobile = cmobile;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getMtheater() {
			return mtheater;
		}
		public void setMtheater(String mtheater) {
			this.mtheater = mtheater;
		}
		public String getShow() {
			return show;
		}
		public void setShow(String show) {
			this.show = show;
		}
		public String getSeat() {
			return seat;
		}
		public void setSeat(String seat) {
			this.seat = seat;
		}
		@Override
		public String toString() {
			return "BookDetails [transactionid=" + transactionid + ", moviename=" + moviename + ", customername="
					+ customername + ", bdate=" + bdate + ", cmobile=" + cmobile + ", city=" + city + ", mtheater="
					+ mtheater + ", show=" + show + ", seat=" + seat + "]";
		}
		
		
	
	
	
	
	}
	
	
	
}
