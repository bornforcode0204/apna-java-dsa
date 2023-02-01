# FlowChart

!["flowchart"](./Day%20-%201/1.jpg)
!["flowchart & psuedocode"](./Day%20-%201/2.jpg)

# Boilerplate code in Java

```java
public class BoilerplateCode {
    public static void main(String[] args) {

    }
}

// boilerplate code
```

classname and file name should be same

# Comments in java

```java
// Single line comment

/*
Multiline
comment
*/

```

# Variable

2\*(a+b) ==> 2 is Literal a and b are Variable

2\*(a+b) is an expression

2 is a number literals and a,@ are the character literals

variable ==> datatype variablename = value;

a,b,c,..., classname(filename), main function, print,println are calles Identifier

# DataTypes

Java is a typed language
means you have to write the type of data before declaring variable

size in bytes, 1byte = 8bit and 1 bit == 0 or 1

1. Primitive - 8

   byte - 1,
   short - 2,
   char - 2,
   boolean - 1bit,
   int - 4,
   long - 8,
   float - 4,
   double - 8

2. Non-Primitive

   String,
   Array,
   Class,
   Object,
   Interface.

java is a strictly typed language

# Taking input in Java

import java.util.\*; (util is a package)

Scanner sc = new Scanner(System.in);

next - take only one token

nextLine - take entire line

nextInt

nextByte

nextFloat

nextDouble

nextBoolean

nextShort

nextLong

echo - means print

we write f after float data type, Java by default consider float value as a double data type

```java
float price = 10.50f;
float radius = sc.nextFloat();
```

# Output in Java

print() is function which helps to print the output

; is terminater to stop the statement is called stmt terminator

How to run

1. go to file location in cmd or terminal
2. type "javac filename.java"
3. type "java filename"

if % is comming after output means it is comming because it is not getting nextline

println() - ln used for next line.

"\n" for is also used for new line

# TypeCasting

when destination type < source type is called Type casting(narrowing conversion explicit conversion)

```java
        float a = 2.1f;
        int b = (int) a;
```

# Type Conversion

when we convert one type of data into another type of data is called type conversion (widening and implicit conversion).

Type conversion happens when:

a . type compatible

b. destination type > source type(if not than lossy conversion happens it can not done automatically)

byte -> short -> int ->float -> long -> double

```java
int a = 25;
long b = a;
```

# Type Promotion

Type promotion is a phinomina in Java

Type Promotion in Expressions

1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
2. If one operand is long, float or double the whole expression is promoted to long, float, or double respectively.

```java
int n1 = 10;
        float n2 = 20.33f;
        long n3 = 23;
        double n4 = 30;
        double t = n1 + n2 + n3 +n4;

        System.out.println(t);

        byte b1 = 5;
        byte a1 = (byte) (b1 * 2);
        System.out.println(a1);

```

# Operators

## Arithmatic Operator

```java
 int a = 10;
        int b = 5;
        System.out.println("Add = "+ (a + b));
        System.out.println("Subtract = "+ (a - b));
        System.out.println("Multiply = "+ (a * b));
        System.out.println("Devide = "+ (a / b));
        System.out.println("Modulo = "+ (a % b));
```

## Assignment Operator

```java
int a = 5;
        System.out.println(a);
        a += 2;
        System.out.println(a);
        a -= 2;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
```

Operators in Java:
Symbols that tell compiler to perform some operation.

    sum = a(operand) +(Operator) b(operand)

    1. Arithmetic Operators (Binary/Unary)
    2. Relational Operators
    3. Logical Operators
    4. Bitwise Operators
    5. Assignment Operators

1. Arithmetic Operators (Binary/Unary):

Binary Unary

-                     ++(pre-increment/post-increment)

-                     --(pre-decrement/post-decrement)

- /
- %
- \+
- \-
- \*

2. Relational Operators

   == equal

   != not equal to (inequality)

   > grater than

   > < less than

   > = grater than equal to

   > <= less than equal to

3. Logical Operators

   && (Logical AND) -> ture when both condition are true otherwise false

   || (Logical OR) -> false when both condition are false otherwise true

   ! (Logical NOT) -> It reverse T->F, F->T

4. Assignment Operators

   =
   +=
   -=
   \*=
   /=

### Note:

```java
char operator = sc.next().charAt(0);
```

# ▶ if-else Statement:

```java
if(condition){
        code
    }else{
        code
    }
```

# ▶ else if Statement:

```java
if(condition 1){
        code
    }else if(condition 2){
        code
    }else{
        code
    }
```

### Largest Of Three Number

```java
int a = 1, b = 2, c = 3;

        if(a >=b && a >= c){
            System.out.println("largest is A");
        }else if(b >= c){
            System.out.println("largest is B");
        }else{
            System.out.println("largest is C");
        }
```

# ▶ Ternary Operator:

                    Ternary Operator is an aletrnate way to write if-else.
                    unary --> 1 operand
                    binary --> 2 operands
                    ternary --> 3 operands

```java
    variable = condition? statement1 : statement2;

    boolean larger = (5>3)? 5(true):3(false);

    String type = (5%2 == 0)? "even" : "odd";
```

# ▶ Switch Statement:

```java
switch(variable){
    case 1:
            code
            break;
    case 2:
            code
            break;
    case 3:
            code
            break;
    default:
            stmt
            break;(optional)
}
```

