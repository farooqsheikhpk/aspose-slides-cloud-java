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
import com.aspose.slides.model.ThreeDFormat;
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
 * Contains the TextFrame&#39;s formatting properties.
 */
@ApiModel(description = "Contains the TextFrame's formatting properties.")
public class TextFrameFormat {
  @SerializedName(value = "threeDFormat", alternate = { "ThreeDFormat" })
  private ThreeDFormat threeDFormat;

  /**
   * Gets or sets text wrapping shape.
   */
  @JsonAdapter(TransformEnum.Adapter.class)
  public enum TransformEnum {
    NONE("None"),
    
    PLAIN("Plain"),
    
    STOP("Stop"),
    
    TRIANGLE("Triangle"),
    
    TRIANGLEINVERTED("TriangleInverted"),
    
    CHEVRON("Chevron"),
    
    CHEVRONINVERTED("ChevronInverted"),
    
    RINGINSIDE("RingInside"),
    
    RINGOUTSIDE("RingOutside"),
    
    ARCHUP("ArchUp"),
    
    ARCHDOWN("ArchDown"),
    
    CIRCLE("Circle"),
    
    BUTTON("Button"),
    
    ARCHUPPOUR("ArchUpPour"),
    
    ARCHDOWNPOUR("ArchDownPour"),
    
    CIRCLEPOUR("CirclePour"),
    
    BUTTONPOUR("ButtonPour"),
    
    CURVEUP("CurveUp"),
    
    CURVEDOWN("CurveDown"),
    
    CANUP("CanUp"),
    
    CANDOWN("CanDown"),
    
    WAVE1("Wave1"),
    
    WAVE2("Wave2"),
    
    DOUBLEWAVE1("DoubleWave1"),
    
    WAVE4("Wave4"),
    
    INFLATE("Inflate"),
    
    DEFLATE("Deflate"),
    
    INFLATEBOTTOM("InflateBottom"),
    
    DEFLATEBOTTOM("DeflateBottom"),
    
    INFLATETOP("InflateTop"),
    
    DEFLATETOP("DeflateTop"),
    
    DEFLATEINFLATE("DeflateInflate"),
    
    DEFLATEINFLATEDEFLATE("DeflateInflateDeflate"),
    
    FADERIGHT("FadeRight"),
    
    FADELEFT("FadeLeft"),
    
    FADEUP("FadeUp"),
    
    FADEDOWN("FadeDown"),
    
    SLANTUP("SlantUp"),
    
    SLANTDOWN("SlantDown"),
    
    CASCADEUP("CascadeUp"),
    
    CASCADEDOWN("CascadeDown"),
    
    CUSTOM("Custom"),
    
    NOTDEFINED("NotDefined");

    private String value;

    TransformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransformEnum fromValue(String text) {
      for (TransformEnum b : TransformEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransformEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransformEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "transform", alternate = { "Transform" })
  private TransformEnum transform;


  public TextFrameFormat() {
    super();
  }

  public TextFrameFormat threeDFormat(ThreeDFormat threeDFormat) {
    this.threeDFormat = threeDFormat;
    return this;
  }

   /**
   * Represents 3d effect properties for a text.
   * @return threeDFormat
  **/
  @ApiModelProperty(value = "Represents 3d effect properties for a text.")
  public ThreeDFormat getThreeDFormat() {
    return threeDFormat;
  }

  public void setThreeDFormat(ThreeDFormat threeDFormat) {
    this.threeDFormat = threeDFormat;
  }

  public TextFrameFormat transform(TransformEnum transform) {
    this.transform = transform;
    return this;
  }

   /**
   * Gets or sets text wrapping shape.
   * @return transform
  **/
  @ApiModelProperty(value = "Gets or sets text wrapping shape.")
  public TransformEnum getTransform() {
    return transform;
  }

  public void setTransform(TransformEnum transform) {
    this.transform = transform;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFrameFormat textFrameFormat = (TextFrameFormat) o;
    return true && Objects.equals(this.threeDFormat, textFrameFormat.threeDFormat) && Objects.equals(this.transform, textFrameFormat.transform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDFormat, transform);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFrameFormat {\n");
    
    sb.append("    threeDFormat: ").append(toIndentedString(threeDFormat)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
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
