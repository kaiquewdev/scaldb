package shaft_alignment

trait Entanglement {
  var top: Edge
  var left: Edge
  var bottom: Edge
  var right: Edge
}

class Edges(
  var top: Edge = new Edge(),
  var left: Edge = new Edge(),
  var bottom: Edge = new Edge(),
  var right: Edge = new Edge()
) extends Axis with Entanglement {}

class Face() extends Edges {
  val draw = new Draw()
  val drawFormatIndex = 0
  val drawFormatName = draw.choice(drawFormatIndex)
}


