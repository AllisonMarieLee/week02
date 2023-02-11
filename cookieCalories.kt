fun main() {
    //user enters number of cookies eaten on input screen
var cookiesEaten: Int= 4
	println("Enter number of cookies eaten: $cookiesEaten")

    
val servingSize = 40/10   // 40 cookies per bag; 10 servings in bag
val caloriesPerCookie= 300/servingSize
val caloriesConsumed= cookiesEaten * caloriesPerCookie
    print("Your calorie intake was: $caloriesConsumed calories.")
}
