public class Exam4_1{
	public static void  main(String[] args){
		int score[]={67,23,54,68,543,98,44,1,77,0};
		int age[]={34,44,53,672,13,4,23,45,1,45};
		sort(score);
		print(score);
		System.out.println("\n.......................");
		sort(age);
		print(age);
	}
	public static void sort(int temp[]){
		for(int i=0;i<temp.length-1;i++){
			for(int j=0;j<temp.length-i-1;j++){
				if(temp[j]>temp[j+1]){
					int k=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=k;
				}
			}		
		}
	}
	public static void print(int temp[]){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");	
		}
	}
