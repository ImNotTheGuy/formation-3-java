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

