/** 
     *@author- Roshan Koirala 
     *@since-March 17, 2014
     *The Magician class which models the behaviour of a character in a game. Each object in this class has name, level, supplies, health, galleons
      */   



/**
*importing required utilities
*/
import java.util.Scanner;
import java.io.*;


/**
*set up magician  class with instance variable name, level,supplies, health, galleons
*/
 
public class Magician
{
   private String name="";
   private String level="";
   private String supplies="";
   private int health=0;
   private int galleons=0;
   private int levelnum=0;

   
   
   
   /**
  * set up Magician Constructor to assign the parameter to the instance variable
  *@param- identity a string value which has name, level, supplies separarted by #
   * @Using Scanner class to scan the part separated by #
   * @Set up all instance variable
  */

   public Magician(String identity)
   {
      Scanner scan = new Scanner(identity);
      scan.useDelimiter("#");
   
      name = scan.next();
      level = scan.next();
      while (scan.hasNext())
      {
         supplies = supplies +" "+ scan.next(); 
      }
      health = 1000;
      galleons = 200;
   
      switch ( level)
      {
         case "apprentice":
            levelnum= 1;
            break;
         case "wizard":
            levelnum= 2;
            break;
         case "mage":
            levelnum= 3;
            break;
         case "sorcerer":
            levelnum= 4;
            break;
         case "shaman":
            levelnum= 5;
            break;
      }
   }
   
   
   
   /**
   *@setup setName method 
   *@param name1- a string that takes person name from test program
   */

   public void setName(String initname)
   {
      name = initname;
   }

   
   /**
   *@setup setLevel method 
   *@param initlevel- a string that takes person's level from test program
   */

   public void setLevel(String initlevel)
   {
      level = initlevel;
      switch ( level)
      {
         case "apprentice":
            levelnum= 1;
            break;
         case "wizard":
            levelnum= 2;
            break;
         case "mage":
            levelnum= 3;
            break;
         case "sorcerer":
            levelnum= 4;
            break;
         case "shaman":
            levelnum= 5;
            break;
      }
   }

   
   /**
   *@setup setSupplies method 
   *@param name1- a strinng that takes person's supplies from test program
   */

   public void  setSupplies(String initsupplies)
   {
      supplies= initsupplies;
   }

   
   /**
   *@setup setHealth method 
   *@param name1- a strinng that takes person's health from test program
   */

   public void setHealth(int inithealth)
   {
      health= inithealth;
   }

  
  /**
   *@setup setGalleons method 
   *@param name1- a string that takes galleons point name from test program
   */
   public void setGalleons(int initgalleons)
   {
      galleons= initgalleons;
   }

  
  /**
   *@setup getName method 
   *@return name- returns person  name to the test program
   */

   public String getName()
   {
      return name;
   }
   
   /**
   *@setup getLevel method 
   *@return name- returns person's level to the test program
   */

   
    public String getLevel()
   {
      return level;
   }

   
   /**
   *@setup getSupplies method 
   *@return name- returns supplies to the test program
   */

   public String getSupplies()
   {
      return supplies;
   }
  
  /**
   *@setup getHealth method 
   *@return name- returns health points to the test program
   */

   public double getHealth()
   {
      return health;
   }
   
   /**
   *@setup getGalleons method 
   *@return name- returns total galleons point to the test program
   */

   public int getGalleons()
   {
      return galleons;
   }

   
   
   /**
   *@setup toString() method of of String type 
   *@return- the string to the  test program when an object is called
    */
   public String toString()
   {
      String newstring = "Name : "+name+"\nLevel : "+level+"\nSupplies : "+supplies+"\nHealth : "+health+"\nGalleons "  + galleons;
      return newstring;
   }
   
   
   
   /**
   *@setup advancelevel method of boolean type 
   *@return true- returns return true if the level is promoted
   *@return false- returns false if thet level is not promoted
   */
   public boolean advanceLevel()
   {
      if(level.equals("apprentice")|| level.equals("wizard")||level.equals("mage")||level.equals("sorcerer"))
      {
         switch(level)
         {
            case "apprentice":
               level = "wizard";
               break;
            case "wizard":
               level = "mage";
               break;
            case "mage":
               level = "sorcerer";
               break;
            case "sorcerer":
               level = "shaman";
               break;
         }
         switch ( level)
         {
            case "apprentice":
               levelnum= 1;
               break;
            case "wizard":
               levelnum= 2;
               break;
            case "mage":
               levelnum= 3;
               break;
            case "sorcerer":
               levelnum= 4;
               break;
            case "shaman":
               levelnum= 5;
               break;
         }
      
      
         galleons = galleons +100;
         return true;
      }
      else
      {
         return false;
      }
   }

   
   
   
   
