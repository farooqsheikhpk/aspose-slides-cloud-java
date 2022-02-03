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
import com.aspose.slides.model.PathSegment;
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
 * Arc segment of the geometry path
 */
@ApiModel(description = "Arc segment of the geometry path")
public class ArcToPathSegment extends PathSegment {
  @SerializedName(value = "width", alternate = { "Width" })
  private Double width;

  @SerializedName(value = "height", alternate = { "Height" })
  private Double height;

  @SerializedName(value = "startAngle", alternate = { "StartAngle" })
  private Double startAngle;

  @SerializedName(value = "sweepAngle", alternate = { "SweepAngle" })
  private Double sweepAngle;


  public ArcToPathSegment() {
    super();
    setType(TypeEnum.ARCTO);
  }

  public ArcToPathSegment width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the rectangle
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Width of the rectangle")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public ArcToPathSegment height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the rectangle
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Height of the rectangle")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public ArcToPathSegment startAngle(Double startAngle) {
    this.startAngle = startAngle;
    return this;
  }

   /**
   * Start angle
   * @return startAngle
  **/
  @ApiModelProperty(required = true, value = "Start angle")
  public Double getStartAngle() {
    return startAngle;
  }

  public void setStartAngle(Double startAngle) {
    this.startAngle = startAngle;
  }

  public ArcToPathSegment sweepAngle(Double sweepAngle) {
    this.sweepAngle = sweepAngle;
    return this;
  }

   /**
   * Sweep angle
   * @return sweepAngle
  **/
  @ApiModelProperty(required = true, value = "Sweep angle")
  public Double getSweepAngle() {
    return sweepAngle;
  }

  public void setSweepAngle(Double sweepAngle) {
    this.sweepAngle = sweepAngle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArcToPathSegment arcToPathSegment = (ArcToPathSegment) o;
    return true && Objects.equals(this.width, arcToPathSegment.width) && Objects.equals(this.height, arcToPathSegment.height) && Objects.equals(this.startAngle, arcToPathSegment.startAngle) && Objects.equals(this.sweepAngle, arcToPathSegment.sweepAngle) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, startAngle, sweepAngle, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArcToPathSegment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    startAngle: ").append(toIndentedString(startAngle)).append("\n");
    sb.append("    sweepAngle: ").append(toIndentedString(sweepAngle)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.ARCTO);
  }
}
