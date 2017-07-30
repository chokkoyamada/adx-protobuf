addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.11")

libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.0"

resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")