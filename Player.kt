class Player {
    val name = "佐藤"
    get() =field.capitalize()

    fun castFireball(numFireballs:Int=2){
        println("A glass of FireBall springs into existence.(x$numFireballs)")
    }
}
/*
field 不允許直接定義
get 讀取屬性
set 設定屬性
 */