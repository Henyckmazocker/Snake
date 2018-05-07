
public class Main {
	

	static Taulell t = new Taulell();
	Finestra f = new Finestra(t);
	public static Mapa mapa1 = new Mapa();

	public static void main(String[] args) {
		
		
		
	}
	
	private static  void initgfx()
	{
		// background
		t.setActimgbackground(true);
		t.setImgbackground("");
		t.setPAD(0);
		// imagenes
		t.setActimatges(true);
		String[] imatges = { "", "", "", "", "", "i", "",
				"", "", "", "", "", "", "", "", "",
				"", "", "", "", "", "", "", "" };
		t.setImatges(imatges);

	}

	public void view()
	{
		t.dibuixa(mapa1.toIntMatrix());
	}

	
}
