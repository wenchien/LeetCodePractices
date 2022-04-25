import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueEmailAddressTest {

    private UniqueEmailAddress uea = new UniqueEmailAddress();

    @Test
    public void testCase2() {
        String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        assertEquals(3, uea.numUniqueEmails(emails));
    }

    @Test
    public void testCase1() {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertEquals(2, uea.numUniqueEmails(emails));
    }

}