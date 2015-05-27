import dispatch.classic.{StatusCode, url, thread, Http}

object App {
  val http = new Http with thread.Safety

  def doGet = try {
    http(url("https://www.googleapis.com/") as_str)
  } catch {
    case StatusCode(404, contents) => "OK -> 404 response as expected"
  }

  def main(args: Array[String]) = {
    java.security.Security.setProperty("networkaddress.cache.ttl" , "1")

    println("Basic test for a dispatch classic get to https://www.googleapis.com/")

    while (true) {
      println(doGet)
      Thread.sleep(5000)
    }
  }
}
