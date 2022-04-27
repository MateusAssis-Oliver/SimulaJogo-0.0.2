import java.util.ArrayList;

public class Campeonato {

    ArrayList<Time> timeList  = new ArrayList<>();
    private String strTimes = "";

    public void addTime(Time time){
        timeList.add(time);
    }

    public void showTimes(){

 
        
        if( timeList.size() == 0 ){

            StdIo.blocoSms("Ainda Não Há Times Cadastrados");
        }else{

            for(Time i : timeList){

                strTimes += timeList.indexOf(i) + " - " + String.join("",i.getNome()) + "\n";
            }

            StdIo.blocoSms(this.strTimes);

        }
        strTimes = " ";
    }
     

     
     

    public void cadastraTime(String nomeTime){

        /* Cria um nivo time passando o nome inserido */
        Time time = new Time(nomeTime);

        /*Adiciona o time no Array  */
        addTime(time);

    }


}
