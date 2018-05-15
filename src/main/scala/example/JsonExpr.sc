sealed trait Json

case class JsNumber(n:Double):Double extends Json

case class JsString(s:String):String extends Json

case class JsBoolean(b:Boolean):Boolean extends Json
case object JsNull extends Json

sealed trait JsSequence extends Json
case class SeqCell(hd:Json, tl:JsSquence) extends JsSequence 
case object SeqEnd extends JsSequence

sealed trait JsonObject extends Json
case class JsCell(key:String, value:Json, tail:JsObject) extends JsObject

case object objectEnd extends JsObject
