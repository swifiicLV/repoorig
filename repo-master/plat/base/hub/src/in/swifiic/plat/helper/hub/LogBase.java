package in.swifiic.plat.helper.hub;


import java.util.logging.*;
import java.io.* ;
public class LogBase 
	{
    
             Logger logger ;
            
            LogBase()
                 {
                        logger = Logger.getLogger("MyLog");  
    			     FileHandler fh;  

    						try {  

        							// This block configure the logger with handler and formatter  
        							fh = new FileHandler("/home/sriya/Desktop/test.log");  
        							logger.addHandler(fh);
        							SimpleFormatter formatter = new SimpleFormatter();  
        							fh.setFormatter(formatter);  

        							// the following statement is used to log any messages  
        							 

    							}
    					      catch (SecurityException e) {  
        							e.printStackTrace();  
    								} 
    					      catch (IOException e) {  
        							e.printStackTrace();  
    							      }  

    				  

		}	
		
		
		public void logBase(String s)
			{
			    
				logger.log(Level.SEVERE,s) ;
			}
                 
                 
                 
         }       






	
