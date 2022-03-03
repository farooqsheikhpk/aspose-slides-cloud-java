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
import com.aspose.slides.model.Series;
import com.aspose.slides.model.SeriesMarker;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Common properties for Bubble and Scatter series. 
 */
@ApiModel(description = "Common properties for Bubble and Scatter series. ")
public class XYSeries extends Series {
  @SerializedName(value = "numberFormatOfYValues", alternate = { "NumberFormatOfYValues" })
  private String numberFormatOfYValues;

  @SerializedName(value = "numberFormatOfXValues", alternate = { "NumberFormatOfXValues" })
  private String numberFormatOfXValues;


  public XYSeries() {
    super();
  }

  public XYSeries numberFormatOfYValues(String numberFormatOfYValues) {
    this.numberFormatOfYValues = numberFormatOfYValues;
    return this;
  }

   /**
   * The number format for the series y values.
   * @return numberFormatOfYValues
  **/
  @ApiModelProperty(value = "The number format for the series y values.")
  public String getNumberFormatOfYValues() {
    return numberFormatOfYValues;
  }

  public void setNumberFormatOfYValues(String numberFormatOfYValues) {
    this.numberFormatOfYValues = numberFormatOfYValues;
  }

  public XYSeries numberFormatOfXValues(String numberFormatOfXValues) {
    this.numberFormatOfXValues = numberFormatOfXValues;
    return this;
  }

   /**
   * The number format for the series x values.
   * @return numberFormatOfXValues
  **/
  @ApiModelProperty(value = "The number format for the series x values.")
  public String getNumberFormatOfXValues() {
    return numberFormatOfXValues;
  }

  public void setNumberFormatOfXValues(String numberFormatOfXValues) {
    this.numberFormatOfXValues = numberFormatOfXValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XYSeries xySeries = (XYSeries) o;
    return true && Objects.equals(this.numberFormatOfYValues, xySeries.numberFormatOfYValues) && Objects.equals(this.numberFormatOfXValues, xySeries.numberFormatOfXValues) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberFormatOfYValues, numberFormatOfXValues, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XYSeries {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    numberFormatOfYValues: ").append(toIndentedString(numberFormatOfYValues)).append("\n");
    sb.append("    numberFormatOfXValues: ").append(toIndentedString(numberFormatOfXValues)).append("\n");
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

}
