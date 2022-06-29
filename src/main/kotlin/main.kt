fun main() {
    val commission = commissionСalculation("Vk Pay", 0,1000_00)
    println("Комиссия составит $commission копеек")
}
fun commissionСalculation(card: String, previousTransfer: Int, amount: Int ): Int {
    var commission = when{
        card == "Vk Pay" -> (amount*0.0).toInt()
        (card == "MasterCard" || card == "Maestro") && previousTransfer <= 75000_00 -> (amount*0.0).toInt()
        (card == "MasterCard" || card == "Maestro") && previousTransfer > 75000_00 -> (amount*0.06 + 20_00).toInt()
        (card == "Visa" || card == "Мир") && 3500 < (amount*0.075) -> (amount*0.075).toInt()
        (card == "Visa" || card == "Мир") && 3500 > (amount*0.075) -> 3500
        else -> 0
    }
    return commission
}


