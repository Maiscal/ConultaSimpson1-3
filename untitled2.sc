///////
def integracion(f: Double => Double, a: Double, b: Double): Double= {
  val h = b - a
  val x = (a+b)/2
  val operacion = h * ((f(a)+ (4*f(x)) + f(b))/6)
  operacion
}

def calError(f1: Double, a: Double): String = {
  val error = Math.abs(a - f1)
  "El error es: " + error
}

//////////


val f1 = (x: Double) =>  - x * x + 8 * x - 12 // 5 ! 3
val f2= (x: Double) =>  3 * (x * x) // 2 ! 0
val f3 = (x: Double) => x + 2*(x*x)-(x * x * x)+ 5*(x*x*x*x)  // 1 ! -1
val f4 = (x: Double) =>  (2*x+1)/(x*x+x) // 2 ! 1
val f5 = (x: Double) =>Math.pow(Math.E,x) // 1 ! 0
val f6 = (x: Double) =>  1/Math.sqrt(x - 1) // 3 ! 2
val f7 = (x : Double) => 1/(1+x*x) // 1 ! 0



val b = 1
//f
val a = 0

val integral = integracion(f7, a, b)

println("El valor aproximado de la integral de f(x) entre a="+ a +" y b="+ b + " es: "+integral)

val error = calError(integral,0.785398)

