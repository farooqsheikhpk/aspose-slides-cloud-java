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
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Slide properties.
 */
@ApiModel(description = "Slide properties.")
public class SlideProperties extends ResourceBase {
  @SerializedName(value = "firstSlideNumber", alternate = { "FirstSlideNumber" })
  private Integer firstSlideNumber;

  /**
   * Slide orientation.
   */
  @JsonAdapter(OrientationEnum.Adapter.class)
  public enum OrientationEnum {
    LANDSCAPE("Landscape"),
    
    PORTRAIT("Portrait");

    private String value;

    OrientationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrientationEnum fromValue(String text) {
      for (OrientationEnum b : OrientationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrientationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrientationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrientationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrientationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "orientation", alternate = { "Orientation" })
  private OrientationEnum orientation;

  /**
   * Scale type.
   */
  @JsonAdapter(ScaleTypeEnum.Adapter.class)
  public enum ScaleTypeEnum {
    DONOTSCALE("DoNotScale"),
    
    ENSUREFIT("EnsureFit"),
    
    MAXIMIZE("Maximize");

    private String value;

    ScaleTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScaleTypeEnum fromValue(String text) {
      for (ScaleTypeEnum b : ScaleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScaleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScaleTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScaleTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScaleTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "scaleType", alternate = { "ScaleType" })
  private ScaleTypeEnum scaleType;

  /**
   * Size type.
   */
  @JsonAdapter(SizeTypeEnum.Adapter.class)
  public enum SizeTypeEnum {
    ONSCREEN("OnScreen"),
    
    LETTERPAPER("LetterPaper"),
    
    A4PAPER("A4Paper"),
    
    SLIDE35MM("Slide35mm"),
    
    OVERHEAD("Overhead"),
    
    BANNER("Banner"),
    
    CUSTOM("Custom"),
    
    LEDGER("Ledger"),
    
    A3PAPER("A3Paper"),
    
    B4ISOPAPER("B4IsoPaper"),
    
    B5ISOPAPER("B5IsoPaper"),
    
    B4JISPAPER("B4JisPaper"),
    
    B5JISPAPER("B5JisPaper"),
    
    HAGAKICARD("HagakiCard"),
    
    ONSCREEN16X9("OnScreen16x9"),
    
    ONSCREEN16X10("OnScreen16x10"),
    
    WIDESCREEN("Widescreen");

    private String value;

    SizeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SizeTypeEnum fromValue(String text) {
      for (SizeTypeEnum b : SizeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SizeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SizeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SizeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SizeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "sizeType", alternate = { "SizeType" })
  private SizeTypeEnum sizeType;

  @SerializedName(value = "width", alternate = { "Width" })
  private Integer width;

  @SerializedName(value = "height", alternate = { "Height" })
  private Integer height;


  public SlideProperties() {
    super();
  }

  public SlideProperties firstSlideNumber(Integer firstSlideNumber) {
    this.firstSlideNumber = firstSlideNumber;
    return this;
  }

   /**
   * First slide number.
   * @return firstSlideNumber
  **/
  @ApiModelProperty(value = "First slide number.")
  public Integer getFirstSlideNumber() {
    return firstSlideNumber;
  }

  public void setFirstSlideNumber(Integer firstSlideNumber) {
    this.firstSlideNumber = firstSlideNumber;
  }

  public SlideProperties orientation(OrientationEnum orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Slide orientation.
   * @return orientation
  **/
  @ApiModelProperty(value = "Slide orientation.")
  public OrientationEnum getOrientation() {
    return orientation;
  }

  public void setOrientation(OrientationEnum orientation) {
    this.orientation = orientation;
  }

  public SlideProperties scaleType(ScaleTypeEnum scaleType) {
    this.scaleType = scaleType;
    return this;
  }

   /**
   * Scale type.
   * @return scaleType
  **/
  @ApiModelProperty(value = "Scale type.")
  public ScaleTypeEnum getScaleType() {
    return scaleType;
  }

  public void setScaleType(ScaleTypeEnum scaleType) {
    this.scaleType = scaleType;
  }

  public SlideProperties sizeType(SizeTypeEnum sizeType) {
    this.sizeType = sizeType;
    return this;
  }

   /**
   * Size type.
   * @return sizeType
  **/
  @ApiModelProperty(value = "Size type.")
  public SizeTypeEnum getSizeType() {
    return sizeType;
  }

  public void setSizeType(SizeTypeEnum sizeType) {
    this.sizeType = sizeType;
  }

  public SlideProperties width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width.
   * @return width
  **/
  @ApiModelProperty(value = "Width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public SlideProperties height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height.
   * @return height
  **/
  @ApiModelProperty(value = "Height.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
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
    SlideProperties slideProperties = (SlideProperties) o;
    return true && Objects.equals(this.firstSlideNumber, slideProperties.firstSlideNumber) && Objects.equals(this.orientation, slideProperties.orientation) && Objects.equals(this.scaleType, slideProperties.scaleType) && Objects.equals(this.sizeType, slideProperties.sizeType) && Objects.equals(this.width, slideProperties.width) && Objects.equals(this.height, slideProperties.height) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstSlideNumber, orientation, scaleType, sizeType, width, height, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlideProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    firstSlideNumber: ").append(toIndentedString(firstSlideNumber)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    scaleType: ").append(toIndentedString(scaleType)).append("\n");
    sb.append("    sizeType: ").append(toIndentedString(sizeType)).append("\n");
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
