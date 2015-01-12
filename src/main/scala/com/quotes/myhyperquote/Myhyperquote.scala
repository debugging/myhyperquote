package com.quotes.myhyperquote

import org.hyperscala.web.StaticWebsite
import org.hyperscala.web.BasicWebsite
import com.outr.net.http.session.MapSession
import com.outr.net.http.jetty.JettyApplication

object Myhyperquote extends BasicWebsite with StaticWebsite[MapSession] with JettyApplication {
  def index = new HelloPage
}

object QuoteDb {
	import scala.io._
	import scala.util.Random

	val quoteUrl = "http://www.coverfire.com/files/quotes.txt"

	lazy val quotes = Source.fromURL(quoteUrl).mkString.split("\n\n")

	def getRandomQuote = {
		quotes(Random.nextInt(quotes.size))
	}

}
