class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closest_x = Math.max(x1, Math.min(xCenter, x2));
        int closest_y = Math.max(y1, Math.min(yCenter, y2));
        int distance_x = xCenter - closest_x;
        int distance_y = yCenter - closest_y;
        return (Math.pow(distance_x,2) + Math.pow(distance_y, 2)) <= Math.pow(radius, 2);
    }
}



        