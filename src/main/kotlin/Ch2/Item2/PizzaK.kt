package Ch2.Item2

import java.util.*

open class PizzaK(private val builder: Builder<*>) {

    enum class Topping {
        HAM,
        MUSHROOM,
        ORION,
        PEPPER,
        SAUSAGE
    }

    private val toppings: Set<Topping>

    init {
        toppings = builder.toppings.clone()
    }

    companion object {
        abstract class Builder<T : Builder<T>?> {
            var toppings: EnumSet<Topping> = EnumSet.noneOf(Topping::class.java)
            fun addTopping(topping: Topping): T {
                toppings.add(topping)
                return self()
            }

            abstract fun build(): PizzaK

            protected abstract fun self(): T
        }
    }
}