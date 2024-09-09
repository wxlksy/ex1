fun main()
{
    val s = "AAADSSSRRTTHAAAA"
    var result = ""

    var count = 1
    for ( i in 1 until s.length)
    {
        if (s[i] == s [i - 1])
        {
            count++
        }
        else
        {
            result += s[i - 1]
            if (count > 1)
            {
                result += count
            }
            count = 1
        }
    }

    result += s.last()
    if (count > 1)
    {
        result += count
    }
    println(result)
}
