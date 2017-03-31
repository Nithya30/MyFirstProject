package com.study.corejava;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = new int[3][3]; 
		for (int i = 0; i < board.length; i++) { 
			for (int j = 0; j < board[i].length; j++) { 
				board[i][j] = i + j; 
				System.out.println(board[i][j]);
			} 
		}



	}

}
