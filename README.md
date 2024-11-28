# Stock Management System Project

## Overview
This is a Stock Management System application built in Java that helps users manage stock inventory. It allows users to add, update, view, and delete stock items, track quantities, and generate reports for inventory management. The system aims to simplify inventory tracking and ensure efficient stock management.

## Features
- Users can add new stock items to the inventory.
- Users can update stock details such as price, quantity, and item description.
- Users can view all available stock items.
- Users can delete stock items that are no longer needed.
- The system provides a simple text-based interface for interacting with the inventory.

## Class Name
- `StockManagementSystem`: The main class to manage stock-related operations.

## Technologies Used
- **Java**: The programming language used for building the system.
- **Text-based Interface**: The stock management system is implemented as a command-line interface.

## Requirements
- Java 8 or above.
- No external libraries are required.

## Installation
1. Clone this repository to your local machine:
    ```bash
    git clone https://github.com/manishdahake10/StockManagementSystem.git
    ```

2. Navigate to the project directory:
    ```bash
    cd StockManagementSystem
    ```

3. Compile the `StockManagementSystem.java` file:
    ```bash
    javac StockManagementSystem.java
    ```

4. Run the application:
    ```bash
    java StockManagementSystem
    ```

## Usage
Once the program runs, you will be prompted to perform different actions:
- Add a new stock item.
- Update an existing stock item.
- View the current stock inventory.
- Delete an item from the inventory.
- Exit the system.

### Output
```bash
Welcome to the Stock Management System
D:\Project\backEndTech\StockManagmentSystem>javac StockManagementSystem.java

D:\Project\backEndTech\StockManagmentSystem>java StockManagementSystem
1. Add stock
2. Remove stock
3. View stock
4. Exit
Enter your choice: 1
Enter the stock name: DairyMilkSilk
Enter the stock quantity: 50
Enter the stock price: 80
Stock added successfully.
1. Add stock
2. Remove stock
3. View stock
4. Exit
Enter your choice: 3
Current stocks:
DairyMilkSilk, quantity: 50, price: $80.0
1. Add stock
2. Remove stock
3. View stock
4. Exit
Enter your choice: 2
Enter the stock name: DairyMilkSilk
Enter the quantity to remove: 40
Stock removed successfully.
1. Add stock
2. Remove stock
3. View stock
4. Exit
Enter your choice: 4
Exiting the program...
