
val DispatchVersion = "0.8.9"

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-http" % DispatchVersion,
  "org.apache.httpcomponents" % "httpclient" % "4.4"
)

fork in run := true

javaOptions += "-Xmx1G"
