package com.github.pshirshov.izumi.idealingua.il.parser

import com.github.pshirshov.izumi.idealingua.model.loader.FSPath
import com.github.pshirshov.izumi.idealingua.model.parser.{ParsedDomain, ParsedModel}
import fastparse._

case class IDLParserContext(
                             file: FSPath
                           ) {
  protected[parser] val defMember = new DefMember(this)
  protected[parser] val defDomain = new DefDomain(this)
  protected[parser] val defSignature = new DefSignature(this)
  protected[parser] val defStructure = new DefStructure(this)
  protected[parser] val defService = new DefService(this)
  protected[parser] val defBuzzer = new DefBuzzer(this)
  protected[parser] val defStreams = new DefStreams(this)
  protected[parser] val defParsers = new DefParsers(this)
  protected[parser] val defPositions = new Positions(this)

}


class IDLParser(context: IDLParserContext) {

  import context._

  def parseDomain(input: String): Parsed[ParsedDomain] = {
    parse(input, defParsers.fullDomainDef(_))
  }

  def parseModel(input: String): Parsed[ParsedModel] = {
    parse(input, defParsers.modelDef(_))
  }


}
