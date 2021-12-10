package chamorro.edisson.utils;

public class ValidateEmail {

	public static boolean validateEmail(String email) {

		boolean isValidate = false;
		if (email.charAt(email.indexOf("@")) == '@') {
			if (email.indexOf(".") > email.indexOf("@")) {
				isValidate = true;
			}
		} else {
			isValidate = false;
		}
		return isValidate;

	}
}
