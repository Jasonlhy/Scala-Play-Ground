package jason

import jason.playground.JasonPhone

package object playground {
  // static method to be imported into class
  def getName() = "Iphone 6 (from helper method)"

  // align to another object's method
  def nameFromPackageObject() = JasonPhone.name()
}
