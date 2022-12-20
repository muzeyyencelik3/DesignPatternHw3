/*
müzeyyen çelik
B211202351
Design Patterns  hw3

Template method design pattern is to define an algorithm as a skeleton of operations and leave the details to be implemented by the child classes.
 The overall structure and sequence of the algorithm are preserved by the parent class.
Template means Preset format like HTML templates which has a fixed preset format.
 Similarly in the template method pattern, we have a preset structure method called template method which consists of steps.
  These steps can be an abstract method that will be implemented by its subclasses.
This behavioral design pattern is one of the easiest to understand and implement.
 This design pattern is used popularly in framework development.
 This helps to avoid code duplication also.

*/
fun main(args: Array<String>) {


val ısoscelesTriangle =IsoscelesTriangle();
val equilateralTriangle=EquilateralTriangle();
println("Drawing Isosceles TRIANGLE")

ısoscelesTriangle.draw();
println("*************************************")
println("Drawing Equilateral TRIANGLE")
    equilateralTriangle.draw();
}