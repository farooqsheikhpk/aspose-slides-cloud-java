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
import com.aspose.slides.model.PathSegment;
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
 * Represents GeometryPath of the shape
 */
@ApiModel(description = "Represents GeometryPath of the shape")
public class GeometryPath {
  /**
   * Path fill mode
   */
  @JsonAdapter(FillModeEnum.Adapter.class)
  public enum FillModeEnum {
    NONE("None"),
    
    NORMAL("Normal"),
    
    LIGHTEN("Lighten"),
    
    LIGHTENLESS("LightenLess"),
    
    DARKEN("Darken"),
    
    DARKENLESS("DarkenLess");

    private String value;

    FillModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FillModeEnum fromValue(String text) {
      for (FillModeEnum b : FillModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FillModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FillModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FillModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FillModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "fillMode", alternate = { "FillMode" })
  private FillModeEnum fillMode;

  @SerializedName(value = "stroke", alternate = { "Stroke" })
  private Boolean stroke;

  @SerializedName(value = "pathData", alternate = { "PathData" })
  private List<PathSegment> pathData = null;


  public GeometryPath() {
    super();
  }

  public GeometryPath fillMode(FillModeEnum fillMode) {
    this.fillMode = fillMode;
    return this;
  }

   /**
   * Path fill mode
   * @return fillMode
  **/
  @ApiModelProperty(value = "Path fill mode")
  public FillModeEnum getFillMode() {
    return fillMode;
  }

  public void setFillMode(FillModeEnum fillMode) {
    this.fillMode = fillMode;
  }

  public GeometryPath stroke(Boolean stroke) {
    this.stroke = stroke;
    return this;
  }

   /**
   * Stroke
   * @return stroke
  **/
  @ApiModelProperty(value = "Stroke")
  public Boolean isStroke() {
    return stroke;
  }

  public void setStroke(Boolean stroke) {
    this.stroke = stroke;
  }

  public GeometryPath pathData(List<PathSegment> pathData) {
    this.pathData = pathData;
    return this;
  }

  public GeometryPath addPathDataItem(PathSegment pathDataItem) {
    if (this.pathData == null) {
      this.pathData = new ArrayList<PathSegment>();
    }
    this.pathData.add(pathDataItem);
    return this;
  }

   /**
   * List of PathSegmen objects
   * @return pathData
  **/
  @ApiModelProperty(value = "List of PathSegmen objects")
  public List<PathSegment> getPathData() {
    return pathData;
  }

  public void setPathData(List<PathSegment> pathData) {
    this.pathData = pathData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeometryPath geometryPath = (GeometryPath) o;
    return true && Objects.equals(this.fillMode, geometryPath.fillMode) && Objects.equals(this.stroke, geometryPath.stroke) && Objects.equals(this.pathData, geometryPath.pathData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillMode, stroke, pathData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeometryPath {\n");
    
    sb.append("    fillMode: ").append(toIndentedString(fillMode)).append("\n");
    sb.append("    stroke: ").append(toIndentedString(stroke)).append("\n");
    sb.append("    pathData: ").append(toIndentedString(pathData)).append("\n");
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
