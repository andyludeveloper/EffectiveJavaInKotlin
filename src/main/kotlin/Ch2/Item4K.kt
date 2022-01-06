package Ch2

fun topFun() {
    println("top fun")
}

class Item4K private constructor() {
    companion object {
        fun staticFun() {
            println("static fun")
        }
    }
}

fun main() {
    topFun()
    Item4K.staticFun()
}
