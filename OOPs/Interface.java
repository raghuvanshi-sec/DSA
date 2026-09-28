package OOPs;
public class Interface {

    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
    }
    
}

//Implenting Interfacae

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("forward 1 step, diagonal 1 step (for attack)");
    }
}

class Knight implements ChessPlayer{
    public void moves(){
        System.out.println("2.5 steps");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("all directions");
    }
}

class Bishop implements ChessPlayer{
    public void moves(){
        System.out.println("diagonal");
    }
}
