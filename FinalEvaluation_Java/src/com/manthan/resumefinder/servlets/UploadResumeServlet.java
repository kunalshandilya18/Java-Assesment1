package com.manthan.resumefinder.servlets;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
@WebServlet("/uploadResume")
public class UploadResumeServlet extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		//process only if its multipart content
		if(ServletFileUpload.isMultipartContent(req)){
			try {
				List<FileItem> multiparts = new ServletFileUpload(
						new DiskFileItemFactory()).parseRequest(req);

				for(FileItem item : multiparts){
					if(!item.isFormField()){
						String name = new File(item.getName()).getName();
						item.write( new File("C:\\Users\\CBT\\Desktop\\newfile" + File.separator + name));
					}
				}

				//Uploading File
				req.setAttribute("message", "File Uploaded Successfully");
			} catch (Exception ex) {
				req.setAttribute("message", "File Upload Failed ");
			}          

		}else{
			req.setAttribute("message","Sorry Something went wrong");

		}

		req.getRequestDispatcher("/upload").forward(req, res);


	}//End of do post

}//End of class
