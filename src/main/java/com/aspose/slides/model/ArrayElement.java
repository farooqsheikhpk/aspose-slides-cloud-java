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
 * An array of elements.
 */
@ApiModel(description = "An array of elements.")
public class ArrayElement extends MathElement {
  @SerializedName(value = "arguments", alternate = { "Arguments" })
  private List<MathElement> arguments = null;

  /**
   * Specifies alignment of the array relative to surrounding text
   */
  @JsonAdapter(BaseJustificationEnum.Adapter.class)
  public enum BaseJustificationEnum {
    NOTDEFINED("NotDefined"),
    
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom");

    private String value;

    BaseJustificationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BaseJustificationEnum fromValue(String text) {
      for (BaseJustificationEnum b : BaseJustificationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BaseJustificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BaseJustificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BaseJustificationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BaseJustificationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "baseJustification", alternate = { "BaseJustification" })
  private BaseJustificationEnum baseJustification;

  @SerializedName(value = "maximumDistribution", alternate = { "MaximumDistribution" })
  private Boolean maximumDistribution;

  @SerializedName(value = "objectDistribution", alternate = { "ObjectDistribution" })
  private Boolean objectDistribution;

  /**
   * The type of vertical spacing between array elements
   */
  @JsonAdapter(RowSpacingRuleEnum.Adapter.class)
  public enum RowSpacingRuleEnum {
    SINGLELINEGAP("SingleLineGap"),
    
    ONEANDAHALFLINEGAP("OneAndAHalfLineGap"),
    
    TWOLINEGAP("TwoLineGap"),
    
    EXACTLY("Exactly"),
    
    MULTIPLE("Multiple");

    private String value;

    RowSpacingRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RowSpacingRuleEnum fromValue(String text) {
      for (RowSpacingRuleEnum b : RowSpacingRuleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RowSpacingRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RowSpacingRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RowSpacingRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RowSpacingRuleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "rowSpacingRule", alternate = { "RowSpacingRule" })
  private RowSpacingRuleEnum rowSpacingRule;

  @SerializedName(value = "rowSpacing", alternate = { "RowSpacing" })
  private Integer rowSpacing;


  public ArrayElement() {
    super();
    setType(TypeEnum.ARRAY);
  }

  public ArrayElement arguments(List<MathElement> arguments) {
    this.arguments = arguments;
    return this;
  }

  public ArrayElement addArgumentsItem(MathElement argumentsItem) {
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

  public ArrayElement baseJustification(BaseJustificationEnum baseJustification) {
    this.baseJustification = baseJustification;
    return this;
  }

   /**
   * Specifies alignment of the array relative to surrounding text
   * @return baseJustification
  **/
  @ApiModelProperty(value = "Specifies alignment of the array relative to surrounding text")
  public BaseJustificationEnum getBaseJustification() {
    return baseJustification;
  }

  public void setBaseJustification(BaseJustificationEnum baseJustification) {
    this.baseJustification = baseJustification;
  }

  public ArrayElement maximumDistribution(Boolean maximumDistribution) {
    this.maximumDistribution = maximumDistribution;
    return this;
  }

   /**
   * Maximum Distribution
   * @return maximumDistribution
  **/
  @ApiModelProperty(value = "Maximum Distribution")
  public Boolean isMaximumDistribution() {
    return maximumDistribution;
  }

  public void setMaximumDistribution(Boolean maximumDistribution) {
    this.maximumDistribution = maximumDistribution;
  }

  public ArrayElement objectDistribution(Boolean objectDistribution) {
    this.objectDistribution = objectDistribution;
    return this;
  }

   /**
   * Object Distribution
   * @return objectDistribution
  **/
  @ApiModelProperty(value = "Object Distribution")
  public Boolean isObjectDistribution() {
    return objectDistribution;
  }

  public void setObjectDistribution(Boolean objectDistribution) {
    this.objectDistribution = objectDistribution;
  }

  public ArrayElement rowSpacingRule(RowSpacingRuleEnum rowSpacingRule) {
    this.rowSpacingRule = rowSpacingRule;
    return this;
  }

   /**
   * The type of vertical spacing between array elements
   * @return rowSpacingRule
  **/
  @ApiModelProperty(value = "The type of vertical spacing between array elements")
  public RowSpacingRuleEnum getRowSpacingRule() {
    return rowSpacingRule;
  }

  public void setRowSpacingRule(RowSpacingRuleEnum rowSpacingRule) {
    this.rowSpacingRule = rowSpacingRule;
  }

  public ArrayElement rowSpacing(Integer rowSpacing) {
    this.rowSpacing = rowSpacing;
    return this;
  }

   /**
   * Spacing between rows of an array
   * @return rowSpacing
  **/
  @ApiModelProperty(value = "Spacing between rows of an array")
  public Integer getRowSpacing() {
    return rowSpacing;
  }

  public void setRowSpacing(Integer rowSpacing) {
    this.rowSpacing = rowSpacing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayElement arrayElement = (ArrayElement) o;
    return true && Objects.equals(this.arguments, arrayElement.arguments) && Objects.equals(this.baseJustification, arrayElement.baseJustification) && Objects.equals(this.maximumDistribution, arrayElement.maximumDistribution) && Objects.equals(this.objectDistribution, arrayElement.objectDistribution) && Objects.equals(this.rowSpacingRule, arrayElement.rowSpacingRule) && Objects.equals(this.rowSpacing, arrayElement.rowSpacing) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, baseJustification, maximumDistribution, objectDistribution, rowSpacingRule, rowSpacing, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    baseJustification: ").append(toIndentedString(baseJustification)).append("\n");
    sb.append("    maximumDistribution: ").append(toIndentedString(maximumDistribution)).append("\n");
    sb.append("    objectDistribution: ").append(toIndentedString(objectDistribution)).append("\n");
    sb.append("    rowSpacingRule: ").append(toIndentedString(rowSpacingRule)).append("\n");
    sb.append("    rowSpacing: ").append(toIndentedString(rowSpacing)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.ARRAY);
  }
}
