public class TwiceAsOld{

    public static int TwiceAsOld(int dadYears, int sonYears){
        int finnalyVariable = 0;
        int sonYearsWhenHeWasBorn = 0;
        int dadYearsWhenSonWasBorn = dadYears - sonYears;
        while(!(dadYearsWhenSonWasBorn / 2 == sonYearsWhenHeWasBorn)){
            sonYearsWhenHeWasBorn++;
            dadYearsWhenSonWasBorn++;

        }
        if(dadYearsWhenSonWasBorn > dadYears){
            finnalyVariable = dadYearsWhenSonWasBorn - dadYears;
        } 
        else if(dadYearsWhenSonWasBorn < dadYears){
            finnalyVariable = dadYears - dadYearsWhenSonWasBorn;
        }
        return finnalyVariable;
    }

}
