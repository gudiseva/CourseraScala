def sumInts(a: Int, b: Int): Int =
  if(a > b) 0 else a + sumInts(a + 1, b)

def cube(x: Int): Int = x * x * x

def sumCubes(a: Int, b: Int): Int =
  if(a > b) 0 else cube(a) + sumCubes(a + 1, b)

def sumFactorials(a: Int, b: Int): Int =
  if(a > b) 0 else factorial(a) + sumFactorials(a + 1, b)

def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n - 1)