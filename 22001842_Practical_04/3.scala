object app3 {
//to upper
  def toUpper(input: String): String = {
    if (input.isEmpty) ""
    else input.toUpperCase();
  }

  // toLower
  def toLower(input: String): String = {
    if (input.isEmpty) ""
    else input.toLowerCase();
  }

// format names
  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {

    var arraylist = Array("Benny", "Niroshan", "Saman", "Kumara");

    println(toUpper(arraylist(0)));

    println(formatNames(arraylist(1)) { name =>
      name.take(4).toUpperCase() + name.drop(4);
    })

    println(toLower(arraylist(2)));

    println(formatNames(arraylist(3)) { name =>
      name.updated(5,name.charAt(5).toUpper)
    })

  }
}
