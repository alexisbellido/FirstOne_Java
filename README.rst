Java Examples
===========================================================

See `repository <https://github.com/kevin-wayne/algs4>`_ with source code for Algorithms, 4th Edition by Robert Sedgewick and Kevin Wayne.

This is how to compile a class in a package passing the current directory as the class path (for the sake of example as this is the default behavior) so other classes can be found. Note how the class is run with the java command using its qualified name (com.zinibu.common.FirstSample).

.. code-block:: bash

  $ pwd
  /home/alexis/Projects/FirstOne_Java/src
  javac -cp . com/zinibu/common/FirstSample.java 
  java com.zinibu.common.FirstSample 

Another example.

.. code-block:: bash

  $ pwd
  /home/alexis/Projects/FirstOne_Java/src
  $ javac -cp ~/Projects/FirstOne_Java/src/ com/zinibu/algs4/QuickTest.java 
  $ java com.zinibu.algs4.QuickTest 

For a .jar or .zip file that contains .class files, the class path ends with the name of the .zip or .jar file.
For .class files in an unnamed package, the class path ends with the directory that contains the .class files.
For .class files in a named package, the class path ends with the directory that contains the "root" package (the first package in the full package name).
Multiple path entries are separated by semi-colons. With the set command, it's important to omit spaces from around the equals sign (=).

The default class path is the current directory. Setting the CLASSPATH variable or using the -classpath command-line option overrides that default, so if you want to include the current directory in the search path, you must include "." in the new settings.

Read more about the `class path <http://docs.oracle.com/javase/7/docs/technotes/tools/windows/classpath.html`>_.

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
