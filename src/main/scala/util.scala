import org.apache.hadoop.conf.Configuration
import org.apache.spark.SparkConf

object test{
	def main(args: array[String]){
		var conf = new SparkConf()
		conf.setAppName("Test app")
		var sc = new SparkContext(conf)
		
		val z = sc.parallelize(100 to 120, 5)
		val r = z.zipWithUniqueId
		println(r.collect)
		Print("Hello")
	}
}
