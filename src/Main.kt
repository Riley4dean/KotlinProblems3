fun main() {
    //problem 8
    val firstUserEmailId = "user_one@gmail.com"
    val emailId = "Unknown OS"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId, firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

}

fun displayAlertMessage(operatingSystem: String, emailId: String): Any {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
}

//problem 9
fun main1() {
    val Steps = 4000
    val CaloriesDeleted = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $CaloriesDeleted calories")
}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCaloriesDeleted = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCaloriesDeleted
}

//problem 10
fun main2() {
    println("Have you been a bad kid: ${Counter(300, 250)}")
    println("Have you been a bad kid: ${Counter(300, 300)}")
    println("Have you been a bad kid: ${Counter(200, 220)}")
}
fun Counter(timeSpentToday: Int, timeSpentYesterday: Int): Boolean  {
    return timeSpentToday > timeSpentYesterday

}

//problem 11
fun calmluhweather() {
    calmluhweather("Ankara",27 ,31 ,82 )
    calmluhweather("Tokyo",32 ,36 ,10 )
    calmluhweather("Cape Town",59 ,64 ,2 )
    calmluhweather("guatemala City",50 ,55 ,7)
}



fun calmluhweather(City: String, LowTemp: Int, Hightemp: Int, Chance: Int): String{
    return ("$City has a Low temperature of $LowTemp and a high temp of $Hightemp with a chance of $Chance of rain.")
}