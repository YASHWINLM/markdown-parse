import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    // @Test
    // public void addition() {
    //     assertEquals(2, 1 + 1);
    // }

    // @Test
    // public void additionbad() {
    //     assertEquals(2, 1 + 1);
    // }

    // @Test
    // public void testingGenericFile() throws IOException{
    //     Path fileName = Path.of("test-file.md");
    //     assertEquals(List.of("https://something.com","some-page.html"), MarkdownParse.getLinks(Files.readString(fileName)));
    // }

    // @Test 
    // public void testingEmpty()throws IOException{
    //     Path fileName=Path.of("test-empty.md");
    //     System.out.println(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(fileName)));
    // }

    // public void testingEmpty2()throws IOException{
    //     Path fileName=Path.of("test-empty.md");
    //     System.out.println(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(fileName)));
    // }

    // @Test
    // public void testingSnippet1()throws IOException{
    //     Path fileName=Path.of("snippet-1.md");
    //     assertEquals(List.of("`google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(Files.readString(fileName)));
        
    // }

    @Test
    public void testingSnippet2()throws IOException{
        Path fileName=Path.of("snippet-2.md");
        assertEquals(List.of("a.com", "a.com(())", "example.com"), MarkdownParse.getLinks(Files.readString(fileName)));
        
    }

    // @Test
    // public void testingSnippet3()throws IOException{
    //     Path fileName=Path.of("snippet-3.md");
    //     assertEquals(List.of("https://www.twitter.com", "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/"), MarkdownParse.getLinks(Files.readString(fileName)));
        
    // }

    

}
