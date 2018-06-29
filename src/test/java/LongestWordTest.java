
import de.hsbo.fbg.kswe.exceptionhandling.words.TextAnalyzer;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class LongestWordTest {
    
    @Test
    public void testLongestWord() {
        TextAnalyzer ta = new TextAnalyzer();
        String word = ta.findLongestWord("hi there, this is a really loooooooooong word!");
        Assert.assertThat(word, CoreMatchers.is("loooooooooong"));
    }

}
