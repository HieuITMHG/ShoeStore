/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author HUU HIEU
 */
public class Comment extends BaseEntity {
    private int CommentId;
    private int AccountId;
    private int ShoeId;
    private String Content;

    public Comment(int CommentId, int AccountId, int ShoeId, String Content) {
        this.CommentId = CommentId;
        this.AccountId = AccountId;
        this.ShoeId = ShoeId;
        this.Content = Content;
    }
    
    
}
