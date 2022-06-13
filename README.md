# Table of contents


- [Table of contents](#table-of-contents)
- [09.06.2022 - Introduction to Java ☕](#09062022---introduction-to-java-)
    - [Booleans](#booleans)
    - [Print options](#print-options)
    - [Reading user input](#reading-user-input)
    - [Math functions](#math-functions)
    - [Constants](#constants)
- [Exercises](#exercises)
    - [Exercise 7](#exercise-7)
    - [Exercise 8](#exercise-8)
    - [Exercise 9](#exercise-9)
    - [Bonus exercise](#bonus-exercise)
    - [For loop](#for-loop)
    - [Exercise 10](#exercise-10)
    - [Exercise 11](#exercise-11)
    - [Exercise 12](#exercise-12)
- [10.06.2022 - Continuing on Java fundamentals](#10062022---continuing-on-java-fundamentals)
    - [While loops](#while-loops)
    - [Exercice 13](#exercice-13)
    - [Exercice 14](#exercice-14)
    - [Exercice 15](#exercice-15)
    - [Arrays](#arrays)
        - [Fixed arrays](#fixed-arrays)
    - [Exercice 16](#exercice-16)
    - [Exercice 17](#exercice-17)
- [13.06.2022 - Arrays continued; Introduction to functions](#13062022---arrays-continued-introduction-to-functions)
    - [How are arrays stored in memory ?](#how-are-arrays-stored-in-memory-)
        - [More info on String storage](#more-info-on-string-storage)
        - [String methods](#string-methods)
        - [Multidimensional tables](#multidimensional-tables)
    - [Exercise 18](#exercise-18)





# 09.06.2022 - Introduction to Java ☕

## Booleans

- Go to [code](src/courseDay1/course/Boolean.java)

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

- Go to [code](src/courseDay1/course/Displays.java)

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

- Go to [code](src/courseDay1/course/Read.java)

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

- Go to [code](src/courseDay1/course/MathFunctions.java)

|   $f(x)$   |       Code       | 
|:----------:|:----------------:| 
| $\sqrt{x}$ |  `Math.sqrt(x)`  |
|  $x^{n}$   | `Math.pow(x, n)` |

- See the official `Math` [documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) for all 
available functions.

## Constants

- Go to [code](src/courseDay1/course/Constants.java)

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

- Go to [code](src/courseDay1/Exercise/Exercice7.java)

Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.

Exemple d'exécution:

Entrez un nombre entier: 5

Le nombre est positif et impair

Entrez un nombre entier: -4

Le nombre est négatif et pair

Entrez un nombre entier: 0

Le nombre est zéro (et il est pair)

## Exercise 8

- Go to [code](src/courseDay1/Exercise/Exercice8.java)

Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
Principe du fonctionnement d'une équation du 2nd degré:

https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf

## Exercise 9

- Go to [code](src/courseDay1/Exercise/Exercice9.java)

Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.

Ex:
Mois : 4
Résult : Avril

Pour cet exercices, vous devez aussi présenter une version qui utilise le sélecteur de cas(à trouver sur internet)


## Bonus exercise

- Go to [code](src/courseDay1/Exercise/ExerciceBonus.java)

Écrivez un petit programme Java, Degre3.java, vous permettant d'évaluer un polynôme du
3ème degré de la forme:
((a+b)/2)x3 + (a+b)2x2 + a + b + c

    Exemple d'exécution:
    Entrez a (int) : 1
    Entrez b (int) : 2
    Entrez c (int) : 3
    Entrez x (double) : 3.5
    La valeur du polynôme est : 180.5625

Note: **How??** 😕 😡 😡 😡 😡 😡


## For loop

- Go to [code](src/ForLoop.java)

## Exercise 10

- Go to [code](src/courseDay1/Exercise/Exercice10.java)

Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
Votre programme devra produire la sortie suivante à l'écran :

Tables de multiplication

Table de 2 :
1 * 2 = 2
...
10 * 2 = 20
...
Table de 5 :
1 * 5 = 5
2 * 5 = 10
... ...
Table de 10 :
1 * 10 = 10 …


## Exercise 11

- Go to [code](src/courseDay1/Exercise/Exercice11.java)


Écrivez un programme Java qui demande à l'utilisateur d'entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:

Ex:

Nombre : 3

Factorielle de 3 : 3x2x1 = 6

Regle de calcul de factorielle : http://villemin.gerard.free.fr/Denombre/Factorie.htm

## Exercise 12

- Go to [code](src/courseDay1/Exercise/Exercice12.java)

Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche 
les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, 
le programme affichera les nombres de 18 à 27.

___

# 10.06.2022 - Continuing on Java fundamentals

## While loops

- Go to [code](src/courseDay2/course/WhileLoop.java)

While loops are used in the cases where we don't know how many times the loop needs
to be performed in order to satisfy the condition which will exit the loop.

They work as follows:

`while (a condition is TRUE)` &rarr; `Do stuff`

Example: enter your pin code ==> we don't know how much tries the user will need
to have the correct pin.

Best practice is to instantiate a while loop with:

`while (true) {}`

Follow the 'DRY' (Do not Repeat Yourself) principle, but don't forget to keep hydrated 🍸

The `do { something } while (condition);` syntax allows to execute at least once the 
`something` before checking for the condition. This can be helpful when the `something`
needs to be executed independently of whether the condition is `true` or `false`.

## Exercice 13

- Go to [code](src/courseDay2/exercise/Exercise13.java)



    Ecrire un programme Javascript qui permet à l'utilisateur de définir une adresse email et un mot de passe.
    Ensuite dans un second temps, il sera demandé à l'utilisateur de fournir l'email et le mot de passe:
    Si l'email et le mot de passe ne correspondent pas aux valeurs définies, le message "Identifiants incorrect devra 
    s'afficher", et l'utilisateur devra recommencer la saisie des valeurs.
    Sinon, le message "Bienvenu dans votre espace client" devra s'afficher.

## Exercice 14


- Go to [code](src/courseDay2/exercise/Exercise14.java)


    A l'exercice précédent, s'ajoute un nouveau requirement:
    Le nombre de fois que l'utilisateur peut saisir des mauvais identifiants est limité à 5, 
    ensuite le programme va s'arrêter avec un message disant.
    "Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué".
    Il faut dire à au user le nombre de tentatives restants


## Exercice 15


- Go to [code](src/courseDay2/exercise/Exercise15.java)


    Ajouter une validation de type de donnees pour que le code
    PIN saisi ne soit compose que des chiffres

## Arrays

2 types of arrays.

Fixed arrays and dynamic arrays

### Fixed arrays

- Go to [code](src/courseDay2/course/ArraysIntro.java)

## Exercice 16

    Ecrire un programme Java qui permet à l'utilisateur de déclarer 3 array d'entiers.
    Ces tableaux ne doivent pas forcément avoir la même taille
    Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN]
    et la somme de tous les éléments multiples 3 dans les 3 tableaux.
    Ex :
    T1 : [ 2, 6, 8, 15,39,11 ]
    T2 : [ 21, 33, 12, 19,0 ]
    T3 : [ 17, 18, 46 ]
    S = 6+15+39+21+33+12+18 = 144


1st solution:
- Go to [code](src/courseDay2/exercise/Exercice16.java)

2nd solution using array of arrays:
- Go to [code](src/courseDay2/exercise/Exercice16AlternateSolution.java)

## Exercice 17

        Ecrire un programme Java qui demande à l'utilisateur de remplir un tableau d'entiers à partir du clavier.
        Puis le programme devra lui demander d'entrer un nombre à rechercher dans le tableau.
        Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu'ils se retrouve dans le tableau
        Sinon le programme lui dira que le nombre recherché n'existe pas dans le tableau
        Ex : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
        ->Entrer un nombre à rechercher : 6
        ->6 existe et se retrouve 3 fois dans le tableau (edited)


- Go to [code](src/courseDay2/exercise/Exercice17.java)


# 13.06.2022 - Arrays continued; Introduction to functions

## How are arrays stored in memory ?

2 types of variables:
- primitive
- objects

Primitive types variables are declared with the 1st letter in **l**owercase, such as: `float; int; boolean`

Ojects are declared with an **U**ppercase 1st letter, such as: `String, Scanner`

When declaring primitive types, each variable has it's value stored.

When declaring an array, we are only storing the memory address where the array is stored, called _pointers_.

The elements of the array are stored in a continuous manner. First element is at index 0, second element is after index 0, etc.

- Go to [code](src/courseDay3/course/ArrayStorage.java)

```
// This does not work as a is not yet initialized
int a;
System.out.println(a);

// However, when we do this:
int[] a = new int[5];
System.out.println(a);
// This will print the address at which the array a is stored in memory.

// To display the actual elements of the array, we need to use:
System.out.println(Arrays.toString(a));
// The values showed will have been initiliazed to a default value 
//(0 in the case of an integer).
```

In the case of a float/double array, default value: 0.0

In the case of a String array, default value: null

In the case of a boolean array, default value: false

If you create an array and then another one that is equal to the first

Each time you change an element of any array, it will automatically change the value of both.

This is because each variable points to the same memory address.

To create 2 distinct, non-linked arrays, do this:

```
int[] a = new int[3];
int[] b = Arrays.copyOf(a);
```

To check equality of memory address of two arrays, do this:

```
System.out.println(a == b);
```

To check equality of values of two arrays, do this:

```
System.out.println(Arrays.equals(a, b));
```

### More info on String storage

A `String` is simply an array composed of multiple `char`

When creating two strings like this:

```
String name1 = "name";
String name2 = "name";
```

Java will create a String pool and variable `name1` & `name2`. 
To save memory, the 2 variables will point to a single address.

However, if the variable `name1` is changed: `name1 = "nameUpdated"`
a new address is created for `name1` but `name2` will still be equal to
`"name"`

**Note:** if a third variable `name3` is created through user input (_scanner_) with the same value,
it will not be in the String pool and therefore address equality will not be met with the other variables.

To put `name3` in the String pool, use: `name3 = name3.intern()`

For more information on this topic, click [here](https://www.javatpoint.com/string-pool-in-java#:~:text=String%20pool%20is%20nothing%20but,by%20the%20Java%20String%20class.)

    

**N.B.** The string pool is specific to Strings and cannot be generalised to arrays.

### String methods

See the info in the code: [code](src/courseDay3/course/StringMethods.java)

### Multidimensional tables

- Go to [code](src/courseDay3/course/MultidemenstionalArrays.java)

**Unrelated, but good to have:**

If you wish to add colors in the terminal output, you can use some of the following:
```
final String ANSI_RESET = "\u001B[0m";
final String ANSI_BLACK = "\u001B[30m";
final String ANSI_RED = "\u001B[31m";
final String ANSI_GREEN = "\u001B[32m";
final String ANSI_YELLOW = "\u001B[33m";
final String ANSI_BLUE = "\u001B[34m";
final String ANSI_PURPLE = "\u001B[35m";
final String ANSI_CYAN = "\u001B[36m";
final String ANSI_WHITE = "\u001B[37m";
```

In your output, use: `System.out.println(ANSI_RED + "Some red text" + ANSI_RESET)`

Note that if you do not specify at the end `+ ANSI_RESET` all remaining 
output will be in red

## Exercise 18

- Go to [code](src/courseDay3/exercise/Exercice18.java)

    Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, retourne la chaine inverse.
    Ex:
    Votre chaine : mamy
    Résultat : ymam

## Exercise 19

- Go to [code](src/courseDay3/exercise/Exercice19.java)


    Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, renseigne si celui est un palindrome(mot qui se lit de la même dans les 2 sens).
    Ex :
    Entrez un text : non
    Résultat : non est un palindrome
    Entrez un text : oui
    Résultat : oui n'est pas un palindrome

## Exercise 20

- Go to [code](src/courseDay3/exercise/Exercice20.java)


    Ecrire un programme java qui demande à l'utilisateur de remplir 
    une matrice carré 4 x 4 et qui 
    ensuite va calculer la somme des elements de la diagonale

## Exercise 21

- Go to [code](src/courseDay3/exercise/Exercice21.java)


    A partir du TP précédent, ajouter le calcul de la somme de 2 diagonales


## Dynamic arrays

Dynamic arrays (DA) are used when size of arrays is not clear. 
To declare a DA, use the following syntax:

```
ArrayList<Type> dynamicArray = new ArrayList<Type>
```

- Go to [code](src/courseDay3/course/DynamicArrays.java)

Note: when deleting an element from an `ArrayList`, it can be costly in computing
power. Indeed, if you remove index=10 from a 1,000,000 rows array, all the indexes
after 10 will have to be recomputed so that there is no gap between them.


