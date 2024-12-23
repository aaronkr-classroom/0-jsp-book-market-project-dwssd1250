package mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mvc.database.DBConnection;

public class BoardDAO {

    private static BoardDAO instance;

    private BoardDAO() {
    }

    public static BoardDAO getInstance() {
        if (instance == null)
            instance = new BoardDAO();
        return instance;
    }
    
    public int getListCount() {
        
    }
    
    public String getLoginNameById(String Id) {
    	
    }
    
    public void insertBoard(BoardDTO board) {
    	
    }
    
    public void updateHit(int num) {
    	
    }
    
    public BoardDTO getBoardByNum(int num, int page) {
    	
    }
    
    public ArrayList<BoardDTO> getBoardList(int page, int limit, String items, String text) {
        
    }
    
    public void updateBoard(BoardDTO board) {
    	
    }
    
    public void deleteBoard(int num) {
    	
    }
}