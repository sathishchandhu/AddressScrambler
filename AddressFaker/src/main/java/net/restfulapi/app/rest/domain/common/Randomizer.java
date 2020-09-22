package net.restfulapi.app.rest.domain.common;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

//public class Randomizer {

//}

class Randomizer {
    public static void main( String args[] ) {
    	Map<String, String> states = new HashMap<String, String>();
    	states.put("Alabama","AL");
    	states.put("Alaska","AK");
    	states.put("Alberta","AB");
    	states.put("American Samoa","AS");
    	states.put("Arizona","AZ");
    	states.put("Arkansas","AR");
    	states.put("Armed Forces (AE)","AE");
    	states.put("Armed Forces Americas","AA");
    	states.put("Armed Forces Pacific","AP");
    	states.put("British Columbia","BC");
    	states.put("California","CA");
    	states.put("Colorado","CO");
    	states.put("Connecticut","CT");
    	states.put("Delaware","DE");
    	states.put("District Of Columbia","DC");
    	states.put("Florida","FL");
    	states.put("Georgia","GA");
    	states.put("Guam","GU");
    	states.put("Hawaii","HI");
    	states.put("Idaho","ID");
    	states.put("Illinois","IL");
    	states.put("Indiana","IN");
    	states.put("Iowa","IA");
    	states.put("Kansas","KS");
    	states.put("Kentucky","KY");
    	states.put("Louisiana","LA");
    	states.put("Maine","ME");
    	states.put("Manitoba","MB");
    	states.put("Maryland","MD");
    	states.put("Massachusetts","MA");
    	states.put("Michigan","MI");
    	states.put("Minnesota","MN");
    	states.put("Mississippi","MS");
    	states.put("Missouri","MO");
    	states.put("Montana","MT");
    	states.put("Nebraska","NE");
    	states.put("Nevada","NV");
    	states.put("New Brunswick","NB");
    	states.put("New Hampshire","NH");
    	states.put("New Jersey","NJ");
    	states.put("New Mexico","NM");
    	states.put("New York","NY");
    	states.put("Newfoundland","NF");
    	states.put("North Carolina","NC");
    	states.put("North Dakota","ND");
    	states.put("Northwest Territories","NT");
    	states.put("Nova Scotia","NS");
    	states.put("Nunavut","NU");
    	states.put("Ohio","OH");
    	states.put("Oklahoma","OK");
    	states.put("Ontario","ON");
    	states.put("Oregon","OR");
    	states.put("Pennsylvania","PA");
    	states.put("Prince Edward Island","PE");
    	states.put("Puerto Rico","PR");
    	states.put("Quebec","QC");
    	states.put("Rhode Island","RI");
    	states.put("Saskatchewan","SK");
    	states.put("South Carolina","SC");
    	states.put("South Dakota","SD");
    	states.put("Tennessee","TN");
    	states.put("Texas","TX");
    	states.put("Utah","UT");
    	states.put("Vermont","VT");
    	states.put("Virgin Islands","VI");
    	states.put("Virginia","VA");
    	states.put("Washington","WA");
    	states.put("West Virginia","WV");
    	states.put("Wisconsin","WI");
    	states.put("Wyoming","WY");
    	states.put("Yukon Territory","YT");
    	
    	
    	StringBuffer sbFinal=new StringBuffer();
    	
    	HashMap<Integer, String> addressMap = new HashMap<Integer, String>();
    	addressMap.put( 1,"Dr");
    	addressMap.put(2,"Circle");
    	addressMap.put(3,"Blvd");

    	
    	HashMap<Integer, String> countryMap = new HashMap<Integer, String>();
    	countryMap.put( 1,"United States of America");
    	countryMap.put(2,"United Kingdom");
    	countryMap.put(3,"Canada");
    	
    	HashMap<Integer, String> countryCdMap = new HashMap<Integer, String>();
    	countryCdMap.put( 1,"USA");
    	countryCdMap.put(2,"UK");
    	countryCdMap.put(3,"CN");
    	
      //get house
      int house=getRandomInt(50,100);
      sbFinal.append(house);sbFinal.append(" ");
      
      //format street address
    //  String addressSecondPart = );
      StringBuffer sb=new StringBuffer(getRandomString(15));
      sb.append(" ");
      sb.append(addressMap.get(getRandomInt(1,3)));
      String street= sb.toString();
      sbFinal.append(street);  sb.append("\n");
      
    
      
      String city=getRandomString(10);
      sbFinal.append(city);sbFinal.append(",");
      String stateCd=getRandomString(2);
      sbFinal.append(stateCd);sbFinal.append(",");
      sbFinal.append("\n");
      
      
    
      String county=getRandomString(10);
      sbFinal.append(county);   sbFinal.append("\n");
      String state=getRandomString(10);
      sbFinal.append(state);   sbFinal.append("\n");
   
      String country = countryMap.get(getRandomInt(1,3));
      sbFinal.append(country);   sbFinal.append("\n");
    //  String countryCode=getRandomString(3);
      String countryCode = countryMap.get(getRandomInt(1,3));
      sbFinal.append(countryCode);   sbFinal.append("\n");
      
      System.out.println(sbFinal.toString());
    }
    
    static int getRandomInt(int min, int max)
    {
    	System.out.println("Random value in int from "+min+" to "+max+ ":");
        int randomInt = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(randomInt);
        return randomInt;
    }
    
    static String getRandomString(int targetStringLength)
    {
    	  int leftLimit = 97; // letter 'a'
          int rightLimit = 122; // letter 'z'
        //  int targetStringLength = 15;
          Random random = new Random();
          StringBuilder buffer = new StringBuilder(targetStringLength);
          for (int i = 0; i < targetStringLength; i++) {
              int randomLimitedInt = leftLimit + (int) 
                (random.nextFloat() * (rightLimit - leftLimit + 1));
              buffer.append((char) randomLimitedInt);
          }
          String randomStr = buffer.toString();
          System.out.println("############");
          System.out.println(randomStr);
          System.out.println("##############");
          return randomStr;
    }
}