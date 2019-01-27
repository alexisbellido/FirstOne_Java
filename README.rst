Java Examples
===========================================================

See `repository <https://github.com/kevin-wayne/algs4>`_ with source code for Algorithms, 4th Edition by Robert Sedgewick and Kevin Wayne.

This is how to compile a class in a package passing the current directory as the class path so other classes can be found. Note how the class is run with the java command using its qualified name (com.zinibu.common.FirstSample).

.. code-block:: bash

  $ pwd
  /home/alexis/Projects/FirstOne_Java/src
  javac -cp . com/zinibu/common/FirstSample.java 
  java com.zinibu.common.FirstSample 

See `<http://docs.oracle.com/javase/7/docs/technotes/tools/windows/classpath.html`>_ , focus on:

When classes are stored in a directory (folder), like /java/MyClasses/utility/myapp, then the class path entry points to the directory that contains the first element of the package name. (in this case, /java/MyClasses, since the package name is utility.myapp.)

.. code-block:: bash

  [~/IdeaProjects/FirstProject/out/production/FirstProject]
  $ java -cp /home/alexis/IdeaProjects/FirstProject/out/production/FirstProject com.zinibu.basic.Example
  Hi
  toyota 1997

.. code-block:: bash

  [~/IdeaProjects/FirstProject/out/production/FirstProject]
  $ java -cp . com.zinibu.basic.Example
  Hi
  toyota 1997

Running algs4 classes from the command line:

First,

.. code-block:: bash

  cd /path-to/FirstOne

1. Recommended, passing classpath via -cp:

.. code-block:: bash

  java -cp /home/alexis/IdeaProjects/FirstOne/lib/algs4.jar edu.princeton.cs.algs4.BinarySearch ~/Downloads/algs4-data/tinyW.txt < ~/Downloads/algs4-data/tinyT.txt 

But, this is important, to provide more than one classpath, because I want to modify the source for BinarySearch and recompile it to /home/alexis/IdeaProjects/FirstOne/out/production/FirstOne while using libraries from /home/alexis/IdeaProjects/FirstOne/lib/algs4.jar, compile from IDEA and run from the command line:

.. code-block:: bash

  java -cp "/home/alexis/IdeaProjects/FirstOne/out/production/FirstOne:/home/alexis/IdeaProjects/FirstOne/lib/algs4.jar" edu.princeton.cs.algs4.BinarySearch ~/Downloads/algs4-data/tinyW.txt < ~/Downloads/algs4-data/tinyT.txt

I have the class with the main method in both algs4.jar and as in /home/alexis/IdeaProjects/FirstOne/src and that's important to indicate the order of class paths is important.

Another example running from the parent directory where the classes are, in this example: /home/alexis/IdeaProjects/FirstOne/out/production

.. code-block:: bash

  alexis@xenomorph$ pwd
  /home/alexis/Learn/FirstOne_Java/out/production/FirstOne_Java
  [~/Learn/FirstOne_Java/out/production/FirstOne_Java] master
  alexis@xenomorph$ java -cp "/home/alexis/Learn/FirstOne_Java/out/production/FirstOne_Java:/home/alexis/Learn/FirstOne_Java/lib/algs4.jar" com.zinibu.algs4.BinarySearch /home/alexis/Learn/algs4/data/tinyW.txt < /home/alexis/Learn/algs4/data/tinyT.txt 

Let's do some binary search

And some initial tests

.. code-block:: bash

  50
  99
  13

2. Using CLASSPATH environment variable

.. code-block:: bash

  export CLASSPATH=/home/alexis/IdeaProjects/FirstOne/lib/algs4.jar
  echo $CLASSPATH
  java edu.princeton.cs.algs4.BinarySearch ~/Downloads/algs4-data/tinyW.txt < ~/Downloads/algs4-data/tinyT.txt 
