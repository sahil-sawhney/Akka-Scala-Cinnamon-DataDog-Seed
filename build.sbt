name := "Akka-Scala-Cinnamon-DataDog-Seed"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.3",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.3" % "test",
  "org.scalatest" %% "scalatest" % "3.0.3" % "test",
  Cinnamon.library.cinnamonAkka,
  Cinnamon.library.cinnamonDatadog
)

lazy val app = project in file(".") enablePlugins Cinnamon
cinnamon in run := true
cinnamon in test := true
cinnamonLogLevel := "INFO"
