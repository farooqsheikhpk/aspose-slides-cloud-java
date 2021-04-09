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
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 * API tests for shape types
 */
public class ShapeTest extends ApiTest {
    @Test
    public void shapeAddTest() throws ApiException, IOException {
        initialize(null, null, null);
        Shape dto = new Shape();
        dto.setShapeType(GeometryShape.ShapeTypeEnum.CALLOUT1);
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof Shape);
    }

    @Test
    public void shapeEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        try {
            //Cannot create shape with no ShapeType specified
            api.createShape(c_fileName, c_slideIndex, new Shape(), null, null, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void graphicalObjectEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        try {
            //Cannot create a graphical object
            api.createShape(c_fileName, c_slideIndex, new GraphicalObject(), null, null, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void pictureFrameAddTest() throws ApiException, IOException {
        initialize(null, null, null);
        PictureFrame dto = new PictureFrame();
        PictureFill pictureFill = new PictureFill();
        pictureFill.setBase64Data("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsQAAA7EAZUrDhsAAAANSURBVBhXY5g+ffp/AAZTAsWGL27gAAAAAElFTkSuQmCC");
        dto.setPictureFillFormat(pictureFill);
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof PictureFrame);
    }

    @Test
    public void pictureFrameEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        try {
            //Cannot create picture with no data specified
            api.createShape(c_fileName, c_slideIndex, new PictureFrame(), null, null, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void audioFrameAddTest() throws ApiException, IOException {
        initialize(null, null, null);
        AudioFrame dto = new AudioFrame();
        dto.setBase64Data("bXAzc2FtcGxl");
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof AudioFrame);
    }

    @Test
    public void audioFrameEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        try {
            //Cannot create audio with no data specified
            api.createShape(c_fileName, c_slideIndex, new AudioFrame(), null, null, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void videoFrameAddTest() throws ApiException, IOException {
        initialize(null, null, null);
        VideoFrame dto = new VideoFrame();
        dto.setBase64Data("bXAzc2FtcGxl");
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof VideoFrame);
    }

    @Test
    public void videoFrameEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        try {
            //Cannot create video with no data specified
            api.createShape(c_fileName, c_slideIndex, new VideoFrame(), null, null, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void oleObjectFrameEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        try {
            //Cannot create an OleObjectFrame
            api.createShape(c_fileName, c_slideIndex, new OleObjectFrame(), null, null, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void smartArtAddTest() throws ApiException, IOException {
        initialize(null, null, null);
        SmartArt dto = new SmartArt();
        dto.setX(0.0);
        dto.setY(0.0);
        dto.setWidth(300.0);
        dto.setHeight(200.0);
        dto.setLayout(SmartArt.LayoutEnum.BASICPROCESS);
        dto.setQuickStyle(SmartArt.QuickStyleEnum.SIMPLEFILL);
        dto.setColorStyle(SmartArt.ColorStyleEnum.COLOREDFILLACCENT1);
        List<SmartArtNode> nodes = new ArrayList<SmartArtNode>();
        SmartArtNode node1 = new SmartArtNode();
        node1.setText("First");
        node1.setOrgChartLayout(SmartArtNode.OrgChartLayoutEnum.INITIAL);
        List<SmartArtNode> subnodes = new ArrayList<SmartArtNode>();
        SmartArtNode subnode1 = new SmartArtNode();
        subnode1.setText("SubFirst");
        subnode1.setOrgChartLayout(SmartArtNode.OrgChartLayoutEnum.INITIAL);
        subnodes.add(subnode1);
        node1.setNodes(subnodes);
        nodes.add(node1);
        SmartArtNode node2 = new SmartArtNode();
        node2.setText("Second");
        node2.setOrgChartLayout(SmartArtNode.OrgChartLayoutEnum.INITIAL);
        nodes.add(node2);
        dto.setNodes(nodes);
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof SmartArt);
    }

    @Test
    public void smartArtEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, new SmartArt(), null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof SmartArt);
    }

    @Test //See ChartTests for non-empty chart examples
    public void chartEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, new Chart(), null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof Chart);
    }

    @Test
    public void tableAddTest() throws ApiException, IOException {
        initialize(null, null, null);
        Table dto = new Table();
        dto.setX(30.0);
        dto.setY(20.0);
        dto.setStyle(Table.StyleEnum.MEDIUMSTYLE2ACCENT1);
        dto.setFirstRow(true);
        dto.setHorizontalBanding(true);
        List<TableRow> rows = new ArrayList<TableRow>();
        TableRow row1 = new TableRow();
        List<TableCell> cells1 = new ArrayList<TableCell>();
        TableCell cell11 = new TableCell();
        cell11.setText("0.1");
        cells1.add(cell11);
        TableCell cell12 = new TableCell();
        cell12.setText("0.2");
        cells1.add(cell12);
        TableCell cell13 = new TableCell();
        cell13.setText("0.3");
        cells1.add(cell13);
        TableCell cell14 = new TableCell();
        cell14.setText("0.4");
        cells1.add(cell14);
        row1.setCells(cells1);
        rows.add(row1);
        TableRow row2 = new TableRow();
        row2.setMinimalHeight(60.0);
        List<TableCell> cells2 = new ArrayList<TableCell>();
        TableCell cell21 = new TableCell();
        cell21.setText("1");
        cells2.add(cell21);
        TableCell cell22 = new TableCell();
        cell22.setText("2-3");
        cell22.setColSpan(2);
        cell22.setRowSpan(2);
        cells2.add(cell22);
        TableCell cell23 = new TableCell();
        cell23.setText("4");
        cells2.add(cell23);
        row2.setCells(cells2);
        rows.add(row2);
        TableRow row3 = new TableRow();
        List<TableCell> cells3 = new ArrayList<TableCell>();
        TableCell cell31 = new TableCell();
        cell31.setText("first");
        cells3.add(cell31);
        TableCell cell32 = new TableCell();
        cell32.setText("last");
        cells3.add(cell32);
        row3.setCells(cells3);
        rows.add(row3);
        TableRow row4 = new TableRow();
        List<TableCell> cells4 = new ArrayList<TableCell>();
        TableCell cell41 = new TableCell();
        cell41.setText("3.1");
        cells4.add(cell41);
        TableCell cell42 = new TableCell();
        cell42.setText("3.2");
        cells4.add(cell42);
        TableCell cell43 = new TableCell();
        cell43.setText("3.3");
        cells4.add(cell43);
        TableCell cell44 = new TableCell();
        cell44.setText("3.4");
        cells4.add(cell44);
        row4.setCells(cells4);
        rows.add(row4);
        TableRow row5 = new TableRow();
        List<TableCell> cells5 = new ArrayList<TableCell>();
        TableCell cell51 = new TableCell();
        cell51.setText("4.1");
        cells5.add(cell51);
        TableCell cell52 = new TableCell();
        cell52.setText("4.2");
        cells5.add(cell52);
        TableCell cell53 = new TableCell();
        cell53.setText("4.3");
        cells5.add(cell53);
        TableCell cell54 = new TableCell();
        cell54.setText("4.4");
        cells5.add(cell54);
        row5.setCells(cells5);
        rows.add(row5);
        dto.setRows(rows);
        List<TableColumn> columns = new ArrayList<TableColumn>();
        TableColumn column1 = new TableColumn();
        column1.setWidth(100.0);
        columns.add(column1);
        TableColumn column2 = new TableColumn();
        column2.setWidth(100.0);
        columns.add(column2);
        TableColumn column3 = new TableColumn();
        column3.setWidth(100.0);
        columns.add(column3);
        TableColumn column4 = new TableColumn();
        column4.setWidth(100.0);
        columns.add(column4);
        dto.setColumns(columns);
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof Table);
    }

    @Test
    public void tableEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        try {
            //Cannot create a table with no columns and rows
            api.createShape(c_fileName, c_slideIndex, new Table(), null, null, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void groupShapeTest() throws ApiException, IOException {
        initialize(null, null, null);
        try {
            //Cannot create a group shape
            api.createShape(c_fileName, c_slideIndex, new GroupShape(), null, null, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void connectorAddTest() throws ApiException, IOException {
        initialize(null, null, null);
        Connector dto = new Connector();
        dto.setShapeType(GeometryShape.ShapeTypeEnum.BENTCONNECTOR3);
        ResourceUri startShape = new ResourceUri();
        startShape.setHref("https://api.aspose.cloud/v3.0/slides/myPresentation.pptx/slides/1/shapes/1");
        dto.setStartShapeConnectedTo(startShape);
        ResourceUri endShape = new ResourceUri();
        endShape.setHref("https://api.aspose.cloud/v3.0/slides/myPresentation.pptx/slides/1/shapes/2");
        dto.setEndShapeConnectedTo(endShape);
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof Connector);
    }

    @Test
    public void connectorEmptyTest() throws ApiException, IOException {
        initialize(null, null, null);
        ShapeBase shape = api.createShape(c_fileName, c_slideIndex, new Connector(), null, null, c_password, c_folderName, null);
        assertTrue(shape instanceof Connector);
    }

    @Test
    public void shapesAlignTest() throws ApiException, IOException {
        initialize(null, null, null);
        ShapeBase shape1 = api.getShape(c_fileName, 2, 1, c_password, c_folderName, null);
        ShapeBase shape2 = api.getShape(c_fileName, 2, 2, c_password, c_folderName, null);
        assertNotEquals(shape1.getX(), shape2.getX(), 1.0);
        assertNotEquals(shape1.getY(), shape2.getY(), 1.0);

        api.alignShapes(c_fileName, 2, ShapesAlignmentType.ALIGNTOP, null, null, c_password, c_folderName, null);
        shape1 = api.getShape(c_fileName, 2, 1, c_password, c_folderName, null);
        shape2 = api.getShape(c_fileName, 2, 2, c_password, c_folderName, null);
        assertNotEquals(shape1.getX(), shape2.getX(), 1.0);
        assertEquals(shape1.getY(), shape2.getY(), 1.0);

        List<Integer> shapes = new ArrayList<Integer>();
        shapes.add(1);
        shapes.add(2);
        api.alignShapes(c_fileName, 2, ShapesAlignmentType.ALIGNLEFT, true, shapes, c_password, c_folderName, null);
        shape1 = api.getShape(c_fileName, 2, 1, c_password, c_folderName, null);
        shape2 = api.getShape(c_fileName, 2, 2, c_password, c_folderName, null);
        assertEquals(shape1.getX(), shape2.getX(), 1.0);
        assertEquals(shape1.getY(), shape2.getY(), 1.0);
        assertEquals(0.0, shape1.getX().doubleValue(), 1.0);
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_slideIndex = 3;
}
