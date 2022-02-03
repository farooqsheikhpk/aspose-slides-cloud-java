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
 * Specifies a grouping symbol above or below an expression, usually to highlight the relationship between elements 
 */
@ApiModel(description = "Specifies a grouping symbol above or below an expression, usually to highlight the relationship between elements ")
public class GroupingCharacterElement extends MathElement {
  @SerializedName(value = "base", alternate = { "Base" })
  private MathElement base;

  @SerializedName(value = "character", alternate = { "Character" })
  private String character;

  /**
   * Position of grouping character.
   */
  @JsonAdapter(PositionEnum.Adapter.class)
  public enum PositionEnum {
    NOTDEFINED("NotDefined"),
    
    TOP("Top"),
    
    BOTTOM("Bottom");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PositionEnum fromValue(String text) {
      for (PositionEnum b : PositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PositionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PositionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "position", alternate = { "Position" })
  private PositionEnum position;

  /**
   * Vertical justification of group character.
   */
  @JsonAdapter(VerticalJustificationEnum.Adapter.class)
  public enum VerticalJustificationEnum {
    NOTDEFINED("NotDefined"),
    
    TOP("Top"),
    
    BOTTOM("Bottom");

    private String value;

    VerticalJustificationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerticalJustificationEnum fromValue(String text) {
      for (VerticalJustificationEnum b : VerticalJustificationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerticalJustificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerticalJustificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerticalJustificationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerticalJustificationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "verticalJustification", alternate = { "VerticalJustification" })
  private VerticalJustificationEnum verticalJustification;


  public GroupingCharacterElement() {
    super();
    setType(TypeEnum.GROUPINGCHARACTER);
  }

  public GroupingCharacterElement base(MathElement base) {
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

  public GroupingCharacterElement character(String character) {
    this.character = character;
    return this;
  }

   /**
   * Grouping character
   * @return character
  **/
  @ApiModelProperty(value = "Grouping character")
  public String getCharacter() {
    return character;
  }

  public void setCharacter(String character) {
    this.character = character;
  }

  public GroupingCharacterElement position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * Position of grouping character.
   * @return position
  **/
  @ApiModelProperty(value = "Position of grouping character.")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public GroupingCharacterElement verticalJustification(VerticalJustificationEnum verticalJustification) {
    this.verticalJustification = verticalJustification;
    return this;
  }

   /**
   * Vertical justification of group character.
   * @return verticalJustification
  **/
  @ApiModelProperty(value = "Vertical justification of group character.")
  public VerticalJustificationEnum getVerticalJustification() {
    return verticalJustification;
  }

  public void setVerticalJustification(VerticalJustificationEnum verticalJustification) {
    this.verticalJustification = verticalJustification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupingCharacterElement groupingCharacterElement = (GroupingCharacterElement) o;
    return true && Objects.equals(this.base, groupingCharacterElement.base) && Objects.equals(this.character, groupingCharacterElement.character) && Objects.equals(this.position, groupingCharacterElement.position) && Objects.equals(this.verticalJustification, groupingCharacterElement.verticalJustification) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, character, position, verticalJustification, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupingCharacterElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    verticalJustification: ").append(toIndentedString(verticalJustification)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.GROUPINGCHARACTER);
  }
}
