package sparkfunctionalities

import org.apache.spark.{SparkConf, SparkContext}

object sample {
  val conf= new SparkConf()
  conf.setMaster("local[4]")
  conf.setAppName("RDD Demo")

  val sc= new SparkContext(conf)
   val rdd= sc.parallelize(List(('a',1),('b',2),('c',3)))

  val result= rdd.map(x=>(x._1, x._2+2)).filter(x=>x._2 > 2).groupByKey()
    .map{
      case(k,v) => (k, v.sum)
    }.reduceByKey((x,y) => x+y)


  result.collect()

  scala.io.StdIn.readLine("Enter Input")


   def main(args : Array[String]): Unit = {

   }

}
