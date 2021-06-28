fun main(){



    val player = Player()
    player.castFireball()

    var auraVisible = healthPoint >=50 && isBlessed || isImmortal

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
    //println("光環顏色: $auraColor , 是否受祝福: ${if(isBlessed) "是的" else "否"}   ")
    println("${player.name} $healthStatus")
}