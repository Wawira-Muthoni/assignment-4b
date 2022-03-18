fun main(){
    var result = IntArray(arrayOf(4,1,2,20,5))
    println(result)

    var addition=sumDecimalsArray(arrayOf("Joel",2.5,"school",3.9,'g',4.7F,7.1))
    println(addition)
   var x= charArray(arrayOf('a','b','c','e','d','u'))
    println (x)

}
//Create a function that takes in array of integers
// and returns product of their  all elements
fun IntArray(numbers:Array<Int>):Int{
    var product = 1
    numbers.forEach { number->
        product*=number
    }
     return product
}
//Create a function takes in an Array of mixedtypes and returns
//the sum of all decimal elements.
fun sumDecimalsArray(mixedtypes:Array<Any>):Double{
    var sum = 0.0
    mixedtypes.forEach { num->
        if(num is Double){
            sum+=num}

    }
    return sum
}
//Create a function that takes in array of characters and returns
//number of vowels in the array.
fun charArray(Characters:Array<Char>):Int {
    var add = 0
    Characters.forEach { alpha->
        if (alpha=='a'|| alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
            ++add
    }
      return add

                }