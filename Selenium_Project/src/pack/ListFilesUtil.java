package pack;
import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;

	
	public class ListFilesUtil {
	
	    /**
	     * List all the files under a directory
	     * @param directoryName to be listed
	     */
	    
	    private  void getFolderSize(String directoryName) {
	    	File dir = new File(directoryName);
	    	File[] files = dir.listFiles();
	    	if (files.length == 0) {
	    	    System.out.println("The directory is empty");
	    	} else {
	    	    for (File aFile : files) {
	    	    	
	    	    	System.out.println("File Types");
	    	    	String fileSizeDisplay = FileUtils.byteCountToDisplaySize(aFile.length());
	    	    	
	    	        System.out.println("File Name:  "+ aFile.getName()+ "--------------------- File Size: " + fileSizeDisplay+"--------------------- File Type:"+aFile.getName());
	    	        
	    	        	    	    }
	    	    	    	}
	    	System.out.println("***********************************************************");
	 	 
	    }
		    
	    /**
	     * List all the folder under a directory
	     * @param extensions to be listed
	     */
	    
	    private  void getFolderextensions(String directoryName) throws Exception 
	    {
	    File dir = new File(directoryName);
	    String[] extensions = new String[] { "xlsx", "csv" };
	    List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);
		for (File file : files) {
			
			System.out.println("file extensions");
			
			System.out.println("file: " + file.getCanonicalPath());
		}
	    }
	    	 
	    public static void main (String[] args) throws Exception{
	        ListFilesUtil listFilesUtil = new ListFilesUtil();
	        //Windows directory example
	        final String directoryWindows ="C:\\Test_1";
	       // listFilesUtil.listFiles(directoryWindows);
	        
	        listFilesUtil.getFolderSize(directoryWindows);
	        
	        listFilesUtil.getFolderextensions(directoryWindows);
	        
	    }
	}