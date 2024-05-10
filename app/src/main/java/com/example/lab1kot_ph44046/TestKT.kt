package com.example.lab1kot_ph44046

fun main () {

    do {
        println("+========= TEST ========+")
        println("+  1. Ví dụ 1         +")
        println("+  2. Ví dụ 2         +")
        println("+  3. Ví dụ 3         +")
        println("+  4. Ví dụ 4         +")
        println("+  5. Ví dụ 5         +")
        println("+  6. Ví dụ 6         +")
        println("+  7. Ví dụ 7         +")
        println("+  8. Ví dụ 8         +")
        println("+  9. Ví dụ 9         +")
        println("+  10. Ví dụ 10         +")

        print("Nhập lựa chọn của bạn (1, 2, 3, 4, 5, 6, 7, 8, 9, 10): ")
        val luachon = readln().toInt() // Sử dụng readln() và toInt()

        when (luachon) {
            1 -> vidu1()
            2 -> vidu2()
            3 -> vidu3()
            4 -> vidu4()
            5 -> vidu5()
            6 -> vidu6()
            7 -> vidu7()
            8 -> vidu8()
            9 -> vidu9()
            10 -> vidu10()

            else -> println("Lựa chọn không hợp lệ!")
        }
        print("Tiếp không?(c/k):")
        val s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình!")
}

fun vidu2 () {  //Phép Chia
    println("Phép chia:")
    print("Nhập số a: ")
    val a = readLine()!!.toDouble()
    print("Nhập số b: ")
    val b = readLine()!!.toDouble()
    if(b==0.0) {
        println("Lỗi: Không thể chia cho 0!")
    }else{
        val c = a / b
        println("$a : $b =$c")
    }
}

fun vidu1 () {
    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers.map { x -> x * 2 }      // 2

    val tripled = numbers.map { it * 3 }          // 3

    println("Number: " + numbers)
    println("Doubled Numbers: " + doubled)
    println("Tripled Numbers: " + tripled)
}

fun vidu3 () {  //Vòng lặp For
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Hello, it's a $cake cake!")
    }

}

fun vidu4 () {  //Ranges
    for(i in 0..3) {             // 1
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4
        print(i)
    }
    print(" ")

}

fun vidu5 () { //Filter
    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // 2

    val negatives = numbers.filter { it < 0 }      // 3

    println("Numbers: " + numbers)
    println("Positives: " + positives )
    println("Negatives: " + negatives)
}

fun vidu6 () { //Function Any
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val anyNegative = numbers.any { it < 0 }             // 2

    val anyGT6 = numbers.any { it > 6 }                  // 3

    println("Numbers: " + numbers)
    println("AnyNegative: " + anyNegative)
    println("AnyGT6: " + anyGT6)
}

fun vidu7 () { //Function All
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val allEven = numbers.all { it % 2 == 0 }            // 2

    val allLess6 = numbers.all { it < 6 }                // 3

    println("Number: " + numbers)
    println("AllEven: " + allEven)
    println("AllLess6: " + allLess6)
}

fun vidu8 () { //Function None
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val allEven = numbers.none { it % 2 == 1 }           // 2

    val allLess6 = numbers.none { it > 6 }               // 3

    println("Numbers: " + numbers)
    println("AllEvan: " + allEven)
    println("AllLess6: " + allLess6)
}

fun vidu9 () { //find, findLast
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    val first = words.find { it.startsWith("some") }                                // 2
    val last = words.findLast { it.startsWith("some") }                             // 3

    val nothing = words.find { it.contains("nothing") }

    println("The first word starting with some is: " + first)
    println("The last word starting with some is: " + last)
    println("The nothing word starting with some is: " + nothing)

}

fun vidu10 () { //Đếm
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val totalCount = numbers.count()                     // 2
    val evenCount = numbers.count { it % 2 == 0 }        // 3

    println("Total number of elements: " + totalCount)
    println("Number of even elements: " + evenCount)

}