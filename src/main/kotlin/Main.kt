//Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке.
// На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4.
// То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу

//Выполнил: Самойлов Кирилл Сергеевич ИП-22-7к

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