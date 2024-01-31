package facatoryObject;

import com.mobile.MobileBrands;
import com.mobile.apple;
import com.mobile.one_plus;
import com.mobile.realME;
import com.mobile.samsung;

public class Objectfactory {
	
	public static MobileBrands showMobile(String s)
	{
		if(s.equalsIgnoreCase("realme"))
			return new realME();
		else if(s.equalsIgnoreCase("apple"))
			return new apple();
		else if(s.equalsIgnoreCase("samsung"))
			return new samsung();
		else if(s.equalsIgnoreCase("one plus"))
			return new one_plus();
		else
			throw  new IllegalArgumentException("the brand is not available");
		
	}

}
