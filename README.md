# Activité 3 - Spring Boot Application

Ce projet est une application simple construite avec Spring Boot, qui gère des produits dans une base de données H2 en mémoire. Il permet d'afficher une liste de produits, de supprimer des produits et d'ajouter des produits à partir d'une interface web.

## Technologies utilisées
- **Spring Boot** : Framework pour créer des applications Java robustes.
- **Spring Data JPA** : Pour l'accès aux données avec une base de données relationnelle.
- **Thymeleaf** : Moteur de template pour la création des vues.
- **H2 Database** : Base de données en mémoire pour stocker les informations des produits.
- **Maven** : Outil de gestion de projet et de dépendances.

## Structure du projet
Le projet se compose des principaux éléments suivants :

### 1. **Entities**
L'entité principale du projet est `Product`, qui représente un produit avec les champs suivants :
- `id` : Identifiant unique du produit.
- `name` : Nom du produit.
- `price` : Prix du produit.
- `quantity` : Quantité du produit en stock.

Le modèle `Product` est annoté avec JPA pour pouvoir être stocké dans la base de données et gérer les opérations CRUD.

### 2. **Repository**
Le `ProductRepository` est une interface qui étend `JpaRepository`. Elle permet d'effectuer des opérations sur les entités `Product`, telles que la récupération de tous les produits ou la suppression par identifiant.

### 3. **Controller**
Le `ProductController` gère les requêtes HTTP liées aux produits. Il possède deux principales méthodes :
- `index()` : Affiche la liste des produits dans une page HTML via Thymeleaf.
- `delete()` : Permet de supprimer un produit en fonction de son identifiant passé en paramètre dans l'URL.

### 4. **Application principale**
La classe `Activite3Application` est le point d'entrée de l'application. Elle configure et démarre l'application Spring Boot. Elle contient également un `CommandLineRunner` qui crée quelques produits au démarrage de l'application pour tester l'affichage et la suppression.

### 5. **Vue (HTML)**
Le fichier `products.html` est une vue Thymeleaf qui affiche les produits sous forme de table. Elle permet également de supprimer un produit via un lien de suppression.

### 6. **Configuration**
L'application utilise la base de données H2 en mémoire, ce qui permet de tester l'application sans configurer une base de données externe. La console H2 est activée pour permettre l'inspection des données via un navigateur web à l'adresse `http://localhost:8080/h2-console`.

### 7. **Dépendances**
Le projet utilise les dépendances suivantes :
- `spring-boot-starter-web` : Pour le développement d'applications web.
- `spring-boot-starter-data-jpa` : Pour l'intégration de Spring Data JPA.
- `spring-boot-starter-thymeleaf` : Pour l'utilisation de Thymeleaf.
- `h2` : Base de données en mémoire.
- `lombok` : Pour simplifier le code en générant automatiquement des getters, setters, constructeurs, etc.

## Exécution du projet

1. Clonez ce projet dans votre répertoire local :
   ```bash
   git clone https://github.com/votre-utilisateur/activite-3.git
