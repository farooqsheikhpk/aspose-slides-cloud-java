// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="CreateTests.cs">
//   Copyright (c) 2018 Aspose.Slides for Cloud
// </copyright>
// <summary>
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
// 
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
// 
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.slides.usecases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Test;
import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * API tests for methods to create presentation
 */
public class CreateTest extends ApiTest {
    @Test
    public void createEmptyTest() throws ApiException, IOException {
        api.deleteFile(c_folderName + "/" + c_fileName, null, null);
        Document created = api.createPresentation(c_fileName, null, null, null, c_folderName, null);
        assertNotNull(created);
    }

    @Test
    public void createFromRequestTest() throws ApiException, IOException {
        api.deleteFile(c_folderName + "/" + c_fileName, null, null);
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        Document created = api.createPresentation(c_fileName, file, c_password, null, c_folderName, null);
        assertNotNull(created);
    }

    @Test
    public void createFromStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.deleteFile(c_folderName + "/" + c_newFileName, null, null);
        Document created = api.createPresentationFromSource(c_newFileName, c_folderName + "/" + c_fileName, c_password, null, null, c_folderName, null);
        assertNotNull(created);
    }

    @Test
    public void createFromTemplateTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.deleteFile(c_folderName + "/" + c_fileName, null, null);
        api.copyFile(tempFolderName + "/" + c_templateFileName, c_folderName + "/" + c_templateFileName, null, null, null);
        Document created = api.createPresentationFromTemplate(c_fileName, c_folderName + "/" + c_templateFileName, c_template, null, null, null, null, c_folderName, null);
        assertNotNull(created);
    }

    @Test
    public void createFromHtml() throws ApiException, IOException {
        api.deleteFile(c_folderName + "/" + c_fileName, null, null);
        Document created = api.importFromHtml(c_fileName, c_html, null, c_folderName, null);
        assertNotNull(created);
    }

    @Test
    public void appendFromHtml() throws ApiException, IOException {
        initialize(null, null, null);
        int slideCount = api.getSlides(c_fileName, c_password, c_folderName, null).getSlideList().size();
        Document updated = api.importFromHtml(c_fileName, c_html, c_password, c_folderName, null);
        assertNotNull(updated);
        assertTrue(api.getSlides(c_fileName, c_password, c_folderName, null).getSlideList().size() > slideCount);
    }

    @Test
    public void createFromPdf() throws ApiException, IOException {
        api.deleteFile(c_folderName + "/" + c_fileName, null, null);
        byte[] pdf = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_pdfFileName));
        Document created = api.importFromPdf(c_fileName, pdf, null, c_folderName, null);
        assertNotNull(created);
    }

    @Test
    public void appendFromPdf() throws ApiException, IOException {
        initialize(null, null, null);
        int slideCount = api.getSlides(c_fileName, c_password, c_folderName, null).getSlideList().size();
        byte[] pdf = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_pdfFileName));
        Document updated = api.importFromPdf(c_fileName, pdf, c_password, c_folderName, null);
        assertNotNull(updated);
        assertTrue(api.getSlides(c_fileName, c_password, c_folderName, null).getSlideList().size() > slideCount);
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_newFileName = "test2.pptx";
    private final String c_templateFileName = "TemplateCV.pptx";
    private final String c_pdfFileName = "test.pdf";
    private final String c_password = "password";
    private final String c_html = "<html><body>New Content</body></html>";
    private final String c_template = "<staff><person><name>John Doe</name><address><line1>10 Downing Street</line1><line2>London</line2></address><phone>+457 123456</phone><bio>Hi, I'm John and this is my CV</bio><skills><skill><title>C#</title><level>Excellent</level></skill><skill><title>C++</title><level>Good</level></skill><skill><title>Java</title><level>Average</level></skill></skills></person></staff>";
}
