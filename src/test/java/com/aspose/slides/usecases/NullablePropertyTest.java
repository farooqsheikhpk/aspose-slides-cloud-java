/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * API tests for nullable property deserialization
 */
public class NullablePropertyTest extends ApiTest {
    /**
     * Read slide placeholder info.
     * @throws ApiException
     * @throws java.io.IOException
     */
    @Test
    public void nullablePropertyTest() throws ApiException, IOException {
        initialize("noSpecificMethod", "noSpecificProperty", null);
        String folderName = "TempSlidesSDK";
        String fileName = "placeholders.pptx";
        String password = "password";
        double min1  = 44.3;
        double min2 = 12;
        double max1 = 104.3;
        double max2 = 87;
        api.copyFile("TempTests/" + fileName, folderName + "/" + fileName, null, null, null);

        Chart testDto = new Chart();
        testDto.setChartType(Chart.ChartTypeEnum.LINE);
        testDto.setWidth(400.0);
        testDto.setHeight(300.0);
        ChartTitle testTitle = new ChartTitle();
        testTitle.setHasTitle(true);
        testTitle.setText("MyTitle");
        testDto.setTitle(testTitle);
        OneValueSeries testSeries = new OneValueSeries();
        testSeries.setType(OneValueSeries.TypeEnum.CLUSTEREDCOLUMN);
        testSeries.setDataPointType(OneValueSeries.DataPointTypeEnum.ONEVALUE);
        testSeries.setName("Series1");
        OneValueChartDataPoint testPoint1 = new OneValueChartDataPoint();
        testPoint1.setValue(40.0);
        OneValueChartDataPoint testPoint2 = new OneValueChartDataPoint();
        testPoint2.setValue(50.0);
        List<OneValueChartDataPoint> points = new ArrayList<OneValueChartDataPoint>();
        points.add(testPoint1);
        points.add(testPoint2);
        testSeries.setDataPoints(points);
        List<Series> series = new ArrayList<Series>();
        series.add(testSeries);
        testDto.setSeries(series);
        testDto.setCategories(null);
        Axes testAxes = new Axes();
        Axis testAxis = new Axis();
        testAxis.setIsAutomaticMinValue(false);
        testAxis.setMinValue(min1);
        testAxis.setIsAutomaticMaxValue(false);
        testAxis.setMaxValue(max1);
        testAxes.setHorizontalAxis(testAxis);
        testDto.setAxes(testAxes);
        api.createShape(fileName, 1, testDto, null, null, password, folderName, null);
        ShapeBase result = api.getShape(fileName, 1, 4, password, folderName, null);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMinValue() == min1);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMaxValue() == max1);

        testDto = new Chart();
        testAxes = new Axes();
        testAxis = new Axis();
        testAxis.setMinValue(min2);
        testAxes.setHorizontalAxis(testAxis);
        testDto.setAxes(testAxes);
        api.updateShape(fileName, 1, 4, testDto, password, folderName, null);

        result = api.getShape(fileName, 1, 4, password, folderName, null);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMinValue() == min2);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMaxValue() == max1);

        testAxis = new Axis();
        testAxis.setMaxValue(max2);
        testAxes.setHorizontalAxis(testAxis);
        api.updateShape(fileName, 1, 4, testDto, password, folderName, null);

        result = api.getShape(fileName, 1, 4, password, folderName, null);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMinValue() == min2);
        assertTrue(((Chart)result).getAxes().getHorizontalAxis().getMaxValue() == max2);
    }
}
