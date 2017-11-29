package com.jr.chess.Pieces;

import com.jr.chess.Const;
import com.jr.chess.Position;

import java.util.List;

public abstract class Piece{

    static int whitePawns = 0;
    static int blackPawns = 0;
    static int whiteBishops = 0;
    static int blackBishops = 0;
    static int whiteKnights = 0;
    static int blackKnights = 0;
    static int whiteRooks = 0;
    static int blackRooks = 0;

    public boolean alive;
    public Position position;
    public int color;

    Piece(int _color){
        alive = true;
        color = _color;

        position = initialPosition();
    }

    abstract Position initialPosition();
    public abstract List<Position> moveXY();
    public abstract List<Position> attackXY();

}
