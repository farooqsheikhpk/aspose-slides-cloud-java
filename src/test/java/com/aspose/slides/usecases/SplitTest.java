// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="SplitTest.java">
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

import com.aspose.slides.ApiException;
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipFile;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for split methods
 */
public class SplitTest extends ApiTest {
    @Test
    public void splitStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        SplitDocumentResult result = api.split(c_fileName, null, null, null, null, null, null, null, c_password, c_folderName, null, null);
        SplitDocumentResult resultFromTo = api.split(c_fileName, null, null, null, null, 2, 3, null, c_password, c_folderName, null, null);
        assertEquals(2, resultFromTo.getSlides().size());
        assertTrue(result.getSlides().size() > resultFromTo.getSlides().size());
        String url = result.getSlides().get(0).getHref();
        String path = url.substring(url.indexOf("/storage/file/") + "/storage/file/".length());
        ObjectExist exists = api.objectExists(path, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void splitRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File result = api.splitOnline(file, SlideExportFormat.PNG, null, null, null, null, c_password, null, null);
        File resultFromTo = api.splitOnline(file, SlideExportFormat.PNG, null, null, 2, 3, c_password, null, null);
        assertTrue(result.canRead());
        assertTrue(resultFromTo.canRead());
        assertNotEquals(result.length(), resultFromTo.length());
        ZipFile zip = new ZipFile(result);
        ZipFile zipFromTo = new ZipFile(resultFromTo);
        assertEquals(2, zipFromTo.size());
        assertTrue(zip.size() > zipFromTo.size());
    }

    @Test
    public void splitAndSaveRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        SplitDocumentResult result = api.splitAndSaveOnline(file, SlideExportFormat.PNG, null, null, null, null, null, c_password, null, null);
        SplitDocumentResult resultFromTo = api.splitAndSaveOnline(file, SlideExportFormat.PNG, null, null, null, 2, 3, c_password, null, null);
        assertEquals(2, resultFromTo.getSlides().size());
        assertTrue(result.getSlides().size() > resultFromTo.getSlides().size());
        String url = result.getSlides().get(0).getHref();
        String path = url.substring(url.indexOf("/storage/file/") + "/storage/file/".length());
        ObjectExist exists = api.objectExists(path, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void splitWithOptionsTest() throws ApiException, IOException {
        initialize(null, null, null);
        PdfExportOptions options = new PdfExportOptions();
        options.setJpegQuality(50);
        SplitDocumentResult result = api.split(c_fileName, options, SlideExportFormat.PDF, null, null, null, null, null, c_password, c_folderName, null, null);
        String url = result.getSlides().get(0).getHref();
        String path = url.substring(url.indexOf("/storage/file/") + "/storage/file/".length());
        ObjectExist exists = api.objectExists(path, null, null);
        assertTrue(exists.isExists());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
}
