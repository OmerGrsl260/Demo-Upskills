Feature: Navigation sur le site UpSkills
  En tant qu'utilisateur
  Je veux pouvoir naviguer sur le site UpSkills
  Afin d'accéder aux différentes sections

  Scenario: Navigation vers la section Cadres & Experts
    Given je suis sur la page d'accueil
    When je clique sur le menu Solutions
    And je clique sur Cadres & Experts
    Then je devrais être sur la page Cadres & Experts

  Scenario: Navigation vers la page Contact
    Given je suis sur la page d'accueil
    When je clique sur le bouton Contact
    Then je devrais être sur la page Contact 