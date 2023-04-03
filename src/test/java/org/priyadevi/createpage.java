package org.priyadevi;

import org.base.baseclass;
import org.pom.pomclass;

public class createpage extends baseclass {
	public static void main(String[] args) {
		browserlanch("chrome");
		urllanch("https://www.facebook.com/");
		maximize();
		implicitywait();
		pomclass a=new pomclass();
		sendkeys(a.getTxtuser(), "priya devi");
		
		sendkeys(a.getTxtpass(), "1234");
//		click(a.getLoginbtn());
		webelementclick(a.getCreatebtn());
		
		sendkeys(a.getFirstname(),"priya");
		sendkeys(a.getLastname(), "devi");
		sendkeys(a.getEmail(), "priydevidinesh7@");
		sendkeys(a.getNewpass(), "MK");
		webelementclick(a.getFemale());
		selectbyvalue(a.getDay(),"9");
		selectbyvalue(a.getMonth(), "3");
		selectbyvalue(a.getYear(), "1995");
		
		pomclass b =new pomclass ();
	//	sendkeys(b.getTxtuser(), )
		
	
	}

}
