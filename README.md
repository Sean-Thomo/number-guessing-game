# Number Guessing Game

[PROJECT URL](https://roadmap.sh/projects/number-guessing-game)

A simple Command Line Interface (CLI) game where players guess a randomly selected number between 1 and 100. The game offers different difficulty levels that determine the number of attempts allowed.

## Features

- **Welcome Message:** Displays a welcome message along with the rules of the game when it starts.
- **Random Number Selection:** The computer randomly selects a number between 1 and 100.
- **Difficulty Levels:** Users can choose from three difficulty levels:
   - Easy (10 chances)
   - Medium (5 chances)
   - Hard (3 chances)
- **User Input:** Players can enter their guesses.
- **Feedback on Guesses:** The game provides feedback on whether the guess is correct, greater, or less than the selected number.
- **Game End Conditions:** The game ends when the user guesses the correct number or runs out of chances.


## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Installation

1. **Clone the Repository:**

   ```bash
   git clone git@github.com:Sean-Thomo/number-guessing-game.git
   cd number-guessing-game
   ```

### Install packages:

```bash
mvn install
```

### Run application:

```bash
mvn exec:java -Dexec.mainClass="com.numberguessinggame.Main"
```

### Usage
To start playing the game, simply run the application. Follow the on-screen prompts to select your difficulty level and make guesses.
```bash
$ mvn exec:java -Dexec.mainClass="com.numberguessinggame.Main"
```

### Game Properties
Each game session includes:
- **randomNumber**: A randomly selected number between 1 and 100.
- **difficultyLevel**: The chosen difficulty level which determines the number of allowed attempts.
- **attempts**: The number of attempts made by the user to guess the correct number.
