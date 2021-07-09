// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ChartTests.cs">
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for chart methods
 */
public class ChartTest extends ApiTest {
    @Test
    public void chartGetTest() throws ApiException, IOException {
        initialize(null, null, null);
        Chart chart = (Chart)api.getShape(c_fileName, c_slideIndex, c_shapeIndex, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
    }

    @Test
    public void chartCreateTest() throws ApiException, IOException {
        /*initialize(null, null, null);
        Chart dto = new Chart();
        dto.setChartType(Chart.ChartTypeEnum.CLUSTEREDCOLUMN);
        dto.setWidth(400.0);
        dto.setHeight(300.0);
        ChartCategory category1 = new ChartCategory();
        category1.setValue("Category1");
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Category2");
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Category3");
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        dto.setCategories(categories);
        List<Series> seriesList = new ArrayList<Series>();
        OneValueSeries series1 = new OneValueSeries();
        series1.setName("Series1");
        List<OneValueChartDataPoint> dataPoints1 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint11 = new OneValueChartDataPoint();
        dataPoint11.setValue(40.0);
        dataPoints1.add(dataPoint11);
        OneValueChartDataPoint dataPoint12 = new OneValueChartDataPoint();
        dataPoint12.setValue(50.0);
        dataPoints1.add(dataPoint12);
        OneValueChartDataPoint dataPoint13 = new OneValueChartDataPoint();
        dataPoint13.setValue(70.0);
        dataPoints1.add(dataPoint13);
        series1.setDataPoints(dataPoints1);
        seriesList.add(series1);
        OneValueSeries series2 = new OneValueSeries();
        series2.setName("Series2");
        List<OneValueChartDataPoint> dataPoints2 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint21 = new OneValueChartDataPoint();
        dataPoint21.setValue(55.0);
        dataPoints2.add(dataPoint21);
        OneValueChartDataPoint dataPoint22 = new OneValueChartDataPoint();
        dataPoint22.setValue(35.0);
        dataPoints2.add(dataPoint22);
        OneValueChartDataPoint dataPoint23 = new OneValueChartDataPoint();
        dataPoint23.setValue(90.0);
        dataPoints2.add(dataPoint23);
        series2.setDataPoints(dataPoints2);
        seriesList.add(series2);
        dto.setSeries(seriesList);
        Chart chart = (Chart)api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(2, chart.getSeries().size());
        assertEquals(3, chart.getCategories().size());*/
    }

    @Test
    public void chartUpdateTest() throws ApiException, IOException {
        /*initialize(null, null, null);
        Chart dto = new Chart();
        dto.setChartType(Chart.ChartTypeEnum.CLUSTEREDCOLUMN);
        dto.setWidth(400.0);
        dto.setHeight(300.0);
        ChartCategory category1 = new ChartCategory();
        category1.setValue("Category1");
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Category2");
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Category3");
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        dto.setCategories(categories);
        List<Series> seriesList = new ArrayList<Series>();
        OneValueSeries series1 = new OneValueSeries();
        series1.setName("Series1");
        List<OneValueChartDataPoint> dataPoints1 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint11 = new OneValueChartDataPoint();
        dataPoint11.setValue(40.0);
        dataPoints1.add(dataPoint11);
        OneValueChartDataPoint dataPoint12 = new OneValueChartDataPoint();
        dataPoint12.setValue(50.0);
        dataPoints1.add(dataPoint12);
        OneValueChartDataPoint dataPoint13 = new OneValueChartDataPoint();
        dataPoint13.setValue(70.0);
        dataPoints1.add(dataPoint13);
        series1.setDataPoints(dataPoints1);
        seriesList.add(series1);
        OneValueSeries series2 = new OneValueSeries();
        series2.setName("Series2");
        List<OneValueChartDataPoint> dataPoints2 = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint21 = new OneValueChartDataPoint();
        dataPoint21.setValue(55.0);
        dataPoints2.add(dataPoint21);
        OneValueChartDataPoint dataPoint22 = new OneValueChartDataPoint();
        dataPoint22.setValue(35.0);
        dataPoints2.add(dataPoint22);
        OneValueChartDataPoint dataPoint23 = new OneValueChartDataPoint();
        dataPoint23.setValue(90.0);
        dataPoints2.add(dataPoint23);
        series2.setDataPoints(dataPoints2);
        seriesList.add(series2);
        dto.setSeries(seriesList);
        Chart chart = (Chart)api.updateShape(c_fileName, c_slideIndex, c_shapeIndex, dto, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(2, chart.getSeries().size());
        assertEquals(3, chart.getCategories().size());*/
    }

    @Test
    public void chartSeriesCreateTest() throws ApiException, IOException {
        /*initialize(null, null, null);
        OneValueSeries series = new OneValueSeries();
        series.setName("Series1");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(14.0);
        dataPoints.add(dataPoint3);
        OneValueChartDataPoint dataPoint4 = new OneValueChartDataPoint();
        dataPoint4.setValue(70.0);
        dataPoints.add(dataPoint4);
        series.setDataPoints(dataPoints);
        Chart chart = api.createChartSeries(c_fileName, c_slideIndex, c_shapeIndex, series, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount + 1, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());*/
    }

    @Test
    public void chartSeriesUpdateTest() throws ApiException, IOException {
        /*initialize(null, null, null);
        OneValueSeries series = new OneValueSeries();
        series.setName("Series1");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(14.0);
        dataPoints.add(dataPoint3);
        OneValueChartDataPoint dataPoint4 = new OneValueChartDataPoint();
        dataPoint4.setValue(70.0);
        dataPoints.add(dataPoint4);
        series.setDataPoints(dataPoints);
        Chart chart = api.updateChartSeries(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, series, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());*/
    }

    @Test
    public void chartSeriesDeleteTest() throws ApiException, IOException {
        initialize(null, null, null);
        Chart chart = api.deleteChartSeries(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount - 1, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
    }

    @Test
    public void chartCategoryCreateTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        /*initialize(null, null, null);
        ChartCategory category = new ChartCategory();
        category.setValue("NewCategory");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(14.0);
        dataPoints.add(dataPoint3);
        category.setDataPoints(dataPoints);
        Chart chart = api.createChartCategory(c_fileName, c_slideIndex, c_shapeIndex, category, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount + 1, chart.getCategories().size());
        assertEquals(c_categoryCount + 1, ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().size());
        assertEquals(category.getDataPoints().get(0).getValue(), ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().get(c_categoryCount).getValue());*/
    }

    @Test
    public void chartCategoryUpdateTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        /*initialize(null, null, null);
        ChartCategory category = new ChartCategory();
        category.setValue("NewCategory");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(14.0);
        dataPoints.add(dataPoint3);
        category.setDataPoints(dataPoints);
        Chart chart = api.updateChartCategory(c_fileName, c_slideIndex, c_shapeIndex, c_categoryIndex, category, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
        assertEquals(c_categoryCount, ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().size());
        assertEquals(category.getDataPoints().get(0).getValue(), ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().get(c_categoryIndex - 1).getValue());*/
    }

