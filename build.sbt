name := "playground_cats_effects" // Please change

version := "0.1"

scalaVersion := "2.12.10"

organization := "com.jimmy.learning"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.8",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "com.typesafe" % "config" % "1.3.4",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
) ++ catsDependencies ++ additionDeps

scalacOptions += "-Ypartial-unification"

val catsVersion = "2.0.0"

val catsDependencies = Seq(
  "org.typelevel" %% "cats-core" % catsVersion,
  "org.typelevel" %% "cats-effect" % catsVersion
)

val additionDeps = Seq(
  "co.fs2" %% "fs2-core" % "2.0.0",
  "io.circe" % "circe-fs2_2.12" % "0.12.0"
)