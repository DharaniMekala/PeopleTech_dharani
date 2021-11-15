package Trees;


	public class TowerOfHanoi {
	    public static void towerHanoi(int disks, char S, char D, char I) {
	        if (disks == 0)
	            return;
	        towerHanoi(disks-1, S, I, D);
	        System.out.println("Move from "+ S +" to "+ D);
	        towerHanoi(disks-1, I, D, S);
	    }
	    public static void main(String[] args) {
	        int disks = 2;
	        towerHanoi(disks, 'S', 'D', 'I');
	    }
	}



