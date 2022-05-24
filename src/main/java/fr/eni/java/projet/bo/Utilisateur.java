package fr.eni.java.projet.bo;

public class Utilisateur {
//déclaration variables:
	private int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private int telephone;
	private String rue;
	private int codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private String administrateur;

//Getters&setters:
	public int getNoUtilisateur() {
		return this.noUtilisateur;
	}
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	
	public String getPseudo() {
		return this.pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelephone() {
		return this.telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	public String getRue() {
		return this.rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}


	public int getCodePostal() {
		return this.codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return this.ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getMotDePasse() {
		return this.motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public int getCredit() {
		return this.credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	

// constructeur sans paramètres:
	public Utilisateur() {
	}
	
//constructeur:
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone,
			String rue, int codePostal, String ville, String motDePasse, int credit, String administrateur) {
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}


	public String getAdministrateur() {
		return this.administrateur;
	}


	public void setAdministrateur(String administrateur) {
		this.administrateur = administrateur;
	}

}