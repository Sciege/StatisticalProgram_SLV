//Create a statistical program which will allow the user to:
//
//Add new data
//See all data entered
//Find an item, to see whether it has been entered or not
//View a summary of statistics: amount of data, sum, average, maximum, minimum
//Exit the program
//These options must appear as a menu. Each option will
//be chosen by a number or a letter.
//
//The program must reserve space for a maximum of 1000
//data, but keep count of how many data actually exist.
fun main() {
    println("Welcome to the program")
    val list = mutableListOf<Int>()

    while (true) {
        println("1. Add data")
        println("2. See all data")
        println("3. Find item")
        println("4. Summary of statistics")
        println("5. Exit program")
        when (val number = readln()) {
            "1" -> {
                println("Enter data to be added:")
                val input = readln().toInt()
                list.add(input)
            }

            "2" -> {
                if (list.isEmpty()) {
                    println("Data is empty")
                } else {
                    println("List/s of data:")
                    print("$list \n")
                }
            }

            "3" -> {
                println("Enter data to found:")
                val found = readln().toInt()
                if (list.contains(found)) {
                    println("$found, can be found")
                } else {
                    println("$found, can't be found")
                }
            }
//View a summary of statistics: amount of data, sum, average, maximum, minimum
            "4" -> {
                println("Summary of data:")
                println("Amount of data:${list.size} Sum:${list.sum()} Average:${list.average()} Maximum:${list.max()} Minimum:${list.min()}")
            }

            "5" -> {
                println("Exiting program")
                break
            }

            else -> {
                println("$number is out of bounds, please enter again")
            }
        }
    }
}
