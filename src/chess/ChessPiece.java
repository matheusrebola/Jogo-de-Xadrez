package chess;

import boardgame.Position;

public abstract class ChessPiece {

	private Color color;
	private Integer moveCount;

	public ChessPiece(Color color) {
	}

	public ChessPiece(Color color, Integer moveCount) {
		this.color = color;
		this.setMoveCount(moveCount);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Integer getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(Integer moveCount) {
		this.moveCount = moveCount;
	}

	public ChessPosition getChessPosition() {
		return null;
	}

	protected boolean isThereOpponentPiece(Position position) {
		return true;
	}

	protected void increaseMovement() {
	}

	protected void decreaseMovement() {
	}

}
