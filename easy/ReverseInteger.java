package easy;

public class ReverseInteger {
	public static void main(String[] args) {
		int ans = reverse(34983);
		System.out.println(ans);
	}
	
public static int reverse(int x) {
	int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
        if ((newResult - tail) / 10 != result)
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
    }
public boolean isPalindrome(int x) {
	
	return false;
}
}
