package td2_collection;

public class Main {
	 public static void main(String[] args) {
		 Article article1 = new Article("Article1", 10.0);
	        Article article2 = new Article("Article2", 15.0);

	        Stock stock = new Stock();
	        stock.addNouvArticle(article1, 50);
	        stock.addNouvArticle(article2, 30);

	        System.out.println("Stock avant vente :");
	        stock.sortStock();

	      
	        Facture facture = new Facture(stock);

	    
	        facture.addLigne(5, "Article1");
	        facture.addLigne(2, "Article2");
	        System.out.println("Montant total de la facture : " + facture.getMontantTotal());

	        System.out.println("Stock après vente :");
	        stock.sortStock();
		}
	
	
	
	
}
