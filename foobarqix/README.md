Principes de mise en oeuvre
===========================

Ce programme affiche les nombres de 1 à 100. Un nombre par ligne, respectant les règles du FooBarQix.
Il permet également l'évaluation FooBarQix de nombres de taille indéfinie.
L'algorithme peut être modifié/enrichi simplement.

* L'agorithme de translation

L'algorithme translation permet de retourner une chaine résultat en fonction d'un texte passé en entrée.
Le comportement de l'algorithme doit être défini au travers de règles. Il existe actuellement deux règles: une régle sur la divisibilité et une de comparaison de contenu.

Cet algorithme est paramétré spécifiquement pour le FooBarQix dans la classe du même nom.

* Critère de divisibilité

Pour déterminer si un nombre est divisible, on utilise 2 algorithmes différents
	si le nombre peut être casté en int, on utilise un simple modulo
	si le nombre est trop grand, on utilise les critères de divibilité. Voir http://fr.wikipedia.org/wiki/Liste_de_crit%C3%A8res_de_divisibilit%C3%A9#Entiers_inf.C3.A9rieurs_.C3.A0_10. Actuellement, seuls les critères de divisibilité pour les 3,5 et 7 sont implémentés.


Buid & Tests
============

mvn package

Execution
=========

mvn exec:java


Utilisation
===========
 * Executer la commande maven test pour compiler/tester et exécuter le programme.
 * Pour quitter le programme, taper la lettre q
 * Pour obtenir les 100 premiers résultat tel que demandé par l'exercie, taper le mot list à la demande de saisie.
 * Toute autre entrée sera interprêtée comme une valeur à évaluer par le FooBarQix
