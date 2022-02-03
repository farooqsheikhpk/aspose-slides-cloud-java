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
import java.util.Arrays;
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
        api.copyFile(tempFolderName + "/" + c_fileName, c_folderName + "/" + c_fileName, null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName2, c_folderName + "/" + c_fileName2, null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileNamePdf, c_folderName + "/" + c_fileNamePdf, null, null, null);
        PresentationsMergeRequest request = new PresentationsMergeRequest();
        List<String> items = new ArrayList<String>();
        items.add(c_folderName + "/" + c_fileName2);
        items.add(c_folderName + "/" + c_fileNamePdf);
        request.setPresentationPaths(items);
        api.merge(c_fileName, request, c_password, c_folderName, null);
    }

    @Test
    public void mergeOrderedStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName, c_folderName + "/" + c_fileName, null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName2, c_folderName + "/" + c_fileName2, null, null, null);
        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation = new PresentationToMerge();
        presentation.setPath(c_folderName + "/" + c_fileName2);
        presentation.setSlides(Arrays.asList( 2, 1 ));
        request.setPresentations(Arrays.asList( presentation ));
        api.orderedMerge(c_fileName, request, c_password, c_folderName, null);
    }

    @Test
    public void mergeRequestTest() throws ApiException, IOException {
        FileInfo file1 = new FileInfo();
        file1.setName(c_fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/TemplateCV.pptx")));
        FileInfo file2 = new FileInfo();
        file2.setName(c_fileName2);
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        List<FileInfo> files = new ArrayList<FileInfo>();
        files.add(file1);
        files.add(file2);
        api.mergeOnline(files, null, null);
    }

    @Test
    public void mergeAndSaveRequestTest() throws ApiException, IOException {
        FileInfo file1 = new FileInfo();
        file1.setName(c_fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/TemplateCV.pptx")));
        FileInfo file2 = new FileInfo();
        file2.setName(c_fileName2);
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        List<FileInfo> files = new ArrayList<FileInfo>();
        files.add(file1);
        files.add(file2);
        api.mergeAndSaveOnline(c_outPath, files, null, null);
        ObjectExist exists = api.objectExists(c_outPath, null, null);
        assertTrue(exists.isExists());
    }

    @Test
    public void mergeOrderedRequestTest() throws ApiException, IOException {
        FileInfo file1 = new FileInfo();
        file1.setName(c_fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName)));
        FileInfo file2 = new FileInfo();
        file2.setName(c_fileName2);
        file2.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName2)));
        List<FileInfo> files = new ArrayList<FileInfo>();
        files.add(file1);
        files.add(file2);
        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation1 = new PresentationToMerge();
        presentation1.setPath(c_fileName);
        presentation1.setPassword(c_password);
        PresentationToMerge presentation2 = new PresentationToMerge();
        presentation2.setPath(c_fileName2);
        presentation2.setSlides(Arrays.asList( 1, 2 ));
        request.setPresentations(Arrays.asList( presentation1, presentation2 ));
        api.mergeOnline(files, request, null);
    }

    @Test
    public void mergeOrderedCombinedTest() throws ApiException, IOException {
        initialize(null, null, null);
        api.copyFile(tempFolderName + "/" + c_fileName2, c_folderName + "/" + c_fileName2, null, null, null);
        FileInfo file1 = new FileInfo();
        file1.setName(c_fileName);
        file1.setData(Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName)));
        List<FileInfo> files = new ArrayList<FileInfo>();
        files.add(file1);
        OrderedMergeRequest request = new OrderedMergeRequest();
        PresentationToMerge presentation1 = new PresentationToMerge();
        presentation1.setPath(c_fileName);
        presentation1.setPassword(c_password);
        PresentationToMerge presentation2 = new PresentationToMerge();
        presentation2.setPath(c_folderName + "/" + c_fileName2);
        presentation2.setSource(PresentationToMerge.SourceEnum.STORAGE);
        presentation2.setSlides(Arrays.asList( 1, 2 ));
        request.setPresentations(Arrays.asList( presentation1, presentation2 ));
        api.mergeOnline(files, request, null);
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_fileName2 = "test-unprotected.pptx";
    private final String c_fileNamePdf = "test.pdf";
    private final String c_password = "password";
    private final String c_outPath = c_folderName + "/merged.pptx";
}
