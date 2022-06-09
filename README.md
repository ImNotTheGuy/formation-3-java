# 09.06.2022 - Introduction to Java ☕

## Booleans

- Go to [code](src/Boolean.java)

Can only take one of the two values: `true` or `False`.

It is declared with the following: `boolean shakeTonBool;`

Good use case: returning a boolean from a function:

```
public boolean isOfAge (int age){
        return age >= 18;
    }

System.out.println(isOfAge(18)) --> true;
System.out.println(isOfAge(15)) --> false;
```

## Print options 

- Go to [code](src/Displays.java)

To concatenate multiple variables into a print statement, you can use:

`System.out.println("variable 1: " + variable1 + "/ variable 2: " + variable2)`

This can become quite tedious if a lot of variables must be recorded, so we can use this instead:

`System.out.println("variable 1: %s / variable 2: %s", variable1, variable2)`

_Note: order must be respected_
- For strings, use `%s`
- For ints, use `%d`
- For floats and doubles `%f`
- To change the number ($n=5$) of decimals for floats and doubles, specify as follows: `%.5f`

Say you have a `boolean isMarried` and you want to specify in the text "You are married" or "You are not married"
To do that, write use the following syntax, called a **ternary operator**:



`System.out.printf("You %s married", isMarried?"are":"are not")`

For visibility purposes, you can store it in a string first and then output the message:

```
String marriedStatus = isMarried?"are":"are not";
System.out.printf("You %s married", marriedStatus);
```

## Reading user input

- Go to [code](src/Read.java)

To read user input, we will need to import the `Scanner` class.

To declare it, use the following line:

```
Scanner input = new Scanner(System.in);
```

Then, you can specify what the user shall enter with a simple sout:
```
System.out.print("Name: "); // note that we use print and not println to avoid writing on the line below
String name = input.nextLine();

System.out.print("Gender: ");
int age = input.nextInt();

System.out.print("Your age: ");
int age = input.nextInt();

System.out.print("Your weight: ");
float weight = input.nextFloat();
```

## Math functions

- Go to [code](src/MathFunctions.java)

| Example of functions |       Code       | 
|:---------------------|:----------------:| 
| $\sqrt{x}$           |  `Math.sqrt(x)`  |
| $x^{n}$              | `Math.pow(x, n)` |

- See the official `Math` library documentation: [here](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) 

