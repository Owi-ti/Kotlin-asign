fun main(){
    var i= CurrentAccount(134567890,"Esther Owiti",500)
     deposit(2000.0)
     println( i.balance)
     withdrawal(1500.0)

    var x=Product("lotion",500,180,"nice & lovely")
    var y=Product("polish", 250,200,"kiwi")
    var z=Product("oil",500,650,"Tilly")
    var item= mutableListOf(x,y,z)
    println(item)

    var results = evenstr("banana")
    println(results)





}
class CurrentAccount(var accountNumber:Int, var accountName:String,var balance:Int )
   fun deposit(amount:Double):Double {
      var a=0.0












   }
   fun withdrawal(amount: Double){



   }

   fun detail(){
       var text= detail()




   }
//2.
class savingAccount(var accountNumber:Int, var accountName:String,var balance:Int)



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


