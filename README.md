# fpp_lab4.2
Sort a string using recursion

Programming Assignment 4-2
Here you will implement a recursive sorting routine, applied to the characters within an
input String. Name your class MinSort and your sorting method sort.
The recursive strategy for MinSort is: Given an input String s consisting only of
characters a-z do the following:
1. Find the position minpos of the alphabetically least character in s
2. Swap the character in position 0 with the character ch in position minpos
3. Remove character ch from the string, store it, and call the remaining String t
4. Sort t and place in storage to the right of the character ch
5. Return the stored String.
To find the min position of a smallest character in the String, use the recursive min
routine presented in the slides in combination with Java’s indexOf String method. Be
sure to handle the cases in which the input String is null or empty.
Test your code in a main method using the input String
s = “zwxuabfkafutbbbb”
with these lines of code:
MinSort ms = new MinSort();
String result = ms.sort(“zwxuabfkafutbbbb”);
System.out.println(result);
