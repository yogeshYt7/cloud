package Practice;


	import java.util.Random;

	public class ArrayShuffle {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7};
	        shuffleArray(array);
	        
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void shuffleArray(int[] array) {
	        int n = array.length;
	        Random random = new Random();

	        for (int i = n - 1; i > 0; i--) {
	            int j = random.nextInt(i + 1); // Generate a random index between 0 and i (inclusive)
	            
	            // Swap elements at index i and j
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	}
