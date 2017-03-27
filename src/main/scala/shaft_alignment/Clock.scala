package shaft_alignment

trait ClockAttr {
  var rotation: Rotation
}

class Clock(var rotation: Rotation = new Rotation()) extends Axis with ClockAttr {}
