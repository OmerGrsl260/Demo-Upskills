# 🚀 Tests Automatisés UpSkills

<div align="center">

![Java](https://img.shields.io/badge/Java-17-red)
![Maven](https://img.shields.io/badge/Maven-3.6+-blue)
![Selenium](https://img.shields.io/badge/Selenium-4.28.1-green)
![Cucumber](https://img.shields.io/badge/Cucumber-7.15.0-brightgreen)
![Allure](https://img.shields.io/badge/Allure-2.24.0-orange)

</div>

## 📋 Description

Ce projet contient les tests automatisés pour le site [upskills.fr](https://upskills.fr) utilisant les technologies suivantes :
- 🎯 Selenium WebDriver pour l'automatisation
- 🥒 Cucumber pour les tests BDD
- 📊 Allure Reports pour les rapports de test
- 🏗️ Page Object Model pour une meilleure maintenance

## 🛠️ Prérequis

- Java 17 ou supérieur
- Maven 3.6 ou supérieur
- Chrome ou Firefox (selon la configuration)

## 📁 Structure du Projet

```
src/
├── test/
│   ├── java/
│   │   └── fr/
│   │       └── upskills/
│   │           ├── config/      # Configuration du WebDriver
│   │           ├── pages/       # Page Objects
│   │           ├── runners/     # Runners Cucumber
│   │           ├── stepdefs/    # Définitions des étapes
│   │           └── utils/       # Utilitaires communs
│   └── resources/
│       ├── config.properties    # Configuration globale
│       └── features/           # Scénarios Cucumber
```

## 🚀 Installation

1. Cloner le repository :
```bash
git clone [URL_DU_REPO]
```

2. Installer les dépendances :
```bash
mvn clean install
```

## 🧪 Exécution des Tests

Pour exécuter les tests :
```bash
mvn clean test
```

## 📊 Génération des Rapports

Pour générer les rapports Allure :
```bash
mvn allure:report
```

Pour voir les rapports Allure :
```bash
mvn allure:serve
```

## ⚙️ Configuration

Les paramètres de configuration se trouvent dans `src/test/resources/config.properties` :
- 🌐 `base.url` : URL du site
- 🌍 `browser` : Navigateur à utiliser (chrome/firefox)
- ⏱️ `implicit.wait` : Temps d'attente implicite en secondes
- ⏰ `explicit.wait` : Temps d'attente explicite en secondes

## 🔍 Fonctionnalités Testées

- Navigation vers la section Cadres & Experts
- Navigation vers la page Contact
- Gestion des cookies et des popups publicitaires

## 🤝 Contribution

Les contributions sont les bienvenues ! N'hésitez pas à :
1. Fork le projet
2. Créer une branche pour votre fonctionnalité
3. Commiter vos changements
4. Pousser vers la branche
5. Ouvrir une Pull Request

## 📝 Licence

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.

## 👥 Auteurs

- [Votre Nom](https://github.com/votre-username)

---
<div align="center">
Made with ❤️ for UpSkills
</div> 