package _21y._11m._08d_21.tridy2.banka;


import java.util.GregorianCalendar;
import java.util.Random;

//Vytvořte třídu Klient, která bude mít jako jednu členskou
// proměnnou referenci na objekt třídy BankovniUcet. Modifikujte třídu Banka,
// aby pracovala s klienty
// místo účty.
public class Client {
    private static String setAdress = "Czechia somewhere";
    private final Random rn = new Random();
    private String firstName;
    private String lastName;
    private GregorianCalendar dateOfBirth;
    private String address;

    public Client(String name) {
        /**
         * @param (String) name
         *
         * Creates Client object with defined name.
         * dateOfBirth is random and set address to Static variable `setAddress`
         */
        this.setName(name);
        this.dateOfBirth = randomDateOfBirth();
        this.address = Client.setAdress;
    }

    public Client(String name, GregorianCalendar dateOfBirth) {
        /**
         * @param (String) name
         * @param (GregorianCalendar) dateOfBirth
         *
         * Creates Client object with defined name and dateOfBirth.
         * Address is set to Static variable `setAddress`
         */
        this.setName(name);
        this.dateOfBirth = dateOfBirth;
        this.address = Client.setAdress;
    }

    public Client(String name, String address) {
        /**
         * @param (String) name
         * @param (String) address
         *
         * Creates Client object with defined name and address.
         * dateOfBirth is random
         */
        this.setName(name);
        this.dateOfBirth = randomDateOfBirth();
        this.address = address;
    }

    public Client(String name, GregorianCalendar dateOfBirth, String address) {
        /**
         * @param (String) name
         * @param (GregorianCalendar) dateOfBirth
         * @param (String) address
         *
         * Creates Client object with defined name, address and dateOfBirth
         */
        this.setName(name);
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    private GregorianCalendar randomDateOfBirth() {
        return new GregorianCalendar(200, this.rn.nextInt(12), this.rn.nextInt(27) + 1);
    }

    private void setName(String name) {
        if (!name.contains(" ")) {
            this.firstName = name;
            this.lastName = "";
            return;
        }
        String[] splitName = name.trim().split(" ");
        this.firstName = splitName[0];
        this.lastName = splitName[1];
    }

    public String getName() {
        return String.format("%s %s", firstName, lastName);
    }
}
