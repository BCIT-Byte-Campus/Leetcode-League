class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int current = asteroids[i];
            
            if (current > 0) { 
                stack.push(current); 
            } else { 
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -current)
                    stack.pop();
                
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(current);
                } else if (stack.peek() == -current) {
                    stack.pop(); 
                } else {
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}