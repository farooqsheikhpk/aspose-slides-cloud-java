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
 * Specifies the Matrix object,
 */
@ApiModel(description = "Specifies the Matrix object,")
public class MatrixElement extends MathElement {
  @SerializedName(value = "hidePlaceholders", alternate = { "HidePlaceholders" })
  private Boolean hidePlaceholders;

  /**
   * Specifies the vertical justification respect to surrounding text. 
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

  @SerializedName(value = "minColumnWidth", alternate = { "MinColumnWidth" })
  private Integer minColumnWidth;

  /**
   * The type of horizontal spacing between columns of a matrix.
   */
  @JsonAdapter(ColumnGapRuleEnum.Adapter.class)
  public enum ColumnGapRuleEnum {
    SINGLESPACINGGAP("SingleSpacingGap"),
    
    ONEANDHALFSPACINGGAP("OneAndHalfSpacingGap"),
    
    DOUBLESPACINGGAP("DoubleSpacingGap"),
    
    EXACTLY("Exactly"),
    
    MULTIPLE("Multiple");

    private String value;

    ColumnGapRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColumnGapRuleEnum fromValue(String text) {
      for (ColumnGapRuleEnum b : ColumnGapRuleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColumnGapRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColumnGapRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColumnGapRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColumnGapRuleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "columnGapRule", alternate = { "ColumnGapRule" })
  private ColumnGapRuleEnum columnGapRule;

  @SerializedName(value = "columnGap", alternate = { "ColumnGap" })
  private Integer columnGap;

  /**
   * The type of vertical spacing between rows of a matrix
   */
  @JsonAdapter(RowGapRuleEnum.Adapter.class)
  public enum RowGapRuleEnum {
    SINGLESPACINGGAP("SingleSpacingGap"),
    
    ONEANDHALFSPACINGGAP("OneAndHalfSpacingGap"),
    
    DOUBLESPACINGGAP("DoubleSpacingGap"),
    
    EXACTLY("Exactly"),
    
    MULTIPLE("Multiple");

    private String value;

    RowGapRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RowGapRuleEnum fromValue(String text) {
      for (RowGapRuleEnum b : RowGapRuleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RowGapRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RowGapRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RowGapRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RowGapRuleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "rowGapRule", alternate = { "RowGapRule" })
  private RowGapRuleEnum rowGapRule;

  @SerializedName(value = "rowGap", alternate = { "RowGap" })
  private Integer rowGap;

  @SerializedName(value = "items", alternate = { "Items" })
  private List<List<MathElement>> items = null;


  public MatrixElement() {
    super();
    setType(TypeEnum.MATRIX);
  }

  public MatrixElement hidePlaceholders(Boolean hidePlaceholders) {
    this.hidePlaceholders = hidePlaceholders;
    return this;
  }

   /**
   * Hide the placeholders for empty matrix elements
   * @return hidePlaceholders
  **/
  @ApiModelProperty(value = "Hide the placeholders for empty matrix elements")
  public Boolean isHidePlaceholders() {
    return hidePlaceholders;
  }

  public void setHidePlaceholders(Boolean hidePlaceholders) {
    this.hidePlaceholders = hidePlaceholders;
  }

  public MatrixElement baseJustification(BaseJustificationEnum baseJustification) {
    this.baseJustification = baseJustification;
    return this;
  }

   /**
   * Specifies the vertical justification respect to surrounding text. 
   * @return baseJustification
  **/
  @ApiModelProperty(value = "Specifies the vertical justification respect to surrounding text. ")
  public BaseJustificationEnum getBaseJustification() {
    return baseJustification;
  }

  public void setBaseJustification(BaseJustificationEnum baseJustification) {
    this.baseJustification = baseJustification;
  }

  public MatrixElement minColumnWidth(Integer minColumnWidth) {
    this.minColumnWidth = minColumnWidth;
    return this;
  }

   /**
   * Minimum column width in twips (1/20th of a point)
   * @return minColumnWidth
  **/
  @ApiModelProperty(value = "Minimum column width in twips (1/20th of a point)")
  public Integer getMinColumnWidth() {
    return minColumnWidth;
  }

  public void setMinColumnWidth(Integer minColumnWidth) {
    this.minColumnWidth = minColumnWidth;
  }

  public MatrixElement columnGapRule(ColumnGapRuleEnum columnGapRule) {
    this.columnGapRule = columnGapRule;
    return this;
  }

   /**
   * The type of horizontal spacing between columns of a matrix.
   * @return columnGapRule
  **/
  @ApiModelProperty(value = "The type of horizontal spacing between columns of a matrix.")
  public ColumnGapRuleEnum getColumnGapRule() {
    return columnGapRule;
  }

  public void setColumnGapRule(ColumnGapRuleEnum columnGapRule) {
    this.columnGapRule = columnGapRule;
  }

  public MatrixElement columnGap(Integer columnGap) {
    this.columnGap = columnGap;
    return this;
  }

   /**
   * The value of horizontal spacing between columns of a matrix
   * @return columnGap
  **/
  @ApiModelProperty(value = "The value of horizontal spacing between columns of a matrix")
  public Integer getColumnGap() {
    return columnGap;
  }

  public void setColumnGap(Integer columnGap) {
    this.columnGap = columnGap;
  }

  public MatrixElement rowGapRule(RowGapRuleEnum rowGapRule) {
    this.rowGapRule = rowGapRule;
    return this;
  }

   /**
   * The type of vertical spacing between rows of a matrix
   * @return rowGapRule
  **/
  @ApiModelProperty(value = "The type of vertical spacing between rows of a matrix")
  public RowGapRuleEnum getRowGapRule() {
    return rowGapRule;
  }

  public void setRowGapRule(RowGapRuleEnum rowGapRule) {
    this.rowGapRule = rowGapRule;
  }

  public MatrixElement rowGap(Integer rowGap) {
    this.rowGap = rowGap;
    return this;
  }

   /**
   * The value of vertical spacing between rows of a matrix;             
   * @return rowGap
  **/
  @ApiModelProperty(value = "The value of vertical spacing between rows of a matrix;             ")
  public Integer getRowGap() {
    return rowGap;
  }

  public void setRowGap(Integer rowGap) {
    this.rowGap = rowGap;
  }

  public MatrixElement items(List<List<MathElement>> items) {
    this.items = items;
    return this;
  }

  public MatrixElement addItemsItem(List<MathElement> itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<List<MathElement>>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Matrix items
   * @return items
  **/
  @ApiModelProperty(value = "Matrix items")
  public List<List<MathElement>> getItems() {
    return items;
  }

  public void setItems(List<List<MathElement>> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatrixElement matrixElement = (MatrixElement) o;
    return true && Objects.equals(this.hidePlaceholders, matrixElement.hidePlaceholders) && Objects.equals(this.baseJustification, matrixElement.baseJustification) && Objects.equals(this.minColumnWidth, matrixElement.minColumnWidth) && Objects.equals(this.columnGapRule, matrixElement.columnGapRule) && Objects.equals(this.columnGap, matrixElement.columnGap) && Objects.equals(this.rowGapRule, matrixElement.rowGapRule) && Objects.equals(this.rowGap, matrixElement.rowGap) && Objects.equals(this.items, matrixElement.items) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hidePlaceholders, baseJustification, minColumnWidth, columnGapRule, columnGap, rowGapRule, rowGap, items, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatrixElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hidePlaceholders: ").append(toIndentedString(hidePlaceholders)).append("\n");
    sb.append("    baseJustification: ").append(toIndentedString(baseJustification)).append("\n");
    sb.append("    minColumnWidth: ").append(toIndentedString(minColumnWidth)).append("\n");
    sb.append("    columnGapRule: ").append(toIndentedString(columnGapRule)).append("\n");
    sb.append("    columnGap: ").append(toIndentedString(columnGap)).append("\n");
    sb.append("    rowGapRule: ").append(toIndentedString(rowGapRule)).append("\n");
    sb.append("    rowGap: ").append(toIndentedString(rowGap)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.MATRIX);
  }
}
