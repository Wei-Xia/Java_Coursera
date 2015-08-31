public static void sort(int[] a) {
		for (int i = 0; i<a.length-1; i++) {
			int idx = 0;
			for (int j = 1; j<a.length-1; j++) {
				if (a[j]>a[idx]) {
					idx = j;
				}
			}
			int t = a[idx];
			a[idx] = a[a.length-i-1];
			a[a.length-i-1] = t;
		}
	}

public static void main(String[] args) {
		int[]  a = new int[6];
		for (int i =0; i<a.length; i++)
			a[i]=(int)(Math.random()*100);
		for (int k:a) {
		}
}
