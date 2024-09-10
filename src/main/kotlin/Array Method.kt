fun main(args: Array<String>) {
    // Array methods
    // sort()
    val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + " ")
    }
    println()

    // sorted()
    val simpsonsB = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsonsSorted = simpsonsB.sortedArray()
    for (simpson in simpsonsSorted) {
        print(simpson + " ")
    }
    println()

    // reverse() and reversedArray()
    val simpsonsC = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + " ")
    }
    println()

    // indexOf()
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }

    val simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonsE.size)
    if (simpsonsE.isNotEmpty()) {
        println("Array tidak kosong!")
    }
    println("Min = " + simpsonsE.minOrNull())
    println("Max = " + simpsonsE.maxOrNull())
    println("First = " + simpsonsE.first())
    println("Last = " + simpsonsE.last())
    println("Contains Marge = " + simpsonsE.contains("Marge"))
}
