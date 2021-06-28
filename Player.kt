class Player {
    var name = "kiyara "
    get() = field.capitalize()
    set(value) {
        field = value.trim()
    }
    fun castFireball(numFireballs:Int=2){
        println("A glass of FireBall springs into existence.(x$numFireballs)")
    }
}
/*
field 不允許直接定義
get 讀取屬性
set 設定屬性
 */