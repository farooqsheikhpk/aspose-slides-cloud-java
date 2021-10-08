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
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * API tests for chart methods
 */
public class MasterSlideTest extends ApiTest {
    @Test
    public void masterSlidesTest() throws ApiException, IOException {
        String sourceFile = "TemplateCV.pptx";
        String sourcePath = c_folderName + "/" + sourceFile;
        initialize(null, null, null);
        MasterSlides masterSlides = api.getMasterSlides(c_fileName, c_password, c_folderName, null);
        assertEquals(1, masterSlides.getSlideList().size());

        MasterSlide masterSlide = api.getMasterSlide(c_fileName, 1, c_password, c_folderName, null);
        assertEquals("Office Theme", masterSlide.getName());

        masterSlide = api.copyMasterSlide(c_fileName, sourcePath, 1, null, null, null, c_password, c_folderName, null);
        assertEquals("Digital portfolio", masterSlide.getName());

        masterSlides = api.getMasterSlides(c_fileName, c_password, c_folderName, null);
        assertEquals(2, masterSlides.getSlideList().size());
    }

    @Test
    public void masterSlideShapesTest() throws ApiException, IOException {
        initialize(null, null, null);
        Shapes shapes = api.getSpecialSlideShapes(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_password, c_folderName, null);
        assertEquals(c_shapeCount, shapes.getShapesLinks().size());

        Shape dto = new Shape();
        dto.setX(100.0);
        dto.setY(100.0);
        dto.setWidth(500.0);
        dto.setHeight(200.0);
        dto.setShapeType(GeometryShape.ShapeTypeEnum.RECTANGLE);
        dto.setText("New shape");
        Shape shape = (Shape)api.createSpecialSlideShape(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, dto, null, null, c_password, c_folderName, null);
        assertEquals(dto.getText(), shape.getText());
        shapes = api.getSpecialSlideShapes(c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_password, c_folderName, null);
        assertEquals(c_shapeCount + 1, shapes.getShapesLinks().size());

        dto.setText("Updated shape");
        shape = (Shape)api.updateSpecialSlideShape(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeCount + 1, dto, c_password, c_folderName, null);
        assertEquals(dto.getText(), shape.getText());
        shapes = api.getSpecialSlideShapes(c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_password, c_folderName, null);
        assertEquals(c_shapeCount + 1, shapes.getShapesLinks().size());

        api.deleteSpecialSlideShape(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeCount + 1, c_password, c_folderName, null);
        shapes = api.getSpecialSlideShapes(c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_password, c_folderName, null);
        assertEquals(c_shapeCount, shapes.getShapesLinks().size());
    }

