/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceifswitch;

import java.util.Locale;

/**
 *
 * @author Cristy
 */
public class ZodiacSign {
    private String month;
    private int day;
  
    private String zodiacSym;

    public ZodiacSign(String month, int day) {
        this.month = month;
        this.day = day;
        this.zodiacSym = "";

    }

    
    /* public void determineZodiacSign()
    {
        month = month.toUpperCase();
        switch (month)
        {
            case "JANUARY":
                if (day >= 1 && day <= 19)
                    zodiacSym = "Capricorn";
                else if (day >= 20 && day <=31)
                    zodiacSym = "Aquarius";
                break;
            
        }


  
    }
    */
    public void determineZodiacSign2()
    {
        month = month.toUpperCase();

        if ((month.equals("MARCH") && day >= 21) || (month.equals("APRIL") && day <= 19))
        {zodiacSym = "Aries";}
        else if ((month.equals("APRIL") && day >= 20) || (month.equals("MAY") && day <= 20))
        {zodiacSym = "Taurus";}
        else if ((month.equals("MAY") && day >= 21) || (month.equals("JUNE") && day <= 20))
        {zodiacSym = "Gemini";}
        else if ((month.equals("JUNE") && day >= 21) || (month.equals("JULY") && day <= 22))
        {zodiacSym = "Cancer";}
        else if ((month.equals("JULY") && day >= 23) || (month.equals("AUGUST") && day <= 22))
        {zodiacSym = "leo";}
        else if ((month.equals("AUGUST") && day >= 23) || (month.equals("SEPTEMBER") && day <= 22))
        {zodiacSym = "Virgo";}
        else if ((month.equals("SEPTEMBER") && day >= 23) || (month.equals("OCTOBER") && day <= 22))
        {zodiacSym = "Libra";}
        else if ((month.equals("OCTOBER") && day >= 23) || (month.equals("NOVEMBER") && day <= 21))
        {zodiacSym = "Scorpio";}
        else if ((month.equals("NOVEMBER") && day >= 22) || (month.equals("DECEMBER") && day <= 21))
        {zodiacSym = "Sagittarius";}
        else if ((month.equals("DECEMBER") && day >= 22) || (month.equals("JANUARY") && day <= 20))
        {zodiacSym = "Capricorn";}
        else if ((month.equals("JANUARY") && day >= 21) || (month.equals("FEBRUARY") && day <= 18))
        {zodiacSym = "Aquarius";}
        else if ((month.equals("FEBRUARY") && day >= 19) || (month.equals("MARCH") && day <= 20))
        {zodiacSym = "Pisces";}

  /**month = month.toUpperCase();

  if ((month.equals("JANUARY") && day >= 21) || (month.equals("FEBRUARY") && day <= 18))
          {zodiacSym = "Aquarius";}
          else if ((month.equals("FEBRUARY") && day >= 19) || (month.equals("MARCH") && day <= 20))
          {zodiacSym = "Pisces";}
          else if ((month.equals("MARCH") && day >= 21) || (month.equals("APRIL") && day <= 19))
          {zodiacSym = "Aries";}
          else if ((month.equals("APRIL") && day >= 20) || (month.equals("MAY") && day <= 20))
          {zodiacSym = "Taurus";}
          else if ((month.equals("MAY") && day >= 21) || (month.equals("JUNE") && day <= 20))
          {zodiacSym = "Gemini";}
          else if ((month.equals("JUNE") && day >= 21) || (month.equals("JULY") && day <= 22))
          {zodiacSym = "Cancer";}
          else if ((month.equals("JULY") && day >= 23) || (month.equals("AUGUST") && day <= 22))
          {zodiacSym = "leo";}
          else if ((month.equals("AUGUST") && day >= 23) || (month.equals("SEPTEMBER") && day <= 22))
          {zodiacSym = "Virgo";}
          else if ((month.equals("SEPTEMBER") && day >= 23) || (month.equals("OCTOBER") && day <= 22))
          {zodiacSym = "Libra";}
          else if ((month.equals("OCTOBER") && day >= 23) || (month.equals("NOVEMBER") && day <= 21))
          {zodiacSym = "Scorpio";}
          else if ((month.equals("NOVEMBER") && day >= 22) || (month.equals("DECEMBER") && day <= 21))
          {zodiacSym = "Sagittarius";}
          else if ((month.equals("DECEMBER") && day >= 22) || (month.equals("JANUARY") && day <= 20))
          {zodiacSym = "Capricorn";}

*/

    }








    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int startDay) {
        this.day = startDay;
    }

    public String getZodiacSym() {
        return zodiacSym;
    }

    public void setZodiacSym(String zodiacSym) {
        this.zodiacSym = zodiacSym;
    }


    public String toString() {
        return "ZodiacSign{" + "month=" + month + ", Day=" + day +  ", zodiacSym=" + zodiacSym + '}';
    }
   
    
    
    
    
    
    
    
}
