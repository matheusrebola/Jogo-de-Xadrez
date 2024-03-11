package chess;

import boardgame.Position;

public class ChessPosition {

	private Character column;
	private Integer row;

	public ChessPosition(Character column, Integer row) {
		this.column = column;
		this.row = row;
	}

	public ChessPosition() {
	}

	public Character getColumn() {
		return column;
	}

	public void setColumn(Character column) {
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	protected Position toPosition() {
		return null;
	}
	
	protected ChessPosition fromPosition(Position position) {
		return null;
	}

}
