fun main(){
    val name="佐藤"
    val healthPoint = 89
    var isBlessed = false
    var isImmortal = false

    val player = Player()
    player.castFireball()

    var auraVisible = healthPoint >=50 && isBlessed || isImmortal
    val karma = (Math.pow(Math.random(),(110-healthPoint)/100.0)*20).toInt()
    var auraColor = when(karma){
        in 0..5 -> "Red"
        in 6..10 -> "Orange"
        in 11..15 -> "Purple"
        in 16..20 -> "Green"
        else -> "沒有光環"
    }
    println("$healthPoint $karma")
    val healthStatus= when(healthPoint){
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed){
            "has some minor wounds but is heading quite quickly."
        }else {
            "has some minor wounds."
        }
        in 15..74 -> "look pretty hurt."
        else -> "is in awful condition"
    }
    println("光環顏色: $auraColor , 是否受祝福: ${if(isBlessed) "是的" else "否"}   ")
    println("$name $healthStatus")
}