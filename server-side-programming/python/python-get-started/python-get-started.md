```Python
# Getting Started with Python
# Python Interpreter in Command-Line Interface (CLI)

$ python    # Try "py", "python3", "python2" and check its version
Python 3.7.0
......
Type "help", "copyright", "credits" or "license" for more information.
>>>

>>> print('hello, world')
hello, world
# 2 raises to power of 88. Python's int is unlimited in size
>>> print(2 ** 88)
309485009821345068724781056
# Python supports floating-point number
>>> print(8.01234567890123456789)
8.012345678901234
# Python supports complex number
>>> print((1+2j) * (3+4j))
(-5+10j)
# Create a variable with an numeric value
>>> x = 123
# Show the value of the variable
>>> x
123
# Create a variable with a string
>>> msg = 'hi!'
# Show the value of the variable
>>> msg
'hi!'
# Exit the interpreter
>>> exit()   # or Ctrl-D or Ctrl-Z+Enter

# Running Python Scripts
# Running Python Scripts in Command-Line Shell (Anaconda Prompt, CMD, Terminal, Bash)
$ cd <dirname>      # Change directory to where you stored the script
$ python hello.py   # Run the script via the Python interpreter
                    # (Also try "py hello.py", "python3 hello.py" and "python2 hello.py"

# Unix's Executable Shell Script
# In Linux/macOS, you can turn a Python script into an executable program (called Shell Script or Executable Script) by:

#!/usr/bin/python3
......

$ cd /path/to/project-directory
$ chmod u+x hello.py  # enable executable for user-owner
$ ls -l hello.py      # list to check the executable flag
-rwxrw-r-- 1 uuuu gggg 314 Nov  4 13:21 hello.py

$ cd /path/to/project-directory
$ ./hello.py

# Alternatively, you can use the following to pick up the Python Interpreter from the environment:

#!/usr/bin/env python3
......


```
