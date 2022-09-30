# Comp1000-Labs
Labs from WIT COMP1000

LA01: 

Write a program to compute the sum, mean, and population standard deviation of a list of 5 numbers for
a user. First, ask the user for the user’s name. Have the user’s input go on the next line and have the
computer greet the user. Then have the user supply five numbers via the keyboard. For example: 1 2 3 4 5
Then, compute the sum of the numbers. In this case: 1 + 2 + 3 + 4 + 5 = 15
The mean is another word for the simple average: 15 / 5 = 3
To calculate the population standard deviation takes a few steps. First, for each inputted value, compute
the difference between the mean and that number: (1-3) = -2, (2-3) = -1, (3-3) = 0, (4-3) = 1, (5-3) = 2
Then, add up the square of these differences: (-2)2 + (-1)2 + (0)2 + (1)2 + (2)2 = 4 + 1 + 0 + 1 + 4 = 10
Then divide this sum by the number of inputs: 10 / 5 = 2
And finally take the square root: √2 ~ 1.41
Have the computer say goodbye to the user at the end.

LA02:

Write a program to compute the area, perimeter, and interior angle of a regular polygon.

LA03:

Write a program to calculate the result of one of three operations (minimum, L1 norm, L2 norm)
on a vector of three numbers. To begin, have the user input three numbers at the keyboard (e.g. -1
2 3). Then, ask the user to type in an operation (valid operations are “min”, “l1”, or “l2”; all letters
are lowercase). Assuming the user types a valid operation, your program should compute and
output to the screen the result based upon the three numbers; otherwise output an error.
For “min”, the result is the minimum of the three numbers (i.e. -1). For “l1”, the result is the sum of
the absolute values of the three numbers (i.e. |-1| + |2| + |3| = 1 + 2 + 3 = 6). For “l2”, the result is the
square root of the sum of the squares (i.e. √(−1)2 + (2)2 + (3)2 = √1 + 4 + 9 = √14 = 3.74).

LA04-a:

First write a method to calculate the greatest common divisor (GCD) of two positive integers using Euclid’s
algorithm (also known as the Euclidean algorithm). Then write a main method that requests two positive
integers from the user, validates the input, calls your method to compute the GCD, and outputs the return
value of the method (all user input and output should be done in main).

LA04-b:

Convert the following equations into java code and have the answers outputted as part of a valid, complete,
program:
1) Y=mx+b
2) 𝑚 = (𝑦2−𝑦1)/(𝑥2−𝑥1)
3) 𝐴 = 4 𝜋 𝑟2
