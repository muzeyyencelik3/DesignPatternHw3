class EquilateralTriangle:Triangle() {
    override fun angle() {
        println("180");
    }

    override fun edge() {
        println("3 sided all equal");
    }

    override fun edgeEquations() {
        println("all angles 60 degrees")
        println("all sides are the same length")

    }
}