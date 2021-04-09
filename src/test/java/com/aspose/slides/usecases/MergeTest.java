// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="MergeTest.java">
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
import com.aspose.slides.FileInfo;
import com.aspose.slides.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for merge methods
 */
public class MergeTest extends ApiTest {
    @Test
    public void mergeStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName2, c_folderName + "/" + c_fileName2, null, null, null);
        PresentationsMergeRequest request = new PresentationsMergeRequest();
        List<String> paths = new ArrayList<String>();
        paths.add(c_folderName + "/" + c_fileName2);
        request.setPresentationPaths(paths);
        Document result = api.merge(c_fileName, request, c_password, c_folderName, null);
        assertNotNull(result);
    }

    @Test
    public void mergeOrderedStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName2, c_folderName + "/" + c_fileName2, null, null, null);
        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation = new PresentationToMerge();
        presentation.setPath(c_folderName + "/" + c_fileName2);
        List<Integer> slides = new ArrayList<Integer>();
        slides.add(2);
        slides.add(1);
        presentation.setSlides(slides);
        List<PresentationToMerge> presentations = new ArrayList<PresentationToMerge>();
        presentations.add(presentation);
        request.setPresentations(presentations);
        Document result = api.orderedMerge(c_fileName, request, c_password, c_folderName, null);
        assertNotNull(result);
    }

    @Test
    public void mergeRequestTest() throws ApiException, IOException {
        List<FileInfo> files = new ArrayList<FileInfo>();
        FileInfo file1 = new FileInfo();
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName)));
        file1.setName(c_fileName);
        files.add(file1);
        FileInfo file2 = new FileInfo();
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        file2.setName(c_fileName2);
        files.add(file2);
        File result = api.mergeOnline(files, null, c_password);
        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertTrue(result.canRead());
    }

    @Test
    public void mergeAndSaveRequestTest() throws ApiException, IOException {
        List<FileInfo> files = new ArrayList<FileInfo>();
        FileInfo file1 = new FileInfo();
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName)));
        files.add(file1);
        FileInfo file2 = new FileInfo();
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        files.add(file2);
        api.mergeAndSaveOnline(c_outPath, files, null, c_password, null);
        ObjectExist exists = api.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void mergeOrderedRequestTest() throws ApiException, IOException {
        List<FileInfo> files = new ArrayList<FileInfo>();
        FileInfo file1 = new FileInfo();
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName)));
        file1.setName(c_fileName);
        files.add(file1);
        FileInfo file2 = new FileInfo();
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        file2.setName(c_fileName2);
        files.add(file2);
        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation = new PresentationToMerge();
        presentation.setPath(c_fileName2);
        List<Integer> slides = new ArrayList<Integer>();
        slides.add(1);
        slides.add(2);
        presentation.setSlides(slides);
        List<PresentationToMerge> presentations = new ArrayList<PresentationToMerge>();
        presentations.add(presentation);
        request.setPresentations(presentations);
        File result = api.mergeOnline(files, request, c_password);
        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertTrue(result.canRead());
    }

    @Test
    public void mergeOrderedCombinedTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName2, c_folderName + "/" + c_fileName2, null, null, null);
        List<FileInfo> files = new ArrayList<FileInfo>();
        FileInfo file1 = new FileInfo();
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName)));
        files.add(file1);
        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation = new PresentationToMerge();
        List<Integer> slides = new ArrayList<Integer>();
        slides.add(1);
        slides.add(2);
        presentation.setSlides(slides);
        presentation.setSource(PresentationToMerge.SourceEnum.STORAGE);
        presentation.setPath(c_folderName + "/" + c_fileName2);
        List<PresentationToMerge> presentations = new ArrayList<PresentationToMerge>();
        presentations.add(presentation);
        request.setPresentations(presentations);
        File result = api.mergeOnline(files, request, c_password);
        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertTrue(result.canRead());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_fileName2 = "test-unprotected.pptx";
    private final String c_password = "password";
    private final String c_outPath = c_folderName + "/merged.pptx";
}
