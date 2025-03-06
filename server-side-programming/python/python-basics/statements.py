# One Python statement in one line, terminated by a newline.
# There is no semicolon at the end of a statement.
x = 1
print(x)

x + 1
print(x + 1)

y = x / 2
print(y)

# You can place multiple statements in one line, separated by semicolon.
print(x); print(x + 1); print(x + 2)  # No ending semicolon

# An expression in brackets [] (i.e., list)can span multiple lines
x = [1,
     22,
     333]   # Re-assign a list denoted as [v1, v2, ...] to variable x
print(x)

# An expression in braces {} (i.e., associative array) can also span multiple lines
x = {'name':"Peter",
     'gender':'male',
     'age':21
    }   # Re-assign  dictionary denoted as {k1;v1, k2:v2,...} to variable x
print(x)

# An expression in parentheses () can also span multiple lines
# You can break a long expression into several lines by enclosing it with parentheses ()
x = (1 +
     2
     + 3
     -
     4)
print(x)

# You can break a long string into several lines with parentheses () too
s = ('testing '   # No commas
     'hello, '
     'world!')
print(s)



