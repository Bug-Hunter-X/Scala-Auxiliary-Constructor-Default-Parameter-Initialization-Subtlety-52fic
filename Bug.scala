```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}
```
This code might seem innocuous, but it hides a subtle bug related to how Scala handles auxiliary constructors and default parameter values.  If you try to call `new MyClass` without providing a value for `x`, you might expect `x` to be 0. However, there's no guarantee that the initialization of `x` in the primary constructor will happen before any side effects or other operations within the auxiliary constructor.