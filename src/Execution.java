import java.util.ArrayList;

public class Execution implements InterListe {
	
	public static void afficherResultat(Quiz q1 )
	{
		 System.out.println(q1.getId_quiz());
		 System.out.println(q1.getId_quiz());
		 System.out.println(q1.getId_quiz());
		 System.out.println(q1.getId_quiz());
		
	}
	
	public static int nbrReponseCorrect(ArrayList<Quiz> q1,ArrayList<Player_QUIZ> pq)
	{
		 int totalReponseCorrectParNiveau =0;
		 int min = Math.min(q1.size(), pq.size());
		 for(int i = 0; i<min; i++) {
			 
			 if(q1.get(i).getId_quiz() == pq.get(i).getId_quiz())
			 {
				 if(q1.get(i).getReponse().equals(pq.get(i).getReponseChosen()))
				 {
					 totalReponseCorrectParNiveau++;
					 break;
					 
				 }
				  
			 }
			 
			}
		 
		 
		 return totalReponseCorrectParNiveau;
	}

	public static void main(String[] args) {
	 
		  ArrayList<Quiz> listeQuiz = new ArrayList<Quiz>();
		  ArrayList<Player_QUIZ> listePlayer_QUIZ = new ArrayList<Player_QUIZ>();
		Quiz Q1 = new Quiz("JAVA est un langage ","Compilé et interpreté","Compilé","Interprété","Compilé et interpreté");
		 
		listeQuiz.add(Q1);
		Player_QUIZ PQ1 = new Player_QUIZ(1,"Compilé et interpreté");
		listePlayer_QUIZ.add(PQ1);
		afficherResultat(Q1);
		
		System.out.println(nbrReponseCorrect(listeQuiz,listePlayer_QUIZ));
		
	 

	}

}
