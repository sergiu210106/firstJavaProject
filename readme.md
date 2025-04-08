# First Java Project

This repository contains two simple Java programs that serve as learning resources for beginners:

- **Calculator.java**: A command-line calculator that supports basic arithmetic operations.
- **HelloWorld.java**: A simple program that prints "Hello World!" to the console.

## Calculator

### Description

The `Calculator` program is a command-line based simple calculator. It allows the user to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The program runs in a loop, allowing multiple calculations in one session. It also includes error handling to prevent operations like division by zero.

### Features

- **Basic Arithmetic Operations**: Supports `+`, `-`, `*`, and `/`.
- **User Interaction**: Prompts the user to continue or exit.
- **Error Handling**: Displays an error message in case of division by zero or invalid operator input.

### How to Run

1. **Compile the Calculator Program**:
   ```bash
   javac Calculator.java
   ```
2. **Run the Program**:
   ```bash
   java Calculator
   ```
3. **Usage**:
   - You'll be prompted to enter `1` to continue or `0` to stop the program.
   - When continuing, enter the first number, choose an operator (`+`, `-`, `*`, or `/`), and then enter the second number.
   - The result of the calculation will be displayed immediately. If an error occurs (like division by zero), an error message is shown.

## HelloWorld

### Description

The `HelloWorld` program is a classic Java starter program that demonstrates basic syntax by simply printing "Hello World!" to the console.

### How to Run

1. **Compile the HelloWorld Program**:
   ```bash
   javac HelloWorld.java
   ```
2. **Run the Program**:
   ```bash
   java HelloWorld
   ```
3. **Usage**:
   - The program outputs "Hello World!" to the console upon execution.

## Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK installed (Java 8 or later is recommended).
- **Command Line Interface**: Access to a terminal (Command Prompt, PowerShell, Terminal, etc.) for compiling and running Java programs.

## Repository Structure

```
firstJavaProject/
├── Calculator.class
├── HelloWorld.class
├── Calculator.java   // Source code for the Calculator program
├── HelloWorld.java   // Source code for the HelloWorld program
└── README.md         // This file
```

## Contributing

Contributions are welcome! Feel free to fork this repository and submit pull requests. If you encounter any issues or have suggestions for improvements, please [open an issue](https://github.com/sergiu210106/firstJavaProject/issues).

## License

This project is open source and available under the [MIT License](LICENSE).
