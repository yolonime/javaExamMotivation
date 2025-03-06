# Chat Motivant - API & Application Spring Boot

## Description
Chat Motivant est une application conçue pour inspirer et motiver les employés en leur fournissant des citations inspirantes à travers une API Spring Boot. L'application enregistre également les conversations pour permettre un suivi et un historique des échanges.

## Contexte
Face à un manque de motivation au sein de l'entreprise, cette application vise à offrir un espace de discussion enrichi par des citations inspirantes. L'objectif est de booster le moral des employés en leur apportant un soutien quotidien.

## Objectifs
- Développer une API Spring Boot qui fournit une citation aléatoire inspirante.
- Concevoir une application Spring Boot permettant aux employés d'interagir avec l'API, d'enregistrer leurs conversations et d'accéder à leur historique.

## Technologies Utilisées
- **Java 11+**
- **Spring Boot** (API et application)
- **MySQL** (Base de données)
- **Maven** (Gestion des dépendances et construction du projet)
- **RestTemplate** (Consommation de l'API dans l'application de chat)

## Prérequis
Avant d'installer et d'exécuter l'application, assurez-vous d'avoir installé :
- **JDK 11+**
- **Maven**
- **MySQL** ou un autre système de gestion de base de données relationnelle

## Installation
1. Clonez le dépôt GitHub :
   ```sh
   git clone -b api --single-branch https://github.com/yolonime/javaExamMotivation.git
   cd motivational_chat_api
   git clone -b app --single-branch https://github.com/yolonime/javaExamMotivation.git
   cd motivational_chat_app
   ```
2. Configurez la base de données :
   - Créez une base de données MySQL.
   - Ajoutez la configuration correspondante dans le fichier `application.properties` de chaque projet :
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/motivation
     spring.datasource.username=root
     spring.datasource.password=votre_mot_de_passe/enlever si pas de mdp
     ```
3. Lancez l'API Spring Boot :
   - L'API sera accessible à l'adresse : [http://localhost:8081/api/quotes](http://localhost:8081/api/quotes)
4. Démarrez l'application de chat :
   - L'application sera accessible à : [http://localhost:8080](http://localhost:8080/chat)

## Fonctionnalités
- **Chat interactif** : Les employés peuvent envoyer des messages et recevoir une citation inspirante en retour.
- **Historique des conversations** : Enregistrement des messages échangés avec les citations associées.
- **Administration** : Accès à l'historique des discussions pour une meilleure analyse de l'engagement.

## Points d'accès principaux
- **[http://localhost:8080/chat](http://localhost:8080/chat)** : Interface du chat
- **[http://localhost:8080/sendMessage](http://localhost:8080/sendMessage)** : Envoi d'un message et réception d'une citation
- **[http://localhost:8080/discussion](http://localhost:8080/discussion)** : Historique des échanges


---
🚀 **Boostez la motivation de votre équipe avec Chat Motivant !**
