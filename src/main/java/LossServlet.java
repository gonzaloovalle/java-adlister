import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="LossServlet", urlPatterns = "/incorrect")
public class LossServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = "You were incorrect!";
        req.setAttribute("message", message);

        req.getRequestDispatcher("/guessing-game/result.jsp").forward(req,resp);
    }
}
