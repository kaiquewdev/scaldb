package shaft_alignment

class Face(var top: Edge = new Edge(), var left: Edge = new Edge(), var bottom: Edge = new Edge(), var right: Edge = new Edge()) extends Axis {
  val draw = new Draw()
  val drawFormatIndex = 0
  val drawFormatName = draw.choice(drawFormatIndex)
}