![Leap year flow chart](./Assets/9/leap%20year.png)("----Leap year logic flowchart----")

# ▶ While Loop:

```java
while(condition){
    code
}
```

# ▶ For Loop:

```java
for(initialisation; condition; updation){
    code
}
```

# ▶ do-while Loop:

```java
do{
    code
}while(condition);
```

# ▶ Break Statement:

to exit the loop

# ▶ Continue Statement:

to skip an iteration (current iteration)

## Primr number:

2,3,5,7,11...etc, and other are the composite number.

```java
 Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n == 2){
            System.out.println(n +" is Prime");
        }else{
            boolean isPrime = true;
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println(n + " is  a prime Number");
        }else{
            System.out.println(n + " is not a prime Number");
        }
```

# ▶ Function/Methods

function is a reusable block of code which perform certain operations.

Jin functions ko hum classes k ander likhte hai vo us class k Method ho jate hai.

## Syntax

```java
returnType name(){
    //body (logic)
    return statement;
}
```

## Syntax with Parameters

```java
returnType name(type param1, type param2){
    //body (logic)
    return statement;
}
```

# ▶ Function Parameter V/S Argument

The variable which is used in function declaration are called Parameters or formal parameters.

The variable or values which we pass at time of calling function are called Arguments or Actual parameters.
!["Parameter V/S Arguments"](./Assets/12/parameter%20vs%20argument.png)

# ▶ What happens in Memory?

variable and function both occupie memory (call stack) in Java.

!["Call stack"](./Assets/12/call_stack.png)

# ▶ Call by Value / Call by Reference(orignal)

Java always calls by value

# ▶ Factorial

n! = n \* (n-1) \* (n-2) \* (n-3) \* .... \* 1
Factorial exist only for positive numbers. not for negative.

!["Binomial Coefficient"](./Assets/12/binomialCoefficient.png)

!["Methods"](./Assets/12/methods.png)

# ▶ Function Overloading

!["Function Overloading"](./Assets/12/functionOverloading.png)

## Function Overloading using parameter

!["Function Overloading using parameter"](./Assets/12/functionOverloadingUsingParameter.png)

Function overloading does not depend on the return type of function it depends on parameter

## Function Overloading using Data Types

# ▶ Convert from Binary to Decimal

!["Binary to Decimal"](./Assets/12/Binarytodecimal.png)

# ▶ Convert from Decimal to Binary

!["Decimal to Binary"](./Assets/12/Decimaltobinary.png)

# ▶ Scope

Scope of variable is referred to the part of the program where the variable can be used.
In this program variable i is declared in the for loop. So scope of variable i is limited to the for loop only that is between {and} of the for loop.There is a display statement after the for loop where variable i is used which means i is used out of scope. This leads to compilation errors.The program given will not run and givean error instead.To correct the program,the variable i needs to be declared outside the for loop.

```java
 for(int i=0; i<=5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);
```

## Method Scope

Inside any method we can use any variable after declaring , before declaring variable we can not use, this is called Method scope.
!["Method Scope"](./Assets/12/methodScope.png)

in line no. 3 it will give error(s cannot be resolved to a variable) because we are using s before declaring.

## Block Scope

```java
{
    //block of code
}
```

!["Block Scope"](./Assets/12/blockscope.png)

in line no. 7 it will give error(s cannot be resolved to a variable) because we are tring to access variable outside of block.

#### We also have class scope

For that we use access modifiers

1. public
2. private
3. protected

we will learn in OOP's

# ▶ Arrays:

Array has list like structure. and indexing starts from 0 called 0-based indexing.

#### Defination :

List of elements of the same type placed in a contiguous(ek k baad ek) memory location.

Java char takes up 2 bytes in memory.

## Operations in Array

1. Create
2. Input
3. Output
4. Update

!["Creating an Array"](./Assets/14/creating%20array.png)

here new keyword gives(allocate) us location in memory.

Array has static type(means you can not change size of array in between of execution(on run time)).

Empty array stores 0, "", ''.

#### Length of an array:

```java
arrayName.length
```

## Passing arrays as argument:

Arrays are pass by reference
!["Arrays are pass by reference"](./Assets/14/arrayPassbyRef.png)

## Linear Search

When we search element in a linear manner, called linear search.
!["Linear Search"](./Assets/14/linearsearch.png)

In Java :<br>
-infinity = Integer.MIN_VALUE<br>
+infinity = Integer.MAX_VALUE

These are avaliable in "util" package to use them :
import java.util.\*;

function can return only one value.

## Binary Search :

Array should be sorted
![](./Assets/14/Binarysearch.png)

# ▶ Strings :

String is a special class in java.

```java

String str = "abcd";
String str1 = new String("asd");
```

Strings are <mark>IMMUTABLE</mark> (means we can not change strings)

## Taking String input from user

```java
 String name = sc.next(); // next() accepts only one token
 String name = sc.nextLine();
```

## Length of String:

to find the length of String we use <mark>.length()</mark> function

## Concatenation

```java
String firstName = "Zeeva";
String lastName = "Singh";
System.out.println(firstName +" " +lastName);
```

## String equality:

If you declare string using String literal it points to the old string
but If you declare string using <mark>new</mark> keyword it create variable in somewhere else in memory.

```java
String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        if(s1 == s3){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
```

If want to check only the value of two strings use <mark>equals()<mark> function

```java
if(s1.equals(s3)){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
```
