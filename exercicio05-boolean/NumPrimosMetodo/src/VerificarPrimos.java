class VerficarPrimos {
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        } else if (numero == 2) {
            return true;
        } else if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}