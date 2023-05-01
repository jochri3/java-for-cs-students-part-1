Most common used functions
Here is a list of the most common dynamic array methods in Java. I have translated the text and provided explanations and examples for these methods. If you would like to know more, I have also provided a link at the end.



## add(E element): Adds an element to the end of the list. Example:

```
ArrayList<String> myList = new ArrayList<>();
myList.add("Hello");
myList.add("World");
```


## get(int index): Retrieves the element at the specified index. Example:

```
String firstElement = myList.get(0); // Returns "Hello"

set(int index, E element): Replaces the element at the specified index with a new element. Example:

myList.set(1, "Java"); // Replaces "World" with "Java"
```


## remove(int index): Removes the element at the specified index. Example:

```
myList.remove(1); // Removes "Java"
```


### size(): Returns the number of elements in the list. Example:

```
int listSize = myList.size(); // Returns 1

clear(): Removes all elements from the list. Example:

myList.clear(); // Empties the list
```


## isEmpty(): Checks if the list is empty. Example:

```
boolean isEmpty = myList.isEmpty(); // Returns true if the list is empty
```


## contains(Object o): Checks if the list contains the specified element. Example:

```
boolean containsHello = myList.contains("Hello"); // Returns true if the list contains "Hello"
```


## indexOf(Object o): Returns the index of the first occurrence of the specified element, or -1 if the list does not contain the element. Example:

```
int indexOfHello = myList.indexOf("Hello"); // Returns 0
```


## lastIndexOf(Object o): Returns the index of the last occurrence of the specified element, or -1 if the list does not contain the element. Example:

```
int lastIndexOfHello = myList.lastIndexOf("Hello"); // Returns 0
```


## toArray(): Returns an array containing all the elements in the list. Example:

```
Object[] myArray = myList.toArray(); // Returns an array containing the elements of the list
```