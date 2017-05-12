package com.yangbing.actions;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException; 

import com.opensymphony.xwork2.ActionSupport;

public class uploadFile extends ActionSupport{
   /**
	 * 
	 */
	private static final long serialVersionUID = -8932086640665551386L;
   private File myFile;
   private String myFileContentType;
   private String myFileFileName;
   private String destPath;

   public String execute()
   {
      /* Copy file to a safe location */
      destPath = "F:/myEclipse2017/SSH框架/WebRoot/WEB-INF/upload";

      try{
     	 System.out.println("Src File name: " + myFile);
     	 System.out.println("Dst File name: " + myFileFileName);
     	    	 
     	 File destFile  = new File(destPath, myFileFileName);
    	 FileUtils.copyFile(myFile, destFile);
  
      }catch(IOException e){
         e.printStackTrace();
         return ERROR;
      }

      return SUCCESS;
   }
   public File getMyFile() {
      return myFile;
   }
   public void setMyFile(File myFile) {
      this.myFile = myFile;
   }
   public String getMyFileContentType() {
      return myFileContentType;
   }
   public void setMyFileContentType(String myFileContentType) {
      this.myFileContentType = myFileContentType;
   }
   public String getMyFileFileName() {
      return myFileFileName;
   }
   public void setMyFileFileName(String myFileFileName) {
      this.myFileFileName = myFileFileName;
   }
}