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
import com.aspose.slides.model.MathElement;
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
 * Radical function
 */
@ApiModel(description = "Radical function")
public class RadicalElement extends MathElement {
  @SerializedName(value = "base", alternate = { "Base" })
  private MathElement base;

  @SerializedName(value = "degree", alternate = { "Degree" })
  private MathElement degree;

  @SerializedName(value = "hideDegree", alternate = { "HideDegree" })
  private Boolean hideDegree;


  public RadicalElement() {
    super();
    setType(TypeEnum.RADICAL);
  }

  public RadicalElement base(MathElement base) {
    this.base = base;
    return this;
  }

   /**
   * Base argument
   * @return base
  **/
  @ApiModelProperty(value = "Base argument")
  public MathElement getBase() {
    return base;
  }

  public void setBase(MathElement base) {
    this.base = base;
  }

  public RadicalElement degree(MathElement degree) {
    this.degree = degree;
    return this;
  }

   /**
   * Degree argument
   * @return degree
  **/
  @ApiModelProperty(value = "Degree argument")
  public MathElement getDegree() {
    return degree;
  }

  public void setDegree(MathElement degree) {
    this.degree = degree;
  }

  public RadicalElement hideDegree(Boolean hideDegree) {
    this.hideDegree = hideDegree;
    return this;
  }

   /**
   * Hide degree
   * @return hideDegree
  **/
  @ApiModelProperty(value = "Hide degree")
  public Boolean isHideDegree() {
    return hideDegree;
  }

  public void setHideDegree(Boolean hideDegree) {
    this.hideDegree = hideDegree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadicalElement radicalElement = (RadicalElement) o;
    return true && Objects.equals(this.base, radicalElement.base) && Objects.equals(this.degree, radicalElement.degree) && Objects.equals(this.hideDegree, radicalElement.hideDegree) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, degree, hideDegree, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadicalElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    hideDegree: ").append(toIndentedString(hideDegree)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.RADICAL);
  }
}
