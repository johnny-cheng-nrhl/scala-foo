package counter

case class Counter(num: Int = 0) { 
    def get = num

    def inc = copy(num = num + 1)
    def inc(index: Int = 1):Counter = {
        copy(num + index)
    }

    def dec = copy(num + 1)
    def dec(index: Int = 1):Counter = {
        /* Generate extra objects??? */
        copy(num - index)
    }

    override def toString = {
        s"Counter($num)"
    }
}
