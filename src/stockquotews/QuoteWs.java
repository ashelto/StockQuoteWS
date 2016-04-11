/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockquotews;

import java.util.ArrayList;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author it3530218
 */
@WebService
public class QuoteWs 
{
        private String code;
	private String name;
	private double price;
	
	private QuoteWs ()
	{
		
	}
	
	private QuoteWs (String code, String name, double price)
	{
		this.code = code;
		this.name = name;
		this.price = price;
	}

	
	
	private String getCode() {
		return code;
	}

	private void setCode(String code) {
		this.code = code;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}
        
        public String showPrice(@WebParam(name = "code")String code)
        {
            QuoteWs AAPL = new QuoteWs("AAPL", "Apple",108.66);
            QuoteWs AXP = new QuoteWs ("AXP", "American Express",59.50);
            QuoteWs BA =  new QuoteWs ("BA", "Boeing", 127.88);
            QuoteWs CAT = new QuoteWs ("CAT", "Caterpillar", 74.35);
            QuoteWs CSCO = new QuoteWs ("CSCO", "Cisco", 27.69);
		
            ArrayList<QuoteWs> stocks = new ArrayList<QuoteWs>(); 
		
            stocks.add(AAPL);
            stocks.add(AXP);
            stocks.add(BA);
            stocks.add(CAT);
            stocks.add(CSCO);
            String returnPrice = "price not found"; 
            for(int i =0; i < stocks.size(); i++)
            {
                if(stocks.get(i).getCode().equals(code))
                {
                    String str = stocks.get(i).getName();
                    double price = stocks.get(i).getPrice();
                    returnPrice = "The price for " + str + " is: " + price;
                    return returnPrice;
                }
            }
            return returnPrice;
        }
	
    
}
