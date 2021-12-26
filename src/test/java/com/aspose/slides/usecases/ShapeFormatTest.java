// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ShapeTests.cs">
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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * API tests for shape format
 */
public class ShapeFormatTest extends ApiTest {
    @Test
    public void shapeFormatLine() throws ApiException, IOException {
        initialize(null, null, null);
        Shape dto = new Shape();
        LineFormat lineFormat = new LineFormat();
        lineFormat.setStyle(LineFormat.StyleEnum.THICKTHIN);
        lineFormat.setWidth(7.0);
        lineFormat.setDashStyle(LineFormat.DashStyleEnum.DASH);
        dto.setLineFormat(lineFormat);
        ShapeBase shape = api.updateShape(c_fileName, c_slideIndex, c_shapeIndex, dto, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
        shape = api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
        assertEquals(dto.getLineFormat().getWidth(), shape.getLineFormat().getWidth());
    }

    @Test
    public void shapeFormatFill() throws ApiException, IOException {
        initialize(null, null, null);
        Shape dto = new Shape();
        SolidFill fillFormat = new SolidFill();
        fillFormat.setColor("#FFFFFF00");
        dto.setFillFormat(fillFormat);
        ShapeBase shape = api.updateShape(c_fileName, c_slideIndex, c_shapeIndex, dto, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
        shape = api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
        assertTrue(shape.getFillFormat() instanceof SolidFill);
        assertEquals(((SolidFill)dto.getFillFormat()).getColor(), ((SolidFill)shape.getFillFormat()).getColor());
    }

    @Test
    public void shapeFormatEffect() throws ApiException, IOException {
        initialize(null, null, null);
        Shape dto = new Shape();
        EffectFormat effectFormat = new EffectFormat();
        InnerShadowEffect innerShadow = new InnerShadowEffect();
        innerShadow.setDirection(35.0);
        innerShadow.setBlurRadius(30.0);
        innerShadow.setDistance(40.0);
        innerShadow.setShadowColor("#FFFFFF00");
        effectFormat.setInnerShadow(innerShadow);
        dto.setEffectFormat(effectFormat);
        ShapeBase shape = api.updateShape(c_fileName, c_slideIndex, c_shapeIndex, dto, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
        shape = api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
        assertEquals(dto.getEffectFormat().getInnerShadow().getDirection(), shape.getEffectFormat().getInnerShadow().getDirection());
    }

    @Test
    public void shapeFormat3D() throws ApiException, IOException {
        initialize(null, null, null);
        Shape dto = new Shape();
        ThreeDFormat threeDFormat = new ThreeDFormat();
        threeDFormat.setDepth(4.0);

        ShapeBevel bevelTop = new ShapeBevel();
        bevelTop.setBevelType(ShapeBevel.BevelTypeEnum.CIRCLE);
        bevelTop.setHeight(6.0);
        bevelTop.setWidth(6.0);
        threeDFormat.setBevelTop(bevelTop);

        Camera camera = new Camera();
        camera.setCameraType(Camera.CameraTypeEnum.ORTHOGRAPHICFRONT);
        threeDFormat.setCamera(camera);

        LightRig lightRig = new LightRig();
        lightRig.setLightType(LightRig.LightTypeEnum.THREEPT);
        lightRig.setDirection(LightRig.DirectionEnum.TOP);
        threeDFormat.setLightRig(lightRig);
        dto.setThreeDFormat(threeDFormat);
        ShapeBase shape = api.updateShape(c_fileName, c_slideIndex, c_shapeIndex, dto, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
        shape = api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
        assertEquals(dto.getThreeDFormat().getDepth(), shape.getThreeDFormat().getDepth());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 1;
    private final int c_shapeIndex = 1;
}
