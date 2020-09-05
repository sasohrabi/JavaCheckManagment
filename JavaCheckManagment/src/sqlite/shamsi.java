/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqlite;

/**
 *
 * @author Administrator
 */
public class shamsi {
    
    /*This function takes the english date and changes to farsi date
	  * the format of given date should be MM/DD/YYYY.
	 */
	public String Fa_Date(String En_Date)
	{
		int The_Select; 
		try{
			if(En_Date.length()==10)
			{
				The_Year = Integer.parseInt(En_Date.substring(6,10));
				The_Month= Integer.parseInt(En_Date.substring(0,2));
				The_Day  = Integer.parseInt(En_Date.substring(3,5));
			}
			else
			{   /** here it accepts the M/D/YYYY or MM/D/YYYY or M/DD/YYYY
			      * in case a user enters date in above format
			      */
			     
				The_Year = Integer.parseInt(En_Date.substring(En_Date.lastIndexOf("/")+1,En_Date.lastIndexOf("/")+5));
				The_Month= Integer.parseInt(En_Date.substring(0,En_Date.indexOf("/")));
				The_Day  = Integer.parseInt(En_Date.substring(En_Date.indexOf("/")+1,En_Date.lastIndexOf("/")));
			}
		   }catch(Exception e){System.out.println("Can not recognized the given date:"+e);return null;}
		
		if(The_Day>31||The_Month>12)
		{
			System.out.println("Can not recognized the given date");
			return null;
		}
		
				
		if(The_Year % 4 == 0) 
		    The_Select = 1;
		else
		    The_Select = 2;
				
		if ((The_Year - 1) % 4 == 0) 
		    The_Select = 3;
				
		if (The_Select == 1 )
		{
		  switch(The_Month)
		  {
			case 1 :
			{
				if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 10;
				    The_Month = 10;
				    The_Year = The_Year - 622;
				}
				else if(The_Day>=21 && The_Day<=31)
				{
					The_Day = The_Day -20;
					The_Month = 11;
				    The_Year = The_Year - 622;
				}
				
				break;
			}
			case 2:
			{
				
			    if(The_Day>=1 &&The_Day<=19)
				{
					The_Day = The_Day + 11;
			    	The_Month = 11;
			    	The_Year = The_Year - 622;
			    	
				}
			    else if(The_Day>=20 &&The_Day<=29)
				{
					The_Day = The_Day - 19;
					The_Month = 12;
			    	The_Year = The_Year - 622;
				}
				break;
			}	
			    
			case 3:
			{
			    if(The_Day>=1 &&The_Day<=19)
				{
					 The_Day = The_Day + 10;
			    	The_Month = 12;
			    	The_Year = The_Year - 622;
				}
				else if(The_Day>=20 &&The_Day<=31)
				{
					The_Day = The_Day - 19;
			    	The_Month = 1;
			    	The_Year = The_Year - 621;
				}
				break;
			}	
			    
			case 4:
			
			{
				if(The_Day>=1 &&The_Day<=19)
				{
					The_Day = The_Day + 12;
			    	The_Month = 1;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=20 &&The_Day<=30)
				{
					The_Day = The_Day - 19;
			    	The_Month = 2;
			    	The_Year = The_Year - 621;
				}
				break;
				
			}
			case 5: 
			{
				if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 11;
			    	The_Month = 2;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=21 &&The_Day<=31)
				{
					The_Day = The_Day - 20;
					The_Month = 3;
			    	The_Year = The_Year - 621;
				}
				
				break;
			}
			case 6:
			{
				if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 11;
				    The_Month = 3;
				    The_Year = The_Year - 621;
				}
				else if(The_Day>=21 &&The_Day<=30)
				{
					The_Day = The_Day - 20;
			    	The_Month = 4;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			
			case 7: 
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 10;
			    	The_Month = 4;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=31)
				{
					The_Day = The_Day - 21;
			    	The_Month = 5;
			    	The_Year = The_Year - 621;
				}
				break;
			
			}	
			
