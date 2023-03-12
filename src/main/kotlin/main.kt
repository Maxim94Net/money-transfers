fun main() {
    val amount = 2000
    val commissionPercent = 0.0075
    val minCommission = 35
    val commission = amount * commissionPercent
    val finCommission = if (commission < minCommission) minCommission else commission
    println("Комиссия составила: $finCommission руб.")

}