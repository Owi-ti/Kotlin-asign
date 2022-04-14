fun main(){
    var i= Currentaccount("Esther",376593,7580.0,)


     withdrawal(1500.0)

    var x=Product("lotion",500,180,"nice & lovely")
    var y=Product("polish", 250,200,"kiwi")
    var z=Product("oil",500,650,"Tilly")
    var item= mutableListOf(x,y,z)
    println(item)

    var results = evenstr("banana")
    println(results)





}
}
open class Currentaccount(var accountName:String,var accountNumber:String,var accountBalance:Double){
    fun deposit(amount:Double){
        accountBalance+=amount
        println(amount)


    }
    open fun withdrawn(amount: Double){
        accountBalance-=amount
        println(amount)
    }
    fun details(){
        println("Account number $accountNumber with balance ${accountBalance} is operated by $accountName")
    }

}
o
   fun withdrawal(amount: Double){



   }

   fun detail(){
       var text= detail()




   }
//2.
pen class savingsAccount(accountName: String,accountNumber: String,accountBalance: Double , var withdrawals:Int ):Currentaccount(accountName,accountNumber,accountBalance,) {
    override fun withdrawn(amount: Double) {
        if(withdrawals<=4){

        }
    }



}



data class Product(var name:String, var weight:Int, var price:Int,var category:String)
 fun whenStat(product:Product) {
    var r= mutableListOf<Product>()
    when(product.category){
        "groceries"-> println(r.plus(product))
    }

}

//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given "banana" it will return
//"bnn"

fun evenstr(word:String):String {
    var make=" "
    for (characters in word){
        if (word.indexOf(characters)%2==0){
            make+=characters
        }
    }
    return make
}


