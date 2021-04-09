// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="HeaderFooterTests.cs">
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
import java.io.IOException;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * API tests for headerfooter methods
 */
public class HeaderFooterTest extends ApiTest {
    @Test
    public void slidesFooterTest() throws ApiException, IOException {
        initialize(null, null, null);

        HeaderFooter dto = new HeaderFooter();
        dto.setIsFooterVisible(true);
        dto.setFooterText("footer");
        dto.setIsDateTimeVisible(false);
        Document document = api.setPresentationHeaderFooter(c_fileName, dto, c_password, c_folderName, null);
        assertNotNull(document);
        HeaderFooter headerFooter = api.getSlideHeaderFooter(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertNotNull(headerFooter);
        assertTrue(headerFooter.isIsFooterVisible());
        assertFalse(headerFooter.isIsDateTimeVisible());
    }

    @Test
    public void slideFooterTest() throws ApiException, IOException {
        initialize(null, null, null);

        HeaderFooter dto = new HeaderFooter();
        dto.setIsFooterVisible(true);
        dto.setFooterText("footer");
        dto.setIsDateTimeVisible(false);
        HeaderFooter headerFooter = api.setSlideHeaderFooter(c_fileName, c_slideIndex, dto, c_password, c_folderName, null);
        assertNotNull(headerFooter);
        assertTrue(headerFooter.isIsFooterVisible());
        assertFalse(headerFooter.isIsDateTimeVisible());
        headerFooter = api.getSlideHeaderFooter(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertNotNull(headerFooter);
        assertTrue(headerFooter.isIsFooterVisible());
        assertFalse(headerFooter.isIsDateTimeVisible());
    }

    @Test
    public void notesSlideFooterTest() throws ApiException, IOException {
        initialize(null, null, null);

        NotesSlideHeaderFooter dto = new NotesSlideHeaderFooter();
        dto.setIsHeaderVisible(true);
        dto.setHeaderText("header");
        dto.setIsDateTimeVisible(false);
        NotesSlideHeaderFooter headerFooter = api.setNotesSlideHeaderFooter(c_fileName, c_slideIndex, dto, c_password, c_folderName, null);
        assertNotNull(headerFooter);
        assertTrue(headerFooter.isIsHeaderVisible());
        assertFalse(headerFooter.isIsDateTimeVisible());
        headerFooter = api.getNotesSlideHeaderFooter(c_fileName, c_slideIndex, c_password, c_folderName, null);
        assertNotNull(headerFooter);
        assertTrue(headerFooter.isIsHeaderVisible());
        assertFalse(headerFooter.isIsDateTimeVisible());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 1;
}
