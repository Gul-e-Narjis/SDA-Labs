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

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        // Applying UTF8Decorator, EncryptionDecorator, and CompressionDecorator
        DataSourceDecorator utf8Encoded = new UTF8Decorator(
                                            new CompressionDecorator(
                                                new EncryptionDecorator(
                                                    new FileDataSource("out/OutputDemo.txt"))));

        utf8Encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(utf8Encoded.readData());
    }
}
