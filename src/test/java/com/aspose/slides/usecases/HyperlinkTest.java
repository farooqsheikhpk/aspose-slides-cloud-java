// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="HyperlinkTests.java">
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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * API tests for headerfooter methods
 */
public class HyperlinkTest extends ApiTest {
    @Test
    public void hyperlinkGetShapeTest() throws ApiException, IOException {
        initialize(null, null, null);
        ShapeBase shape = api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null);
        assertNotNull(shape.getHyperlinkClick());
        assertEquals(Hyperlink.ActionTypeEnum.HYPERLINK, shape.getHyperlinkClick().getActionType());
        assertNull(shape.getHyperlinkMouseOver());
    }

    @Test
    public void hyperlinkGetPortionTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portion portion = api.getPortion(c_fileName, c_slideIndex, c_hoverShapeIndex, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertNull(portion.getHyperlinkClick());
        assertNotNull(portion.getHyperlinkMouseOver());
        assertEquals(Hyperlink.ActionTypeEnum.JUMPLASTSLIDE, portion.getHyperlinkMouseOver().getActionType());
    }

    @Test
    public void hyperlinkCreateShapeTest() throws ApiException, IOException {
        int slideIndex = 1;
        int shapeIndex = 1;
        initialize(null, null, null);
        Shape shape = new Shape();
        Hyperlink hyperlink = new Hyperlink();
        hyperlink.setActionType(Hyperlink.ActionTypeEnum.HYPERLINK);
        hyperlink.setExternalUrl("https://docs.aspose.cloud/slides");
        shape.setHyperlinkClick(hyperlink);
        Shape updatedShape = (Shape)api.updateShape(c_fileName, slideIndex, shapeIndex, shape, c_password, c_folderName, null);
        assertNotNull(updatedShape.getHyperlinkClick());
        assertEquals(shape.getHyperlinkClick().getExternalUrl(), updatedShape.getHyperlinkClick().getExternalUrl());
    }

    @Test
    public void hyperlinkCreatePortionTest() throws ApiException, IOException {
        int slideIndex = 1;
        int shapeIndex = 1;
        initialize(null, null, null);
        Portion dto = new Portion();
        dto.setText("Link text");
        Hyperlink link = new Hyperlink();
        link.setActionType(Hyperlink.ActionTypeEnum.JUMPLASTSLIDE);
        dto.setHyperlinkMouseOver(link);
        Portion updatedPortion = api.createPortion(
            c_fileName, slideIndex, shapeIndex, c_paragraphIndex, dto, null, c_password, c_folderName, null);
        assertNotNull(updatedPortion.getHyperlinkMouseOver());
        assertEquals(dto.getHyperlinkMouseOver().getActionType(), updatedPortion.getHyperlinkMouseOver().getActionType());
    }

    @Test
    public void hyperlinkDeleteTest() throws ApiException, IOException {
        initialize(null, null, null);
        PictureFrame shape = new PictureFrame();
        Hyperlink hyperlink = new Hyperlink();
        hyperlink.setIsDisabled(true);
        shape.setHyperlinkClick(hyperlink);
        ShapeBase updatedShape = api.updateShape(c_fileName, c_slideIndex, c_shapeIndex, shape, c_password, c_folderName, null);
        assertNull(updatedShape.getHyperlinkClick());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 2;
    private final int c_shapeIndex = 2;
    private final int c_hoverShapeIndex = 1;
    private final int c_paragraphIndex = 1;
    private final int c_portionIndex = 2;
}
