# Tests Automatisés UpSkills

Ce projet contient les tests automatisés pour le site upskills.fr utilisant Selenium WebDriver, Cucumber et Allure Reports.

## Prérequis

- Java 11 ou supérieur
- Maven 3.6 ou supérieur
- Chrome ou Firefox (selon la configuration)

## Structure du Projet

```
src/
├── test/
│   ├── java/
│   │   └── fr/
│   │       └── upskills/
│   │           ├── config/
│   │           ├── pages/
│   │           ├── runners/
│   │           ├── stepdefs/
│   │           └── utils/
│   └── resources/
│       ├── config.properties
│       └── features/
```

## Installation

1. Cloner le repository :
```bash
git clone [URL_DU_REPO]
```

2. Installer les dépendances :
```bash
mvn clean install
```

## Exécution des Tests

Pour exécuter les tests :
```bash
mvn clean test
```

## Génération des Rapports

Pour générer les rapports Allure :
```bash
mvn allure:report
```

Pour voir les rapports Allure :
```bash
mvn allure:serve
```

## Configuration

Les paramètres de configuration se trouvent dans `src/test/resources/config.properties` :
- `base.url` : URL du site
- `browser` : Navigateur à utiliser (chrome/firefox)
- `implicit.wait` : Temps d'attente implicite en secondes
- `explicit.wait` : Temps d'attente explicite en secondes 