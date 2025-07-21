# 🗃️ 1.3 - Collections & Sorting

A complete set of exercises focused on mastering Java collections and sorting techniques.  
This project demonstrates how to use `ArrayList`, `HashSet`, `HashMap`, and file I/O with sorting, ordering, and iteration patterns, applying Java's utility classes like `Iterator`, `ListIterator`, and `Comparator`.


## 📄 Description – Exercise Statement

This repository contains the full solution for Sprint 1.3 - Collections & Sorting of the Java ITAcademy programming track.  
The sprint is divided into three levels, each focusing on increasingly advanced handling of Java collections, iteration techniques, file parsing, and sorting logic using lambdas and comparators.


## 💥 Level 1

###  Exercise 1
- Create a class `Month` with an attribute `name`.
- Add 11 `Month` objects to an `ArrayList`, omitting "Agost".
- Insert "Agost" at the correct index and ensure the list maintains correct order.
- Convert the `ArrayList` into a `HashSet` and demonstrate it doesn't allow duplicates.
- Iterate over the list using a standard `for` loop and an `Iterator`.

###  Exercise 2
- Create and populate a `List<Integer>`.
- Create a second `List<Integer>` and insert elements from the first list in reverse order.
- Use a `ListIterator` to read from the first list and insert into the second.

###  Exercise 3
- Read from the file `countries.txt` containing country-capital pairs.
- Store them in a `HashMap<String, String>`.
- Prompt the user for their name.
- Randomly display 10 countries and ask the user to input their capitals.
- Score the user for each correct answer.
- Save the user’s name and score to `classificacio.txt`.


## 🎯 Level 2

### · Exercise 1
- Create a class `Restaurant` with `name` (String) and `rating` (int).
- Add logic to prevent inserting duplicate restaurants (same name and rating) into a `HashSet`.

### · Exercise 2
- Sort `Restaurant` objects first by name, then by descending rating.


## 🎟️ Level 3

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


## 💻 Technologies Used

- Java (SDK 17+)
- IntelliJ IDEA 
- No external dependencies or frameworks


## 📋 Requirements
Before running this project, make sure you have:

- Java SDK **17+** or higher (SDK 23 was used during development)
- IntelliJ IDEA or Eclipse (recommended for easier navigation)
- Git (optional, for cloning the repository)


## 🛠️ Installation

To run this project, you **must first clone the repository locally**. Otherwise, you won't be able to open it correctly in IntelliJ IDEA.
To get a local copy of the project:

```bash
# Clone this repository
https://github.com/maarselo/1.3-Collections.git

# Navigate into the project directory
cd 1.3-Collections/
```

### 📥 Cloning and Opening in IntelliJ IDEA

1. Open **IntelliJ IDEA**.
2. On the welcome screen, click **"Clone Repository"** (Get from Version Control).
3. Paste the following URL into the **URL** field:
```bash
git clone https://github.com/maarselo/1.1-InheritancePolymorphism.git
```
4. Choose the folder where the project should be saved.
5. Click **Clone**.

 if you already have it cloned, click on `Open` and select the local copy to open it. 


## ▶️ Running the Project

To run the program:

- Open the class that contains the `main()` method.
- Click the green **Run** button in IntelliJ IDEA, or press **Shift + F10**.
- If IntelliJ prompts you to sync or import dependencies, confirm the action.

Each exercise (level) can be executed independently by running its corresponding main class.  

## 🌐 Deployment

This project is intended to run in a **local development environment** only.  
No production deployment configuration has been defined.

In the future, it could be extended into a GUI or web-based application for a better user experience.

## 🤝 Contributions

Contributions are welcome! If you’d like to collaborate:

1. Fork this repository.
2. Create a new branch:  
 `git checkout -b feature/YourFeatureName`
3. Make your changes and commit them:  
 `git commit -m "Add: Your meaningful commit message"`
4. Push your branch to your fork:  
 `git push origin feature/YourFeatureName`
5. Open a pull request with a clear description of your changes.

Thanks for your interest and support! 🚀
