//Exercise 7: You are asked to create an application for registering the details of jobseeker. The requirement is: 
//Username should always end with _job and there should be at least minimum of 8 characters to the left of _job.
//Write a function to validate the same.
//Return true in case the validation is passed. In case of validation failure return false. 
package ExerciseLab6;

public class JobSeeker {
	public static boolean validateChar(int count) {
		if (count >= 8) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		int count = 0;
		String userName = "dharanimekala";
		String job = "_job";
		String jobApp = userName + job;
		System.out.println(jobApp);
		for (int i = 0; i < userName.length(); i++) {
			if (userName.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(validateChar(count));
	}
}
