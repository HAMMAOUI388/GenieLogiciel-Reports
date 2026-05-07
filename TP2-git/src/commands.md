# TP Git & Node.js — Gestion de versions

## 📌 1. Initialisation du projet

```bash
mkdir mon-projet-node
cd mon-projet-node
git init
npm init -y
```

## 📌 2. Création des fichiers

```bash
echo "# Mon Projet Node" > README.md
echo "node_modules/" > .gitignore
echo "console.log('Hello Node');" > index.js
```

Premier commit

```bash
git add .
git commit -m "Initial commit"
````

## 📌 3. Gestion des branches

```bash
git branch dev
git checkout dev
````

## 📌 4. Fusion (Merge)

```bash

git checkout main
git merge dev
````

## 📌 5. Résolution de conflits

Lors de la fusion de branches (ex: feature), un conflit peut apparaître :

git merge feature

Après résolution manuelle :

git add index.js
git commit -m "Résolution du conflit"

## 📌 6. Rebase

git checkout main
git rebase bugfix

## 📌 7. Cherry-pick

Application d’un commit précis sur une autre branche :

git cherry-pick <commit-id>


## 📌 8. Intégration GitHub

git remote add origin <repo-url>

git push -u origin main

⚠️ Note

La commande npx gitignore node a échoué à cause d’un problème de connexion réseau (DNS GitHub).
Le fichier .gitignore a donc été créé manuellement.

