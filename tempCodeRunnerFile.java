import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatternEightTest {
    
    @Test
    public void testMainOutputPattern() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        PatternEight.main(new String[]{});
        
        String output = outContent.toString();
        String[] lines = output.split("\n");
        
        assertEquals(5, lines.length, "Should have 5 rows");
        assertEquals(9, lines[0].replaceAll(" ", "").length(), "Row 0 should have 9 stars");
        assertEquals(7, lines[1].replaceAll(" ", "").length(), "Row 1 should have 7 stars");
        assertEquals(5, lines[2].replaceAll(" ", "").length(), "Row 2 should have 5 stars");
        assertEquals(3, lines[3].replaceAll(" ", "").length(), "Row 3 should have 3 stars");
        assertEquals(1, lines[4].replaceAll(" ", "").length(), "Row 4 should have 1 star");
        
        System.setOut(System.out);
    }
    
    @Test
    public void testMainRowSpacing() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        PatternEight.main(new String[]{});
        
        String output = outContent.toString();
        String[] lines = output.split("\n");
        
        assertEquals(0, countLeadingSpaces(lines[0]), "Row 0 should have 0 leading spaces");
        assertEquals(1, countLeadingSpaces(lines[1]), "Row 1 should have 1 leading space");
        assertEquals(2, countLeadingSpaces(lines[2]), "Row 2 should have 2 leading spaces");
        assertEquals(3, countLeadingSpaces(lines[3]), "Row 3 should have 3 leading spaces");
        assertEquals(4, countLeadingSpaces(lines[4]), "Row 4 should have 4 leading spaces");
        
        System.setOut(System.out);
    }
    
    private int countLeadingSpaces(String line) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (c == ' ') count++;
            else break;
        }
        return count;
    }
}