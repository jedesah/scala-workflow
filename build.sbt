organization := "org.scalamacros"

version := "1.0.0"
    
scalacOptions ++= Seq("-feature")

scalaVersion := "2.11.5"

scalaOrganization := "org.scala-lang.macro-paradise"

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

libraryDependencies <+= (scalaVersion)("org.scala-lang.macro-paradise" % "scala-reflect" % _)

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"

initialCommands in console := "import workflow._"
