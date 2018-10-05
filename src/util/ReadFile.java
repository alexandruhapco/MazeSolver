package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Cell;
import model.Maze;

public class ReadFile {

	@SuppressWarnings("resource")
	public static Maze getMaze(String filename) {

		Maze maze = new Maze();

		try {
			Scanner scanner = new Scanner(new File(filename));

			maze.setWidth(scanner.nextInt());
			maze.setHeight(scanner.nextInt());
			maze.setStart(new Cell(scanner.nextInt(), scanner.nextInt()));
			maze.setEnd(new Cell(scanner.nextInt(), scanner.nextInt()));

			String[][] matrix = new String[maze.getHeight()][maze.getWidth()];

			for (int i = 0; i < maze.getHeight(); ++i) {
				for (int j = 0; j < maze.getWidth(); ++j) {
					if (scanner.hasNextInt()) {
						matrix[i][j] = String.valueOf(scanner.nextInt());
					}
				}
			}
			maze.setMaze(matrix);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return maze;

	}

}
