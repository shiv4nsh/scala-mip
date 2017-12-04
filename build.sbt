name := "scala-mip"

version := "0.1"

scalaVersion := "2.12.4"

organization := "com.foobar"

// The necessary dependencies can be added here

val sparkVersion = "2.1.0"
libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1",
  //Integer Programming Dependencies
  "com.github.vagmcs" %% "optimus" % "2.1.0",
  "com.github.vagmcs" %% "optimus-solver-oj" % "2.1.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

        