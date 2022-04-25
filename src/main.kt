fun main(){
    var i= CurrentAccount("Esther","98769766",7400.0)
    i.deposit(600.0)
    i.withdrawn(400.0)
    i.details()
    var me= SavingsAccount("Owiti","43525454",5000.00,2)
    me.withdrawn(3000.00)
    me.withdrawn(1000.0)
    me.withdrawn(1000.00)
    println(me.accountBalance)

    var x=Product("towel",50,180,"hygiene")
    var y=Product("cabbage", 5,80,"groceries")
    var z=Product("oil",500,650,"others")
       whenStat(Product("towel",50,180,"hygiene"))

    var results = evenstr("banana")
    println(results)
}
//1.Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance by the amount deposited
//b.withdraw(amount: Double) - Decrements the balance by the amount withdrawn
//c.details() - Prints out the account number and balance and name in this format: “Account number x with
// balance y is operated by z”                                                  (5points)

open class CurrentAccount(var accountName:String,var accountNumber:String,var  accountBalance:Double){
    fun deposit(amount:Double){
        accountBalance+=amount
        println(accountBalance)

    }open fun withdrawn(amount: Double){
        accountBalance-=amount
        println(accountBalance)
    }
    fun details(){
        println("Account number $accountNumber with balance $accountBalance is operated by $accountName")
    }
}
//2.Create another classSavingsAccount. It has the same functions and attributes as the current account
// except for one attribute, withdrawals: Int. Withdrawals is a counter variable that is used to keep track
// of how many withdrawals have been made from the account in a year. The only other difference is that the
// savings account withdraw() method first checks if the number of withdrawals is less than 4 for it to allow
// one to withdraw money from the account. It also increments the withdrawals attribute after a successful withdrawal
//(5points)
  class SavingsAccount(accountName:String,accountNumber: String,accountBalance: Double , var withdrawals:Int ):CurrentAccount(accountName,accountNumber,accountBalance,) {

    override fun withdrawn(amount: Double) {
       if (withdrawals<4){
        withdrawals++
            super.withdrawn(amount)

            println("Allowed to withdrawn")
        }else{
            println("you have reached maximum withdrawal")
        }
    }
}
//3.A product is represented by a data class with these attributes: name, weight, price, category. Category
// can either be groceries, hygiene or other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category

data class Product(var name:String, var weight:Int, var price:Int,var category:String)
 fun whenStat(product:Product) {
    var groceries = mutableListOf<Product>()
     var hygiene = mutableListOf<Product>()
     var others= mutableListOf<Product>()
    when(product.category){
        "groceries"-> println(groceries.add(product))
        "hygiene"-> println(groceries.add(product))
        else-> others.add(product)
    }
  println(groceries)
  println(hygiene)
  println(others)
}

//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given "banana" it will return "bnn"

fun evenstr(word:String):String {
    var make=" "
    for (characters in word){
        if (word.indexOf(characters)%2==0){
            make+=characters
        }
    }
    return make
}


