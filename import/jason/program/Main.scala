package jason.program

// this line import classes & object under jason.playground (not recurisly)
import jason.playground._;

// this line import "members" like mixin including variable, and method under jason.playground.JasonPhone
import jason.playground.JasonPhone._;

/**
  * Created by Jason on 1/20/16.
  */
object Main {
  def main(args: Array[String]): Unit = {
    println("I am using: " + JasonPhone.name())
    println("I am using: " + nameFromPackageObject());
    println("I am using: " + name());
  }
}

