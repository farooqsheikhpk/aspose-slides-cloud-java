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
 * Specifies the Limit object
 */
@ApiModel(description = "Specifies the Limit object")
public class LimitElement extends MathElement {
  @SerializedName(value = "base", alternate = { "Base" })
  private MathElement base;

  @SerializedName(value = "limit", alternate = { "Limit" })
  private MathElement limit;

  @SerializedName(value = "upperLimit", alternate = { "UpperLimit" })
  private Boolean upperLimit;


  public LimitElement() {
    super();
    setType(TypeEnum.LIMIT);
  }

  public LimitElement base(MathElement base) {
    this.base = base;
    return this;
  }

   /**
   * Base
   * @return base
  **/
  @ApiModelProperty(value = "Base")
  public MathElement getBase() {
    return base;
  }

  public void setBase(MathElement base) {
    this.base = base;
  }

  public LimitElement limit(MathElement limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Limit
   * @return limit
  **/
  @ApiModelProperty(value = "Limit")
  public MathElement getLimit() {
    return limit;
  }

  public void setLimit(MathElement limit) {
    this.limit = limit;
  }

  public LimitElement upperLimit(Boolean upperLimit) {
    this.upperLimit = upperLimit;
    return this;
  }

   /**
   * Specifies upper or lower limit
   * @return upperLimit
  **/
  @ApiModelProperty(value = "Specifies upper or lower limit")
  public Boolean isUpperLimit() {
    return upperLimit;
  }

  public void setUpperLimit(Boolean upperLimit) {
    this.upperLimit = upperLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitElement limitElement = (LimitElement) o;
    return true && Objects.equals(this.base, limitElement.base) && Objects.equals(this.limit, limitElement.limit) && Objects.equals(this.upperLimit, limitElement.upperLimit) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, limit, upperLimit, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    upperLimit: ").append(toIndentedString(upperLimit)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.LIMIT);
  }
}
