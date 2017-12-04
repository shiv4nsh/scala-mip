package com.foobar.mip

class MathematicalIntegerProgrammingDemo {

  /*
  Implement this Solution
   Let items be indexed by i and warehouses be indexed by j.
   Qi-> quantity of item i in the cart
   Sij-> quantity of item i at warehouse j
   Dj-> distance from the customer to the warehouse j.

 First find the minimum warehouse count k.
 Let binary variable xj be 1 if and only if warehouse j is involved in the order.

 k is the value of this program.

 minimize sum over j of xj
subject to
for all i, (sum over j of min(Sij, Qi) * xj) >= Qi
for all j, xj in {0, 1}

Second find the closest warehouses.
 I'm going to assume that we want to minimize the sum of the distances.

minimize sum over j of Dj * xj
subject to
for all i, (sum over j of min(Sij, Qi) * xj) >= Qi
(sum over j of xj) <= k
for all j, xj in {0, 1}


    */

  def calculate(Qi: Int, Sij: Int, Dj: Double) = ???

  def demo = {
    import optimus.optimization._
    implicit val problem = MIProblem(SolverLib.ojalgo)

    val x = MPFloatVar("x", 0, 40)
    val y = MPIntVar("y", 0 to 1000)
    val z = MPIntVar("z", 0 until 18)
    val t = MPFloatVar("t", 2, 3)
    maximize(x + 2 * y + 3 * z + t)
    subjectTo(
      -1 * x + y + z + 10 * t <:= 20,
      x - 3.0 * y + z <:= 30,
      y - 3.5 * t := 0
    )
    start()
    println("objective: " + objectiveValue)
    println("x = " + x.value + "y = " + y.value + "z = " + z.value + "t = " + t.value)
    release()
  }
}
