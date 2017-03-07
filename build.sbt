lazy val root = (project in file("."))
  .settings(
    name := "my-project",
    organization := "fr.colinleverger",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.10.4",
    // Spark
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "1.3.1" % "provided",
      "org.apache.spark" %% "spark-sql" % "1.3.1",
      "org.apache.spark" %% "spark-hive" % "1.3.1",
      "org.apache.spark" %% "spark-streaming" % "1.3.1",
      "org.apache.spark" %% "spark-mllib" % "1.3.1"
    ),
    // logs
    libraryDependencies += "log4j" % "log4j" % "1.2.17"
  )
