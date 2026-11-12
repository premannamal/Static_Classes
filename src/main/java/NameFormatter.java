public class NameFormatter {

    /* public static String format(String firstName, String lastName)
    {

    }     */

    /* public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix)
    {
      //
    }      */



    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        /*
        LastName, Prefix FirstName MiddleName, Suffix

        Dr. Mel B Johnson, PhD
        Mel B Johnson, PhD
        Mel Johnson */

        String formattedName = "";

        formattedName = formattedName + lastName+ ", " ;
        //At this point, formattedName = lastName+"' "

        if ( prefix != null && !prefix.isEmpty() )
        {
            formattedName = formattedName + prefix;
            //At this point, formattedName = lastName+"' " + prefix
        }


        formattedName = formattedName + " " + firstName;
        //At this point formatttedName = lastName+"' " + prefix + " " + firstName

        if ( middleName != null && !middleName.isEmpty()  )
        {
            formattedName = formattedName + " " + middleName;
            //At this point formatttedName = lastName+"' " + prefix + " " + firstName + " " + middleName
        }

        if (suffix != null && !suffix.isEmpty()  )
        {
            formattedName = formattedName + ", " + suffix;
              //At this point formatttedName = lastName+"' " + prefix + " " + firstName + " " + middleName + " , " + suffix
        }

        System.out.println(formattedName);
        return formattedName;

    }

    private NameFormatter() {
    }

    public static void main(String[] args) {
             String outputString;
        outputString = format("Mr.","John","L.","Doe","Ph.d.");
    }
}
