/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 first_name last_name
 */
package Assignment04;

import javafx.scene.control.TableCell;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.util.Callback;

//Override the default TableCell with a default CheckBoxTableCell
public class CheckBoxTableCellFactory implements Callback {
    @Override
    public TableCell call(Object p) {
        CheckBoxTableCell cell = new CheckBoxTableCell();
        return cell;
    }
}
