# teslaJsd
Bonjour à tous !
Cette semaine je vous mets à la tête du service informatique de Tesla.
Vous devez déployer à distance la dernière version Beta du logiciel FSD (Full Self Driving) sur les voitures des utilisateurs éligibles au service.

Parmi les plus de 2 millions de possesseurs de Tesla, peu d’entre eux vont en réalité recevoir cette nouvelle version.

Seuls ceux qui répondent aux conditions suivantes sont éligibles:
Être enregistré aux Etats-Unis
Avoir payé pour le service
Être considéré comme un bon conducteur, ce que la voiture elle-même évalue par un score de conduite qui doit être supérieur à 99%

On parle ici de quelques centaines d’utilisateurs, qui vous sont fournis via une List par la méthode getAdmissibleUsers de la classe TeslaUserService.

Comme souvent dans l’industrie du logiciel, les Beta sont accessibles d’abord à une fraction limitée des utilisateurs. Ici, Tesla choisit de déployer la nouvelle version sur les Tesla des 25% des possesseurs éligibles.
Les heureux élus seront ceux dont l’identifiant utilisateur fait partie des premiers 25%.
Or chez Tesla, les identifiants sont les adresses email, ce ne sont pas des numériques.

Créez la classe TeslaUser.
Créez une Mock ou un Stub de la classe TeslaUserService qui retourne une List de 10 TeslaUser
Créez ensuite une ou plusieurs classes qui vont permettre de filtrer cette liste et retourner les X premiers pourcent des utilisateurs, en fonction de leur identifiant.
Testez le bon fonctionnement de vos classes.
