import kotlin.math.*

fun main() {
    
    var principal= 10000                 // P in formula
    	println("Amount of pricipal originally deposited into the account: $$principal")
    
    var annualRate= 5                 // r in formula
   		println("Annual interest rate paid by the account: $annualRate%")
    
	var timesPerYearCompounded= 12              // n in formula
    	println("Number of times per year that the interest is compounded: $timesPerYearCompounded")
    
	var specifiedYears= 3             // t in formula
    	println("Number of years the account will be left to earn interest: $specifiedYears \n")
    
    
    //formula is A=P(1+(r/n))^(nt)
    //will have separate formulas for base and exponent
    
    val base= (annualRate/100.00) / timesPerYearCompounded + 1             // (1+(r/n))
    val exponent= timesPerYearCompounded * specifiedYears            // (n*t) exponent in formula
    
    val result = (Math.pow(base.toDouble(), exponent.toDouble())*principal)
    
        print("The amount of money that will be in the account after $specifiedYears account will be: $$result")
}
