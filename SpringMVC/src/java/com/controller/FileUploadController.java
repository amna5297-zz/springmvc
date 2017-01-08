/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.File;
import java.util.List;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Amna
 */

@Controller
@RequestMapping(value = "uploadFile")
public class FileUploadController {
    
    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public String save(HttpServletRequest request){
        String filePath = request.getRealPath("/uploadFile");
        filePath = filePath.substring(0,filePath.indexOf("\\build"));
        filePath=filePath+"\\web\\uploadFile\\";
        DiskFileItemFactory df = new DiskFileItemFactory();
        ServletFileUpload uploader = new ServletFileUpload(df);
        try{
            List<FileItem> lst = uploader.parseRequest(request);
            for(FileItem item: lst){
                if(item.isFormField()==false){
                    item.write(new File(filePath+"/"+item.getName()));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            return "fail";
        }
        return "File Uploaded!";
    }
}
