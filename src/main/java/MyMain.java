public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        // YOUR CODE HERE
        if(board[row][col]==true){
            return true;
        }
        else{
            return false;
        }
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        for(int i = 0; i < boatLength; i++){
            if(direction.equals("right")){
                board[row][col+i]=true;
            }
            else{
                board[row+i][col] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        boolean is = true;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length - 1; j++){
                if(words[i][j].charAt(0) <= words[i][j+1].charAt(0)&&words[i][j].length() <= words[i][j+1].length()){
                    is = is&&true;
                }
                else{
                    is = is&&false;
                }
            }
        }
        return is;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
