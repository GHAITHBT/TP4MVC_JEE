package modele;

public class clientbean {
	private String nom;
		private String prenom;
		private String adrliv;
		private String tel;
		private String email ;
		public clientbean(String nom, String prenom, String adrliv, String tel, String email) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.adrliv = adrliv;
			this.tel = tel;
			this.email = email;
		}
		public String getAdrliv() {
			return adrliv;
		}
		public void setAdrliv(String adrliv) {
			this.adrliv = adrliv;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		
		

	}

