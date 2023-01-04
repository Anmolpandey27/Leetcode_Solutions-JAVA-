class Solution {
  public int nearestExit(char[][] maze, int[] entrance) {
    int y = maze.length - 1, x = maze[0].length - 1; 
    
    LinkedList<int[]> q = new LinkedList<>();
    q.add(entrance);
    for(int step = 0; !q.isEmpty(); step++)
      for(int n = q.size(); n-- != 0;){
          int[] coord = q.pollLast();
          int r = coord[0], c = coord[1]; 
          if(maze[r][c] == '+') continue;
          if( (r == 0 || c == 0 || r == y || c == x) && step != 0) return step;
          maze[r][c] = '+';
          
          if(r != 0 && maze[r-1][c] == '.') q.addFirst(new int[]{r-1, c});
          if(r != y && maze[r+1][c] == '.') q.addFirst(new int[]{r+1, c});
          if(c != 0 && maze[r][c-1] == '.') q.addFirst(new int[]{r, c-1});
          if(c != x && maze[r][c+1] == '.') q.addFirst(new int[]{r, c+1});
        }

    return -1;       
  }
}
