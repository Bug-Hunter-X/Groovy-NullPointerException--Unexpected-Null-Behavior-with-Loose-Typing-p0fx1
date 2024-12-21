```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null
  }
  return a + b
}

println myMethod(1,2) //3
println myMethod(null, 2) //null
println myMethod(1, null) //null
println myMethod(null, null) //null

println myMethod([1,2], [3,4]) //[1, 2, 3, 4]
println myMethod([1,2], null) //null
println myMethod(null, [3,4]) //null
println myMethod(null, null) //null

println myMethod("a", "b") //ab
println myMethod("a", null) //null
println myMethod(null, "b") //null
println myMethod(null, null) //null
```