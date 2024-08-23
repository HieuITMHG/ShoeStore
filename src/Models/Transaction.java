/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Enums.TransactionType;

public class Transaction extends BaseEntity{
    private int TransactionID;
    private int AccountID;
    private float Amount;
    private TransactionType Type;
}
