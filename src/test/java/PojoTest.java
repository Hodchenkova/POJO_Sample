import Issue.JsonForIssue.Fields;
import Issue.JsonForIssue.Issue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class PojoTest {
    @Test
    public void sampleTest() {
        ObjectMapper mapper = new ObjectMapper();
        Fields fields = new Fields();
        fields.setAssignee("Hodchenkova");
        fields.setIssueType("Bug");
        fields.setProject("QAAUT-15");
        fields.setSummary("Issue summary from Test");

        Issue issue = new Issue(fields);
        String jsonInString = "";
        try {
            jsonInString = mapper.writeValueAsString(issue);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonInString);
    }
}
