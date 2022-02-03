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
 * Specifies an N-ary mathematical object, such as Summation and Integral.
 */
@ApiModel(description = "Specifies an N-ary mathematical object, such as Summation and Integral.")
public class NaryOperatorElement extends MathElement {
  @SerializedName(value = "base", alternate = { "Base" })
  private MathElement base;

  @SerializedName(value = "subscript", alternate = { "Subscript" })
  private MathElement subscript;

  @SerializedName(value = "superscript", alternate = { "Superscript" })
  private MathElement superscript;

  @SerializedName(value = "operator", alternate = { "Operator" })
  private String operator;

  /**
   * The location of limits (subscript and superscript)
   */
  @JsonAdapter(LimitLocationEnum.Adapter.class)
  public enum LimitLocationEnum {
    NOTDEFINED("NotDefined"),
    
    UNDEROVER("UnderOver"),
    
    SUBSCRIPTSUPERSCRIPT("SubscriptSuperscript");

    private String value;

    LimitLocationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LimitLocationEnum fromValue(String text) {
      for (LimitLocationEnum b : LimitLocationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LimitLocationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LimitLocationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LimitLocationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LimitLocationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "limitLocation", alternate = { "LimitLocation" })
  private LimitLocationEnum limitLocation;

  @SerializedName(value = "growToMatchOperandHeight", alternate = { "GrowToMatchOperandHeight" })
  private Boolean growToMatchOperandHeight;

  @SerializedName(value = "hideSubscript", alternate = { "HideSubscript" })
  private Boolean hideSubscript;

  @SerializedName(value = "hideSuperscript", alternate = { "HideSuperscript" })
  private Boolean hideSuperscript;


  public NaryOperatorElement() {
    super();
    setType(TypeEnum.NARYOPERATOR);
  }

  public NaryOperatorElement base(MathElement base) {
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

  public NaryOperatorElement subscript(MathElement subscript) {
    this.subscript = subscript;
    return this;
  }

   /**
   * Subscript argument
   * @return subscript
  **/
  @ApiModelProperty(value = "Subscript argument")
  public MathElement getSubscript() {
    return subscript;
  }

  public void setSubscript(MathElement subscript) {
    this.subscript = subscript;
  }

  public NaryOperatorElement superscript(MathElement superscript) {
    this.superscript = superscript;
    return this;
  }

   /**
   * Superscript argument
   * @return superscript
  **/
  @ApiModelProperty(value = "Superscript argument")
  public MathElement getSuperscript() {
    return superscript;
  }

  public void setSuperscript(MathElement superscript) {
    this.superscript = superscript;
  }

  public NaryOperatorElement operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Nary Operator Character
   * @return operator
  **/
  @ApiModelProperty(value = "Nary Operator Character")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public NaryOperatorElement limitLocation(LimitLocationEnum limitLocation) {
    this.limitLocation = limitLocation;
    return this;
  }

   /**
   * The location of limits (subscript and superscript)
   * @return limitLocation
  **/
  @ApiModelProperty(value = "The location of limits (subscript and superscript)")
  public LimitLocationEnum getLimitLocation() {
    return limitLocation;
  }

  public void setLimitLocation(LimitLocationEnum limitLocation) {
    this.limitLocation = limitLocation;
  }

  public NaryOperatorElement growToMatchOperandHeight(Boolean growToMatchOperandHeight) {
    this.growToMatchOperandHeight = growToMatchOperandHeight;
    return this;
  }

   /**
   * Operator Character grows vertically to match its operand height
   * @return growToMatchOperandHeight
  **/
  @ApiModelProperty(value = "Operator Character grows vertically to match its operand height")
  public Boolean isGrowToMatchOperandHeight() {
    return growToMatchOperandHeight;
  }

  public void setGrowToMatchOperandHeight(Boolean growToMatchOperandHeight) {
    this.growToMatchOperandHeight = growToMatchOperandHeight;
  }

  public NaryOperatorElement hideSubscript(Boolean hideSubscript) {
    this.hideSubscript = hideSubscript;
    return this;
  }

   /**
   * Hide Subscript
   * @return hideSubscript
  **/
  @ApiModelProperty(value = "Hide Subscript")
  public Boolean isHideSubscript() {
    return hideSubscript;
  }

  public void setHideSubscript(Boolean hideSubscript) {
    this.hideSubscript = hideSubscript;
  }

  public NaryOperatorElement hideSuperscript(Boolean hideSuperscript) {
    this.hideSuperscript = hideSuperscript;
    return this;
  }

   /**
   * Hide Superscript
   * @return hideSuperscript
  **/
  @ApiModelProperty(value = "Hide Superscript")
  public Boolean isHideSuperscript() {
    return hideSuperscript;
  }

  public void setHideSuperscript(Boolean hideSuperscript) {
    this.hideSuperscript = hideSuperscript;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaryOperatorElement naryOperatorElement = (NaryOperatorElement) o;
    return true && Objects.equals(this.base, naryOperatorElement.base) && Objects.equals(this.subscript, naryOperatorElement.subscript) && Objects.equals(this.superscript, naryOperatorElement.superscript) && Objects.equals(this.operator, naryOperatorElement.operator) && Objects.equals(this.limitLocation, naryOperatorElement.limitLocation) && Objects.equals(this.growToMatchOperandHeight, naryOperatorElement.growToMatchOperandHeight) && Objects.equals(this.hideSubscript, naryOperatorElement.hideSubscript) && Objects.equals(this.hideSuperscript, naryOperatorElement.hideSuperscript) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, subscript, superscript, operator, limitLocation, growToMatchOperandHeight, hideSubscript, hideSuperscript, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaryOperatorElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    subscript: ").append(toIndentedString(subscript)).append("\n");
    sb.append("    superscript: ").append(toIndentedString(superscript)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    limitLocation: ").append(toIndentedString(limitLocation)).append("\n");
    sb.append("    growToMatchOperandHeight: ").append(toIndentedString(growToMatchOperandHeight)).append("\n");
    sb.append("    hideSubscript: ").append(toIndentedString(hideSubscript)).append("\n");
    sb.append("    hideSuperscript: ").append(toIndentedString(hideSuperscript)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.NARYOPERATOR);
  }
}
