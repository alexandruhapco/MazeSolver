package main;

import java.util.Stack;

import model.Cell;
import model.Maze;
import util.ReadFile;
import util.Solver;

public class App {

	public static void main(String[] args) {
		Maze maze = ReadFile.getMaze("input.txt");
	
		Stack<Cell> path = new Stack<>();
		Solver.solve(maze, path);

		maze.draw(path);
		maze.show();

	}

}
