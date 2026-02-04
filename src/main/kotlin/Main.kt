fun main() {

    //Criando variáveis
    val arrayNumeros = arrayOf(3, 4, 6, 1, 2 , 2, 4)

//1 -) Crie uma variável numérica e diga se o número é par ou (resto da divisão por  2 = 0) ímpar (resto da divisão por 2 = 1)
    println("=======================")
    println("   Teste Exercício 1   ")
    println("-----------------------")
    println(isEven(45))

//2 -) Crie uma variável numérica e exiba se o número é positivo, negativo ou zero
    println("=======================")
    println("   Teste Exercício 2   ")
    println("-----------------------")
    println(classifyNumber(47))

//3 -) Crie uma variável idade e diga "Criança" caso seja menor de 12,
//"Adolescente" entre 12 e 17, "Adulto" entre 18 e 59 e "Idoso" se 60 ou mais
    println("=======================")
    println("   Teste Exercício 3   ")
    println("-----------------------")
    println(classifyAge(65))

//4 -) Crie uma variável numérica e exiba sua tabuada de 1 a 10
    println("=======================")
    println("   Teste Exercício 4   ")
    println("-----------------------")
    calcTable(4)

//5 -) Dado um array de números, calcule a soma de todos eles (ex: [1,2,3,4] → 10)
    println("=======================")
    println("   Teste Exercício 5   ")
    println("-----------------------")
    println(sumArray(arrayNumeros))

//6 -) Encontre o maior número dentro de um array (ex: [5,8,2,10,3] → 10)
    println("=======================")
    println("   Teste Exercício 6   ")
    println("-----------------------")
    findMax(arrayNumeros)

//7 -) Crie uma variável numérica e exiba uma contagem regressiva até zero
    println("=======================")
    println("   Teste Exercício 7   ")
    println("-----------------------")
    countDown(10)

//8 -) Dado um array de números, calcule somente a soma dos números pares (ex:
//[1,2,3,4] → 6)
    println("=======================")
    println("   Teste Exercício 8   ")
    println("-----------------------")
    println(sumEven(arrayNumeros))

//9 -) Crie uma função que receba um número e retorne o dobro dele
    println("=======================")
    println("   Teste Exercício 9   ")
    println("-----------------------")
    println(dobraEPassaProProximo(49))

//10 -) Faça uma função que receba 3 notas e retorne a média do aluno
    println("=======================")
    println("   Teste Exercício 10   ")
    println("-----------------------")
    println(calcGrade(10F, 7F, 8.5F))

//11 -) Faça uma função que receba uma temperatura Celsius (ponto flutuante) e
//retorne o valor em Fahrenheit (fórmula: F = C x 1.8 + 32)
    println("=======================")
    println("   Teste Exercício 11   ")
    println("-----------------------")
    println(convertToFahrenheit(65.6F))
}

//======================================================================
//                          FUNÇÕES
//======================================================================

//1 -) Crie uma variável numérica e diga se o número é par ou (resto da divisão por  2 = 0) ímpar (resto da divisão por 2 = 1)
fun isEven(numero: Int): Boolean {
    return numero % 2 == 0
}


//2 -) Crie uma variável numérica e exiba se o número é positivo, negativo ou zero
fun classifyNumber(numero: Int):String{
    var numeroStatus = when{
        numero < 0 -> "negativo"
        numero > 0 -> "positivo"
        numero == 0 -> "zero"
        else -> "input Inválido"
    }
    println("O número $numero é $numeroStatus")
    return numeroStatus
}


//3 -) Crie uma variável idade e diga "Criança" caso seja menor de 12,
//"Adolescente" entre 12 e 17, "Adulto" entre 18 e 59 e "Idoso" se 60 ou mais
fun classifyAge(idade: Int):String{
    val statusIdade: String = when(idade) {
        in 0..12 -> "Criança"
        in 13..17 -> "Adolescente"
        in 18..59 -> "Adulto"
        else if (idade>=60) -> "Idoso" //Essa linha em específico usa When Guard, que não existe em versões anteriores do kotlin
        else -> "Valor inválido"
    }
    return statusIdade
}

//4 -) Crie uma variável numérica e exiba sua tabuada de 1 a 10
fun calcTable(numero: Int){
   for (i in 1..10){
       val resultado:Int = numero * i
       println("$numero x $i = $resultado")
   }
}
//5 -) Dado um array de números, calcule a soma de todos eles (ex: [1,2,3,4] → 10)
fun sumArray(numeros:Array<Int>): Int {
    //Solução com função única
    //val total = numeros.sum()

    //Solução mais manual
    var total:Int = 0
    for (numero in numeros)
        total += numero
    return total
}

//6 -) Encontre o maior número dentro de um array (ex: [5,8,2,10,3] → 10)
fun findMax(numeros:Array<Int>):Int{
    //Simplificado, função única
    //print(numeros.max())

    //Manual
    var maiorValor:Int = numeros[0]
    var indiceMaiorValor:Int = 0
    for ((indice ,numero) in numeros.withIndex()){
        if (numero > maiorValor){
            maiorValor = numero
            indiceMaiorValor = indice
        }
    }
    println("O maior número dentro do array fornecido é $maiorValor, do indice $indiceMaiorValor")
    return maiorValor
}

//7 -) Crie uma variável numérica e exiba uma contagem regressiva até zero
fun countDown(numero:Int){
    val range = numero downTo 0
    for (i in range)
        println(i)
}
//8 -) Dado um array de números, calcule somente a soma dos números pares (ex: //[1,2,3,4] → 6)
fun sumEven(numeros:Array<Int>): Int{
    var total:Int = 0
    for (numero in numeros){
        if (numero % 2 == 0){
            total += numero
        }
    }
    return total
}

//9 -) Crie uma função que receba um número e retorne o dobro dele
fun dobraEPassaProProximo(numero:Int):Int{
    return numero * 2;
}

//10 -) Faça uma função que receba 3 notas e retorne a média do aluno
fun calcGrade(notaUm:Float, notaDois:Float, notaTres:Float):Float{
    val total = notaUm + notaDois + notaTres
    return total/3
}

//11 -) Faça uma função que receba uma temperatura Celsius (ponto flutuante) e
//retorne o valor em Fahrenheit (fórmula: F = C x 1.8 + 32)
fun convertToFahrenheit(temperaturaCelsius: Float):Float{
    var temperaturaFahrenheit:Float = ((temperaturaCelsius * 1.8) +32).toFloat();
    return temperaturaFahrenheit
}