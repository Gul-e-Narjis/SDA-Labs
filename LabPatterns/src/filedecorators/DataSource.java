/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedecorators;

/**
 *
 * @author SP23-BSE-011
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}