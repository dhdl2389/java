package day8함수;

import java.util.ArrayList;
import java.util.List;

public class maze {

	private static int[][] maze;
	private static int rows;
	private static int cols;
	private static List<int[]> path;

	public static void main(String[] args) {
		maze = new int[][] { { 2, 1, 1, 0, 0 }, { 1, 0, 1, 1, 0 }, { 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 3 } };

		rows = maze.length;
		cols = maze[0].length;
		path = new ArrayList<>();

		if (solveMaze(0, 0)) {
			System.out.println("미로를 해결했습니다!");
			printPath();
		} else {
			System.out.println("미로를 해결할 수 없습니다.");
		}
	}

	private static boolean solveMaze(int x, int y) {
		// 유효한 좌표인지 확인
		if (x < 0 || x >= rows || y < 0 || y >= cols || maze[x][y] == 0) {
			return false;
		}

		// 현재 위치를 경로에 추가
		path.add(new int[] { x, y });

		// 도착 지점인지 확인
		if (maze[x][y] == 3) {
			return true;
		}

		// 현재 위치를 방문했음을 표시
		maze[x][y] = 0;

		// 상하좌우 이동을 시도
		if (solveMaze(x + 1, y) || solveMaze(x - 1, y) || solveMaze(x, y + 1) || solveMaze(x, y - 1)) {
			return true;
		}

		// 해당 경로가 미로를 해결하는 경로가 아니므로 현재 위치를 경로에서 제거
		path.remove(path.size() - 1);

		return false;
	}

	private static void printPath() {
		System.out.println("찾은 경로:");
		for (int[] point : path) {
			System.out.println("(" + point[0] + ", " + point[1] + ")");
		}
	}
}
