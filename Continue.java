
public class Continue {

	public static void main(String[] args) {
		int i = 1;
		int n = 5;
		while(i<=n) {
        	if(i==4) {
        		i++;
        		continue;
        	}
//        	i++; loop gets stucked after 4
        	i++;
        	System.out.println(i);
	}

}
}