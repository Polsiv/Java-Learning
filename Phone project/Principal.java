
class Principal{
    public static void main(String[] args) {
        smartPhone myPhone = new smartPhone("Samsung a52", 59, "Samsung");
        myPhone.agregarChip(new Chip("Movistar", 36478));

        System.out.println(myPhone);
    }
} 