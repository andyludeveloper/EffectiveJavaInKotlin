package Ch2.Item2

class CalzoneK(builder: Builder) : PizzaK(builder) {

    private var sauceInside: Boolean

    companion object {
        class Builder : PizzaK.Companion.Builder<Builder>() {
            var sauceInside = false
            fun sauceInside(): Builder {
                sauceInside = true
                return this
            }

            override fun build(): PizzaK {
                return CalzoneK(this);
            }

            override fun self(): Builder {
                return this
            }
        }
    }

    init {
        this.sauceInside = builder.sauceInside
    }
}

fun main() {
    val calzoneK = CalzoneK(CalzoneK.Companion.Builder())
    calzoneK
}