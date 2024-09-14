fun main(args: Array<String>) {
    displayMessage("Rekayasa Perangkat Lunak", 10);
}
fun displayMessage(msg: String, count: Int) {
    var counter = 1
    while(counter <= count ) {
        println("$msg $counter")
        counter++
    }

    val listNumber = listOf(1,2,3,4,5,6)
    println("Jumlah nilai pada elemen listNumber = ${getSum(listNumber)}")
}
fun getSum(values: List<Int>) : Int { // return type is Int
    var total = 0;
    for (i in values) total += i
    return total // return value
}