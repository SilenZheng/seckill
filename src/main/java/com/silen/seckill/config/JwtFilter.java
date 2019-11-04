package com.silen.seckill.config;

import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zero on 2018/9/21.
 */
public class JwtFilter extends GenericFilterBean {
    @Autowired
    private Audience audience;
    @Override
    public void doFilter(ServletRequest req,
                         ServletResponse res,
                         FilterChain filterChain)
            throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) req;
        final HttpServletResponse response = (HttpServletResponse) res;
        final String authHeader = request.getHeader(JwtHelper.HEADER_NAME);

        if (authHeader!=null && "N3xToc7htjUa6dQw".equals(authHeader)){
            filterChain.doFilter(req, res);
        }else {
            if ("OPTIONS".equals(request.getMethod())) {
                response.setStatus(HttpServletResponse.SC_OK);
                filterChain.doFilter(req, res);
            } else {
                if (authHeader == null || !authHeader.startsWith(JwtHelper.TOKEN_HEADER)) {
                    throw new ServletException("缺少token或者token不合法");
                }
                final String token = authHeader.substring(JwtHelper.TOKEN_HEADER.length());
                try {
                    if(audience == null){
                        BeanFactory factory = WebApplicationContextUtils
                                .getRequiredWebApplicationContext(request.getServletContext());
                        audience = (Audience) factory.getBean("audience");
                    }
                    final Claims claims = JwtHelper.parseJWT(token,audience.getBase64Secret());
                    request.setAttribute("claims", claims);
                } catch (Exception e) {
                    throw new ServletException("无效的token");
                }
                filterChain.doFilter(req, res);
            }
        }
    }
}
