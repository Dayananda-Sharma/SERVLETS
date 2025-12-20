import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/mob",loadOnStartup = 10)
public class MobileServlet extends GenericServlet {
    public MobileServlet(){
        System.out.println("object created..");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("initialized method created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service called");
    }
}
