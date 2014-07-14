name := "servlet-stubs"

organization := "soot.javaee.stubs"

version := "0.1-SNAPSHOT"

scalaVersion := Versions.scala

sbtVersion := Versions.sbt

Common.settings

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
