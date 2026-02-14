import org.apache.spark.{SparkConf, SparkContext}
import org.apache.log4j.{Level, Logger}

object rdd_assignment extends App {

  Logger.getLogger("org").setLevel(Level.ERROR)

  val conf = new SparkConf()
  conf.setMaster("local[4]")
  conf.setAppName("RDD Demo Program")

  val sc = new SparkContext(conf)

// //1. Create an RDD using parallelize() with a list of 10 numbers and print all elements.
  val data1 = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
  val rdd1 = sc.parallelize(data1, 2)

  rdd1.collect().foreach(println)



  //2. Create an RDD and store its data into a given output path.
//  val data2 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//
//
//  val rdd2=sc.parallelize(data2,1)
//
//  rdd2.saveAsTextFile("C:/Users/Pratik Kokate/OneDrive/Desktop/class/RDD_Assignment")
//
//
//
//
//  //3. Find the mean of an RDD using both mean() and without using mean().
//  val data3 = Array(5, 10, 15, 20, 25)
//
//  val rdd3=sc.parallelize(data3,1)
//  val mean=rdd3.mean()
//  println("Using mean() :",mean)
//
//
//
//
//// 4. Filter a RDD to retain only even numbers.
//  val data4 = List(3, 6, 9, 12, 15, 18, 21, 24)
//
//  val rdd4=sc.parallelize(data4,1)
//
//  val even=rdd4.filter(x=> x%2==0)
//  even.collect().foreach(println)



//5. Remove duplicate values from an RDD containing numbers.
//  val data5 = Array(1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9)
//
//
//  val rdd5=sc.parallelize(data5,1)
//  val distinct=rdd5.distinct()
//  println(distinct.collect().mkString("[",",","]"))
//


//6. Count the number of elements in an RDD.
//  val data6 = List("Scala", "Spark", "Hadoop", "Hive", "Scala", "Spark")
//
//
//  val rdd6=sc.parallelize(data6,1)
//  val keyval=rdd6.map(word => (word,1))
//  val Count=keyval.reduceByKey((v1,v2)=> v1+v2)
//  println(Count.collect().mkString("[",",","]"))



//  RDD Transformations
//1. Convert a list of strings into an RDD and apply map() to convert all words to uppercase.
//  val data7 = List("hello", "world", "scala", "spark")
//
//  val rdd7=sc.parallelize(data7,1)
//  val upper=rdd7.map(word=> word.toUpperCase)
//  println(upper.collect().mkString("[",",","]"))

//2. Use flatMap() on an RDD containing sentences and split them into words.
//  val data8 = List("Big Data is powerful","Spark makes processing faster")
//
//  val rdd8=sc.parallelize(data8,1)
//  val word=rdd8.flatMap(line=> line.split(" "))
//  print(word.collect().mkString(","))
//
//  println()



  //3. Given an RDD of numbers, filter only the prime numbers.
//  val data9 = Array(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13)
//
//  def isPrime(n: Int): Boolean = {
//    if (n <= 1) return false
//
//    var flag = false
//    for (i <- 2 until n) {
//      if (n % i == 0) {
//        flag = true
//      }
//    }
//    !flag
//  }
//  val rdd9=sc.parallelize(data9,1)
//  val prime=rdd9.filter(x=> isPrime(x))
//
//  println(prime.collect().mkString(","))
//
//
//

//4. Apply reduce() to find the product of all numbers in an RDD.
//  val data10 = List(1, 2, 3, 4, 5, 6)
//
//  val rdd10=sc.parallelize(data10,1)
//
//  val product=rdd10.reduce((n1,n2)=> n1*n2)
//
//  println(product)

//5. Implement mapPartitions() on an RDD with 3 partitions and process elements in bulk.
//  val data11 = Array(10, 20, 30, 40, 50, 60, 70, 80, 90)
//
//  val rdd11 = sc.parallelize(data11, 3)
//
//  val result = rdd11.mapPartitions(partition => {partition.map(x => x / 2)})
//
//  println(result.collect().mkString("[",",","]"))
//
//

//6. Implement sample() to get a random subset of elements from an RDD.
//  val data12 = List(100, 200, 300, 400, 500, 600, 700)
//
//  val rdd12=sc.parallelize(data12, 1)
//  val sample=rdd12.sample(withReplacement = false,fraction = 0.4,seed = 42)
//
//  sample.collect().foreach(println)


//  Pair RDDs and Key-Value Operations
//1. Create a pair RDD with student IDs and names, and apply lookup() to find a student name by ID.
//  val data13 = Array((101, "Amit"), (102, "Nilesh"), (103, "Shakti"), (104, "Preeti"))
//
//  val rdd13=sc.parallelize(data13,1)
//
//  val pair=rdd13.lookup(102)
//
//  print(pair.mkString(","))
//

//2. Given an RDD of (word, 1) pairs, apply reduceByKey() to count the frequency of each word.
//  val data14 = Array("apple", "banana", "apple", "orange", "banana", "apple")
//
//  val rdd14=sc.parallelize(data14,1)
//  val key=rdd14.map(word=> (word,1))
//  val freq=key.reduceByKey((v1,v2)=>v1+v2)
//  freq.collect().foreach(println)


//3. Use groupByKey() on an RDD containing (department, salary) pairs to group salaries by department.
//  val data15 = Array(("IT", 60000), ("HR", 50000), ("IT", 70000), ("HR", 45000), ("Finance", 80000))
//
//  val rdd15=sc.parallelize(data15,1)
//  val Deptsal=rdd15.groupByKey()
//  Deptsal.collect().foreach(println)
//
//4. Apply sortByKey() on an RDD containing employee IDs and names to sort by employee ID.
//  val data16 = Array((105, "Omkar"),(101, "Vishal"),(103, "Shreya"),(104, "Suraj"))
//
//  val rdd16 = sc.parallelize(data16, 1)
//  val  sorted= rdd16.sortByKey()
//  sorted.collect().foreach(println)



//5. Given two RDDs with (ID, value) pairs, perform an inner join.
//  val data01 = Array((1, "Laptop"), (2,"Mobile"), (3,"Tablet"))
//  val data02 = Array((1, 50000), (2, 20000), (4, 15000))
//
//  val rdd01 = sc.parallelize(data01, 1)
//  val rdd02 = sc.parallelize(data02, 1)
//
//  val join = rdd01.join(rdd02)
//
//  join.collect().foreach(println)


//6. Perform a leftOuterJoin() on two RDDs representing employees and their department details.
//  val employees = Array((1, "Riya"),(2, "Divya"),(3, "Pallavi"))
//  val departments = Array((1, "IT"),(2, "HR"))
//
//
//  val empRdd = sc.parallelize(employees, 1)
//  val deptRdd = sc.parallelize(departments, 1)
//
//  val empDept = empRdd.leftOuterJoin(deptRdd)
//
//  empDept.collect().foreach(println)



//7. Implement combineByKey() to find the average salary per department.



//1. Given two RDDs of numbers, create a new RDD containing their union.
//  val Data01 = List(1, 2, 3, 4)
//  val Data02 = List(3, 4, 5, 6)
//
//  val RddSet01=sc.parallelize(Data01, 1)
//  val RddSet02=sc.parallelize(Data02, 1)
//
//  val Union=RddSet01.union(RddSet02)
//
//  println(Union.collect().mkString("[",",","]"))


