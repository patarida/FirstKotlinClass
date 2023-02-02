class Die(
    sides: Int=6,       // // constructor for 0,1 parameters, max side
){
    // properties (data member)
    private var name = "d"+sides
    private var sides = sides
    private var currentSide: Int   
    
    // define the currentSide
    init {
        this.currentSide = kotlin.random.Random.nextInt(from =1 ,until = this.sides)  
    }
  
    // constructor for 2 parameters, name and side
    constructor( 
        name:String, 
        sides:Int, 
    ): this(sides){
        this.name = name
        this.sides = sides
    }

    // method for this class
    fun getName(): String = this.name
    fun getSides(): Int = this.sides
    fun setCurrentSide(number: Int): Unit { this.currentSide = number}  // check that it is not > sides
    fun getCurrentSide(): Int = this.currentSide
    fun roll(): Unit { 
        this.currentSide = kotlin.random.Random.nextInt(from =1 ,until = this.sides)  
    }

}


/*
properties to describe the die
Type - or name, or colour (eg d20)
Number of sides (eg 20)
Current side up

A primary constructor that can accept 0, 1, or two arguments

Default type/name: "d6"; default number of sides: 6; random side up generated from the roll method
Number of sides is the parameter. Default type/name: "d{number of sides}" random side up generated from the roll method
Both the number of sides and the type are parameters; random side up generated from the roll method

Appropriate accessors and mutators

Things to consider:
Should you let the user change the number of sides?
If you can change the number of sides, should you also change the type/name?
A roll method to generate a random value
Your roll method can make use of built-in random functions like Random.nextInt().
roll is a special set method that doesn't take any arguments and shouldn't return a value
*/

