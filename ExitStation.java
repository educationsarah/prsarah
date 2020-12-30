
package com.mycompany.parking;
import java.time.LocalTime;


public class ExitStation  extends ticket{
    private  final double minimumTime=15.0;
    private  final double minimumFee =0.5;
    private int id;
    private char type;
    private double startTime;
    
  ExitStation(){//the constructor
      
 }   
  
    public double calculateFee(char type,double startTime)
    {   
        this.type=type;
        this.startTime = startTime;
        //Suppose that the parking fee is:
        //CAR:          $1.50/hr after 15 minutes
        //BUS:          $2.30/hr after 15 minutes
        LocalTime time = LocalTime.now();
        double endTime = time.getMinute();
        
       startTime = startTime *60 ;// to convert hours into muinets
       
        double payTime = (endTime - startTime); 
        double fee =0.0;
        switch (type) {
            case 'c'://if it is a car
            case 'C':
                if (payTime <= 15.0) {  //if payTime <= minimumTime the customer will pay minimum fee(0.5 $)
                    fee = 0.5;
                    break;
                }
                 else
		{
		    fee = ((payTime)*1.50);
		    break;
		 }
	case 'B'://if it is a bus
	case'b' :
	    if (payTime <= 15.0) //if payTime <= minimumTime the customer will pay minimum fee(0.5 $)
		{
		    fee = 0.5;
		    break;
		}
		 else
		 {
			 fee = (payTime*2.30);
			 break;
		}
	default:
	      break;
	}
	return fee;
        }
        
}