			case 8:
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 10;
			    	The_Month = 5;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=31)
				{
					The_Day = The_Day - 21;
			    	The_Month = 6;
			    	The_Year = The_Year - 621;
				}
				break;
		
			}
			
			case 9: 
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 10;
			    	The_Month = 6;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=30)
				{
					The_Day = The_Day - 21;
			    	The_Month = 7;
			    	The_Year = The_Year - 621;
				}
				break;

			}
			
			case 10: 
			{
				
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 9;
			    	The_Month = 7;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=31)
				{
					The_Day = The_Day - 21;
			    	The_Month = 8;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			
			case 11: 
			{
				if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 10;
			    	The_Month = 8;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=21 &&The_Day<=30)
				{
					The_Day = The_Day - 20;
			    	The_Month = 9;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 12: 
			{
				if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 10;
			    	The_Month = 9;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=21 &&The_Day<=31)
				{
					The_Day = The_Day - 20;
					The_Month = 10;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			default:// in case a wrong date, it will come here.
			{
				System.out.println("Seems the given date is wrong\n The Format should be MM/DD/YYYY");
				return null;
							
			}
		}
		
	  }//end of if in select->1
	  ////////////////////////////////////////////////////////////////	
	  if(The_Select == 2)
      {
		
		switch(The_Month)
		{
			
			case 1:
			{
			    
			    if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 10;
				    The_Month = 10;
				    The_Year = The_Year - 622;
				}
				else if(The_Day>=21 &&The_Day<=31)
				{
					The_Day = The_Day - 20;
				    The_Month = 11;
				    The_Year = The_Year - 622;
				}
				break;
			}
			case 2:
			{
				if(The_Day>=1 &&The_Day<=19)
				{
					The_Day = The_Day + 11;
			    	The_Month = 11;
			    	The_Year = The_Year - 622;
				}
				else if(The_Day>=19 &&The_Day<=28)
				{
					The_Day = The_Day - 19;
			    	The_Month = 12;
			    	The_Year = The_Year - 622;
				}
				break;
			}
			case 3:
			{
				if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 9;
			    	The_Month = 12;
			    	The_Year = The_Year - 622;
				}
				else if(The_Day>=21 &&The_Day<=31)
				{
					The_Day = The_Day - 20;
			    	The_Month = 1;
			    	The_Year = The_Year - 621;
				}
				break;
			}		
			case 4:
			{
				if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 11;
			    	The_Month = 1;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=21 &&The_Day<=30)
				{
					The_Day = The_Day - 20;
			    	The_Month = 2;
			    	The_Year = The_Year - 621;
					
				}
				break;
			}
			case 5:
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 10;
			    	The_Month = 2;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=31)
				{
					The_Day = The_Day - 21;
			    	The_Month = 3;
			    	The_Year = The_Year - 621;
					
				}
				break;
			}
			case 6:
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 10;
			    	The_Month = 3;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=30)
				{
					The_Day = The_Day - 21;
			    	The_Month = 4;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 7:
			{
				if(The_Day>=1 &&The_Day<=22)
				{
					The_Day = The_Day + 9;
			    	The_Month = 4;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=23 &&The_Day<=31)
				{
					The_Day = The_Day - 22;
			    	The_Month = 5;
			    	The_Year = The_Year - 621;
				}
				
				break;
			}
			case 8:
			{
				if(The_Day>=1 &&The_Day<=22)
				{
					The_Day = The_Day + 9;
			    	The_Month = 5;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=23 &&The_Day<=31)
				{
					The_Day = The_Day - 22;
			    	The_Month = 6;
			    	The_Year = The_Year - 621;
				}
				break;
			} 
				
			case 9:
			{
				if(The_Day>=1 &&The_Day<=22)
				{
					The_Day = The_Day + 9;
			    	The_Month = 6;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=23 &&The_Day<=30)
				{
					The_Day = The_Day - 22;
			    	The_Month = 7;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 10:
			{
				if(The_Day>=1 &&The_Day<=22)
				{
					The_Day = The_Day + 8;
			    	The_Month = 7;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=23 &&The_Day<=31)
				{
					The_Day = The_Day - 22;
			    	The_Month = 8;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			
			case 11:
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 9;
			    	The_Month = 8;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=30)
				{
					The_Day = The_Day - 21;
			    	The_Month = 9;
			    	The_Year = The_Year - 621;
				}
				break;
				
			}
			case 12:
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 9;
			    	The_Month = 9;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=31)
				{
					The_Day = The_Day - 21;
			    	The_Month = 10;
			    	The_Year = The_Year - 621;
				}
				break;
		    }
		    
		    default:
			{
				System.out.println("Seems the given date is wrong\n The Format should be MM/DD/YYYY");
				return null;
				
			}
			 
	     }//End of switch
      }//end of if in select->2   	     
		
	if (The_Select == 3)
	{
		switch(The_Month)
		{
			
			case 1:
			{
				if(The_Day>=1 &&The_Day<=19)
				{
					The_Day = The_Day + 11;
			    	The_Month = 10;
			    	The_Year = The_Year - 622;
				}
				else if(The_Day>=20 &&The_Day<=31)
				{
					The_Day = The_Day - 19;
			    	The_Month = 11;
			    	The_Year = The_Year - 622;
				}
				break;
				
			}
			case 2: 
			{
				
				if(The_Day>=1 &&The_Day<=18)
				{
					The_Day = The_Day + 12;
			    	The_Month = 11;
			    	The_Year = The_Year - 622;
			    }
				else if(The_Day>=19 &&The_Day<=28)
				{
					The_Day = The_Day - 18;
			    	The_Month = 12;
			    	The_Year = The_Year - 622;
				}
				break;
			}
			case 3:
			{
				if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 10;
			    	The_Month = 12;
			    	The_Year = The_Year - 622;
				}
				else if(The_Day>=21 &&The_Day<=31)
				{
					The_Day = The_Day - 20;
			    	The_Month = 1;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 4:
			{
				if(The_Day>=1 &&The_Day<=20)
				{
					The_Day = The_Day + 11;
			    	The_Month = 1;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=21 &&The_Day<=30)
				{
					The_Day = The_Day - 20;
			    	The_Month = 2;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 5:
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 10;
			    	The_Month = 2;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=31)
				{
					The_Day = The_Day - 21;
			    	The_Month = 3;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 6:
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 10;
			    	The_Month = 3;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=30)
				{
					The_Day = The_Day - 21;
			    	The_Month = 4;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			
			case 7:
			{
				if(The_Day>=1 &&The_Day<=22)
				{
					The_Day = The_Day + 9;
			    	The_Month = 4;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=23 &&The_Day<=31)
				{
					The_Day = The_Day - 22;
			    	The_Month = 5;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 8:
			{
				if(The_Day>=1 &&The_Day<=22)
				{
					The_Day = The_Day + 9;
			    	The_Month = 5;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=23 &&The_Day<=31)
				{
					The_Day = The_Day - 22;
			    	The_Month = 6;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 9://a
			{
				if(The_Day>=1 &&The_Day<=22)
				{
					The_Day = The_Day + 9;
			    	The_Month = 6;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=23 &&The_Day<=30)
				{
					The_Day = The_Day - 22;
			    	The_Month = 7;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 10:
			{
				if(The_Day>=1 &&The_Day<=22)
				{
					The_Day = The_Day + 8;
			    	The_Month = 7;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=23 &&The_Day<=31)
				{
					The_Day = The_Day - 22;
			    	The_Month = 8;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			case 11://bb
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 9;
			    	The_Month = 8;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=30)
				{
					The_Day = The_Day - 21;
			    	The_Month = 9;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			
			case 12://a
			{
				if(The_Day>=1 &&The_Day<=21)
				{
					The_Day = The_Day + 9;
			    	The_Month = 9;
			    	The_Year = The_Year - 621;
				}
				else if(The_Day>=22 &&The_Day<=31)
				{
					The_Day = The_Day - 21;
			    	The_Month = 10;
			    	The_Year = The_Year - 621;
				}
				break;
			}
			
			default://s
			{
				System.out.println("Seems the given date is wrong\n The Format should be MM/DD/YYYY");
				return null;
			}
	   	}
	  }	
	  // you may use different output
          String MonthShamsi = ""+The_Month;
          String DayShamsi = ""+The_Day;
          

          if(MonthShamsi.length()==1) MonthShamsi = "0"+MonthShamsi;
          if(DayShamsi.length()==1) DayShamsi = "0"+DayShamsi;
	  Farsi_Date = The_Year + "/" +MonthShamsi + "/" +DayShamsi;
	  return Farsi_Date;
	  
	}//end of function Fa->En
		
	/** This function converts the Farsi date to English date 
	 */
	public String En_Date(String Fa_Date)
	{
		
		try{
			if(Fa_Date.length()==10)
			{
				The_Year= Integer.parseInt(Fa_Date.substring(0,4));
				The_Month=Integer.parseInt(Fa_Date.substring(5,7));
				The_Day= Integer.parseInt(Fa_Date.substring(8,10));
			}
			else
			{
				The_Year = Integer.parseInt(Fa_Date.substring(0,Fa_Date.indexOf("/")));
				The_Month= Integer.parseInt(Fa_Date.substring(Fa_Date.indexOf("/")+1,Fa_Date.lastIndexOf("/")));
				The_Day  = Integer.parseInt(Fa_Date.substring(Fa_Date.lastIndexOf("/")+1,Fa_Date.length()));
			}
		   }catch(Exception e){System.out.println("Can not recognized the given date:"+e);return null;}
		
		
		if(The_Day>31||The_Month>12)
		{
			System.out.println("Can not recognized the given date");
			return null;
		}
		
			
		int The_Select = The_Year % 4;
		
		if (The_Select == 0)
		{
			switch(The_Month)
			{
				case 1:
				{
					
					if(The_Day>=1 && The_Day<=11)
					{
						The_Day = The_Day + 20;
				    	The_Month = 3;
				    	The_Year = The_Year + 621;
					}
											
					else if(The_Day>=12 &&The_Day<=31)
					{
						The_Day = The_Day - 11;
				    	The_Month = 4;
				    	The_Year = The_Year + 621;
					}
					break;
				}
				case 2:
				{
					
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 20;
				    	The_Month = 4;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=31)
					{
						The_Day = The_Day - 10;
				    	The_Month = 5;
				    	The_Year = The_Year + 621;
					}
					break;
				}
				
				case 3:
				{
					
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 21;
				    	The_Month = 5;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=31)
					{
						The_Day = The_Day - 10;
				    	The_Month = 6;
				    	The_Year = The_Year + 621;
					}
					
					break;
				}
				
				case 4:
				{
				 
				    if(The_Day>=1 &&The_Day<=9)
				    {
						The_Day = The_Day + 21;
				    	The_Month = 6;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
				    	The_Month = 7;
				    	The_Year = The_Year + 621;
					}
					break;

				}
				case 5:
				{
					if(The_Day>=1 &&The_Day<=9)
				    {
						The_Day = The_Day + 22;
				    	The_Month = 7;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
				    	The_Month = 8;
				    	The_Year = The_Year + 621;
					}
					break;
				}
				
				case 6:
				{
					if(The_Day>=1 &&The_Day<=9)
				    {
						The_Day = The_Day + 22;
				    	The_Month = 8;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
				    	The_Month = 9;
				    	The_Year = The_Year + 621;
					} 
					break;
					 
				}
				case 7:
				{
					if(The_Day>=1 &&The_Day<=8)
				    {
						The_Day = The_Day + 22;
				    	The_Month = 9;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=9 &&The_Day<=30)
					{
						The_Day = The_Day - 8;
				   		The_Month = 10;
				    	The_Year = The_Year + 621;
					}
					break;
					
				}
				
				case 8:
				{
					if(The_Day>=1 &&The_Day<=9)
				    {
						The_Day = The_Day + 22;
				    	The_Month = 10;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=30)
					{
						The_Day = The_Day - 9;
				    	The_Month = 11;
				    	The_Year = The_Year + 621;
					}
					break;
				}
				
				case 9:
				{
					if(The_Day>=1 &&The_Day<=9)
				    {
						The_Day = The_Day + 21;
				    	The_Month = 11;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=30)
					{
						The_Day = The_Day - 9;
				    	The_Month = 12;
				    	The_Year = The_Year + 621;
					}
					break;
				}
				
				case 10:
				{
					if(The_Day>=1 &&The_Day<=10)
				    {
						The_Day = The_Day + 21;
				    	The_Month = 12;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=30)
					{
						The_Day = The_Day - 10;
				    	The_Month = 1;
				    	The_Year = The_Year + 622;
					}
					
				}
				case 11:
				{
					if(The_Day>=1 &&The_Day<=11)
				    {
						The_Day = The_Day + 20;
				    	The_Month = 1;
				    	The_Year = The_Year + 622;
					}
					else if(The_Day>=12 &&The_Day<=30)
					{
						The_Day = The_Day - 11;
				    	The_Month = 2;
				    	The_Year = The_Year + 622;
					}
					break;
				}
				
				case 12:
				{
					if(The_Day>=1 &&The_Day<=9)
				    {
						The_Day = The_Day + 19;
				    	The_Month = 2;
				    	The_Year = The_Year + 622;
					}
					else if(The_Day>=10 &&The_Day<=30)
					{
						The_Day = The_Day - 9;
				    	The_Month = 3;
				    	The_Year = The_Year + 622;
					}
					break;
				}
				default:
				{
					System.out.println("Seems the given date is wrong\n The Format should be YYYY/MM/DD");
					return null;
				}
			}	
		}//end of if in select->0
		
		if (The_Select == 1)
		{
			switch(The_Month)
			{
				case 1:
				{
					
					if(The_Day>=1 &&The_Day<=11)
					{
						The_Day = The_Day + 20;
				    	The_Month = 3;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=12 &&The_Day<=31)
					{
						The_Day = The_Day - 11;
				    	The_Month = 4;
				    	The_Year = The_Year + 621;
					}
					break;
				}
				case 2:
				{
					
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 20;
				    	The_Month = 4;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=31)
					{
						The_Day = The_Day - 10;
				    	The_Month = 5;
				    	The_Year = The_Year + 621;
					}
					break;
				}
				
				case 3:
				{
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 22;
					    The_Month = 5;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=31)
					{
						The_Day = The_Day - 10;
					    The_Month = 6;
					    The_Year = The_Year + 621;
					} 
					break;
				}
				case 4:
				{
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 21;
					    The_Month = 6;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
					    The_Month = 7;
					    The_Year = The_Year + 621;
					} 
					
					break;
				}
				case 5:
				{
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 22;
					    The_Month = 7;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
					    The_Month = 8;
					    The_Year = The_Year + 621;
						
					} 
					
					break;
				}
				case 6:
				{
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 22;
					    The_Month = 8;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
					    The_Month = 9;
					    The_Year = The_Year + 621;
						
					} 
					break;
				}
				case 7:
				{
					 
					if(The_Day>=1 &&The_Day<=8)
					{
						The_Day = The_Day + 22;
					    The_Month = 9;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=9 &&The_Day<=30)
					{
						The_Day = The_Day - 8;
					    The_Month = 10;
					    The_Year = The_Year + 621;
						
					}
					break;
				}
				case 8:
				{
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 22;
					    The_Month = 10;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=30)
					{
						The_Day = The_Day - 9;
					    The_Month = 11;
					    The_Year = The_Year + 621;
					}
					break;
				}
				case 9:
				{
					
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 21;
					    The_Month = 11;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=30)
					{
						The_Day = The_Day - 9;
					    The_Month = 12;
					    The_Year = The_Year + 621;
					}
					break;
				}
				case 10:
				{
					
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 21;
					    The_Month = 12;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=30)
					{
						The_Day = The_Day - 10;
					    The_Month = 1;
					    The_Year = The_Year + 622;
					}
					break;
				
				}
				case 11:
				{
					if(The_Day>=1 &&The_Day<=11)
					{
						The_Day = The_Day + 20;
					    The_Month = 1;
					    The_Year = The_Year + 622;
					}
					else if(The_Day>=12 &&The_Day<=30)
					{
						The_Day = The_Day - 11;
					    The_Month = 2;
					    The_Year = The_Year + 622;
					}
					break;	 	
				}
				case 12:
				{
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 19;
					    The_Month = 2;
					    The_Year = The_Year + 622;
					}
					else if(The_Day>=10 &&The_Day<=30)
					{
						The_Day = The_Day - 9;
					    The_Month = 3;
					    The_Year = The_Year + 622;
					}
					break;
				}
				default:
				{
					System.out.println("Seems the given date is wrong\n The Format should be YYYY/MM/DD");
					return null;
				}
			}
		}//end of if in select->1
				

			
		if (The_Select == 2)
		{
			switch(The_Month)
			{
				case 1:
				{
					
					if(The_Day>=1 &&The_Day<=11)
					{
						The_Day = The_Day + 20;
				    	The_Month = 3;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=12 &&The_Day<=31)
					{
						The_Day = The_Day - 11;
				    	The_Month = 4;
				    	The_Year = The_Year + 621;
					}
					break;
				}
		
				case 2:
				{
					
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 20;
				    	The_Month = 4;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=31)
					{
						The_Day = The_Day - 10;
				    	The_Month = 5;
				    	The_Year = The_Year + 621;
					}
					break;
				}
				case 3:
				{
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 21;
					    The_Month = 5;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=31)
					{
						The_Day = The_Day - 10;
					    The_Month = 6;
					    The_Year = The_Year + 621;
					} 
					break;
				}
				case 4:
				{
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 21;
					    The_Month = 6;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
					    The_Month = 7;
					    The_Year = The_Year + 621;
					} 
					
					break;
				}
			
				case 5:
				{
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 22;
					    The_Month = 7;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
					    The_Month = 8;
					    The_Year = The_Year + 621;
						
					} 
					
					break;
				}
				case 6:
				{
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 22;
					    The_Month = 8;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
					    The_Month = 9;
					    The_Year = The_Year + 621;
						
					} 
					break;
				}
			
				case 7:
				{
					 
					if(The_Day>=1 &&The_Day<=8)
					{
						The_Day = The_Day + 22;
					    The_Month = 9;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=9 &&The_Day<=30)
					{
						The_Day = The_Day - 8;
					    The_Month = 10;
					    The_Year = The_Year + 621;
						
					}
					break;
				}
				case 8:
				{
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 22;
					    The_Month = 10;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=30)
					{
						The_Day = The_Day - 9;
					    The_Month = 11;
					    The_Year = The_Year + 621;
					}
					break;
				}
				
				case 9:
				{
					
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 21;
					    The_Month = 11;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=30)
					{
						The_Day = The_Day - 9;
					    The_Month = 12;
					    The_Year = The_Year + 621;
					}
					
					break;
				}
				case 10:
				{
					
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 21;
					    The_Month = 12;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=30)
					{
						The_Day = The_Day - 10;
					    The_Month = 1;
					    The_Year = The_Year + 622;
					}
					break;
				}
				case 11:
				{
					if(The_Day>=1 &&The_Day<=11)
					{
						The_Day = The_Day + 20;
					    The_Month = 1;
					    The_Year = The_Year + 622;
					}
					else if(The_Day>=12 &&The_Day<=30)
					{
						The_Day = The_Day - 11;
					    The_Month = 2;
					    The_Year = The_Year + 622;
					}
					break;
				}
				case 12:
				{
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 19;
					    The_Month = 2;
					    The_Year = The_Year + 622;
					}
					else if(The_Day>=11 &&The_Day<=30)
					{
						The_Day = The_Day - 10;
					    The_Month = 3;
					    The_Year = The_Year + 622;
					}
					break;
				}
				default:
				{
					System.out.println("Seems the given date is wrong\n The Format should be YYYY/MM/DD");
					return null;
				}
			}
		}//end of if in select->2
				
			
		if (The_Select == 3)
		{
			switch(The_Month)
			{
				case 1:
				{
					
					if(The_Day>=1 &&The_Day<=12)
					{
						The_Day = The_Day + 19;
				    	The_Month = 3;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=13 &&The_Day<=31)
					{
						The_Day = The_Day - 12;
				    	The_Month = 4;
				    	The_Year = The_Year + 621;
					}
					break;
				}
		
				case 2:
				{
					
					if(The_Day>=1 &&The_Day<=11)
					{
						The_Day = The_Day + 19;
				    	The_Month = 4;
				    	The_Year = The_Year + 621;
					}
					else if(The_Day>=12 &&The_Day<=31)
					{
						The_Day = The_Day - 11;
				    	The_Month = 5;
				    	The_Year = The_Year + 621;
					}
					break;
				}
				case 3:
				{
					if(The_Day>=1 &&The_Day<=11)
					{
						The_Day = The_Day + 20;
					    The_Month = 5;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=12 &&The_Day<=31)
					{
						The_Day = The_Day - 11;
					    The_Month = 6;
					    The_Year = The_Year + 621;
					} 
					break;
				}
				case 4:
				{
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 20;
					    The_Month = 6;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=31)
					{
						The_Day = The_Day - 9;
					    The_Month = 7;
					    The_Year = The_Year + 621;
					} 
					break;
					
				}
				case 5:
				{
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 21;
					    The_Month = 7;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=31)
					{
						The_Day = The_Day - 10;
					    The_Month = 8;
					    The_Year = The_Year + 621;
						
					} 
					break;
					
				}
				case 6:
				{
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 21;
					    The_Month = 8;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=31)
					{
						The_Day = The_Day - 10;
					    The_Month = 9;
					    The_Year = The_Year + 621;
						
					} 
					break;
				}
				case 7:
				{
					 
					if(The_Day>=1 &&The_Day<=9)
					{
						The_Day = The_Day + 21;
					    The_Month = 9;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=10 &&The_Day<=30)
					{
						The_Day = The_Day - 9;
					    The_Month = 10;
					    The_Year = The_Year + 621;
						
					}
					break;
				}
				case 8:
				{
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 21;
					    The_Month = 10;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=30)
					{
						The_Day = The_Day - 10;
					    The_Month = 11;
					    The_Year = The_Year + 621;
					}
					break;
				}
				case 9:
				{
				
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 20;
					    The_Month = 11;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=11 &&The_Day<=30)
					{
						The_Day = The_Day - 10;
					    The_Month = 12;
					    The_Year = The_Year + 621;
					}
					break;
				}
				case 10:
				{
					
					if(The_Day>=1 &&The_Day<=11)
					{
						The_Day = The_Day + 20;
					    The_Month = 12;
					    The_Year = The_Year + 621;
					}
					else if(The_Day>=12 &&The_Day<=30)
					{
						The_Day = The_Day - 11;
					    The_Month = 1;
					    The_Year = The_Year + 622;
					}
					break;
				}
				case 11:
				{
					if(The_Day>=1 &&The_Day<=12)
					{
						The_Day = The_Day + 19;
					    The_Month = 1;
					    The_Year = The_Year + 622;
					}
					else if(The_Day>=13 &&The_Day<=30)
					{
						The_Day = The_Day - 12;
					    The_Month = 2;
					    The_Year = The_Year + 622;
					}
					break;
				}
				case 12:
				{
					if(The_Day>=1 &&The_Day<=10)
					{
						The_Day = The_Day + 18;
					    The_Month = 2;
					    The_Year = The_Year + 622;
					}
					else if(The_Day>=11 &&The_Day<=30)
					{
						The_Day = The_Day - 10;
					    The_Month = 3;
					    The_Year = The_Year + 622;
					}
					break;
				}
				default:
				{
					System.out.println("Seems the given date is wrong\n The Format should be YYYY/MM/DD");
					return null;
				}
			}
		}//end if
		// output of english date format
		English_Date = The_Day + "/"+The_Month+ "/" +The_Year;
		return English_Date;
	}//end of Function En->Fa
	
private String Farsi_Date=null;
private String English_Date=null;
private int The_Year  ;
private int The_Month ;
private int The_Day   ;
    
}
