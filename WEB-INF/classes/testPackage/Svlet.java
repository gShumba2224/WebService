package testPackage;
    
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Svlet extends HttpServlet{

    @Override
    public void init () throws ServletException{
        System.out.println("shit started yall !!");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.getWriter().println("Hello, World!");
    }
}