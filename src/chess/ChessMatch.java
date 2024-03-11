package chess;

public class ChessMatch {

	private Integer turn;
	private Color currentPlayer;
	private Boolean check;
	private Boolean checkMate;
	private ChessPiece enPassantVunerable;
	private ChessPiece promoted;

	public ChessMatch(Integer turn, Color currentPlayer, Boolean check, Boolean checkMate,
			ChessPiece enPassantVunerable, ChessPiece promoted) {
		this.turn = turn;
		this.currentPlayer = currentPlayer;
		this.check = check;
		this.checkMate = checkMate;
		this.enPassantVunerable = enPassantVunerable;
		this.promoted = promoted;
	}

	public ChessMatch() {
	}

	public Integer getTurn() {
		return turn;
	}

	public void setTurn(Integer turn) {
		this.turn = turn;
	}

	public Color getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Color currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}

	public Boolean getCheckMate() {
		return checkMate;
	}

	public void setCheckMate(Boolean checkMate) {
		this.checkMate = checkMate;
	}

	public ChessPiece getEnPassantVunerable() {
		return enPassantVunerable;
	}

	public void setEnPassantVunerable(ChessPiece enPassantVunerable) {
		this.enPassantVunerable = enPassantVunerable;
	}

	public ChessPiece getPromoted() {
		return promoted;
	}

	public void setPromoted(ChessPiece promoted) {
		this.promoted = promoted;
	}

	public ChessPiece getPieces() {
		return null;
	}
	
	public boolean possibleMoves(ChessPosition sourcePosition) {
		return true;
	}
	
	public ChessPosition performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		return null;
	}
	
	public ChessPiece replacePromotedPiece(String type) {
		return null;
	}
}