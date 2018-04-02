/**
 * 
 */
package com.trainingbasket.resumeparser.pdfreader;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Test;

/**
 * @author Dheeraj Singh via OpenSource This class basically reads the PDF file
 *         using the open source library called PDF BOX from Apache Foundation
 */
public class PdfReader {
	File file = null;
	PDDocument document = null;
	PDFTextStripper textStripper = null;

	public PdfReader() throws IOException {
		textStripper = new PDFTextStripper();
	}

	/**
	 * @param filePath
	 *            It takes the complete file path not absolute
	 * @return text from the pdf document
	 */
	public String readFile(String filePath) {
		String dataFromPDF = "";
		try {
			file = new File(filePath);
			document = PDDocument.load(file);
			dataFromPDF = textStripper.getText(document);
			document.close();
		} catch (Exception e) {
			return e.getMessage();
		}
		return dataFromPDF;
	}

	/*
	public static void main(String...strings) {
		try {
			PdfReader reader = new PdfReader();
			System.err.println(reader.readFile("d:\\AkhileshSingh[2_8].pdf"));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}*/
}
