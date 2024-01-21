### Online Quiz Application Documentation

#### 1. Overview

The Online Quiz Application is a console-based quiz program written in Java. It facilitates a user to participate in a quiz by answering a set of multiple-choice questions. The application is structured using object-oriented principles, with classes representing individual questions (`Question`) and the quiz itself (`Quiz`).

#### 2. Design

##### 2.1. `Question` Class

The `Question` class encapsulates the properties and behaviors of a quiz question.

- **Properties:**
  - `questionText`: String - The text of the question.
  - `options`: List<String> - A list of answer options.
  - `correctAnswer`: int - Index of the correct answer in the options list.

- **Methods:**
  - `getQuestionText()`: Returns the question text.
  - `getOptions()`: Returns the list of answer options.
  - `getCorrectAnswer()`: Returns the index of the correct answer.

##### 2.2. `Quiz` Class

The `Quiz` class manages a set of questions and the quiz-taking process.

- **Properties:**
  - `questions`: List<Question> - List of quiz questions.
  - `userScore`: int - User's score during the quiz.

- **Methods:**
  - `startQuiz()`: Initiates the quiz, presents questions to the user, collects answers, and calculates the final score.

#### 3. Features

- **Questionnaire:**
  - Users can answer a predefined set of questions.
  - Each question has multiple-choice options, and users select the correct one.

- **Scoring:**
  - The application keeps track of the user's score.
  - Users gain a point for each correct answer.

- **Immediate Feedback:**
  - After each question, the application provides immediate feedback on the correctness of the user's answer.
  - In case of an incorrect answer, the correct answer is displayed.

- **Input Validation:**
  - Input validation is implemented to handle potential user input errors, ensuring valid numeric responses within the specified range.

- **Final Score Display:**
  - At the end of the quiz, the user receives a summary of their performance, including the total score and the percentage of correct answers.

#### 4. Usage

1. **Compile and Run:**
   - Compile the `OnlineQuizApplication` class.
   - Run the compiled program.

2. **Answer Questions:**
   - Users respond to each question by entering the corresponding number for the selected option.

3. **Feedback and Score:**
   - Immediate feedback is provided after each question.
   - The final score is displayed at the end of the quiz.

#### 5. Future Enhancements

Potential enhancements for future versions of the application could include:

- Support for different question types (e.g., true/false, fill in the blanks).
- A graphical user interface (GUI) for a more interactive experience.
- Integration with a database to dynamically fetch and store questions.

### Conclusion

This documentation provides an overview of the design and features of the Online Quiz Application. It is intended to help users understand how to use the application and serve as a foundation for potential enhancements or modifications.
