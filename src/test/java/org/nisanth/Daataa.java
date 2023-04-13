package org.nisanth;

import org.baseClass.BaseClasss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v108.page.Page.GetAppIdResponse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Daataa extends BaseClasss{
	
	public  Daataa() {	
		PageFactory.initElements(driver, this);
	}

	@FindBy(name= "username")
	private WebElement name;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement numroom;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement numadult;
	
	@FindBy(id="child_room")
	private WebElement numchild;
	
	@FindBy(name="Submit")
	private WebElement submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement btn;
	
	@FindBy(id="continue")
	private WebElement cntnew;
	
	@FindBy(id="first_name")
	private WebElement fstnm;
	
	@FindBy(id="last_name")
	private WebElement lstnm;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement card;
	
	@FindBy(id="cc_type")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmon;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyr;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name="book_now")
	private WebElement booknow;
	
	@FindBy(name="my_itinerary")
	private WebElement itinerary;

	@FindBy(id="order_no")
	private WebElement orderid;
	
	@FindBy(xpath="//input[@name='check_all']")
	private WebElement checkall;
		
	@FindBy(name="cancelall")
	private WebElement cancelall;
	
	
	public WebElement getCancelall() {
		return cancelall;
	}
	public WebElement getCheckall() {
		return checkall;
	}
	public WebElement getItinerary() {
		return itinerary;
	}
	public WebElement getAddress() {
		return address;
	}public WebElement getBooknow() {
		return booknow;
	}public WebElement getBtn() {
		return btn;
	}public WebElement getCard() {
		return card;
	}public WebElement getCheckin() {
		return checkin;
	}public WebElement getCheckout() {
		return checkout;
	}public WebElement getCntnew() {
		return cntnew;
	}public WebElement getCtype() {
		return ctype;
	}public WebElement getCvv() {
		return cvv;
	}public WebElement getExpmon() {
		return expmon;
	}public WebElement getExpyr() {
		return expyr;
	}public WebElement getFstnm() {
		return fstnm;
	}public WebElement getHotel() {
		return hotel;
	}public WebElement getLocation() {
		return location;
	}public WebElement getLogin() {
		return login;
	}public WebElement getLstnm() {
		return lstnm;
	}public WebElement getName() {
		return name;
	}public WebElement getNumadult() {
		return numadult;
	}public WebElement getNumchild() {
		return numchild;
	}public WebElement getNumroom() {
		return numroom;
	}public WebElement getOrderid() {
		return orderid;
	}public WebElement getPass() {
		return pass;
	}public WebElement getRoom() {
		return room;
	}public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	

	
}
