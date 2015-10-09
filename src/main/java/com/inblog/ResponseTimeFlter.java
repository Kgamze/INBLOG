package com.inblog;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Mesut Dogan <mesut.dogan@indbilisim.com.tr> on 10/9/15.
 */
public class ResponseTimeFlter implements Filter {

    FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long startTime = System.currentTimeMillis();
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession();
        if (session != null)

            filterChain.doFilter(servletRequest, servletResponse);
        long elapsed = System.currentTimeMillis();
        session.setAttribute("responseTime", "" + (elapsed - startTime));
        request.setAttribute("deneme", "selamkardo");

    }

    @Override
    public void destroy() {

    }
}
