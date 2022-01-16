package Ch2.Item2

class NyPizzaK(builder: Builder) : PizzaK(builder) {

    enum class Size {
        SMALL, MEDIUM, LARGE
    }

    private val size: Size

    companion object {
        class Builder(val size: Size) : PizzaK.Companion.Builder<Builder>() {

            override fun build(): NyPizzaK {
                return NyPizzaK(this)
            }

            override fun self(): Builder {
                return this
            }

        }
    }

    init {
        size = builder.size
    }
}