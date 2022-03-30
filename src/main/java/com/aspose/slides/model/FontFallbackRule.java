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
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents font fallback rule.             
 */
@ApiModel(description = "Represents font fallback rule.             ")
public class FontFallbackRule {
  @SerializedName(value = "rangeStartIndex", alternate = { "RangeStartIndex" })
  private Integer rangeStartIndex;

  @SerializedName(value = "rangeEndIndex", alternate = { "RangeEndIndex" })
  private Integer rangeEndIndex;

  @SerializedName(value = "fallbackFontList", alternate = { "FallbackFontList" })
  private List<String> fallbackFontList = null;


  public FontFallbackRule() {
    super();
  }

  public FontFallbackRule rangeStartIndex(Integer rangeStartIndex) {
    this.rangeStartIndex = rangeStartIndex;
    return this;
  }

   /**
   * First index of continuous unicode range.
   * @return rangeStartIndex
  **/
  @ApiModelProperty(required = true, value = "First index of continuous unicode range.")
  public Integer getRangeStartIndex() {
    return rangeStartIndex;
  }

  public void setRangeStartIndex(Integer rangeStartIndex) {
    this.rangeStartIndex = rangeStartIndex;
  }

  public FontFallbackRule rangeEndIndex(Integer rangeEndIndex) {
    this.rangeEndIndex = rangeEndIndex;
    return this;
  }

   /**
   * Last index of continuous unicode range.
   * @return rangeEndIndex
  **/
  @ApiModelProperty(required = true, value = "Last index of continuous unicode range.")
  public Integer getRangeEndIndex() {
    return rangeEndIndex;
  }

  public void setRangeEndIndex(Integer rangeEndIndex) {
    this.rangeEndIndex = rangeEndIndex;
  }

  public FontFallbackRule fallbackFontList(List<String> fallbackFontList) {
    this.fallbackFontList = fallbackFontList;
    return this;
  }

  public FontFallbackRule addFallbackFontListItem(String fallbackFontListItem) {
    if (this.fallbackFontList == null) {
      this.fallbackFontList = new ArrayList<String>();
    }
    this.fallbackFontList.add(fallbackFontListItem);
    return this;
  }

   /**
   * List of fallback font links.
   * @return fallbackFontList
  **/
  @ApiModelProperty(value = "List of fallback font links.")
  public List<String> getFallbackFontList() {
    return fallbackFontList;
  }

  public void setFallbackFontList(List<String> fallbackFontList) {
    this.fallbackFontList = fallbackFontList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FontFallbackRule fontFallbackRule = (FontFallbackRule) o;
    return true && Objects.equals(this.rangeStartIndex, fontFallbackRule.rangeStartIndex) && Objects.equals(this.rangeEndIndex, fontFallbackRule.rangeEndIndex) && Objects.equals(this.fallbackFontList, fontFallbackRule.fallbackFontList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rangeStartIndex, rangeEndIndex, fallbackFontList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FontFallbackRule {\n");
    
    sb.append("    rangeStartIndex: ").append(toIndentedString(rangeStartIndex)).append("\n");
    sb.append("    rangeEndIndex: ").append(toIndentedString(rangeEndIndex)).append("\n");
    sb.append("    fallbackFontList: ").append(toIndentedString(fallbackFontList)).append("\n");
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