   /**
   *@setup downgrade method of boolean type 
   *@return true- returns  true if the level is demoted
   *@return false- returns false if thet level is not demoted
   */
   public boolean downgradeLevel()
   {
      if(level.equals("shaman")|| level.equals("wizard")||level.equals("mage")||level.equals("sorcerer"))
      {
         switch(level)
         {
            case "shaman":
               level = "sorcerer";
               break;
            case "sorcerer":
               level = "mage";
               break;
            case "mage":
               level = "wizard";
               break;
            case "wizard":
               level = "apprentice";
               break;
         }
         switch ( level)
         {
            case "apprentice":
               levelnum= 1;
               break;
            case "wizard":
               levelnum= 2;
               break;
            case "mage":
               levelnum= 3;
               break;
            case "sorcerer":
               levelnum= 4;
               break;
            case "shaman":
               levelnum= 5;
               break;
         }
      
         if (galleons>=100)
         {
            galleons = galleons -100;
         }
         else
         {
            galleons =0;
         }
      
         return true;
      }
      else
      {
         return false;
      }
   
   }

   
  
  
   /**
   *@setup buyProp method of boolean type 
   *@return true- returns  true if the prop is brought
   *@return false- returns false if the prop is not brought
   */
   public boolean buyProp(char type)
   {
      boolean temp;
      if( type == 's' && galleons>=300 )
      {
         supplies = (supplies + " Staff");
         galleons = galleons -300; 
         temp = true;
      }
      if( type == 'c' && galleons>=75 )
      {
         supplies = (supplies + " Cauldron");
         galleons = galleons -75; 
         temp = true;
      }
      if( type == 'b' && galleons>=100 )
      {
         supplies = (supplies + " broom");
         galleons = galleons -100; 
         temp = true;
      }
      if( type == 't' && galleons>=150 )
      {
         supplies = (supplies + " telescope");
         galleons = galleons -150; 
         temp = true;
      }
      if( type == 'w' && galleons>=200 )
      {
         supplies = (supplies + " wand");
         galleons = galleons -200; 
         temp = true;
      }
      else 
      {
         temp = false;
      }
      return temp;
   
   }

  
  
  /**
   *@setup an extra method of int type 
   *@return level number that corresponds to the level
      */

   public int getLevelnumber()
   {
      int lnum=0;
      switch ( level)
      {
         case "apprentice":
            lnum= 1;
            break;
         case "wizard":
            lnum= 2;
            break;
         case "mage":
            lnum= 3;
            break;
         case "sorcerer":
            lnum= 4;
            break;
         case "shaman":
            lnum= 5;
            break;
      }
      return lnum;
   
   }

   
   
   
   
   /**
   *@setup spellBind method that places on Magician m for a given time according to the follwing specification
  *@param- object m of Magician class from test program
   *@param- integer value lengthOfTime from Test Program
   */
   public void spellBind(Magician m, int lengthOfTime)
   {
   final double RATE1 = 0.02;
   final double RATE2 = 0.05;
   final double BONUS = 10;
      if ( levelnum < m.getLevelnumber())
      {
         double newhealth = (m.getHealth()-(RATE1*(m.getHealth())));
      
         m.setHealth((int)newhealth);
      
         health = health + (int)(RATE1*(m.getHealth())) ;
      }
   
      if ( levelnum == m.getLevelnumber())
      {
         double secondnewhealth = (m.getHealth()-(RATE2*(m.getHealth()))-(BONUS*lengthOfTime));
      
         m.setHealth( (int)secondnewhealth);
         health = health + (int)(RATE2*(m.getHealth())+(BONUS*lengthOfTime)) ;
      
      }
   
      if(levelnum > m.getLevelnumber())
      {
         double thirdnewhealth = m.getHealth();
         for (int i=1; i<=lengthOfTime; i++)
         {
         
            thirdnewhealth = thirdnewhealth - (RATE2*thirdnewhealth);
         }
         m.setHealth((int)thirdnewhealth);
      
      }
   }

   
   
   
   /**
   *@setup equals  method of boolean type 
   8@param- object m of the magician class from test program
   *@return true- returns  true if both the object have same identity
   *@return false- returns  false if both the object do nothave same identity
    */
   public boolean equals(Magician m)
   {
      if (name.equals(m.getName())&& level.equals(m.getLevel())&& health==(m.getHealth()) && galleons==(m.getGalleons()))
      {
         return true; 
      
      }
      else
      {
         return false;
      }
   }
}// End of the class