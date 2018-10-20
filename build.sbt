scalaVersion := "2.12.7"

organization := "org.pantsbuild"

name := "jarjar"

version := "1.6.7-SNAPSHOT"

autoScalaLibrary := false

crossPaths := false

libraryDependencies ++= Seq(
  "org.ow2.asm" % "asm" % "7.0-beta",
  "org.ow2.asm" % "asm-commons" % "7.0-beta",
  "org.apache.ant" % "ant" % "1.9.9",
  "org.apache.maven" % "maven-plugin-api" % "3.3.9",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.apache.commons" % "commons-lang3" % "3.7"
)
