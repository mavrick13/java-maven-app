# initialize a 2 dimentional array and intitaize every element of it as an empty it can using "_"
import random


class Tic_tac_toe():
    def __init__(self) -> None:
        self.board = []

    def create_board(self):
        for i in range(3):
            row = []
            for j in range(3):
                row.append('_')
            self.board.append(row)

    def get_random_first_player(self):
        return random.randint(0, 1)
