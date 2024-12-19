def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // or null, depending on desired behavior
  }
  return a + b
}

println myMethod(null, 5)
println myMethod(5, null)
println myMethod(5, 10)