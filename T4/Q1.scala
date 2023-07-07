package T4

import scala.io.StdIn

object Q1 {
  def findinterest(amt:Double):Double=if(amt<20000){return amt*0.02}else if(amt<200000){return amt*0.04}else if(amt<2000000){return amt*0.035}else{return amt*0.065}


  def main(args: Array[String]): Unit= {
    printf("Input deposit amount :");
    val depositAmount=scala.io.StdIn.readDouble();
    val interest=findinterest(depositAmount);

    println("\nInterest per month : "+interest);
    println("\nInterest per Year :"+interest*12);

  }
}
