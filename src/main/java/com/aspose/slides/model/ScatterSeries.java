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

package com.aspose.slides.model;

import java.util.Objects;
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.ScatterChartDataPoint;
import com.aspose.slides.model.SeriesMarker;
import com.aspose.slides.model.XYSeries;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * A scatter series
 */
@ApiModel(description = "A scatter series")
public class ScatterSeries extends XYSeries {
  @SerializedName(value = "dataPoints", alternate = { "DataPoints" })
  private List<ScatterChartDataPoint> dataPoints = null;


  public ScatterSeries() {
    super();
    setDataPointType(DataPointTypeEnum.SCATTER);
  }

  public ScatterSeries dataPoints(List<ScatterChartDataPoint> dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  public ScatterSeries addDataPointsItem(ScatterChartDataPoint dataPointsItem) {
    if (this.dataPoints == null) {
      this.dataPoints = new ArrayList<ScatterChartDataPoint>();
    }
    this.dataPoints.add(dataPointsItem);
    return this;
  }

   /**
   * Gets or sets the values.
   * @return dataPoints
  **/
  @ApiModelProperty(value = "Gets or sets the values.")
  public List<ScatterChartDataPoint> getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(List<ScatterChartDataPoint> dataPoints) {
    this.dataPoints = dataPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterSeries scatterSeries = (ScatterSeries) o;
    return true && Objects.equals(this.dataPoints, scatterSeries.dataPoints) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPoints, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterSeries {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }



  private static final Map<String, Object> typeDeterminers = new Hashtable<String, Object>();

  static {
      typeDeterminers.put("DataPointType", DataPointTypeEnum.SCATTER);
  }
}
