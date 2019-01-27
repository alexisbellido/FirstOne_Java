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

When using multiple class paths, remember that the Windows path separator is ; and the Linux path separator is :.

Windows:

.. code-block:: bash

  $ java -cp file.jar;dir/* my.app.ClassName

Linux:

.. code-block:: bash

  $ java -cp file.jar:dir/* my.app.ClassName

Read more about the `class path <http://docs.oracle.com/javase/7/docs/technotes/tools/windows/classpath.html`>_.

Tests with binary search
------------------------------------------------------

Change to the directory that contains the "root" package. This is the first package in the full package name; src/com/zinibu/algs4/BinarySearch.java uses two packages, *com* and *edu*, so this directory is *src*.

.. code-block:: bash

  $ pwd
  /home/alexis/Projects/FirstOne_Java/src

Compile using the default class path, the current directory (.), and that will create the required classes,

.. code-block:: bash

  $ javac com/zinibu/algs4/BinarySearch.java

.. code-block:: bash

  edu/princeton/cs/algs4/In.class
  edu/princeton/cs/algs4/StdIn.class
  edu/princeton/cs/algs4/StdOut.class
  com/zinibu/algs4/BinarySearch.class

and now you can run the BinarySearch class with

.. code-block:: bash

  $ java com.zinibu.algs4.BinarySearch  ~/Downloads/algs4-data/tinyW.txt < ~/Downloads/algs4-data/tinyT.txt
  
You can also compile using algs4.jar, which contains all the classes for the book (we're still in the *src* directory).

.. code-block:: bash

  $ javac -cp ../lib/algs4.jar com/zinibu/algs4/BinarySearch.java 
  $ java -cp ../lib/algs4.jar:. com.zinibu.algs4.BinarySearch  ~/Downloads/algs4-data/tinyW.txt < ~/Downloads/algs4-data/tinyT.txt
  
In this case you need add the current directory (the dot at the end of *-cp ../lib/algs4.jar:.*) to the class path.

-----------------------------------

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

I have the class with the main method in both algs4.jar and /home/alexis/IdeaProjects/FirstOne/src so it's important to indicate the class paths order.

Another example running from the parent directory where the classes are, in this example: /home/alexis/IdeaProjects/FirstOne/out/production

.. code-block:: bash

  $ pwd
  /home/alexis/Learn/FirstOne_Java/out/production/FirstOne_Java
  [~/Learn/FirstOne_Java/out/production/FirstOne_Java] master
  $ java -cp "/home/alexis/Learn/FirstOne_Java/out/production/FirstOne_Java:/home/alexis/Learn/FirstOne_Java/lib/algs4.jar" com.zinibu.algs4.BinarySearch /home/alexis/Learn/algs4/data/tinyW.txt < /home/alexis/Learn/algs4/data/tinyT.txt 

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
