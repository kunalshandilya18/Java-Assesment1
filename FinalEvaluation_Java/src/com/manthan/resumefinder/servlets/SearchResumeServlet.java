package com.manthan.resumefinder.servlets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

@WebServlet("/searchResumeServlet")
public class SearchResumeServlet extends HttpServlet {

	String emailChars="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	String path;

	public void init() {
		path=getServletContext().getInitParameter("uploadFile");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> searchResults=new ArrayList<String>();
		List<String> email=new ArrayList<String>();
		String textInput=req.getParameter("text");
		String[] textInputStr=textInput.split(" ");

		//File path setting
		File[] file=new File("C:/Users/CBT/Desktop/newfile").listFiles();
		//Iterating File Content
		for (File fi : file) {

			if(fi.isFile()) {
				if(FilenameUtils.getExtension(path+"/"+fi).equals("pdf")) {
					String fileName=fi.getPath();

					//Loading File in document 
					PDDocument doc=PDDocument.load(fi);

					//Creating PDFTextStripper object
					PDFTextStripper pdfTextStripper=new PDFTextStripper();

					//Fetching text from doc
					String txt=pdfTextStripper.getText(doc);

					//replacing next lines with a space
					txt=txt.replace("/n", " ").replace("/r", " ");

					boolean isFound=false;

					for (String keyValue : textInputStr) {
						if(txt.toLowerCase().contains(keyValue.toLowerCase())) {
							isFound=true;
						}
						else {
							isFound=false;
							break;
						}
					}
					if(isFound) {
						searchResults.add(FilenameUtils.getBaseName(fileName)+"."+FilenameUtils.getExtension(fileName));

						//Matching Pattern accordint to email ID
						Pattern p=Pattern.compile("\\S+@+\\S");
						Matcher m=p.matcher(txt);
						//If Pattern matched it will get email ID
						if(m.find()) {
							String group=m.group(1);
							System.out.println(group);
							email.add(group);

						}
						else {
							email.add("Email ID not present");
						}
					}
					

					doc.close();
				}//End of if

			}//End of if(isFile)
		}//End of loop of File


		req.setAttribute("results", searchResults);
		req.setAttribute("emails", email);
		req.getRequestDispatcher("/results").forward(req, resp);
	}//End of do post



}//End of class
