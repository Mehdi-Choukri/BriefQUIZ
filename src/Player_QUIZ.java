import java.util.ArrayList;

public class Player_QUIZ implements InterListe{
	 
	   private int id_Player;  
	   private static int id_quiz;
	   private int nbr_good_choice ;
	   private  String reponseChosen;
	   private boolean goodchoice;
 
	   public static int cpt=0;
	   ArrayList<Player_QUIZ> listePlayer_QUIZ = new ArrayList<Player_QUIZ>();
	   
	   public Player_QUIZ(int idP, String RC )
	   {
		   setId_Player(idP);
		   id_quiz++;
		 
		   setReponseChosen(RC);
		    
		   cpt++;
	
	   }
	    
	   
	    
	   /*
	    
	   public static double calculScore()
	   {
		   boolean trouve=false;
		   double totalReponseCorrectParNiveau =0;
		   //a changer
		   if(cpt==1)
		   {
			   int j=0;
			  

				for(Quiz L : listeQuiz  ){
					 totalReponseCorrectParNiveau =2;
					while(!trouve)
					{
						if(L.getId_quiz() == listePlayer_QUIZ.get(j).getId_quiz())
						{
							if(L.getReponse().equals(listePlayer_QUIZ.get(j).getReponseChosen()))
							{
								totalReponseCorrectParNiveau++;
								trouve=true;
								break;
							}
						}
						else
						{
							j++;
						}
					 
					  }
					}
				cpt=0;
				
				return totalReponseCorrectParNiveau;
			   
		   }
		   return -1;
		   
	   }
	   */
	   
	   // good loop
	   /*
	   List<Dept> d = new ArrayList<Dept>();
	   List<Emp> e = new ArrayLlist<Emp>();
	   public void loop()
		   { int min = Math.min(d.size(), e.size());
		   for(int i = 0; i<min; i++) {
			   System.out.println("---"+e.get(i)+"---"+d.get(i));
			}
	   }
	   */

	public int getId_Player() {
		return id_Player;
	}

	public void setId_Player(int id_Player) {
		this.id_Player = id_Player;
	}

	 

	public int getId_quiz() {
		return id_quiz;
	}

	public void setId_quiz(int id_quiz) {
		Player_QUIZ.id_quiz = id_quiz;
	}

	public int getNbr_good_choice() {
		return nbr_good_choice;
	}

	public void setNbr_good_choice(int nbr_good_choice) {
		this.nbr_good_choice = nbr_good_choice;
	}
	public boolean isGoodchoice() {
		return goodchoice;
	}
	public void setGoodchoice(boolean goodchoice) {
		this.goodchoice = goodchoice;
	}

	public String getReponseChosen() {
		return reponseChosen;
	}

	public void setReponseChosen(String reponseChosen) {
		this.reponseChosen = reponseChosen;
	}

 

	
	   
	  


}
