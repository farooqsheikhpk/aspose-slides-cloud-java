// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="TextTest.java">
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for text methods
 */
public class TextTest extends ApiTest {
    @Test
    public void textGetTest() throws ApiException, IOException {
        initialize(null, null, null);
        TextItems presentationItems = api.getPresentationTextItems(c_fileName, null, c_password, c_folderName, null);
        TextItems presentationItemsWithEmpty = api.getPresentationTextItems(c_fileName, true, c_password, c_folderName, null);
        TextItems slideItems = api.getSlideTextItems(c_fileName, c_slideIndex, null, c_password, c_folderName, null);
        TextItems slideItemsWithEmpty = api.getSlideTextItems(c_fileName, c_slideIndex, true, c_password, c_folderName, null);
        assertTrue(presentationItemsWithEmpty.getItems().size() > presentationItems.getItems().size());
        assertTrue(presentationItems.getItems().size() > slideItems.getItems().size());
        assertTrue(slideItemsWithEmpty.getItems().size() > slideItems.getItems().size());
    }

    @Test
    public void textReplaceStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        DocumentReplaceResult result = api.replacePresentationText(c_fileName, c_oldValue, c_newValue, null, c_password, c_folderName, null);

        initialize(null, null, null);
        DocumentReplaceResult resultIgnoreCase = api.replacePresentationText(c_fileName, c_oldValue, c_newValue, true, c_password, c_folderName, null);

        initialize(null, null, null);
        SlideReplaceResult slideResult = api.replaceSlideText(c_fileName, c_slideIndex, c_oldValue, c_newValue, null, c_password, c_folderName, null);

        initialize(null, null, null);
        SlideReplaceResult slideResultIgnoreCase = api.replaceSlideText(c_fileName, c_slideIndex, c_oldValue, c_newValue, true, c_password, c_folderName, null);

        assertTrue(resultIgnoreCase.getMatches() > result.getMatches());
        assertTrue(result.getMatches() > slideResult.getMatches());
        assertTrue(slideResultIgnoreCase.getMatches() > slideResult.getMatches());
    }

    @Test
    public void textReplaceRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File result = api.replacePresentationTextOnline(file, c_oldValue, c_newValue, null, c_password);
        File resultIgnoreCase = api.replacePresentationTextOnline(file, c_oldValue, c_newValue, true, c_password);
        File slideResult = api.replaceSlideTextOnline(file, c_slideIndex, c_oldValue, c_newValue, null, c_password);
        File slideResultIgnoreCase = api.replaceSlideTextOnline(file, c_slideIndex, c_oldValue, c_newValue, true, c_password);
        assertTrue(result.canRead());
        assertTrue(resultIgnoreCase.canRead());
        assertTrue(slideResult.canRead());
        assertTrue(slideResultIgnoreCase.canRead());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final String c_oldValue = "text";
    private final String c_newValue = "new_text";
    private final int c_slideIndex = 1;
}
