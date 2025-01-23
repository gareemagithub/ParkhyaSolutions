package Projects.SnakeGame;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class SnakeGameConsole {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 10;
    private static final char EMPTY = '.';
    private static final char SNAKE_BODY = 'O';
    private static final char SNAKE_HEAD = 'H';
    private static final char APPLE = 'A';
    
    private static LinkedList<int[]> snake;
    private static int[] apple;
    private static boolean gameOver = false;
    private static char direction = 'R'; // R = Right, L = Left, U = Up, D = Down
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        snake = new LinkedList<>();
        snake.add(new int[] { HEIGHT / 2, WIDTH / 2 }); // Start snake at the center
        spawnApple(); // Spawn the first apple
        
        while (!gameOver) {
            printBoard();
            System.out.println("Use WASD to move (W=Up, A=Left, S=Down, D=Right)");
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("W") || input.equals("A") || input.equals("S") || input.equals("D")) {
                direction = input.charAt(0);
            }
            updateGame();
            try {
                Thread.sleep(200); // Control the speed of the game
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Game Over! Your score: " + (snake.size() - 1));
        scanner.close();
    }

    private static void printBoard() {
        // Create the game board and print it
        char[][] board = new char[HEIGHT][WIDTH];
        
        // Fill the board with empty spaces
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                board[i][j] = EMPTY;
            }
        }

        // Place the snake on the board
        for (int i = 0; i < snake.size(); i++) {
            int[] segment = snake.get(i);
            if (i == 0) {
                board[segment[0]][segment[1]] = SNAKE_HEAD; // Snake head
            } else {
                board[segment[0]][segment[1]] = SNAKE_BODY; // Snake body
            }
        }

        // Place the apple on the board
        board[apple[0]][apple[1]] = APPLE;
        
        // Print the game board
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void updateGame() {
        int[] head = snake.getFirst();
        int[] newHead = new int[2];
        
        // Move the head of the snake based on the direction
        switch (direction) {
            case 'W': newHead[0] = head[0] - 1; newHead[1] = head[1]; break; // Up
            case 'S': newHead[0] = head[0] + 1; newHead[1] = head[1]; break; // Down
            case 'A': newHead[0] = head[0]; newHead[1] = head[1] - 1; break; // Left
            case 'D': newHead[0] = head[0]; newHead[1] = head[1] + 1; break; // Right
        }
        
        // Check if the new head collides with the wall or itself
        if (newHead[0] < 0 || newHead[0] >= HEIGHT || newHead[1] < 0 || newHead[1] >= WIDTH || isSnake(newHead)) {
            gameOver = true;
            return;
        }
        
        // Add new head to the front of the snake
        snake.addFirst(newHead);
        
        // Check if the snake eats the apple
        if (newHead[0] == apple[0] && newHead[1] == apple[1]) {
            spawnApple(); // Spawn a new apple
        } else {
            snake.removeLast(); // Remove the tail if no apple is eaten
        }
    }

    private static boolean isSnake(int[] segment) {
        for (int[] s : snake) {
            if (s[0] == segment[0] && s[1] == segment[1]) {
                return true;
            }
        }
        return false;
    }

    private static void spawnApple() {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(HEIGHT);
            int y = random.nextInt(WIDTH);
            int[] appleCandidate = new int[] { x, y };
            if (!isSnake(appleCandidate)) {
                apple = appleCandidate;
                break;
            }
        }
    }
}
