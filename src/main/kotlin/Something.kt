class Something {   // სახელები ვერ მოვიფრე უცბად კარგი :დდ

    fun usg(number1: Int, number2: Int): Int {
        var usg = 0
        if (number1 == 0) {
            return number1
        } else {
            for (i in 1..number2) {
                if (number1 % i == 0 && number2 % i == 0) {
                    usg = i

                }
            }

            return usg
        }
    }

    fun usj(number1: Int, number2: Int): Int{
        var answer = 0
        if (number1 > number2){
            answer = number1

        }else answer = number2

        var isTrue = true
        while(isTrue){
            if (answer % number1 == 0 && answer % number2 == 0){
                break
            }
            answer++
        }
        return answer
    }

   fun mesame(str:String):String{
       if (str.contains('$')){
           return "დიახ შეიცავს '$' ის სიმბოლოს"
       }else{
           return "არა არ შეიცავს '$' ის სიმბოლოს "
       }
   }

    fun mexute(number:Int):Int{
        var numberToString = number.toString().reversed()
        var i = 0
        while(i < numberToString.length){
            if (numberToString[0] == '0'){
                numberToString.substring(1)
                i++
            }else{
                break
            }
        }
        return numberToString.toInt()
    }

    fun polindromi(str1: String):String{
        var str2 = str1
        var answer = 0
        var i = 0
        var j = str1.length-1
        while (i < str1.length){
            if (str1[i] == str2[j]){
                answer++
            }
            i++
            j--
        }
        if (answer == str1.length){
            return "არის პოლინდრომი"
        }else return "არ არის პოლინდრომი"
    }

   fun recursion(number1:Int = 100): Int{
           if (number1 == 2) return 2
          return number1 + recursion(number1 - 2)

   }


    }


