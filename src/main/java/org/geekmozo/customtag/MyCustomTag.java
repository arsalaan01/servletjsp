package org.geekmozo.customtag;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport {
    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.println("<h1>This is my custom tag from");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
