package arrays;

public class CellReachable2849L {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {

        int my = Math.abs(fy-sy);
        int mx = Math.abs(fx-sx);
        int min_time = Math.max(my, mx);
        int max_time= my+mx;
        if(my==0 && mx==0 && (t>1|| t==0)){
            return true;
        }
        if(fx==sx && fy==sy){
            return false;
        }
        if (t>=min_time && (t>=max_time ||(t<max_time) )){
            // if(fy==sy && fx==sx){
            // return false;
            // }
            return true;
        }
        return false;
    }
}
