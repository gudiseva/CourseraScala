object FactorialTail {
  def factorial(n: Int): Int = {
    def loop(accumulate: Int, n: Int): Int =
      if(n == 0) accumulate
      else loop(accumulate * n, n - 1)
    loop(1, n)
  }
}
