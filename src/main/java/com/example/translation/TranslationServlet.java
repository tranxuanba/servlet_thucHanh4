package com.example.translation;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "TranslationServlet", value = "/translate")
public class TranslationServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chao");
        dictionary.put("how", "the nao");
        dictionary.put("book", "quyen vo");
        dictionary.put("computer", "may tinh");
        String search = req.getParameter("txtSearch");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        String result = dictionary.get(search);
        if (result != null) {
            writer.println("Word: " + search + "<br>");
            writer.println("Result: " + result);
        }else {
        writer.println("not found!");
        }
        writer.println("</html>");
    }

    public void destroy() {
    }
}