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
 * Cubic Bezier curve segment of the geometry path
 */
@ApiModel(description = "Cubic Bezier curve segment of the geometry path")
public class CubicBezierToPathSegment extends PathSegment {
  @SerializedName(value = "x1", alternate = { "X1" })
  private Double x1;

  @SerializedName(value = "y1", alternate = { "Y1" })
  private Double y1;

  @SerializedName(value = "x2", alternate = { "X2" })
  private Double x2;

  @SerializedName(value = "y2", alternate = { "Y2" })
  private Double y2;

  @SerializedName(value = "x3", alternate = { "X3" })
  private Double x3;

  @SerializedName(value = "y3", alternate = { "Y3" })
  private Double y3;


  public CubicBezierToPathSegment() {
    super();
    setType(TypeEnum.CUBICBEZIERTO);
  }

  public CubicBezierToPathSegment x1(Double x1) {
    this.x1 = x1;
    return this;
  }

   /**
   * X coordinate of the first direction point
   * @return x1
  **/
  @ApiModelProperty(required = true, value = "X coordinate of the first direction point")
  public Double getX1() {
    return x1;
  }

  public void setX1(Double x1) {
    this.x1 = x1;
  }

  public CubicBezierToPathSegment y1(Double y1) {
    this.y1 = y1;
    return this;
  }

   /**
   * Y coordinate of the first direction point
   * @return y1
  **/
  @ApiModelProperty(required = true, value = "Y coordinate of the first direction point")
  public Double getY1() {
    return y1;
  }

  public void setY1(Double y1) {
    this.y1 = y1;
  }

  public CubicBezierToPathSegment x2(Double x2) {
    this.x2 = x2;
    return this;
  }

   /**
   * X coordinate of the second direction point
   * @return x2
  **/
  @ApiModelProperty(required = true, value = "X coordinate of the second direction point")
  public Double getX2() {
    return x2;
  }

  public void setX2(Double x2) {
    this.x2 = x2;
  }

  public CubicBezierToPathSegment y2(Double y2) {
    this.y2 = y2;
    return this;
  }

   /**
   * Y coordinate of the second direction point
   * @return y2
  **/
  @ApiModelProperty(required = true, value = "Y coordinate of the second direction point")
  public Double getY2() {
    return y2;
  }

  public void setY2(Double y2) {
    this.y2 = y2;
  }

  public CubicBezierToPathSegment x3(Double x3) {
    this.x3 = x3;
    return this;
  }

   /**
   * X coordinate of end point
   * @return x3
  **/
  @ApiModelProperty(required = true, value = "X coordinate of end point")
  public Double getX3() {
    return x3;
  }

  public void setX3(Double x3) {
    this.x3 = x3;
  }

  public CubicBezierToPathSegment y3(Double y3) {
    this.y3 = y3;
    return this;
  }

   /**
   * Y coordinate of end point
   * @return y3
  **/
  @ApiModelProperty(required = true, value = "Y coordinate of end point")
  public Double getY3() {
    return y3;
  }

  public void setY3(Double y3) {
    this.y3 = y3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CubicBezierToPathSegment cubicBezierToPathSegment = (CubicBezierToPathSegment) o;
    return true && Objects.equals(this.x1, cubicBezierToPathSegment.x1) && Objects.equals(this.y1, cubicBezierToPathSegment.y1) && Objects.equals(this.x2, cubicBezierToPathSegment.x2) && Objects.equals(this.y2, cubicBezierToPathSegment.y2) && Objects.equals(this.x3, cubicBezierToPathSegment.x3) && Objects.equals(this.y3, cubicBezierToPathSegment.y3) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x1, y1, x2, y2, x3, y3, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CubicBezierToPathSegment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    x1: ").append(toIndentedString(x1)).append("\n");
    sb.append("    y1: ").append(toIndentedString(y1)).append("\n");
    sb.append("    x2: ").append(toIndentedString(x2)).append("\n");
    sb.append("    y2: ").append(toIndentedString(y2)).append("\n");
    sb.append("    x3: ").append(toIndentedString(x3)).append("\n");
    sb.append("    y3: ").append(toIndentedString(y3)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.CUBICBEZIERTO);
  }
}
