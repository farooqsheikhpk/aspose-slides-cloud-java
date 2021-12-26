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
 * ShapeBevel
 */
@ApiModel(description = "ShapeBevel")
public class ShapeBevel {
  /**
   * Bevel type
   */
  @JsonAdapter(BevelTypeEnum.Adapter.class)
  public enum BevelTypeEnum {
    ANGLE("Angle"),
    
    ARTDECO("ArtDeco"),
    
    CIRCLE("Circle"),
    
    CONVEX("Convex"),
    
    COOLSLANT("CoolSlant"),
    
    CROSS("Cross"),
    
    DIVOT("Divot"),
    
    HARDEDGE("HardEdge"),
    
    RELAXEDINSET("RelaxedInset"),
    
    RIBLET("Riblet"),
    
    SLOPE("Slope"),
    
    SOFTROUND("SoftRound"),
    
    NOTDEFINED("NotDefined");

    private String value;

    BevelTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BevelTypeEnum fromValue(String text) {
      for (BevelTypeEnum b : BevelTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BevelTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BevelTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BevelTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BevelTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "bevelType", alternate = { "BevelType" })
  private BevelTypeEnum bevelType;

  @SerializedName(value = "width", alternate = { "Width" })
  private Double width;

  @SerializedName(value = "height", alternate = { "Height" })
  private Double height;


  public ShapeBevel() {
    super();
  }

  public ShapeBevel bevelType(BevelTypeEnum bevelType) {
    this.bevelType = bevelType;
    return this;
  }

   /**
   * Bevel type
   * @return bevelType
  **/
  @ApiModelProperty(value = "Bevel type")
  public BevelTypeEnum getBevelType() {
    return bevelType;
  }

  public void setBevelType(BevelTypeEnum bevelType) {
    this.bevelType = bevelType;
  }

  public ShapeBevel width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Bevel width
   * @return width
  **/
  @ApiModelProperty(value = "Bevel width")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public ShapeBevel height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Bevel height
   * @return height
  **/
  @ApiModelProperty(value = "Bevel height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShapeBevel shapeBevel = (ShapeBevel) o;
    return true && Objects.equals(this.bevelType, shapeBevel.bevelType) && Objects.equals(this.width, shapeBevel.width) && Objects.equals(this.height, shapeBevel.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bevelType, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShapeBevel {\n");
    
    sb.append("    bevelType: ").append(toIndentedString(bevelType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
