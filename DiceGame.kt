/*
DiceGame.kt Write a runner class (DiceGame.kt) to test your Die class:

Create different sized dice using each constructor
Roll the dice and display their results (before and after)
Choose one Die object and set it to show it's highest value
Create 5 six-sided dice. Roll each Die in a loop until you get 5 of a kind. Count and display the number of rolls.
*/


fun main(){

    /*
    Roll the dice and display their results (before and after)
    Choose one Die object and set it to show it's highest value 
    */
    

    val d6 = Die()                  // create an object with 0 parameter
    val d20 = Die(sides = 20)       // create an object with 1 parameter
    val d10 = Die(name = "percentile die", sides = 10)    // create an object with 2 parameters

    println("Creating a default "+ d6.getName()+ "...")
    println("Creating a "+ d20.getName()+ "...")
    println("Creating a "+ d10.getName()+ "...")
    
    println("The current side up for "+d6.getName()+" is "+ d6.getCurrentSide())
    println("The current side up for "+d20.getName()+" is "+ d20.getCurrentSide())
    println("The current side up for "+d10.getName()+" is "+ d10.getCurrentSide())
    
    println("\nTesting the roll method\n")
    d6.roll()
    println("Rolling the "+d6.getName()+"...")
    println("The new value is "+ d6.getCurrentSide())

    d20.roll()
    println("Rolling the "+d20.getName()+"...")
    println("The new value is "+ d20.getCurrentSide())  // set to the highest side 

    
    d10.roll()
    println("Rolling the "+d10.getName()+"...")
    println("The new value is "+ d10.getCurrentSide())

    println("\nSetting the "+ d20.getName()+ "to show "+d20.getSides())
    d20.setCurrentSide(20)
    println("The side up is now "+ d20.getCurrentSide())

    /*
    Create 5 six-sided dice. 
    Roll each Die in a loop until you get 5 of a kind. 
    Count and display the number of rolls.

    var myList = listOf(Die(6),Die(6),Die(6),Die(6),Die(6))
    var counter = 0
    for (item in myList)
    {
        while(item.getCurrentSide() != 5)
        {
            item.roll()
            counter++
        }
    }
    println("YAHTZEE! It took "+counter+" rolls.")
 */



 
    println("\nCreating a 5 "+ d6.getName()+ "...")
 /* Roll 5 dice at the same time */
    var myList2 = listOf(Die(6),Die(6),Die(6),Die(6),Die(6))
    var counter2 = 0
    var count5 = 0
    while (count5 == 0)
    {
        for (item in myList2)
        {
            item.roll()
            if(item.getCurrentSide() != 5){
                continue
            }  else {
                count5++
            }
        }
        counter2++
        if ( count5 == 5){
            break
        }
        count5 = 0
    }
    println("YAHTZEE! It took "+counter2+" rolls.")

}


