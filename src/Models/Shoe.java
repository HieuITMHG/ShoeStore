/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Enums.BranchType;
import Enums.CategoryType;

/**
 *
 * @author HUU HIEU
 */
public class Shoe extends BaseEntity{
    private int ShoeID;
    private String Name;
    private BranchType Branch;
    private float Size;
    private float Price;
    private CategoryType Category;
    private int Quantity;
    private String description;
    private String ImageURL;
}
