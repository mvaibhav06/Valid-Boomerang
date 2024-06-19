class Solution {
    public boolean isBoomerang(int[][] points) {
        if((points[0][0]==points[1][0] && points[0][1]==points[1][1]) || (points[0][0]==points[2][0] && points[0][1]==points[2][1]) || (points[2][0]==points[1][0] && points[2][1]==points[1][1])){
            return false;
        }

        if(points[0][0]==points[1][0] && points[1][0]==points[2][0]){
            return false;
        }

        if(points[0][1]==points[1][1] && points[1][1]==points[2][1]){
            return false;
        }

        int x = points[1][0]-points[0][0];
        double m = (points[1][1]-points[0][1]);
        if(x != 0){
            m = (double)m/x;
        }else{
            m = 0;
        }


        int x1 = points[2][0]-points[0][0];
        double m1 = (points[2][1]-points[0][1]);
        if(x1 != 0){
            m1 = (double)m1/x1;
        }else{
            m1 = 0;
        }

        int x2 = points[2][0]-points[1][0];
        double m2 = (points[2][1]-points[1][1]);
        if(x != 0){
            m2 = (double)m2/x2;
        }else{
            m2 = 0;
        }

        if((x==0 && (x1!=0 || x2!=0)) || (x1==0 && (x!=0 || x2!=0)) || (x2==0 && (x1!=0 || x!=0))){
            return true;
        }

        if(m==m2 && m2==m1){
            return false;
        }else{
            return true;
        }
        
    }
}
