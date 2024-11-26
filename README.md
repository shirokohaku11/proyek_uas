# Rock-Paper-Scissors Game with GUI

A dynamic Rock-Paper-Scissors game built using Java, complete with a graphical user interface (GUI) for a seamless and intuitive gameplay experience. This project was developed as a collaborative assignment.

## Table of Contents
- [Features](#features)
- [Requirements](#requirements)
- [How to Play](#how-to-play)
- [Use Case Description](#use-case-description)
- [Class Design](#class-design)
- [Installation](#installation)
- [Contributors](#contributors)

---

## Features
1. **Dynamic Gameplay**  
   - Play against the computer in every round.  
   - The winner is determined automatically based on standard Rock-Paper-Scissors rules.  

2. **User-Friendly Interface**  
   - GUI-based gameplay with buttons and labels for easy interaction.  
   - Real-time updates of scores and choices.  

3. **Replay Option**  
   - After each round, players can choose to play again.  

4. **Score Tracking**  
   - The system keeps track of both player and computer scores.  

---

## Requirements
- **Programming Language**: Java  
- **JDK Version**: 8 or higher  
- **IDE Recommended**: IntelliJ IDEA, Eclipse, or NetBeans  
- **Library Used**: Java Swing (standard)  

---

## How to Play
1. Run the application.
2. Use the GUI to select either "Rock," "Paper," or "Scissors."
3. The computer will make a random choice.
4. The winner is displayed along with updated scores.
5. After the round, choose whether to play again or exit.

---

## Use Case Description
### 1. Playing the Game
- **Actor**: Player  
- **Precondition**: Program is running, GUI is displayed.  
- **Flow**:  
  1. The player selects Rock, Paper, or Scissors.  
  2. The computer makes a random choice.  
  3. The system determines the winner and updates the scores.  
  4. The results are displayed in the GUI.  

### 2. Replay Game
- **Actor**: Player  
- **Precondition**: A round has been completed.  
- **Flow**:  
  1. The player chooses to replay from the dialog prompt.  
  2. The GUI resets for a new round.  

---

## Class Design
### 1. `RockPaperScissor` Class
- **Purpose**: Manages the game logic and determines the outcome based on player and computer choices.  
- **Attributes**:  
  - `String[] computerChoices` (Options: Rock, Paper, Scissors)  
  - `String computerChoice` (Current round's computer choice)  
  - `int computerScore` (Computer's total score)  
  - `int playerScore` (Player's total score)  

### 2. `RockPaperScissorGUI` Class
- **Purpose**: Provides the graphical user interface for user interaction.  
- **Components**: Buttons (Rock, Paper, Scissors), Score Labels, Result Dialog.  

### 3. `App` Class
- **Purpose**: Launches the application and initializes the GUI.  

---

## Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/shirokohaku11/proyek_uas.git
