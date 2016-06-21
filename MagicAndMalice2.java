/********************************************************************
* MagicAndMalice.java
* @version 1.0
* Driver program for the Magician.java class
*
* @author Connor Dixon
* 11 March 2014
********************************************************************/
public class MagicAndMalice2
{
   public static void main (String[] args)
   {
      //////////////////////////////////////
      // Create the first Magician, Harry //
      /*************************************************************
      * Printout should look something like:
      *    Name:  Harry Potter
      *    Level:  Apprentice
      *    Galleons: 200
      *    Health: 1000
      *    Supplies:  wand broom
      *************************************************************/
      Magician harry = new Magician("Harry Potter#apprentice#wand#broom");
      System.out.println(harry);  // test toString() method
      System.out.println("------------------------\n\n");
      
      ///////////////////////////////////
      // Test advancer and downgrader. //
      /*************************************************************
      * Printout should be the following:
      *   true
      *   Wizard
      *   false
      *   true
      *   false
      *************************************************************/
      System.out.println(harry.advanceLevel()); // from Apprentice to Wizard, true
      System.out.println(harry.getLevel()); // print Wizard
      harry.setLevel("shaman");
      System.out.println(harry.advanceLevel()); // can't go above Shaman, so false
      harry.setLevel("wizard");
      System.out.println(harry.downgradeLevel()); // from Wizard to Apprentice, true
      System.out.println(harry.downgradeLevel()); // can't go below Apprentice, so false
      System.out.println("-----------------\n\n");
      
      //////////////////
      // Test Equals. //
      /*************************************************************
      * Printout should be the following:
      *   true
      *   false
      *************************************************************/
      Magician polyjuiceFleur = new Magician("Harry Potter#apprentice#Broom#Wand");
      Magician polyjuiceBill = new Magician("Harry Potter#apprentice#Wand");
      System.out.println(polyjuiceFleur.equals(polyjuiceBill)); //identical in all but supplies, so true
      
      polyjuiceBill.setHealth(1111);
      System.out.println(polyjuiceBill.equals(polyjuiceFleur)); //not identical in health, so false
      System.out.println("------------\n\n");
      
      //////////////////////
      // Test Spell Bind. //
      /*************************************************************
      * Harry and Draco will duel.
      *************************************************************/
      System.out.println("Harry: " + harry.getHealth() + " hp");
      Magician draco = new Magician("Draco Malfoy#wizard#Wand#Staff");
      System.out.println("Draco: " + draco.getHealth() + " hp");
      
      harry.spellBind(draco, 2);
      // harry will have 1020 hp
      // draco will have 980 hp
      System.out.println("Harry casts Rictusempra!");
      System.out.println("Harry: " + harry.getHealth() + " hp");
      System.out.println("Draco: " + draco.getHealth() + " hp");
      
      System.out.println("Harry gains skill.  He is now a Wizard.\n");
      harry.advanceLevel();
      harry.setHealth(1000);
      draco.setHealth(1000);



      draco.spellBind(harry, 2);
      // harry will have 930 hp
      // draco will have 1070 hp
      System.out.println("Draco casts Serpensortia!");
      System.out.println("Harry: " + harry.getHealth() + " hp");
      System.out.println("Draco: " + draco.getHealth() + " hp");
      
      
      System.out.println("Harry gains skill.  He is now a Mage.\n");
      harry.advanceLevel();
      harry.setHealth(1000);
      draco.setHealth(1000);
      
      harry.spellBind(draco, 2);
      // after one second, draco will have 950 hp
      // after the next, draco will have 902.5 hp, floored to 902
      System.out.println("Harry casts Expelliarmus!");
      System.out.println("Harry: " + harry.getHealth() + " hp");
      System.out.println("Draco: " + draco.getHealth() + " hp");
      System.out.println("----------------\n\n");
      
      //////////////////
      // Diagon Alley //
      /*************************************************************
      * Harry will buy things.
      *************************************************************/
      Magician neville = new Magician("Neville Longbottom#apprentice");
      
      neville.setGalleons(299);
      System.out.println(neville.buyProp('s') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //not enough money
      neville.setGalleons(300);
      System.out.println(neville.buyProp('s') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //should buy staff
      
      neville.setSupplies(""); //reset
      
      neville.setGalleons(74);
      System.out.println(neville.buyProp('c') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //not enough money
      neville.setGalleons(75);
      System.out.println(neville.buyProp('c') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //should buy cauldron
      
      neville.setSupplies(""); //reset
      
      neville.setGalleons(99);
      System.out.println(neville.buyProp('b') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //not enough money
      neville.setGalleons(100);
      System.out.println(neville.buyProp('b') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //should buy broom
      
      neville.setSupplies(""); //reset
      
      neville.setGalleons(149);
      System.out.println(neville.buyProp('t') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //not enough money
      neville.setGalleons(150);
      System.out.println(neville.buyProp('t') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //should buy telescope
      
      neville.setSupplies(""); //reset
      
      neville.setGalleons(199);
      System.out.println(neville.buyProp('w') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //not enough money
      neville.setGalleons(200);
      System.out.println(neville.buyProp('w') + "\n" + neville.getGalleons() + "\n" + neville.getSupplies());
      System.out.println(); //should buy wand
      
      
      
            
   
   }
}