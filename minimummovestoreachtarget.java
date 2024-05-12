public class minimummovestoreachtarget {
    public int minMoves(int target, int maxDoubles) {
        return countSteps(target, maxDoubles, 0);
    }

    public int countSteps(int target, int maxDoubles, int steps) {
        if (target == 1) {
            return steps;
        }

        if (target % 2 == 0 && maxDoubles > 0)
            return countSteps(target / 2, maxDoubles - 1, steps + 1);
        else if(maxDoubles>0&&target%2!=0)
            return countSteps(target-1,maxDoubles,steps+1);
        else
            return countSteps( 1, maxDoubles, steps + target-1);

    }
}
