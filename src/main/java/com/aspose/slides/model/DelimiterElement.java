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
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Delimiter element
 */
@ApiModel(description = "Delimiter element")
public class DelimiterElement extends MathElement {
  @SerializedName(value = "arguments", alternate = { "Arguments" })
  private List<MathElement> arguments = null;

  @SerializedName(value = "beginningCharacter", alternate = { "BeginningCharacter" })
  private String beginningCharacter;

  @SerializedName(value = "separatorCharacter", alternate = { "SeparatorCharacter" })
  private String separatorCharacter;

  @SerializedName(value = "endingCharacter", alternate = { "EndingCharacter" })
  private String endingCharacter;

  @SerializedName(value = "growToMatchOperandHeight", alternate = { "GrowToMatchOperandHeight" })
  private Boolean growToMatchOperandHeight;

  /**
   * Delimiter shape
   */
  @JsonAdapter(DelimiterShapeEnum.Adapter.class)
  public enum DelimiterShapeEnum {
    CENTERED("Centered"),
    
    MATCH("Match");

    private String value;

    DelimiterShapeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DelimiterShapeEnum fromValue(String text) {
      for (DelimiterShapeEnum b : DelimiterShapeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DelimiterShapeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DelimiterShapeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DelimiterShapeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DelimiterShapeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "delimiterShape", alternate = { "DelimiterShape" })
  private DelimiterShapeEnum delimiterShape;


  public DelimiterElement() {
    super();
    setType(TypeEnum.DELIMITER);
  }

  public DelimiterElement arguments(List<MathElement> arguments) {
    this.arguments = arguments;
    return this;
  }

  public DelimiterElement addArgumentsItem(MathElement argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<MathElement>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

   /**
   * Arguments
   * @return arguments
  **/
  @ApiModelProperty(value = "Arguments")
  public List<MathElement> getArguments() {
    return arguments;
  }

  public void setArguments(List<MathElement> arguments) {
    this.arguments = arguments;
  }

  public DelimiterElement beginningCharacter(String beginningCharacter) {
    this.beginningCharacter = beginningCharacter;
    return this;
  }

   /**
   * Beginning character
   * @return beginningCharacter
  **/
  @ApiModelProperty(value = "Beginning character")
  public String getBeginningCharacter() {
    return beginningCharacter;
  }

  public void setBeginningCharacter(String beginningCharacter) {
    this.beginningCharacter = beginningCharacter;
  }

  public DelimiterElement separatorCharacter(String separatorCharacter) {
    this.separatorCharacter = separatorCharacter;
    return this;
  }

   /**
   * Separator character
   * @return separatorCharacter
  **/
  @ApiModelProperty(value = "Separator character")
  public String getSeparatorCharacter() {
    return separatorCharacter;
  }

  public void setSeparatorCharacter(String separatorCharacter) {
    this.separatorCharacter = separatorCharacter;
  }

  public DelimiterElement endingCharacter(String endingCharacter) {
    this.endingCharacter = endingCharacter;
    return this;
  }

   /**
   * Ending character
   * @return endingCharacter
  **/
  @ApiModelProperty(value = "Ending character")
  public String getEndingCharacter() {
    return endingCharacter;
  }

  public void setEndingCharacter(String endingCharacter) {
    this.endingCharacter = endingCharacter;
  }

  public DelimiterElement growToMatchOperandHeight(Boolean growToMatchOperandHeight) {
    this.growToMatchOperandHeight = growToMatchOperandHeight;
    return this;
  }

   /**
   * Grow to match operand height
   * @return growToMatchOperandHeight
  **/
  @ApiModelProperty(value = "Grow to match operand height")
  public Boolean isGrowToMatchOperandHeight() {
    return growToMatchOperandHeight;
  }

  public void setGrowToMatchOperandHeight(Boolean growToMatchOperandHeight) {
    this.growToMatchOperandHeight = growToMatchOperandHeight;
  }

  public DelimiterElement delimiterShape(DelimiterShapeEnum delimiterShape) {
    this.delimiterShape = delimiterShape;
    return this;
  }

   /**
   * Delimiter shape
   * @return delimiterShape
  **/
  @ApiModelProperty(value = "Delimiter shape")
  public DelimiterShapeEnum getDelimiterShape() {
    return delimiterShape;
  }

  public void setDelimiterShape(DelimiterShapeEnum delimiterShape) {
    this.delimiterShape = delimiterShape;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelimiterElement delimiterElement = (DelimiterElement) o;
    return true && Objects.equals(this.arguments, delimiterElement.arguments) && Objects.equals(this.beginningCharacter, delimiterElement.beginningCharacter) && Objects.equals(this.separatorCharacter, delimiterElement.separatorCharacter) && Objects.equals(this.endingCharacter, delimiterElement.endingCharacter) && Objects.equals(this.growToMatchOperandHeight, delimiterElement.growToMatchOperandHeight) && Objects.equals(this.delimiterShape, delimiterElement.delimiterShape) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, beginningCharacter, separatorCharacter, endingCharacter, growToMatchOperandHeight, delimiterShape, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelimiterElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    beginningCharacter: ").append(toIndentedString(beginningCharacter)).append("\n");
    sb.append("    separatorCharacter: ").append(toIndentedString(separatorCharacter)).append("\n");
    sb.append("    endingCharacter: ").append(toIndentedString(endingCharacter)).append("\n");
    sb.append("    growToMatchOperandHeight: ").append(toIndentedString(growToMatchOperandHeight)).append("\n");
    sb.append("    delimiterShape: ").append(toIndentedString(delimiterShape)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.DELIMITER);
  }
}
