import java.util.Scanner;

public class prog2 {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str!=null){
            String[] times=str.split(",");
            if(times.length==2){
                String[] startList = times[0].split(":");
                String[] endList = times[1].split(":");
                int startNum=Integer.parseInt(startList[0]);
                int startMin=Integer.parseInt(startList[1]);
                int startSec=Integer.parseInt(startList[2]);
                int endNum=Integer.parseInt(endList[0]);
                int endMin=Integer.parseInt(endList[1]);
                int endSec=Integer.parseInt(endList[2]);
                double startPoint = (startNum*60*0.5)%360.00;
                int firstMin = (int)(startPoint*2/11);
                double firstSec = (startPoint*2/11-firstMin)*60;
                int total=endNum-startNum+1;
                if(firstMin < startMin ||(firstMin==startMin &&  firstSec < startSec)){
                    total-=1;
                }
                double endPoint = (endNum*60*0.5)%360.00;
                int lastMin = (int)(endPoint*2/11);
                double lastSec = (endPoint*2/11-lastMin)*60;
                if(endMin < lastMin ||(endMin==lastMin &&  endSec < lastSec)){
                    total-=1;
                }

                if(startNum <12 && endNum >= 12){
                    total-=1;
                }

                System.out.println(total);
            }
        }
    }
}
