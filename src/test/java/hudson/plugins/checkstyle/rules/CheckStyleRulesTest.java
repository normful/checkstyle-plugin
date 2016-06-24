package hudson.plugins.checkstyle.rules;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the class {@link CheckStyleRules}.
 *
 * @author Ulli Hafner
 */
public class CheckStyleRulesTest {
    /**
     * Test whether we could parse the Checkstyle rule meta data.
     */
    @Test
    public void checkRuleLoader() {
        CheckStyleRules reader = CheckStyleRules.getInstance();
        reader.initialize();

        assertEquals("Wrong number of rules detected.", 163, reader.getRules().size());
        assertNotNull("No EmptyBlock rule found.", reader.getRule("EmptyBlock"));
        assertEquals("Description for EmptyBlock found.", "<p> Checks for empty blocks. </p>", reader.getRule("EmptyBlock").getDescription());
    }
}
