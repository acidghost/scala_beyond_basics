class Person private(firstName: String, lastName: String)

object Person {
  private var c = 0

  def apply(firstName: String, lastName: String): Person = {
    c = c + 1
    new Person(firstName, lastName)
  }

  def count: Int = c
}


// throws error (constructor)
// val w = new Person("Andrea", "Jemmett")

val p = Person("Andrea", "Jemmett")
val q = Person("Nensi", "Kolo")

println(s"I created ${Person.count} people!")


val list = Nil.::(4).::(3).::(2).::(1)
list == 1 :: 2 :: 3 :: 4 :: Nil

val (h, t) = 1 :: Nil