  //2. Find the intersection of two RDDs of integers.
//  val Data03 = List(1, 2, 3, 4, 5)
//  val Data04 = List(3, 4, 5, 6, 7)
//
//  val RddSet03=sc.parallelize(Data03, 1)
//  val RddSet04=sc.parallelize(Data04, 1)
//
//  val Intersection=RddSet03.intersection(RddSet04)
//  println(Intersection.collect().mkString("[",",","]"))

  //3. Subtract one RDD from another and return only unique elements from the first RDD.
//  val Data05 = List(10, 20, 30, 40, 50)
//  val Data06 = List(30, 40, 50)
//
//  val RddSet05 = sc.parallelize(Data05, 1)
//  val RddSet06 = sc.parallelize(Data06, 1)
//
//  val subtract = RddSet05.subtract(RddSet06)
//  println(subtract.collect().mkString("[", ",", "]"))
//
//

//4. Generate the Cartesian product of two RDDs (one containing numbers, the other containing letters).
//  val Data07 = List(1, 2, 3)
//  val Data08 = List("A", "B")
//
//  val RddSet07 = sc.parallelize(Data07, 1)
//  val RddSet08 = sc.parallelize(Data08, 1)
//
//  val cartesian = RddSet07.cartesian(RddSet08)
//  println(cartesian.collect().mkString("[", ",", "]"))


//1. Apply countByKey() on a key-value RDD containing city names and counts.
//  val data18 = List( ("Pune", 3),("Delhi", 2),("Mumbai", 5),("Tamil", 1))
//
//  val rdd18 = sc.parallelize(data18, 1)
//  val count = rdd18.countByKey()
//
//  println(count)

//2. Implement takeOrdered() to get the top 5 smallest numbers from an RDD.
//  val data19 = Array(55, 20, 75, 10, 90, 5, 30)
//
//  val rdd19 = sc.parallelize(data19, 1)
//
//  val small5 = rdd19.takeOrdered(5)
//
//  println(small5.mkString("[", ",", "]"))



  //3. Use foreach() to print all elements of an RDD in parallel.

//  val data20 = List("Scala","Spark", "Hadoop", "Hive", "Scala", "Spark")
//
//  val rdd20=sc.parallelize(data20, 1)
//  rdd20.collect().foreach(println)


//4. Find the maximum and minimum values in an RDD.
//  val data21 = Array(500, 1000, 200, 50, 700, 900)
//
//  val rdd21=sc.parallelize(data21, 1)
//  val max=rdd21.reduce((x,y)=> if(x>y) x else y )
//
//  println(max)



//5.Use fold() to compute the sum of all elements in an RDD.
//  val data22 = List(5, 10, 15, 20, 25)
//
//  val rdd22 = sc.parallelize(data22, 1)
//  val Sum = rdd22.fold(0)((a,b)=> a+b)
//
//  println(Sum)


//6.Count the number of words that contain a specific substring in an RDD of words.

//  val data23 = List("analytics", "data", "spark", "databricks", "database")
//
//  val rdd23 = sc.parallelize(data23, 1)
//
//  val wordCount = rdd23.filter(word => word.contains("data")).count()
//
//  println(wordCount)


//Implement a word count problem and return the 5 most frequent words in an RDD of sentences.
//  val data24 = List("Spark is great","Big Data is powerful","Spark makes Big Data easy")
//
//  val rdd24 = sc.parallelize(data24, 1)
//
//  val words = rdd24.flatMap(line => line.toLowerCase.split(" "))
//  val keys=words.map(word => (word, 1))
//  val wordcount=keys.reduceByKey((v1,v2)=>v1+v2)
//  val sort = wordcount.sortBy(word => word._2, ascending = false)
//  val top5 = sort.take(5)
//
//  top5.foreach(println)



}