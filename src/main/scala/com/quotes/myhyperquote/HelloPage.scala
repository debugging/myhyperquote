package com.quotes.myhyperquote

import org.hyperscala.web.Webpage
import org.hyperscala.html._
import com.outr.net.http.session.Session
import org.hyperscala.web.Website

class HelloPage extends Webpage(Myhyperquote) {
  val randomQuote = QuoteDb.getRandomQuote
  body.contents += new tag.H1(content = randomQuote)
}
