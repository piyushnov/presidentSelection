
public class President {

    public static void main(String[] args){

        System.out.println(whoIsElected(6,4));
        System.out.println(whoIsElected(1,1));
        System.out.println(whoIsElected(2,2));
        System.out.println(whoIsElected(4,2));
        System.out.println(whoIsElected(100,2));
        System.out.println(whoIsElected(5,3));
        System.out.println(whoIsElected(1000,5));

    }

    public static int whoIsElected(int numStudents,int songLength){
        int presidentSelected = 0;
        for (int i = 2; i <= numStudents; i++)
            presidentSelected = (presidentSelected + songLength) % i;

        return presidentSelected+1;
    }
}
