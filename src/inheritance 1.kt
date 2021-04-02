fun main(){
    var matatu=Car("subaru","legacy","white",35)
    matatu.carry(54)
    println(matatu.capacity)
    matatu.identity("white","subaru","legacy")
    println(matatu.calculateParkingFees(10))
     var fare=Bus("toyota","new","yellow",60)
    println(fare.maxTripFare(78.787))
    println(fare.calculateParkingFees(6))


    }

open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        if(capacity<=people) {
            println("Carrying $people passengers")
        }else{
            println("over capacity by $people")
        }
    }
    fun identity(color: String,make: String,model: String){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var multiply=hours*20
        return multiply
    }
} class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var total=fare*capacity
        return total
    }
    override fun calculateParkingFees(hours:Int):Int{
      var parkingFees=hours*capacity
        return parkingFees
    }
}




