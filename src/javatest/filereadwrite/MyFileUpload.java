///*
//package javatest.filereadwrite;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.commons.net.ftp.FTPClient;
//
//public class MyFileUpload {
//    public static void kotlintest.trickyquestion.main(String[] args) {
//        FTPClient client = new FTPClient();
//        FileInputStream fis = null;
//
//        try {
//            client.connect("192.168.0.66");
//            client.login("raj1234", "raj1234");
//
//            //
//            // Create an InputStream of the file to be uploaded
//            //
//            String filename = "F:/abcde.txt";
//            fis = new FileInputStream(filename);
//
//            //
//            // Store file to server
//            //
//            System.out.println("File going to Store Successfully");
//            client.storeFile("abcdef.txt", fis);
//            System.out.println("File Store Successfully");
//            client.logout();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fis != null) {
//                    fis.close();
//                }
//                client.disconnect();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//
//*/
///*import java.io.IOException;
//import java.io.File;
//import java.io.FileInputStream;
//
//import org.apache.commons.net.ftp.FTP;
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPConnectionClosedException;
//
//class MyFileUpload {
//        public static void kotlintest.trickyquestion.main(String[] args) throws IOException {
//                FTPClient ftpclient = new FTPClient();
//                FileInputStream fis = null;
//                boolean result;
//                String ftpServerAddress = "192.168.0.1";
//                String userName = "raj123";
//                String password = "raj123";
//
//                try {
//                        ftpclient.connect(ftpServerAddress);
//                        result = ftpclient.login(userName, password);
//
//                        if (result == true) {
//                                System.out.println("Logged in Successfully !");
//                        } else {
//                                System.out.println("Login Fail!");
//                                return;
//                        }
//                        ftpclient.setFileType(FTP.BINARY_FILE_TYPE);
//
//                        ftpclient.changeWorkingDirectory("/");
//
//                        File file = new File("F:/abc.txt");
//                        String testName = file.getName();
//                        fis = new FileInputStream(file);
//
//                        // Upload file to the ftp server
//                        result = ftpclient.storeFile(testName, fis);
//
//                        if (result == true) {
//                                System.out.println("File is uploaded successfully");
//                        } else {
//                                System.out.println("File uploading failed");
//                        }
//                        ftpclient.logout();
//                } catch (FTPConnectionClosedException e) {
//                        e.printStackTrace();
//                } finally {
//                        try {
//                                ftpclient.disconnect();
//                        } catch (FTPConnectionClosedException e) {
//                                System.out.println(e);
//                        }
//                }
//        }
//}
//*//*
//
//
//*/
///*import org.apache.commons.net.ftp.FTPConnectionClosedException;
//
//class MyFileUpload {
//        public static void kotlintest.trickyquestion.main(String[] args) throws IOException {
//                FTPClient ftpclient = new FTPClient();
//                FileInputStream fis = null;
//                boolean result=false;
//                String ftpServerAddress = "127.0.0.1";
//                String userName = "raj123";
//                String password = "raj123";
//
//                try {
//                        ftpclient.connect(ftpServerAddress);
//                        result = ftpclient.login(userName, password);
//
//                        if (result == true) {
//                                System.out.println("Logged in Successfully !");
//                        } else {
//                                System.out.println("Login Fail!");
//                                return;
//                        }
//                        ftpclient.setFileType(FTP.BINARY_FILE_TYPE);
//
//                        ftpclient.changeWorkingDirectory("/");
//
//                        File file = new File("F:/abcde.txt");
//                        String testName = file.getName();
//                        fis = new FileInputStream(file);
//
//                        // Upload file to the ftp server
//                        result = ftpclient.storeFile(testName, fis);
//
//                        if (result == true) {
//                                System.out.println("File is uploaded successfully");
//                        } else {
//                                System.out.println("File uploading failed");
//                        }
//                        ftpclient.logout();
//                } catch (FTPConnectionClosedException e) {
//                	System.out.println(""+e.toString());
//                        e.printStackTrace();
//                } finally {
//                        try {
//                                ftpclient.disconnect();
//                        } catch (FTPConnectionClosedException e) {
//                                System.out.println(e.toString());
//                        }
//                }
//        }
//}
///
//
//
//
///public class MyFileUpload {
//	public static void kotlintest.trickyquestion.main(String[] args) {
//		FTPClient client = new FTPClient();
//		FileInputStream fis = null;
//		try {
//			client.connect("ftp.javacodegeeks.com");
//			client.login("username", "password");
//			// Create an InputStream of the file to be uploaded
//			String filename = "test.txt";
//			fis = new FileInputStream(filename);
//			// Store file on server and logout
//			client.storeFile(filename, fis);
//			client.logout();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (fis != null) {
//					fis.close();
//				}
//				client.disconnect();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}/
//
//
//
//
//
///public class MyFileUpload {
// public static void kotlintest.trickyquestion.main(String args[]) {
//
//  // get an ftpClient object
//  FTPClient ftpClient = new FTPClient();
//  FileInputStream inputStream = null;
//
//  try {
//   // pass directory path on server to connect
//  // ftpClient.connect("192.168.0.66");
//   ftpClient.connect("192.168.0.66",21);
//
//   // pass username and password, returned true if authentication is
//   // successful
//   boolean login = ftpClient.login("raj123", "raj123");
//
//   if (login) {
//    System.out.println("Connection established...");
//    inputStream = new FileInputStream("F:\\abcde.txt");
//    System.out.println("File inputStream..run.");
//    boolean uploaded = ftpClient.storeFile("abcde.txt", inputStream);
//    System.out.println("uploaded...");
//    if (uploaded) {
//     System.out.println("File uploaded successfully !");
//    } else {
//     System.out.println("Error in uploading file !");
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
//*/*/
