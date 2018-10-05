package model;

import java.util.Stack;

public class Maze {

	private int height;
	private int width;

	private String[][] maze;

	private Cell start;
	private Cell end;

	public Maze() {
		super();
	}

	public void draw(Stack<Cell> path) {

		while (!path.isEmpty()) {
			Cell cell = path.pop();
			maze[cell.row][cell.col] = "X";
		}

		for (int i = 0; i < height; ++i) {
			for (int j = 0; j < width; ++j) {
				if (maze[i][j].equals("1")) {
					maze[i][j] = "#";
					continue;
				}
				if (maze[i][j].equals("0")) {
					maze[i][j] = " ";
				}

			}
		}

		maze[start.col][start.row] = "S";
		maze[end.col][end.row] = "E";
	}

	public void show() {
		for (int i = 0; i < height; ++i) {
			for (int j = 0; j < width; ++j) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String[][] getMaze() {
		return maze;
	}

	public void setMaze(String[][] maze) {
		this.maze = maze;
	}

	public Cell getEnd() {
		return new Cell(end.col, end.row);
	}

	public void setEnd(Cell end) {
		this.end = end;
	}

	public Cell getStart() {
		return new Cell(start.col, start.row);
	}

	public void setStart(Cell start) {
		this.start = start;
	}

}
