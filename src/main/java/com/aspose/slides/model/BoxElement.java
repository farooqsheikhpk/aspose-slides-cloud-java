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
 * Box element.
 */
@ApiModel(description = "Box element.")
public class BoxElement extends MathElement {
  @SerializedName(value = "base", alternate = { "Base" })
  private MathElement base;

  @SerializedName(value = "operatorEmulator", alternate = { "OperatorEmulator" })
  private Boolean operatorEmulator;

  @SerializedName(value = "noBreak", alternate = { "NoBreak" })
  private Boolean noBreak;

  @SerializedName(value = "differential", alternate = { "Differential" })
  private Boolean differential;

  @SerializedName(value = "alignmentPoint", alternate = { "AlignmentPoint" })
  private Boolean alignmentPoint;

  @SerializedName(value = "explicitBreak", alternate = { "ExplicitBreak" })
  private Integer explicitBreak;


  public BoxElement() {
    super();
    setType(TypeEnum.BOX);
  }

  public BoxElement base(MathElement base) {
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

  public BoxElement operatorEmulator(Boolean operatorEmulator) {
    this.operatorEmulator = operatorEmulator;
    return this;
  }

   /**
   * Operator emulator
   * @return operatorEmulator
  **/
  @ApiModelProperty(value = "Operator emulator")
  public Boolean isOperatorEmulator() {
    return operatorEmulator;
  }

  public void setOperatorEmulator(Boolean operatorEmulator) {
    this.operatorEmulator = operatorEmulator;
  }

  public BoxElement noBreak(Boolean noBreak) {
    this.noBreak = noBreak;
    return this;
  }

   /**
   * No break
   * @return noBreak
  **/
  @ApiModelProperty(value = "No break")
  public Boolean isNoBreak() {
    return noBreak;
  }

  public void setNoBreak(Boolean noBreak) {
    this.noBreak = noBreak;
  }

  public BoxElement differential(Boolean differential) {
    this.differential = differential;
    return this;
  }

   /**
   * Differential
   * @return differential
  **/
  @ApiModelProperty(value = "Differential")
  public Boolean isDifferential() {
    return differential;
  }

  public void setDifferential(Boolean differential) {
    this.differential = differential;
  }

  public BoxElement alignmentPoint(Boolean alignmentPoint) {
    this.alignmentPoint = alignmentPoint;
    return this;
  }

   /**
   * Alignment point
   * @return alignmentPoint
  **/
  @ApiModelProperty(value = "Alignment point")
  public Boolean isAlignmentPoint() {
    return alignmentPoint;
  }

  public void setAlignmentPoint(Boolean alignmentPoint) {
    this.alignmentPoint = alignmentPoint;
  }

  public BoxElement explicitBreak(Integer explicitBreak) {
    this.explicitBreak = explicitBreak;
    return this;
  }

   /**
   * Explicit break
   * @return explicitBreak
  **/
  @ApiModelProperty(value = "Explicit break")
  public Integer getExplicitBreak() {
    return explicitBreak;
  }

  public void setExplicitBreak(Integer explicitBreak) {
    this.explicitBreak = explicitBreak;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxElement boxElement = (BoxElement) o;
    return true && Objects.equals(this.base, boxElement.base) && Objects.equals(this.operatorEmulator, boxElement.operatorEmulator) && Objects.equals(this.noBreak, boxElement.noBreak) && Objects.equals(this.differential, boxElement.differential) && Objects.equals(this.alignmentPoint, boxElement.alignmentPoint) && Objects.equals(this.explicitBreak, boxElement.explicitBreak) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, operatorEmulator, noBreak, differential, alignmentPoint, explicitBreak, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    operatorEmulator: ").append(toIndentedString(operatorEmulator)).append("\n");
    sb.append("    noBreak: ").append(toIndentedString(noBreak)).append("\n");
    sb.append("    differential: ").append(toIndentedString(differential)).append("\n");
    sb.append("    alignmentPoint: ").append(toIndentedString(alignmentPoint)).append("\n");
    sb.append("    explicitBreak: ").append(toIndentedString(explicitBreak)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.BOX);
  }
}
