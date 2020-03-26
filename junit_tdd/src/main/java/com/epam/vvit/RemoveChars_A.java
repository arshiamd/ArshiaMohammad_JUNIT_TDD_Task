package com.epam.vvit;

public class RemoveChars_A {

	public String removeA(String s) {
		String res="";
		if(s.length()==1) {
			if(s.charAt(0)=='A')
				return res;
			else 
				return s;
		}
		else if(s.length()==2) {
			if(s.charAt(0)=='A' && s.charAt(1)=='A')
				return res;
			else
				return s;
		}
		else if(s=="")
			return res;
		else if(s.charAt(0)=='A') {
			if(s.charAt(1)=='A') {
				for(int i=2; i<s.length(); i++)
					res+=s.charAt(i);
			}
			else {
				for(int i=1; i<s.length(); i++)
					res+=s.charAt(i);
			}
		}
		else if(s.charAt(1)=='A') {
			res+=s.charAt(0);
			for(int i=2; i<s.length(); i++)
					res+=s.charAt(i);
		}
		else
			res=s;
		return(res);
		
	}

}
