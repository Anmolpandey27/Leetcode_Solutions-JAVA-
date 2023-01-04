class Solution {
    public int findMinDifference(List<String> timePoints) {

        int min = Integer.MAX_VALUE;
        List<Integer> res = new ArrayList<>();
        timePoints.forEach(t -> res.add(convertToMinute(t)));
        Collections.sort(res);
        int n = timePoints.size();
        for (int i = 0; i < n-1; i++) {
            int curDiff = res.get(i+1) - res.get(i);
            if (curDiff < min) {
                min = curDiff;
            }
        }

        min = Math.min(24 * 60 + res.get(0) - res.get(res.size()-1), min);

        return min;
    }

    private int convertToMinute(String time) {
        String hour = time.split(":")[0];
        String minute = time.split(":")[1];

        return Integer.parseInt(hour) * 60 + Integer.parseInt(minute);
    }
}