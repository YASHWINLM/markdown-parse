import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testingGenericFile() throws IOException{
        Path fileName = Path.of("test-file.md");
        assertEquals(List.of("https://something.com","some-page.html"), MarkdownParse.getLinks(Files.readString(fileName)));
    }
}