
public class UpdateTest {

	public static void main(String[] args) {
		System.out.println("---------------");
		BinaryGap ob = new BinaryGap();

		System.out.println(ob.solution(32));
	}

}

class BinaryGap {
	public int solution(int n) {
		int k, max = 0;
		String d = Integer.toBinaryString(n);
		// int num = Integer.parseInt(d);
		int i = 0, f = 1;
		for (i = 0; i < d.length() - 1; i++) {
			k = 0;
			char s = d.charAt(i);
			if (s == '1' && d.charAt(i + 1) == '0') {
				for (int j = i + 1; j < d.length() - 1; j++) {
					if (d.charAt(j) == '1') {

						f = -1;
						break;
					} else if (d.charAt(j) == '0')
						k++;
					if (k > max)
						max = k;
				}
				// else max=0;

			}

//	while(num!=0) {
//		if(num%10==1)
//		{
//			num=num/10;
//			if(num%10==0)
//				c++;
//			if(num)
		}
		if (f == 1)
			return 0;
		else
			return max;
	}
}