    @Test
    public void chartCategoryDeleteTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        /*initialize(null, null, null);
        Chart chart = api.deleteChartCategory(c_fileName, c_slideIndex, c_shapeIndex, c_categoryIndex, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount - 1, chart.getCategories().size());
        assertEquals(c_categoryCount - 1, ((OneValueSeries)chart.getSeries().get(0)).getDataPoints().size());*/
    }

    @Test
    public void chartDataPointCreateTest() throws ApiException, IOException {
        initialize(null, null, null);
        OneValueChartDataPoint dataPoint = new OneValueChartDataPoint();
        dataPoint.setValue(40.0);
        try {
            api.createChartDataPoint(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, dataPoint, c_password, c_folderName, null);
        } catch (Exception ex) {
            //Must throw ApiException because adding data points only works with Scatter & Bubble charts.
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void chartDataPointUpdateTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        /*initialize(null, null, null);
        OneValueChartDataPoint dataPoint = new OneValueChartDataPoint();
        dataPoint.setValue(40.0);
        Chart chart = api.updateChartDataPoint(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, c_categoryIndex, dataPoint, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
        assertEquals(c_categoryCount, ((OneValueSeries)chart.getSeries().get(c_seriesIndex - 1)).getDataPoints().size());
        assertEquals(dataPoint.getValue(), ((OneValueSeries)chart.getSeries().get(c_seriesIndex - 1)).getDataPoints().get(c_categoryIndex - 1).getValue());*/
    }

    @Test
    public void chartDataPointDeleteTest() throws ApiException, IOException {
        //SLIDESCLOUD-1133
        /*initialize(null, null, null);
        Chart chart = api.deleteChartDataPoint(c_fileName, c_slideIndex, c_shapeIndex, c_seriesIndex, c_categoryIndex, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(c_seriesCount, chart.getSeries().size());
        assertEquals(c_categoryCount, chart.getCategories().size());
        assertEquals(c_categoryCount, ((OneValueSeries)chart.getSeries().get(c_seriesIndex - 1)).getDataPoints().size());
        assertNull(((OneValueSeries)chart.getSeries().get(c_seriesIndex - 1)).getDataPoints().get(c_categoryIndex - 1));*/
    }

    @Test
    public void chartSunburstTest() throws ApiException, IOException {
        /*initialize(null, null, null);
        Chart dto = new Chart();
        dto.setChartType(Chart.ChartTypeEnum.SUNBURST);
        dto.setWidth(400.0);
        dto.setHeight(300.0);
        List<ChartCategory> categories = new ArrayList<ChartCategory>();
        ChartCategory category1 = new ChartCategory();
        category1.setValue("Leaf1");
        category1.setLevel(3);
        List<String> parentCategories1 = new ArrayList<String>();
        parentCategories1.add("Branch1");
        parentCategories1.add("Stem1");
        category1.setParentCategories(parentCategories1);
        categories.add(category1);
        ChartCategory category2 = new ChartCategory();
        category2.setValue("Leaf2");
        category2.setLevel(3);
        List<String> parentCategories2 = new ArrayList<String>();
        parentCategories2.add("Branch1");
        parentCategories2.add("Stem1");
        category2.setParentCategories(parentCategories2);
        categories.add(category2);
        ChartCategory category3 = new ChartCategory();
        category3.setValue("Branch2");
        category3.setLevel(2);
        List<String> parentCategories3 = new ArrayList<String>();
        parentCategories3.add("Stem1");
        category3.setParentCategories(parentCategories3);
        categories.add(category3);
        ChartCategory category4 = new ChartCategory();
        category4.setValue("Stem2");
        category4.setLevel(1);
        categories.add(category3);
        dto.setCategories(categories);
        List<Series> seriesList = new ArrayList<Series>();
        OneValueSeries series = new OneValueSeries();
        series.setName("Series1");
        List<OneValueChartDataPoint> dataPoints = new ArrayList<OneValueChartDataPoint>();
        OneValueChartDataPoint dataPoint1 = new OneValueChartDataPoint();
        dataPoint1.setValue(40.0);
        dataPoints.add(dataPoint1);
        OneValueChartDataPoint dataPoint2 = new OneValueChartDataPoint();
        dataPoint2.setValue(50.0);
        dataPoints.add(dataPoint2);
        OneValueChartDataPoint dataPoint3 = new OneValueChartDataPoint();
        dataPoint3.setValue(70.0);
        dataPoints.add(dataPoint3);
        OneValueChartDataPoint dataPoint4 = new OneValueChartDataPoint();
        dataPoint4.setValue(80.0);
        dataPoints.add(dataPoint4);
        series.setDataPoints(dataPoints);
        seriesList.add(series);
        dto.setSeries(seriesList);
        Chart chart = (Chart)api.createShape(c_fileName, c_slideIndex, dto, null, null, c_password, c_folderName, null);
        assertNotNull(chart);
        assertEquals(1, chart.getSeries().size());
        assertEquals(4, chart.getCategories().size());
        assertEquals(3, chart.getCategories().get(0).getLevel().longValue());*/
    }

    private static final String c_folderName = "TempSlidesSDK";
    private static final String c_fileName = "test.pptx";
    private static final String c_password = "password";
    private static final int c_slideIndex = 3;
    private static final int c_shapeIndex = 1;
    private static final int c_seriesIndex = 2;
    private static final int c_categoryIndex = 2;
    private static final int c_seriesCount = 3;
    private static final int c_categoryCount = 4;
}
