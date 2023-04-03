package org.priyadevi;

public class string {
	public static void main(String[] args) {
		
		//reverse fullname
		String s="priya devi";
		int l = s.length();
		System.out.println(l);
		String  res="";
		for(int i=9;i>=0; i--) {
			res=res+s.charAt(i);
		}
		System.out.println(res);
		//reverse  split&reverse
		String m="priya devi";
		String[] sp = m.split(" ");
		String res1="";
		for(int i=0; i<sp.length; i++) {
			String a=sp[i];
			for(int j=a.length()-1; j>=0; j--) {
				res1=res1+a.charAt(j);
		//		System.out.println(res1);
			
		
		}
			res1=res1+" ";
		
		System.out.println(res1);
	}}}
