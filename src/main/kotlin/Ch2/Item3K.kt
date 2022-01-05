package Ch2

object Item3K {
    init {
        println("Item3K")
    }

    fun leaveTheBuilding() {
        println("Item3: leaveTheBuilding")
    }
}

class Item3K_1 private constructor() {
    init {
        println("Item3_1")
    }

    fun leaveTheBuilding() {
        println("Item3_1: leaveTheBuilding")
    }

    companion object {
        val INSTANCE = Item3K_1()
    }
}

class Item3K_2 private constructor() {
    init {
        println("Item3_2")
    }

    fun leaveTheBuilding() {
        println("Item3_2: leaveTheBuilding")
    }

    companion object {
        val instance = Item3K_2()
    }
}

enum class Item3K_3 {
    INSTANCE;

    fun leaveTheBuilding() {
        println("Item3_3: leaveTheBuilding")
    }
}

fun main() {
    Item3K_1.INSTANCE.leaveTheBuilding()
    Item3K_1.INSTANCE.leaveTheBuilding()
    println("----")
    Item3K_2.instance.leaveTheBuilding()
    Item3K_2.instance.leaveTheBuilding()
    println("-----")

    Item3K_3.INSTANCE.leaveTheBuilding()
    Item3K_3.INSTANCE.leaveTheBuilding()
    println("-----")

    Item3K.leaveTheBuilding()
    Item3K.leaveTheBuilding()

}