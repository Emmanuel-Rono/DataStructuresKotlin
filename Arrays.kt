fun linearSearch(array:IntArray, target:Int):Int{
   
    for (i in array.indices){
        if(array[i] == target)
        {
        print("found $i")
        return i
    }
    }
   return -1
}

fun main()
{
    val target=5
    val array=intArrayOf(1,2,5,6,7,8,9)
    val result=linearSearch(array,target)
   print ("result $result")
    val myArray=Array(10,{i -> i*1})
     for(i in 0..myArray.size-1)
    {
        println(myArray[i])
    }

    val myArray2=arrayOf(1,2,3,4,5)
  
    for(i in 0..myArray2.size-1)
    {  println(myArray2[i])
    }
        
    val myArray3 = arrayOf<Int>(1,2,3,4,5)
    for(i in 0..myArray3.size-1)
    {
        println(myArray3[i])
    }}