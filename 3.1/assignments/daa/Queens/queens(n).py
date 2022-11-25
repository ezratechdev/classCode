from array import *
SIZE = int(input("Enter the board's col * row : col == row \n"))
def solutionPrint(board):
	for i in range(SIZE):
		for j in range(SIZE):
			print(board[i][j], end = " ")
		print()

def isTheBoardSafe(board, row, col):
	for i in range(col):
		if board[row][i] == 1:
			return False

	for i, j in zip(range(row, -1, -1),
					range(col, -1, -1)):
		if board[i][j] == 1:
			return False

	for i, j in zip(range(row, SIZE, 1),
					range(col, -1, -1)):
		if board[i][j] == 1:
			return False
	return True

def solveNQUtil(board, column):
	if column >= SIZE:
		return True
	for i in range(SIZE):

		if isTheBoardSafe(board, i, column):
			board[i][column] = 1
			if solveNQUtil(board, column + 1) == True:
				return True
			board[i][column] = 0

	return False

def solveForNQ():
	# the board is initially empty
	initial_board = []
	# loop through the array and generate the board
	for i in range(SIZE):
		temp = []
		for w in range(SIZE):
			temp.insert(w, 0)
			initial_board.insert(i, temp)

	if solveNQUtil(initial_board, 0) == False:
		print ("The solution does not exist")
		return False

	solutionPrint(initial_board)
	return True

solveForNQ()
