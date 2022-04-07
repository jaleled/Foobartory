# Foobartory Application

Enoncé
​
Le but est de coder une chaîne de production automatique de foobar.
​
On dispose au départ de 2 robots, qui sont chacun capables d'effectuer plusieurs actions :
​

Se déplacer pour changer d'activité : occupe le robot pendant 5 secondes.
Miner du foo : occupe le robot pendant 1 seconde.
Miner du bar : occupe le robot pendant un temps aléatoire compris entre 0.5 et 2 secondes.
Assembler un foobar à partir d'un foo et d'un bar : occupe le robot pendant 2 secondes. L'opération a 60% de chances de succès ; en cas d'échec le bar peut être réutilisé, le foo est perdu.
​

Tu as de grands entrepôts, la gestion des stocks n'est pas un problème.
En revanche, la législation impose la traçabilité des pièces ayant servi à fabriquer les foobars : chaque foo et chaque bar doivent avoir un numéro de série unique qu'on doit retrouver sur le foobar en sortie d'usine
​
On souhaite ensuite accélérer la production pour prendre rapidement le contrôle du marché des foobar. Les robots peuvent effectuer de nouvelles actions:

Vendre des foobar : 10s pour vendre de 1 à 5 foobar, on gagne 1€ par foobar vendu
Acheter un nouveau robot pour 3€ et 6 foo, 0s
​
Le jeu s'arrête quand on a 30 robots.
​

# Build Application

## Requirements

Pour créer et exécuter l’application, vous avez besoin :

- [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11-windows)
- [Maven 3](https://maven.apache.org)

## Running the application locally
### From the IDE
Exécutez la méthode `main` de la classe `FoobartoryApplication`.
### Maven Build command :

# Compiler le projet et générer le dossier cible


```shell
mvn  clean package
```

#Exécuter le projet

```shell
mvn exec:java -Dexec.mainClass=FoobartoryApplication
```
