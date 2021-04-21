name := "SparkStreaming"

version := "0.1"

scalaVersion := "2.12.10"
val sparkVersion = "3.0.2"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
