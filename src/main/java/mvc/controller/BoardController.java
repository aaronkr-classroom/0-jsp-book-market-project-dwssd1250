package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import mvc.model.BoardDAO;
import mvc.model.BoardDTO;

public class BoardController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    static final int LISTCOUNT = 5;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String RequestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String command = RequestURI.substring(contextPath.length());

        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("utf-8");

        if (command.equals("/BoardListAction.do")) {
            requestBoardList(request);
            RequestDispatcher rd = request.getRequestDispatcher("./board/list.jsp");
            rd.forward(request, response);
        } else if (command.equals("/BoardWriteForm.do")) {
            requestLoginName(request);
            RequestDispatcher rd = request.getRequestDispatcher("./board/writeForm.jsp");
            rd.forward(request, response);
        } else if (command.equals("/BoardWriteAction.do")) {
            requestBoardWrite(request);
            RequestDispatcher rd = request.getRequestDispatcher("/BoardListAction.do");
            rd.forward(request, response);
        } else if (command.equals("/BoardViewAction.do")) {
            requestBoardView(request);
            RequestDispatcher rd = request.getRequestDispatcher("/BoardView.do");
            rd.forward(request, response);
        } else if (command.equals("/BoardView.do")) {
            RequestDispatcher rd = request.getRequestDispatcher("./board/view.jsp");
            rd.forward(request, response);
        } else if (command.equals("/BoardUpdateAction.do")) {
            requestBoardUpdate(request);
            RequestDispatcher rd = request.getRequestDispatcher("/BoardListAction.do");
            rd.forward(request, response);
        } else if (command.equals("/BoardDeleteAction.do")) {
            requestBoardDelete(request);
            RequestDispatcher rd = request.getRequestDispatcher("/BoardListAction.do");
            rd.forward(request, response);
        }
    }

    
    public void requestBoardList(HttpServletRequest request) {
        
    }
    
    public void requestLoginName(HttpServletRequest request) {
        
    }

    public void requestBoardWrite(HttpServletRequest request) {
        
    }
    
    public void requestBoardView(HttpServletRequest request) {
        
    }
    
    public void requestBoardUpdate(HttpServletRequest request) {
        
    }
}