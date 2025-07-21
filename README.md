# 🗃️ # ⚠️ 1.2 - Collections & Sorting

A complete set of exercises focused on mastering Java collections and sorting techniques.  
This project demonstrates how to use `ArrayList`, `HashSet`, `HashMap`, and file I/O with sorting, ordering, and iteration patterns, applying Java's utility classes like `Iterator`, `ListIterator`, and `Comparator`.

---

## 📄 Description – Exercise Statement

This repository contains the full solution for Sprint 1 - Collections & Sorting of the Java programming track.  
The sprint is divided into three levels, each focusing on increasingly advanced handling of Java collections, iteration techniques, file parsing, and sorting logic using lambdas and comparators.

---

## 💥 Level 1

### ✅ Exercise 1
- Create a class `Month` with an attribute `name`.
- Add 11 `Month` objects to an `ArrayList`, omitting "Agost".
- Insert "Agost" at the correct index and ensure the list maintains correct order.
- Convert the `ArrayList` into a `HashSet` and demonstrate it doesn't allow duplicates.
- Iterate over the list using a standard `for` loop and an `Iterator`.

### ✅ Exercise 2
- Create and populate a `List<Integer>`.
- Create a second `List<Integer>` and insert elements from the first list in reverse order.
- Use a `ListIterator` to read from the first list and insert into the second.

### ✅ Exercise 3
- Read from the file `countries.txt` containing country-capital pairs.
- Store them in a `HashMap<String, String>`.
- Prompt the user for their name.
- Randomly display 10 countries and ask the user to input their capitals.
- Score the user for each correct answer.
- Save the user’s name and score to `classificacio.txt`.

---

## 🎯 Level 2

### ✅ Exercise 1
- Create a class `Restaurant` with `name` (String) and `rating` (int).
- Add logic to prevent inserting duplicate restaurants (same name and rating) into a `HashSet`.

### ✅ Exercise 2
- Sort `Restaurant` objects first by name, then by descending rating.

---


## 🎟️ Level 3

### ✅ Exercise 1
- Read a CSV file with entries: `name`, `surname`, `DNI`.
- Store them in a list of `Person` objects.
- Allow sorting by name, surname, or DNI in ascending or descending order using a menu.

#### 📋 Menu Example:
1.- Add new person
2.- Show people sorted by name (A-Z)
3.- Show people sorted by name (Z-A)
4.- Show people sorted by surname (A-Z)
5.- Show people sorted by surname (Z-A)
6.- Show people sorted by DNI (1-9)
7.- Show people sorted by DNI (9-1)
0.- Exit


#### 📄 Output Example:
Name    Surname     DNI
Andreu  Ballestero  34835767J
Miquel  Bayona      48743957B
Guillem Capdevila   33957834J
Albert  Carbonell   77364986R
Ferran  Casas       23047848P
Maria   Casellas    47102244S
Genis   Ciutat      39718459N

---

## 💻 Technologies Used

- Java (SDK 17+)
- IntelliJ IDEA 
- No external dependencies or frameworks

---

## 📋 Requirements

Before running this project, make sure you have:

- ✅ Java SDK 17 or later (developed using SDK 23)
- ✅ IntelliJ IDEA or Eclipse (for easy development)
- ✅ Git (optional, for cloning the repository)

---

## 🛠️ Installation

To run this project, clone the repository locally. If you don't, you may not open it properly in IntelliJ IDEA.

```bash
# Clone this repository
git clone https://github.com/maarselo/1.2-CollectionsSorting.git
```
# Navigate into the project directory
cd 1.2-CollectionsSorting/

## 📥 Cloning and Opening in IntelliJ IDEA
Open IntelliJ IDEA.

On the welcome screen, click "Get from Version Control".

Paste the URL:
https://github.com/maarselo/1.2-CollectionsSorting.git

Choose a folder where the project will be saved.

Click Clone.

If already cloned, just select Open and choose the local folder.

## ▶️ Running the Project
Open the class that contains the main() method of the desired exercise.

Press the green ▶️ Run button or press Shift + F10.

IntelliJ may ask you to sync or import — confirm it.

Each level or exercise runs independently.

## 🌐 Deployment
This project is intended for local development and learning purposes only.
In the future, it could be enhanced with GUI or web interface for a more user-friendly experience.

## 🤝 Contributions
Contributions are welcome! If you’d like to collaborate:
```bash
# Fork this repository

# Create a new branch
git checkout -b feature/YourFeatureName

# Make your changes and commit
git commit -m "Add: Your meaningful commit message"

# Push your branch to your fork
git push origin feature/YourFeatureName
```
Then, open a pull request with a clear description of your changes.
