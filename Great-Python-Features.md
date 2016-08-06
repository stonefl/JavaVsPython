
Python 3 has some features can make your life much easier.

# Unpacking

# List Comprehension

# Positional and Keyword Arguments

# Sequence Operations

Sequence types in Pyton include: lists, tuples, range, and strings. 

## Repeatation

You can use `*` to specify repeat times. For example, 


```python
s = "Python"
s_repeat = s * 3
s_repeat
```




    'PythonPythonPython'



Note that items in the sequence 's' are not copied; they are referenced multiple times. This often haunts new Python programmers. For example,


```python
s = [[]] * 3
print(s)
s[2].append(2)
print(s)
```

    [[], [], []]
    [[2], [2], [2]]


what happended here is that `[[]]` is one-element list containning an empty lsit, so all three elements of 's = [[]] * 3' are reference to this single emtpy list. Modifying any of the elements in `s` modifies this single list. You can create a list of different items in this way:


```python
s = [[] for i in range(3)]
print(s)
s[0].append(1)
s[1].append(2)
s[2].append(3)
print(s)
```

    [[], [], []]
    [[1], [2], [3]]


## Slice

You slice a sequence using 

`s[i:j]` slice of sequence s from index _i_(**including**) to index _j_ (**excluding**), which is defined as the sequence of items with index _k_ such that `i <= k < j`. If _i_ or _j_ is greater than `len(s)`, use `len(s)`. If _i_ is omitted or `None`, use `0`. If _j_ is omitted or `None`, use `len(s)`. If _i_ is greater than or equal to _j_, the slice is empty.

`s[i:j:k]`slice of sequence s from _i_ (**including**) to j with step k, which is defined as the sequence of items with index `x = i + n*k` such that `0 <= n < (j-i)/k`. In other words, the indices are `i`, `i+k`, `i+2*k`, `i+3*k` and so on, stopping when j is reached (but never including j). If i or j is greater than len(s), use len(s). If i or j are omitted or None, they become “end” values (which end depends on the sign of k). Note, k cannot be zero. If k is None, it is treated like 1.

# String in Python

## Build a String


```python
s1 = 'welcome to Python'
s2 = "welcome to Python"
s3 = str('welcome to Python')
s4 = str("welcome to Python")
s5 = s1
print(s1 == s2)
print(s1 is s2)
print(s3 == s4)
print(s3 is s4)
print(s1 is s5)
```

    True
    False
    True
    False
    True


+ **`str.capitalize()`** returns a copy of the string with its first character capitalized and the rest lowercased.
+ **`str.casefold()`** return a casefolded copy of the string. Casefolded strings can be used for caseless matching. Casefolding is similar to lowercasing but more aggressive because it is intended to remove all case distinctions in a string.


```python
s = "welCOME to Python"
print(s.capitalize())
print(s.title())
print(s.upper())
print(s.lower())
print(s.casefold())
print(s.swapcase())
```

    Welcome to python
    Welcome To Python
    WELCOME TO PYTHON
    welcome to python
    welcome to python
    WELcome TO pYTHON



```python

```


```python
print(s.center(30, '@'))
print(s.ljust(30, '*'))
print(s.rjust(30, '#'))
print(s.zfill(30))
```

    @@@@@@welcome to python@@@@@@@
    welcome to python*************
    #############welcome to python
    0000000000000welcome to python



```python
s.count('o', 1, 10)
```




    2




```python

```


```python
s.encode()
```




    b'welcome to python'




```python

```


```python
s.endswith('on')
```




    True




```python

```


```python
s = "This is\tan string example"
print("original string: " + s)
print("default expanded tab string: " + s.expandtabs())
print("specified expanded tab string: " + s.expandtabs(16))
```

    original string: This is	an string example
    default expanded tab string: This is an string example
    specified expanded tab string: This is         an string example



```python

```


```python
s.find('is')
```




    2




```python

```


```python
s.index('is')
```




    2




```python

```


```python
x, y = 1, 2
'The sume of {0} and {1} is {2}'.format(x, y, x+y)
```




    'The sume of 1 and 2 is 3'




```python

```


```python
s = '12345'
print(s.isalnum())
print(s.isalpha())
print(s.isdecimal())
print(s.isdigit())
print(s.isnumeric())
```

    True
    False
    True
    True
    True



```python

```


```python
print(s.isidentifier())
print(s.islower())
```

    False
    False



```python

```


```python
print(s.join('abc'))
print(s.join(['1-', '2-', '3-', '4-']))
```

    awelcome to pythonbwelcome to pythonc
    1-welcome to python2-welcome to python3-welcome to python4-



```python

```
