


// 1
def listIlo(list: List[Double]):Double = list match {
		case Nil => 0
		case head::tail => head * listIlo(tail)
}

// 1 test
listIlo(List(1,2,3))
listIlo(List())
listIlo(List(-3,2,1))
listIlo(List(1,2,3,0))



// 4
def potegaI(X: Int, Y: Int): Int = {
	def pom(wyn: Int, Y: Int): Int = Y match {
		case x if x<0 => 0
		case 0 => 1
		case 1 => wyn
		case _ => pom(wyn*X, Y-1)
	}
	pom(X,Y)
}	
	
def potegaD(X:Double, Y: Double): Double = {
	def pom(wyn: Double, Y: Double): Double = Y match {
		case x if x<0 => 0
		case 0 => 1
		case 1 => wyn
		case _ => pom(wyn*X, Y-1)
	}
	pom(X,Y)
}

// 4 test
potegaD(2,3)
potegaD(-2,3)
potegaD(0,3)
potegaD(3,0)
potegaD(3,-3)
