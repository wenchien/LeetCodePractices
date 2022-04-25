import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        int output = 0;
        Set<String> lookupSet = new HashSet<>();
        for(String email : emails) {
            String[] splitted = email.split("@");
            String localName = splitted[0];
            String domainName = splitted[1];

            // Check local name
            // if contains . strip away .
            if (localName.contains(".")) {
                localName = localName.replace(".", "");
            }
            if (localName.contains("+")) {
                localName = localName.substring(0, localName.indexOf('+'));
            }

            String processedEmail = localName + "@" + domainName;
            if (!lookupSet.contains(processedEmail)) {
                ++output;
                lookupSet.add(processedEmail);
            }
        }

        return output;
    }
}
