package GameApp;


public class Map {
    String[][] map = new String[][]{
            {".", ".",".", ".",".", ".",".", ".", ".", "."},
            {".", ".",".", ".",".", ".",".", ".", ".", "."},
            {".", ".",".", ".",".", ".",".", ".", ".", "."},
            {".", ".",".", ".",".", ".",".", ".", ".", "."},
            {".", ".",".", ".",".", ".",".", ".", ".", "."},
            {".", ".",".", ".",".", ".",".", ".", ".", "."},
            {".", ".",".", ".",".", ".",".", ".", ".", "."},
            {".", ".",".", ".",".", ".",".", ".", ".", "."},
            {".", ".",".", ".",".", ".",".", ".", ".", "."}
    };
    public String[][] getMap(){
        return map;
    }

    public String[][] updateMap(int x, int y, String str){
        map[x][y] = str;
        return map;
    };

    public boolean checkFreeSpace(int x, int y) {
        if (map[x][y].equalsIgnoreCase(".")){
            return true;
        }
        return false;
    }

    public String returnMapOccupant(int x, int y) {
        return map[x][y];
    }

    public void printMap(){
        int i;
        for(String[] element: map){
            i = 0;
            for(String el: element) {
                System.out.print(el + " ");
                i++;
                if(i == 9){
                    System.out.println();
                    break;
                }
            }
        }
    }
}
