// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="NotesSlideTests.cs">
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
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * API tests for chart methods
 */
public class NotesSlideTest extends ApiTest {
    @Test
    public void notesSlideStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        NotesSlide notesSlide = api.getNotesSlide(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertNotNull(notesSlide);
    }

    @Test
    public void notesSlideExistsStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        EntityExists exists = api.notesSlideExists(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertNotNull(exists);
    }

    @Test
    public void notesSlideDownloadStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        File notesSlide = api.downloadNotesSlide(c_fileName, c_slideIndex, c_format, null, null, c_password, c_folderName, null, null);
        assertNotNull(notesSlide);
        assertTrue(notesSlide.length() > 0);
        assertTrue(notesSlide.canRead());
    }

    @Test
    public void notesSlideGetRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        NotesSlide notesSlide = api.getNotesSlideOnline(file, c_slideIndex, c_password);
        assertNotNull(notesSlide);
    }

    @Test
    public void notesSlideExistsRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        EntityExists exists = api.notesSlideExistsOnline(file, c_slideIndex, c_password);
        assertTrue(exists.isExists());
    }

    @Test
    public void notesSlideDownloadRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File notesSlide = api.downloadNotesSlideOnline(file, c_slideIndex, c_format, null, null, c_password, null);
        assertNotNull(notesSlide);
        assertTrue(notesSlide.length() > 0);
        assertTrue(notesSlide.canRead());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 1;
    private final NotesSlideExportFormat c_format = NotesSlideExportFormat.PNG;
}
