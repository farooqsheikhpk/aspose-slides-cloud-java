// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="MathTest.java">
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
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * API tests for math methods
 */
public class MathTest extends ApiTest {
    @Test
    public void mathGetTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portion portion = api.getPortion(
                c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertNotNull(portion.getMathParagraph());
        assertNotNull(portion.getMathParagraph().getMathBlockList());
        assertEquals(1, portion.getMathParagraph().getMathBlockList().size());
        assertNotNull(portion.getMathParagraph().getMathBlockList().get(0).getMathElementList());
        assertEquals(3, portion.getMathParagraph().getMathBlockList().get(0).getMathElementList().size());
        assertTrue(portion.getMathParagraph().getMathBlockList().get(0).getMathElementList().get(2) instanceof FractionElement);
    }

    @Test
    public void mathGetNullTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portion portion = api.getPortion(
                c_fileName, c_slideIndex, c_notMathShapeIndex, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertNull(portion.getMathParagraph());
    }

    @Test
    public void mathCreateTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portion dto = new Portion();
        MathParagraph mathParagraph = new MathParagraph();
        List<BlockElement> mathBlocks = new ArrayList<BlockElement>();
        BlockElement blockElement = new BlockElement();
        List<MathElement> mathElements = new ArrayList<MathElement>();
        FunctionElement functionElement = new FunctionElement();
        LimitElement limitElement = new LimitElement();
        TextElement text1 = new TextElement();
        text1.setValue("lim");
        limitElement.setBase(text1);
        TextElement text2 = new TextElement();
        text2.setValue("x->0");
        limitElement.setLimit(text2);
        functionElement.setName(limitElement);
        FractionElement fractionElement = new FractionElement();
        FunctionElement sinusElement = new FunctionElement();
        TextElement text3 = new TextElement();
        text3.setValue("sin");
        sinusElement.setName(text3);
        TextElement text4 = new TextElement();
        text4.setValue("x");
        sinusElement.setBase(text4);
        fractionElement.setNumerator(sinusElement);
        TextElement text5 = new TextElement();
        text5.setValue("x");
        limitElement.setLimit(text5);
        fractionElement.setDenominator(fractionElement);
        functionElement.setBase(fractionElement);
        mathElements.add(functionElement);
        blockElement.setMathElementList(mathElements);
        mathBlocks.add(blockElement);
        mathParagraph.setMathBlockList(mathBlocks);
        dto.setMathParagraph(mathParagraph);
        Portion portion = api.createPortion(c_fileName, 1, 1, c_paragraphIndex, dto, null, c_password, c_folderName, null);
        assertNotNull(portion.getMathParagraph());
        assertNotNull(portion.getMathParagraph().getMathBlockList());
        assertEquals(1, portion.getMathParagraph().getMathBlockList().size());
        assertNotNull(portion.getMathParagraph().getMathBlockList().get(0).getMathElementList());
        assertEquals(1, portion.getMathParagraph().getMathBlockList().get(0).getMathElementList().size());
        assertTrue(portion.getMathParagraph().getMathBlockList().get(0).getMathElementList().get(0) instanceof FunctionElement);
    }

    @Test
    public void mathUpdateTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portion dto = new Portion();
        MathParagraph mathParagraph = new MathParagraph();
        List<BlockElement> mathBlocks = new ArrayList<BlockElement>();
        BlockElement blockElement = new BlockElement();
        List<MathElement> mathElements = new ArrayList<MathElement>();
        FunctionElement functionElement = new FunctionElement();
        LimitElement limitElement = new LimitElement();
        TextElement text1 = new TextElement();
        text1.setValue("lim");
        limitElement.setBase(text1);
        TextElement text2 = new TextElement();
        text2.setValue("x->0");
        limitElement.setLimit(text2);
        functionElement.setName(limitElement);
        FractionElement fractionElement = new FractionElement();
        FunctionElement sinusElement = new FunctionElement();
        TextElement text3 = new TextElement();
        text3.setValue("sin");
        sinusElement.setName(text3);
        TextElement text4 = new TextElement();
        text4.setValue("x");
        sinusElement.setBase(text4);
        fractionElement.setNumerator(sinusElement);
        TextElement text5 = new TextElement();
        text5.setValue("x");
        limitElement.setLimit(text5);
        fractionElement.setDenominator(fractionElement);
        functionElement.setBase(fractionElement);
        mathElements.add(functionElement);
        blockElement.setMathElementList(mathElements);
        mathBlocks.add(blockElement);
        mathParagraph.setMathBlockList(mathBlocks);
        dto.setMathParagraph(mathParagraph);
        Portion portion = api.updatePortion(
            c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_portionIndex, dto, c_password, c_folderName, null);
        assertNotNull(portion.getMathParagraph());
        assertNotNull(portion.getMathParagraph().getMathBlockList());
        assertEquals(1, portion.getMathParagraph().getMathBlockList().size());
        assertNotNull(portion.getMathParagraph().getMathBlockList().get(0).getMathElementList());
        assertEquals(1, portion.getMathParagraph().getMathBlockList().get(0).getMathElementList().size());
        assertTrue(portion.getMathParagraph().getMathBlockList().get(0).getMathElementList().get(0) instanceof FunctionElement);
    }

    @Test
    public void mathDownloadTest() throws ApiException, IOException {
        initialize(null, null, null);
        File mathMl = api.downloadPortionAsMathMl(
            c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        assertNotNull(mathMl);
        assertTrue(mathMl.length() > 0);
        assertTrue(mathMl.canRead());
    }

    @Test
    public void mathDownloadNullTest() throws ApiException, IOException {
        initialize(null, null, null);
        try {
            //Cannot convert an ordinary portion to MathML
            File mathMl = api.downloadPortionAsMathMl(
                c_fileName, c_slideIndex, c_notMathShapeIndex, c_paragraphIndex, c_portionIndex, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void mathSaveTest() throws ApiException, IOException {
        String outPath = c_folderName + "/mathml.xml";
        initialize(null, null, null);
        api.savePortionAsMathMl(
            c_fileName, c_slideIndex, c_shapeIndex, c_paragraphIndex, c_portionIndex, outPath, c_password, c_folderName, null);
        ObjectExist exists = api.objectExists(outPath, null, null);
        assertTrue(exists.isExists());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 2;
    private final int c_shapeIndex = 3;
    private final int c_notMathShapeIndex = 1;
    private final int c_paragraphIndex = 1;
    private final int c_portionIndex = 1;
}
