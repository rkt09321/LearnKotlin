//package javatest.filereadwrite;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.net.SocketException;
//
//import org.apache.commons.net.ftp.FTPClient;
//
//
//
//public class MyFileDownload {
// public static void kotlintest.trickyquestion.main(String args[]) {
//
//  // get an ftpClient object
//  FTPClient ftpClient = new FTPClient();
//  FileOutputStream fos = null;
//
//  try {
//   // pass directory path on server to connect
//   ftpClient.connect("192.168.0.66");
//
//   // pass username and password, returned true if authentication is
//   // successful
//   boolean login = ftpClient.login("raj1234", "raj1234");
//
//   if (login) {
//    System.out.println("Connection established...");
//
//    fos = new FileOutputStream("F:/abc.txt");
//
//    boolean download = ftpClient.retrieveFile("ab.txt",
//      fos);
//    if (download) {
//     System.out.println("File downloaded successfully !");
//    } else {
//     System.out.println("Error in downloading file !");
//    }
//
//    // logout the user, returned true if logout successfully
//    boolean logout = ftpClient.logout();
//    if (logout) {
//     System.out.println("Connection close...");
//    }
//   } else {
//    System.out.println("Connection fail...");
//   }
//
//  } catch (SocketException e) {
//   e.printStackTrace();
//  } catch (IOException e) {
//   e.printStackTrace();
//  } finally {
//   try {
//    ftpClient.disconnect();
//   } catch (IOException e) {
//    e.printStackTrace();
//   }
//  }
// }
//}
