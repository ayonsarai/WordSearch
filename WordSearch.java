// Programer: Sarai Ayon
// Class: CS&141 F2P
// Date: 
// Assignment: 
// Reference Materials: 
// Purpose: 


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordSearch {
    // Define the size of the grid
    private static final int GRID_SIZE = 24;

    // Define the maximum number of words the user can input
    private static final int MAX_WORDS = 5;

    public static void main(String[] args) {
        // Define the list of words
        List<String> words = new ArrayList<>();

        // Get the words from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < MAX_WORDS; i++) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

        // Define the grid
        char[][] grid = new char[GRID_SIZE][GRID_SIZE];

        // Initialize the grid with spaces
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = ' ';
            }
        }

        // Place the words in the grid
        Random random = new Random();
        for (String word : words) {
            // Choose a random starting position and direction
            int x = random.nextInt(GRID_SIZE);
            int y = random.nextInt(GRID_SIZE);
            int dx = random.nextInt(3) - 1;
            int dy = random.nextInt(3) - 1;

            // Check if the word fits in the grid
            boolean fits = true;
            int len = word.length();
            if (x + dx * len < 0 || x + dx * len >= GRID_SIZE || y + dy * len < 0 || y + dy * len >= GRID_SIZE) {
                fits = false;
            } else {
                // Check if the word overlaps with another word
                for (int i = 0; i < len; i++) {
                    if (grid[y + dy * i][x + dx * i] != ' ' && grid[y + dy * i][x + dx * i] != word.charAt(i)) {
                        fits = false;
                        break;
                    }
                }
            }

            // Place the word in the grid
            if (fits) {
                for (int i = 0; i < len; i++) {
                    grid[y + dy * i][x + dx * i] = word.charAt(i);
                }
            }
        }

        // Print the grid
        for (char[] row : grid) {
            System.out.println(new String(row));
        }
    }
}
    // Define the size of the grid
    private static final int GRID_SIZE = 24;

    // Define the maximum number of words the user can input
    private static final int MAX_WORDS = 5;

    public static void main(String[] args) {
        // Define the list of words
        List<String> words = new ArrayList<>();

        // Get the words from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < MAX_WORDS; i++) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

        // Define the grid
        char[][] grid = new char[GRID_SIZE][GRID_SIZE];

        // Initialize the grid with spaces
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = ' ';
            }
        }

        // Place the words in the grid
        Random random = new Random();
        for (String word : words) {
            // Choose a random starting position and direction
            int x = random.nextInt(GRID_SIZE);
            int y = random.nextInt(GRID_SIZE);
            int dx = random.nextInt(3) - 1;
            int dy = random.nextInt(3) - 1;

            // Check if the word fits in the grid
            boolean fits = true;
            int len = word.length();
            if (x + dx * len < 0 || x + dx * len >= GRID_SIZE || y + dy * len < 0 || y + dy * len >= GRID_SIZE) {
                fits = false;
            } else {
                // Check if the word overlaps with another word
                for (int i = 0; i < len; i++) {
                    if (grid[y + dy * i][x + dx * i] != ' ' && grid[y + dy * i][x + dx * i] != word.charAt(i)) {
                        fits = false;
                        break;
                    }
                }
            }

            // Place the word in the grid
            if (fits) {
                for (int i = 0; i < len; i++) {
                    grid[y + dy * i][x + dx * i] = word.charAt(i);
                }
            }
        }

        // Print the grid
        for (char[] row : grid) {
            System.out.println(new String(row));
        }
    }
}
    if x + dx * len(word) < 0 or x + dx * len(word) >= GRID_SIZE or y + dy * len(word) < 0 or y + dy * len(word) >= GRID_SIZE:
        continue
    
    # Check if the word overlaps with another word
    overlap = False
    for i in range(len(word)):
        if grid[y + dy * i][x + dx * i] != ' ' and grid[y + dy * i][x + dx * i] != word[i]:
            overlap = True
            break
    if overlap:
        continue
    
    # Place the word in the grid
    for i in range(len(word)):
        grid[y + dy * i][x + dx * i] = word[i]

# Print the grid
for row in grid:
    print(' '.join(row))








