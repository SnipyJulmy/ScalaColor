name := "ScalaColor"
version := "1.0"
scalaVersion := "2.12.8"
organization := "ch.snipy"

useGpg := true

credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credential")

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.14.3" % Test,
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  "org.scalatestplus" %% "scalatestplus-scalacheck" % "3.1.0.0-RC2" % Test
)

coverageEnabled := true

scalacOptions ++= Seq(
  "-language:postfixOps",
  "-language:implicitConversions",
  "-deprecation"
)