#  Java : TD et TP de programmation orientée objet

Exercices et TP du module de **programmation orientée objet en Java** (S6), des bases du langage jusqu'à l'héritage, l'abstraction et une première interface Swing.

## Contenu

### [01-bases](01-bases/) : premiers pas
| Fichier | Exercice |
|---|---|
| `PremierScript.java` | Lecture au clavier des types primitifs (`byte`, `short`, `int`, `long`, `float`, `double`, `boolean`) |
| `Exo1.java` | Calculatrice en boucle (`switch`, protection contre la division par zéro) |
| `Exo2.java` | Plus petit de trois nombres |
| `Exo3.java` | Tableau aléatoire et recherche d'un élément |
| `Exo4.java` | Classe `Cercle` : encapsulation, validation du rayon, `toString()` |

### [02-td1-algorithmique](02-td1-algorithmique/) : TD 1
| Fichier | Exercice |
|---|---|
| `Exercice1` | Nombres premiers, décomposition en facteurs premiers, nombre et somme des diviseurs |
| `Exercice2` | Nombres parfaits, nombres d'Armstrong, nombres amicaux dans un intervalle |
| `Exercice3` | Jeu : deviner une combinaison magique de 4 chiffres |
| `Exercice4` | Statistiques sur un tableau : min, max, moyenne, variance, écart-type, médiane, mode et suppression des doublons, **sans `Arrays.sort`** (tri à bulles) |
| `Exercice5` | Matrices : sommes des lignes et des colonnes, symétrie, sous-matrice 2×2 de somme maximale |
| `MiniProjett` | Gestion de notes : modification, tri décroissant (tri par sélection), moyenne, médiane, top 3, normalisation sur [6, 20], recherche par id |

Les fichiers `*Main.java` contiennent les programmes de test de chaque exercice.

### [03-tp1-heritage](03-tp1-heritage/) : TP 1, héritage et abstraction
- **`faculte/`** : hiérarchie `Personne` → `Employe` → `Professeur`, et `Personne` → `Etudiant`. Un `Departement` a un professeur comme chef. `GestionFaculte` propose un menu console pour saisir et afficher ces personnes (redéfinition de `afficher()`).
- **`banque/`** : classe abstraite `Personne` dont hérite `Client`. Chaque client possède un `CompteBancaire` (dépôt, retrait avec contrôle du solde) dont le numéro est attribué automatiquement par un compteur `static`.

### [04-tp2-classes](04-tp2-classes/) : TP 2, classes et objets
- **`calculatrice/`** : les 4 opérations sur deux entiers.
- **`etudiant/`** : classe `Etudiant` avec surcharge de constructeurs, numéro d'examen automatique (`static`), moyenne selon les modules suivis et mention.
- **`cercle/`** : classe `Cercle` dont le diamètre et la surface sont recalculés à chaque changement de rayon, avec déplacement du centre.

### [05-swing](05-swing/) : première interface graphique
Une fenêtre `JFrame` avec un bouton, placé par positionnement absolu.

### [06-mini-projet-membre](06-mini-projet-membre/) : mini-projet (en cours)
Classe `Membre` : identifiant auto-incrémenté, champs obligatoires et validation de l'email par expression régulière.

## Compiler et exécuter

Chaque dossier est indépendant :

```bash
cd 03-tp1-heritage/banque
javac *.java
java Banque
```

## Technologies

Java (JDK 17+) · Swing
