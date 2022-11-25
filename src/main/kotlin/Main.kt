import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Введите цисло: ")

    fun recursion () {
        val n = reader.nextInt()

        var f = 1
        if (n > 0) {
            f = 1
        }

        for (i in (1..n)) {
            f *= i
        }
        println("Факториал числа: $n = $f")
    }
}