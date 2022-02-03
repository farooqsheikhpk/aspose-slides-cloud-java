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
 * Quadratic Bezier curve segment of the geometry path
 */
@ApiModel(description = "Quadratic Bezier curve segment of the geometry path")
public class QuadraticBezierToPathSegment extends PathSegment {
  @SerializedName(value = "x1", alternate = { "X1" })
  private Double x1;

  @SerializedName(value = "y1", alternate = { "Y1" })
  private Double y1;

  @SerializedName(value = "x2", alternate = { "X2" })
  private Double x2;

  @SerializedName(value = "y2", alternate = { "Y2" })
  private Double y2;


  public QuadraticBezierToPathSegment() {
    super();
    setType(TypeEnum.QUADBEZIERTO);
  }

  public QuadraticBezierToPathSegment x1(Double x1) {
    this.x1 = x1;
    return this;
  }

   /**
   * X coordinate of direction point
   * @return x1
  **/
  @ApiModelProperty(required = true, value = "X coordinate of direction point")
  public Double getX1() {
    return x1;
  }

  public void setX1(Double x1) {
    this.x1 = x1;
  }

  public QuadraticBezierToPathSegment y1(Double y1) {
    this.y1 = y1;
    return this;
  }

   /**
   * Y coordinate of direction point
   * @return y1
  **/
  @ApiModelProperty(required = true, value = "Y coordinate of direction point")
  public Double getY1() {
    return y1;
  }

  public void setY1(Double y1) {
    this.y1 = y1;
  }

  public QuadraticBezierToPathSegment x2(Double x2) {
    this.x2 = x2;
    return this;
  }

   /**
   * X coordinate of end point
   * @return x2
  **/
  @ApiModelProperty(required = true, value = "X coordinate of end point")
  public Double getX2() {
    return x2;
  }

  public void setX2(Double x2) {
    this.x2 = x2;
  }

  public QuadraticBezierToPathSegment y2(Double y2) {
    this.y2 = y2;
    return this;
  }

   /**
   * Y coordinate of end point
   * @return y2
  **/
  @ApiModelProperty(required = true, value = "Y coordinate of end point")
  public Double getY2() {
    return y2;
  }

  public void setY2(Double y2) {
    this.y2 = y2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuadraticBezierToPathSegment quadraticBezierToPathSegment = (QuadraticBezierToPathSegment) o;
    return true && Objects.equals(this.x1, quadraticBezierToPathSegment.x1) && Objects.equals(this.y1, quadraticBezierToPathSegment.y1) && Objects.equals(this.x2, quadraticBezierToPathSegment.x2) && Objects.equals(this.y2, quadraticBezierToPathSegment.y2) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x1, y1, x2, y2, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuadraticBezierToPathSegment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    x1: ").append(toIndentedString(x1)).append("\n");
    sb.append("    y1: ").append(toIndentedString(y1)).append("\n");
    sb.append("    x2: ").append(toIndentedString(x2)).append("\n");
    sb.append("    y2: ").append(toIndentedString(y2)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.QUADBEZIERTO);
  }
}
