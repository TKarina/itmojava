import java.util.ArrayList;

public class Patient {

    private String name;
    private Gender gender;

    private ArrayList<RegistrationCard> registrationCard ;



    public Patient(String name, Gender gender)
    {
        this.name = name;
        this.gender = gender;

        this.accounts = new;
    }
    public void addRegistrationCard(final RegistrationCard registrationCard)
    {
        accounts[numberOfAccounts++] = account;
    }

    public String getName()
    {
        return name;
    }

    public Gender getGender()
    {
        return gender;
    }

    public Account[] getAccounts()
    {
        return Arrays.copyOfRange(registrationCard, 0);
    }

    public String getClientGreeting()
    {
        if (gender != null)
        {
            return gender.getGreeting() + " " + name;
        }
        else
        {
            return name;
        }
    }

    @Override
    public String toString()
    {
        return getClientGreeting();
    }
}
