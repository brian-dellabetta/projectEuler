package com.ProjectEulerMain
import scala.math

/**
 * Created by BDELLABE on 3/20/14.
 */
object Problems001to010 {
  def Prob001(n: Int):Int={
    var sum=0
    for(ii <- 1 until n if ((ii%3)==0 || (ii%5)==0)) sum+=ii
    sum
  }

  def Prob002():BigInt={
    var currentNumber:BigInt=1
    var previousNumber:BigInt=0
    var hold:BigInt=0
    var sum:BigInt=0
    while(currentNumber<4000000){
      hold=currentNumber
      currentNumber+=previousNumber
      if(currentNumber%2==0) sum += currentNumber
    }
    sum
  }

  def Prob009(n: Int):Int={
    var prod=0
    for(ii <- 1 until n; jj <- ii until n){
      if((ii+jj+math.sqrt(math.pow(ii,2)+math.pow(jj,2)))==1000.0) {
        prod = ii * jj * math.sqrt(math.pow(ii,2)+math.pow(jj,2)).toInt
      }
    }
    prod
  }

  def Prob010(n: Int):BigInt={
    var sum: BigInt = 0
    val numList = (for(ii <- 2 to n) yield 1).toArray

    for(ii <- 2 to n){
      if (numList(ii-2)==1){
        for (jj <- math.pow(ii,2).toInt.to(n).by(ii)){
          numList(jj-2) = 0
        }
      }
    }

    for(ii <- 2 to n){
      if(numList(ii-2)==1) {
        println(ii)
        sum += ii
      }
    }
    sum
  }
}
