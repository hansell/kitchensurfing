package com.kitchensurfing.control;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.kitchensurfing.util.FileMeta;
/**
 * controller for file upload
 * @author Hansel
 *
 */
@Controller
public class FileUploadController implements Serializable{

    private static final Logger logger=Logger.getLogger(FileUploadController.class);
	private static final long serialVersionUID = 1L;
    LinkedList<FileMeta> files=new LinkedList<FileMeta>();
    
    @RequestMapping(value="/upload", method=RequestMethod.GET)
    public @ResponseBody String provideUploadInfo() {
        return "You can upload a file by posting to this same URL.";
    }
    
    @RequestMapping(value="/upload",method=RequestMethod.POST)
    public @ResponseBody LinkedList<FileMeta> handleFileUpload(MultipartHttpServletRequest request,
    		HttpServletResponse response){
    	//1. build an iterator
        Iterator<String> itr =  request.getFileNames();
        MultipartFile mpf = null;
        //2 get file
        while(itr.hasNext()){
        	
        }
        return null;
    }
}
