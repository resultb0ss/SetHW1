fun main() {
    var mySet = setOf(1,2,3,4,5,6,7,8,9,10)
    var mySetOne = mySet.filter { it % 2 == 0 }
    var mySetTwo = mySet.filter { it % 2 != 0 }
    println(mySetOne)
    println(mySetTwo)

}