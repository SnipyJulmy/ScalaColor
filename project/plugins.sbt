logLevel := Level.Warn

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")
addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.3.15")
