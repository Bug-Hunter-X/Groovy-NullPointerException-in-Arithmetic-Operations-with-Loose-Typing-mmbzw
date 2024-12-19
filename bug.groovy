def myMethod(a, b) {
  if (a == null || b == null) {
    return null
  }
  return a + b
}

println myMethod(null, 5)