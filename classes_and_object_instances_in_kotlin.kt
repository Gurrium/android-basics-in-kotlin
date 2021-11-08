fun main() {
    val myFirstDice = Dice(6, "Red")
	println("Your ${myFirstDice.numSides} sided ${myFirstDice.color} dice rolled ${myFirstDice.roll()}!")
    
    val mySecondDice = Dice(20, "Blue")
	println("Your ${mySecondDice.numSides} sided ${mySecondDice.color} dice rolled ${mySecondDice.roll()}!")
    
    val myFirstCoin = Coin()
	println("Your coin flipped ${myFirstCoin.flip()}!")
}

class Dice(val numSides: Int, val color: String) {
	fun roll(): Int {
        return (1..numSides).random()	
    }
}

class Coin {
    fun flip(): Int {
        return (1..2).random()
    }
}
