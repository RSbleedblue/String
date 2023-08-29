public class ValidateIP {
    public static boolean validate(String str) {
        String[] parts = str.split("\\.");

        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        String IP = "192.12.134.20";
        boolean isValid = validate(IP);
        if (isValid) {
            System.out.println("Valid IP address.");
        } else {
            System.out.println("Invalid IP address.");
        }
    }
}
