import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mapa {

	Casillas[][] matrix = new Casillas[10][10];
	int x = 0, y = 0;

	public void Map() throws FileNotFoundException {

		try {
			BufferedReader in = new BufferedReader(new FileReader("Mapa.txt"));

			String obj;

			while ((obj = in.readLine()) != null) {

				String[] objs = obj.split(",");

				for (int i = 0; i < objs.length; i++) {
					
					String str = objs[i];
					Object b = str;

					matrix[x][y] = (Casillas) b;
					
					y++;

				}
				x++;
			}
			in.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public int[][] toIntMatrix()
	{
		int[][] imat = new int[10][10];
		
		for(int i = 1; i < 10 - 1; i++)
		{
			for(int j = 1; j < 10 - 1; j++)
			{
				
				try
				{
					
					imat[i][j] = matrix[i][j].getimg();
					
				}
				catch (NullPointerException e)
				{
			
				}
			}
		}
		
		return imat;
	}

}
