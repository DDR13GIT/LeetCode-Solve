class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                res.push(asteroids[i]);
            } else {
                while (!res.isEmpty() && res.peek() > 0) {
                    if (Math.abs(asteroids[i]) > res.peek()) {
                        res.pop();
                    } else if (Math.abs(asteroids[i]) == res.peek()) {
                        res.pop();
                        asteroids[i] = 0;
                        break;
                    } else {
                        asteroids[i] = 0;
                        break;
                    }
                }
                if (asteroids[i] != 0) {
                    res.push(asteroids[i]);
                }
            }
        }
        int[] result = new int[res.size()];
        for (int i = res.size() - 1; i >= 0; i--) {
            result[i] = res.pop();
        }
        return result;

    }
}