//Traversing Array
//Traversal is the process of visiting each element, and searching is a specific operation performed during that traversal.
fun MyTeestFn(array:IntArray, thenumber:Int):Int
{
    //body
    //traverse a dn find number 5 in an Array
    for(i in array.indices)
    {
        if(array[i]== thenumber)
        {
            print("Found")
            return i 
        }
    }
    return -1
}
fun main()
{
    //access the function members variables
    //#1.Initialise Values
    val array=intArrayOf(1,3,5,6,7)
    val thenumber=5
    val theResult= MyTeestFn(array,thenumber)
    print("The result : $theResult")
}