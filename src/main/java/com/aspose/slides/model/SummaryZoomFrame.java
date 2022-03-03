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
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.Hyperlink;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ShapeBase;
import com.aspose.slides.model.SummaryZoomSection;
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
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Summary zoom frame.
 */
@ApiModel(description = "Summary zoom frame.")
public class SummaryZoomFrame extends ShapeBase {
  /**
   * Zoom layout type
   */
  @JsonAdapter(ZoomLayoutEnum.Adapter.class)
  public enum ZoomLayoutEnum {
    GRIDLAYOUT("GridLayout"),
    
    FIXEDLAYOUT("FixedLayout");

    private String value;

    ZoomLayoutEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ZoomLayoutEnum fromValue(String text) {
      for (ZoomLayoutEnum b : ZoomLayoutEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ZoomLayoutEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ZoomLayoutEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ZoomLayoutEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ZoomLayoutEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "zoomLayout", alternate = { "ZoomLayout" })
  private ZoomLayoutEnum zoomLayout;

  @SerializedName(value = "sections", alternate = { "Sections" })
  private List<SummaryZoomSection> sections = null;


  public SummaryZoomFrame() {
    super();
    setType(TypeEnum.SUMMARYZOOMFRAME);
  }

  public SummaryZoomFrame zoomLayout(ZoomLayoutEnum zoomLayout) {
    this.zoomLayout = zoomLayout;
    return this;
  }

   /**
   * Zoom layout type
   * @return zoomLayout
  **/
  @ApiModelProperty(value = "Zoom layout type")
  public ZoomLayoutEnum getZoomLayout() {
    return zoomLayout;
  }

  public void setZoomLayout(ZoomLayoutEnum zoomLayout) {
    this.zoomLayout = zoomLayout;
  }

  public SummaryZoomFrame sections(List<SummaryZoomSection> sections) {
    this.sections = sections;
    return this;
  }

  public SummaryZoomFrame addSectionsItem(SummaryZoomSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<SummaryZoomSection>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Zoom frame sections
   * @return sections
  **/
  @ApiModelProperty(value = "Zoom frame sections")
  public List<SummaryZoomSection> getSections() {
    return sections;
  }

  public void setSections(List<SummaryZoomSection> sections) {
    this.sections = sections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryZoomFrame summaryZoomFrame = (SummaryZoomFrame) o;
    return true && Objects.equals(this.zoomLayout, summaryZoomFrame.zoomLayout) && Objects.equals(this.sections, summaryZoomFrame.sections) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoomLayout, sections, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryZoomFrame {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    zoomLayout: ").append(toIndentedString(zoomLayout)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.SUMMARYZOOMFRAME);
  }
}
