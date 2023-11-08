public class VerificationPassword {
    public boolean isPasswordValide(String password) {
        if (password.length() < ConstantesPassword.MIN_PASSWORD_LONG) {
            return false;
        }
        var nbSpecialChars = 0;
        for (int i = 0; i < password.length(); i++) {
            var currentChar = password.charAt(i);
            if(currentChar == '#' || currentChar == '$' || currentChar == '_'){
                nbSpecialChars++;
            }
        }
        if(nbSpecialChars < ConstantesPassword.NB_SPECIAL_CARS_PASSWORD){
            return false;
        }
        return true;
    }
}
