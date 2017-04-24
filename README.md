# ScalaColor

[![Build Status](https://travis-ci.org/SnipyJulmy/ScalaColor.svg?branch=master)](https://travis-ci.org/SnipyJulmy/ScalaColor)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b5a1ebb5b51a404792fbf945c702cc05)](https://www.codacy.com/app/SnipyJulmy/ScalaColor?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=SnipyJulmy/ScalaColor&amp;utm_campaign=Badge_Grade)
[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/b5a1ebb5b51a404792fbf945c702cc05)](https://www.codacy.com/app/SnipyJulmy/ScalaColor?utm_source=github.com&utm_medium=referral&utm_content=SnipyJulmy/ScalaColor&utm_campaign=Badge_Coverage)
[![Sonatype Version](https://img.shields.io/badge/Sonatype-1.0-orange.svg)](https://oss.sonatype.org/#nexus-search;quick~scalacolor)
[![Scala Version](https://img.shields.io/badge/Scala%20Version-2.12.1-red.svg)]()
[![Licence](https://img.shields.io/badge/licence-GPLv3-brightgreen.svg)](https://github.com/SnipyJulmy/ScalaColor/blob/master/LICENSE)

ScalaColor is a simple Scala library which provides abstraction for colorized print in the console.

## Installation
In your build.sbt :
```scala
resolvers += Resolver.sonatypeRepo("public")

libraryDependencies += "com.github.SnipyJulmy" %% "scalacolor" % "1.0"
```

or for maven :
```xml
<dependency>
  <groupId>com.github.SnipyJulmy</groupId>
  <artifactId>scalacolor_2.12</artifactId>
  <version>1.0</version>
</dependency>
```

For the moment the library is available only for scala 2.12.1...

## Example

```scala
import com.github.SnipyJulmy.scalacolor.ScalaColor._

object Main extends App {

    // ...

    println("Error...".red)

    //..
}
```

## License
GPLv3, just because I like the GPL !