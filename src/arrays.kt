fun main(args: Array<String>) {

    var myarr = arrayOf("Bananas","Oranges","Mangos","Apples","67","75")
    myarr[1] = "Melons"
    println("I love eating ${myarr[1]}")

    var myarr2 = arrayOf<Int>(5,7,1,-4,-9,12,6,0)
    println(myarr2.sorted())

    var myarr3 = arrayOf<Float>(2.0F,2.9F,-0.6F,-10.3F,3.9F,78.9F)
    println(myarr3.sorted())

    var myarr4 = arrayOf<String>("Kenya","Uganda","Tanzania","Ethiopia","Madagascar")
    println(myarr4.sorted())

}