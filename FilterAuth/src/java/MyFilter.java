
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

    /**
     *
     * @param req
     * @param resp
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain chain) throws IOException, ServletException {

        PrintWriter out = resp.getWriter();
        String password = req.getParameter("password");
        if (password.equals("admin")) {
            chain.doFilter(req, resp);//sends request to next resource
        } else {
            out.print("username or password error!");
            
        }

    }

    @Override
    public void destroy() {
    }

}
