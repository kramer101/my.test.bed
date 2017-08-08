package my.test.bed;

import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;

/**
 * Created by Vadym_Yakovlev on 7/7/2017.
 */
public class MockServerTest {


    private ClientAndServer mockServer = null;

    public void test() throws Exception {




        try {
            mockServer = ClientAndServer.startClientAndServer(4444);

            mockServer.when(HttpRequest.request()).respond(HttpResponse.response().withBody("<XSTORE_RETURN> \n" +
                    "  <result_ok>OK</result_ok>  \n" +
                    "  <release_tag>release-73</release_tag>  \n" +
                    "  <version>1.73</version>  \n" +
                    "  <uid>1001</uid>  \n" +
                    "  <comment>Update thru LPA</comment>  \n" +
                    "  <change_lists/>  \n" +
                    "  <xml_profile/> \n" +
                    "</XSTORE_RETURN>"));






        } finally {
            /*if (mockServer != null) {
                mockServer.stop();
            }*/

        }
    }



    public static void main(String[] args) {

        MockServerTest test = new MockServerTest();
        try {
            test.test();
        } catch (Exception eParam) {
            eParam.printStackTrace();
        }

    }
}
