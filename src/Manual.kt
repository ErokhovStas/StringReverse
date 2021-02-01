import java.util.*
import kotlin.jvm.JvmStatic

object Manual {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Введите строку, которую нужно инвертировать: ")
        val sc = Scanner(System.`in`)
        val s1 = sc.nextLine()
        ReverseStroki(s1)
    }
}