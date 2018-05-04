val maybeLength: Option[String] => Option[Int] = 
  _ match {
    case None => None
    case Some(xs) => Some(xs.length)
  }

val mt = maybeLength(None)
val undef = maybeLength(Option[String](null))
val sm = maybeLength(Some("Peter"))

println(s"mt: $mt, undef: $undef, sm: $sm")
