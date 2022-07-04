fun main()
{
    val someRoot = squareRootAlgorithm(127f);
    println("The root is: $someRoot");
    println("The number is: " + (someRoot * someRoot))
}

fun squareRootAlgorithm(input: Float): Float
{
    //O(sqrt(n + 1))
    val maximum = fun(num: Float): Float{
        var iterator: Float = 0f;
        while((iterator * iterator) <= num)
        	iterator++;
        
        return iterator;
    }
    
    var max = maximum(input);
    var min = max - 1;
    var temp = 0f;
    
    //O(1)
	for(i in 0..20)
    {
        if((temp * temp) == input)
 			return temp;
        
        temp = (max + min) / 2;
        
        if((temp * temp) < input)
        	min = temp;
        if((temp * temp) > input)
        	max = temp;
    }
    
    return min;
}