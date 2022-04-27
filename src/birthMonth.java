class birthMonth {

    public static void main(String[] args) {

        int month;
        month = 16;

        if (month >= 1)
        {
            if (month <= 12)
            {
                System.out.println("You were born in the month: " + month);
            }
            else
            {
                System.out.println("Please give a number between 1 - 12");
            }
        }
        else
        {
            System.out.println("Please give a number between 1 - 12");
        }
    }
}