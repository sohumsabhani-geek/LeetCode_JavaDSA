import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int ast : asteroids) {
            boolean survived = true;
            
            while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                int diff = ast + stack.peek();
                
                if (diff < 0) {
                    stack.pop();
                    continue; 
                } else if (diff == 0) {
                    stack.pop();
                    survived = false;
                    break;
                } else {
                    survived = false;
                    break;
                }
            }
            
            if (survived) {
                stack.push(ast);
            }
        }
        
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}
