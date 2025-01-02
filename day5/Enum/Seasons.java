package Day5;
enum Season {
    Winter {
        public int getAvgTemperature() {
            return 5;
        }
    },
    Spring {
        public int getAvgTemperature() {
            return 13;
        }
    },
    Fall {
         public int getAvgTemperature(){
             return 8;
         }
    },
    Summer{
        public int getAvgTemperature(){
            return 35;
        }
    };
    public abstract int getAvgTemperature();
}
public class Seasons {
    public static void main(String args[]){
        for(Season s:Season.values()){
            System.out.println(s+" average temperature "+s.getAvgTemperature());
        }
    }
}
