public interface IHinnoittelija {
	float getAlennusProsentti(Asiakas asiakas, Tuote tuote);

	void aloita();

	void setAlennusProsentti(Asiakas asiakas, float v);

	void lopeta();
}
