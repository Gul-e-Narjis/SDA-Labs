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


import java.io.UnsupportedEncodingException;

public class UTF8Decorator extends DataSourceDecorator {

    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        try {
            // Convert the data to UTF-8 encoding before writing
            super.writeData(new String(data.getBytes(), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        try {
            // Ensure the data is read as UTF-8
            String data = super.readData();
            return new String(data.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}

