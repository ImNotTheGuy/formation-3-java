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

|   $f(x)    |       Code       | 
|:----------:|:----------------:| 
| $\sqrt{x}$ |  `Math.sqrt(x)`  |
|  $x^{n}$   | `Math.pow(x, n)` |

- See the official `Math` [documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) for all 
available functions.

## Constants

- Go to [code](src/Constants.java)

Constant value are declared with the prefix `final`, such as:

`final double EARTH_GRAVITY = 9.81;`

By convention, a constant variable shall be in full CAPS, with words separated by an underscore: `THIS_IS_A_CONSTANT`

You can declare a variable by inference, which means you do not have to specify it's type.

Example: 

```
var country = "France";
```

But you cannot do this:

```
var country;
country = "France";
```

___ 

# Exercises

## Exercise 7

[code](src/Exercice7.java)

Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.

Exemple d'exécution:

Entrez un nombre entier: 5

Le nombre est positif et impair

Entrez un nombre entier: -4

Le nombre est négatif et pair

Entrez un nombre entier: 0

Le nombre est zéro (et il est pair)

## Exercise 8

[code](src/Exercice8.java)

Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
Principe du fonctionnement d'une équation du 2nd degré:

https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf

## Exercise 9

[code](src/Exercice9.java)

Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.

Ex:
Mois : 4
Résult : Avril

Pour cet exercices, vous devez aussi présenter une version qui utilise le sélecteur de cas(à trouver sur internet)