    @Test
    public void masterSlideParagraphsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Paragraphs paragraphs = api.getSpecialSlideParagraphs(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(c_paragraphCount, paragraphs.getParagraphLinks().size());

        Paragraph dto = new Paragraph();
        dto.setAlignment(Paragraph.AlignmentEnum.RIGHT);
        List<Portion> portions = new ArrayList<Portion>();
        Portion portion = new Portion();
        portion.setText("New paragraph");
        portions.add(portion);
        dto.setPortionList(portions);
        Paragraph paragraph = api.createSpecialSlideParagraph(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, dto, null, c_password, c_folderName, null);
        assertEquals(dto.getAlignment(), paragraph.getAlignment());
        paragraphs = api.getSpecialSlideParagraphs(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(c_paragraphCount + 1, paragraphs.getParagraphLinks().size());

        dto = new Paragraph();
        dto.setAlignment(Paragraph.AlignmentEnum.CENTER);
        paragraph = api.updateSpecialSlideParagraph(
            c_fileName,
            c_slideIndex,
            SpecialSlideType.MASTERSLIDE,
            c_shapeIndex,
            c_paragraphCount + 1,
            dto,
            c_password,
            c_folderName,
            null);
        assertEquals(dto.getAlignment(), paragraph.getAlignment());
        paragraphs = api.getSpecialSlideParagraphs(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(c_paragraphCount + 1, paragraphs.getParagraphLinks().size());

        api.deleteSpecialSlideParagraph(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, c_paragraphCount + 1, c_password, c_folderName, null);
        paragraphs = api.getSpecialSlideParagraphs(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, c_password, c_folderName, null);
        assertEquals(c_paragraphCount, paragraphs.getParagraphLinks().size());
    }

    @Test
    public void masterSlidePortionsTest() throws ApiException, IOException {
        initialize(null, null, null);
        Portions portions = api.getSpecialSlidePortions(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(c_portionCount, portions.getItems().size());

        Portion dto = new Portion();
        dto.setFontBold(Portion.FontBoldEnum.TRUE);
        dto.setText("New portion");
        Portion portion = api.createSpecialSlidePortion(
            c_fileName,
            c_slideIndex,
            SpecialSlideType.MASTERSLIDE,
            c_shapeIndex,
            c_paragraphIndex,
            dto,
            null,
            c_password,
            c_folderName,
            null);
        assertEquals(dto.getFontBold(), portion.getFontBold());
        assertEquals(dto.getText(), portion.getText());
        portions = api.getSpecialSlidePortions(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(c_portionCount + 1, portions.getItems().size());

        Portion dto2 = new Portion();
        dto2.setFontHeight(22.0);
        dto2.setText("Updated portion");
        portion = api.updateSpecialSlidePortion(
            c_fileName,
            c_slideIndex,
            SpecialSlideType.MASTERSLIDE,
            c_shapeIndex,
            c_paragraphIndex,
            c_portionCount + 1,
            dto2,
            c_password,
            c_folderName,
            null);
        assertEquals(dto.getFontBold(), portion.getFontBold());
        assertEquals(dto2.getFontHeight(), portion.getFontHeight());
        assertEquals(dto2.getText(), portion.getText());
        portions = api.getSpecialSlidePortions(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(c_portionCount + 1, portions.getItems().size());

        api.deleteSpecialSlidePortion(
            c_fileName,
            c_slideIndex,
            SpecialSlideType.MASTERSLIDE,
            c_shapeIndex,
            c_paragraphIndex,
            c_portionCount + 1,
            c_password,
            c_folderName,
            null);
        portions = api.getSpecialSlidePortions(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_shapeIndex, c_paragraphIndex, c_password, c_folderName, null);
        assertEquals(c_portionCount, portions.getItems().size());
    }

    @Test
    public void masterSlideAnimationTest() throws ApiException, IOException {
        initialize(null, null, null);
        SlideAnimation animation = api.getSpecialSlideAnimation(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, null, c_password, c_folderName, null);
        assertEquals(1, animation.getMainSequence().size());

        SlideAnimation dto = new SlideAnimation();
        List<Effect> effects = new ArrayList<Effect>();
        Effect effect1 = new Effect();
        effect1.setType(Effect.TypeEnum.BLINK);
        effect1.setShapeIndex(2);
        effects.add(effect1);
        Effect effect2 = new Effect();
        effect2.setType(Effect.TypeEnum.APPEAR);
        effect2.setShapeIndex(3);
        effects.add(effect2);
        dto.setMainSequence(effects);
        animation = api.setSpecialSlideAnimation(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, dto, c_password, c_folderName, null);
        assertEquals(dto.getMainSequence().size(), animation.getMainSequence().size());
        animation = api.getSpecialSlideAnimation(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, 3, c_password, c_folderName, null);
        assertEquals(1, animation.getMainSequence().size());

        animation = api.deleteSpecialSlideAnimationEffect(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, 2, c_password, c_folderName, null);
        assertEquals(dto.getMainSequence().size() - 1, animation.getMainSequence().size());
        animation = api.getSpecialSlideAnimation(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, 3, c_password, c_folderName, null);
        assertEquals(0, animation.getMainSequence().size());

        animation = api.deleteSpecialSlideAnimation(
            c_fileName, c_slideIndex, SpecialSlideType.MASTERSLIDE, c_password, c_folderName, null);
        assertEquals(0, animation.getMainSequence().size());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 1;
    private final int c_shapeIndex = 2;
    private final int c_shapeCount = 6;
    private final int c_paragraphIndex = 3;
    private final int c_paragraphCount = 5;
    private final int c_portionCount = 1;
}
