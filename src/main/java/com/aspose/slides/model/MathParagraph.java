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
import com.aspose.slides.model.BlockElement;
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
 * Mathematical paragraph that is a container for mathematical blocks
 */
@ApiModel(description = "Mathematical paragraph that is a container for mathematical blocks")
public class MathParagraph {
  @SerializedName(value = "mathBlockList", alternate = { "MathBlockList" })
  private List<BlockElement> mathBlockList = null;

  /**
   * Justification of the math paragraph
   */
  @JsonAdapter(JustificationEnum.Adapter.class)
  public enum JustificationEnum {
    LEFTJUSTIFIED("LeftJustified"),
    
    RIGHTJUSTIFIED("RightJustified"),
    
    CENTERED("Centered"),
    
    CENTEREDASGROUP("CenteredAsGroup");

    private String value;

    JustificationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JustificationEnum fromValue(String text) {
      for (JustificationEnum b : JustificationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<JustificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JustificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JustificationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return JustificationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "justification", alternate = { "Justification" })
  private JustificationEnum justification;


  public MathParagraph() {
    super();
  }

  public MathParagraph mathBlockList(List<BlockElement> mathBlockList) {
    this.mathBlockList = mathBlockList;
    return this;
  }

  public MathParagraph addMathBlockListItem(BlockElement mathBlockListItem) {
    if (this.mathBlockList == null) {
      this.mathBlockList = new ArrayList<BlockElement>();
    }
    this.mathBlockList.add(mathBlockListItem);
    return this;
  }

   /**
   * List of math blocks
   * @return mathBlockList
  **/
  @ApiModelProperty(value = "List of math blocks")
  public List<BlockElement> getMathBlockList() {
    return mathBlockList;
  }

  public void setMathBlockList(List<BlockElement> mathBlockList) {
    this.mathBlockList = mathBlockList;
  }

  public MathParagraph justification(JustificationEnum justification) {
    this.justification = justification;
    return this;
  }

   /**
   * Justification of the math paragraph
   * @return justification
  **/
  @ApiModelProperty(value = "Justification of the math paragraph")
  public JustificationEnum getJustification() {
    return justification;
  }

  public void setJustification(JustificationEnum justification) {
    this.justification = justification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MathParagraph mathParagraph = (MathParagraph) o;
    return true && Objects.equals(this.mathBlockList, mathParagraph.mathBlockList) && Objects.equals(this.justification, mathParagraph.justification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mathBlockList, justification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MathParagraph {\n");
    
    sb.append("    mathBlockList: ").append(toIndentedString(mathBlockList)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
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

}
