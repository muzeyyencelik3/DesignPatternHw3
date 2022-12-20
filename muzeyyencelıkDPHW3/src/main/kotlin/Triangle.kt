abstract class Triangle {
    fun draw() {
    angle();
    edge();
    edgeEquations();
    }

    open fun angle(){
        println("The sum of the angles is 180");
    }
    open fun edge(){
        println("Total 3 sided");
    }
    open fun edgeEquations(){
        println("Equilateral if 3 sides are equal, isosceles if 2 sides are equal")
    }
}
