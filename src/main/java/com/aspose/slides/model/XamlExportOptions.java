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
import com.aspose.slides.model.ExportOptions;
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
 * Provides options that control how a presentation is saved in XAML format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in XAML format.")
public class XamlExportOptions extends ExportOptions {
  @SerializedName(value = "exportHiddenSlides", alternate = { "ExportHiddenSlides" })
  private Boolean exportHiddenSlides;


  public XamlExportOptions() {
    super();
    setFormat("XAML");
  }

  public XamlExportOptions exportHiddenSlides(Boolean exportHiddenSlides) {
    this.exportHiddenSlides = exportHiddenSlides;
    return this;
  }

   /**
   * Export hidden slides
   * @return exportHiddenSlides
  **/
  @ApiModelProperty(value = "Export hidden slides")
  public Boolean isExportHiddenSlides() {
    return exportHiddenSlides;
  }

  public void setExportHiddenSlides(Boolean exportHiddenSlides) {
    this.exportHiddenSlides = exportHiddenSlides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XamlExportOptions xamlExportOptions = (XamlExportOptions) o;
    return true && Objects.equals(this.exportHiddenSlides, xamlExportOptions.exportHiddenSlides) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportHiddenSlides, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XamlExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportHiddenSlides: ").append(toIndentedString(exportHiddenSlides)).append("\n");
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
