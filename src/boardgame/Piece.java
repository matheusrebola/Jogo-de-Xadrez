package boardgame;

public class Piece {
	protected Position position;

	public Piece(Position position) {
		this.position = position;
	}

	public Piece() {
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public boolean possibleMoves() {
		return true;
	}

	public boolean possibleMove(Position position) {
		return true;
	}

	public boolean isThereAnyPossibleMove() {
		return true;
	}
}
