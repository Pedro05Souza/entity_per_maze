# The problem
In this work, we address the challenge presented by the problem *The Maze of Horror II*. This involves a maze divided into subdivisions, where each subdivision is defined as an area isolated from the others. The maze contains different entities, and the main goal is to identify the largest number of entities, as well as their types, present within a single subdivision.

In addition to the formal problem description, a folder containing test cases was provided. These test cases are used to validate the effectiveness and correctness of the proposed solution. The tests cases are available in `CD/` directory



# The maze
The maze provided for the problem is represented in a text file with the `.txt` format. The first line of the file contains the dimensions of the matrix that defines the maze, in the format `rows x columns`. The subsequent lines describe the maze positions, using characters that can be either letters or numbers. The rules for interpreting the maze are as follows:

- **Uppercase letters**: Represent characters in specific positions of the maze.
- **Lowercase letters and numbers**: Represent other elements of the maze, not directly associated with characters.

Each character in the maze can be converted from hexadecimal to binary, and this conversion plays a fundamental role in defining the maze structure:

1. **Bits equal to 1**: Indicate the presence of a wall at that position.
2. **Bits equal to 0**: Indicate free or accessible paths.

![image](https://github.com/user-attachments/assets/02e95460-e7de-44ab-a465-31167b140c41)
