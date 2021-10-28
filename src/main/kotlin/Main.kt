fun main(args: Array<String>) {



    var x = 0
    val repetir = 1
    var resultado =0

    for (repetir in 1 ..10) {

        println("Informe o valor $repetir")
        x = readLine()!!.toInt()

        if (x % 2 == 0) {

            println("par")
        } else if (x % 2 == 1) {

            println("impar")
        }

    }
}