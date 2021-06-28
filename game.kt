fun main(){

    val player = Player()
    player.castFireball()


    //println("光環顏色: $auraColor , 是否受祝福: ${if(isBlessed) "是的" else "否"}   ")
    println("${player.name} ${player.formatHealthStatus}")
}