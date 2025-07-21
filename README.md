# 🗃️ 1.3-Collections
A complete project dedicated to learning and applying Java Collections Framework through practical exercises involving lists, sets, maps, file handling, and custom sorting.

📄 Description - Exercise Statement

This repository contains the full implementation of the third sprint focused on mastering Java collections and their most common use cases. The sprint is divided into three levels:

---

### 📦 Level 1

- **Exercise 1:**  
  Create a `Month` class with a `name` attribute. Store 11 `Month` objects (excluding "August") in an `ArrayList`, then insert "August" at its correct index and verify the list order.  
  Convert the `ArrayList` into a `HashSet` and ensure it does not accept duplicates.  
  Iterate over the list using both a for loop and an `Iterator`.

- **Exercise 2:**  
  Create and populate a `List<Integer>`.  
  Create a second `List<Integer>` and insert elements from the first list in reverse order using a `ListIterator`.

- **Exercise 3:**  
  Read the file `countries.txt`, which contains countries and their capitals. Load the data into a `HashMap<String, String>`.  
  Prompt the user for their name and quiz them with 10 random countries to guess their capitals. Track the score and save the user's name and score to `classificacio.txt`.

---

### 🏨 Level 2

- **Exercise 1:**  
  Create a `Restaurant` class with `name` and `rating` attributes. Implement `equals()` and `hashCode()` to prevent adding duplicates to a `HashSet` (same name & rating).  
  Restaurants with the same name but different ratings are allowed.

- **Exercise 2:**  
  Enhance the `Restaurant` class to implement custom ordering: sort by name (ascending) and rating (descending).  
  Example:
  name: restaurant1, rating: 8
  name: restaurant1, rating: 7
  ---
  ### 👥 Level 3

- **Exercise 1:**  
Build an application capable of reading a CSV file with `name`, `surname`, and `DNI` per line. Load these into a `List<Persona>`.  
Provide a menu to sort and display people by:

1. Name (A-Z)  
2. Name (Z-A)  
3. Surname (A-Z)  
4. Surname (Z-A)  
5. DNI (ascending)  
6. DNI (descending)  
0. Exit

1. 💻 Technologies Used

- Java (SDK 23)
- IntelliJ IDEA
- Java Collections Framework
- File I/O
- No external dependencies

---

📋 Requirements

- Java SDK 17+ (tested with SDK 23)
- IntelliJ IDEA or Eclipse (for better usability)
- Git (for version control)

---

🛠️ Installation

To get a local copy of the project:

```bash
