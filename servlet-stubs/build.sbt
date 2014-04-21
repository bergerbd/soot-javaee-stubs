name := "servlet-stubs"

organization := "soot.javaee.stubs"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.0"

sbtVersion := "0.13.2"

//Faster incremental compilation. See http://scala-lang.org/news/2014/04/21/release-notes-2.11.0.html
//incOptions := incOptions.value.withNameHashing(true)

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.1.0"
