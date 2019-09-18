class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class LeetCode {
	public static void main(String[] args){
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		merge(nums1,m,nums2,n);
		for (int tmp : nums1) {
			System.out.print(tmp + " ");
		}
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = n + m - 1;
		m--;
		n--;
		
		while (n >= 0 && m >= 0) {
			nums1[index--] = nums2[n] > nums1[m] ? nums2[n--] : nums1[m--];
		}
		while (n >= 0) {
			nums1[index--] = nums2[n--];
		}
	}
	
}