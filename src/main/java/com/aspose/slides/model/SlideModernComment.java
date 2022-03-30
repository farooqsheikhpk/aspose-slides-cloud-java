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
import com.aspose.slides.model.SlideCommentBase;
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
 * Represents modern comment of slide
 */
@ApiModel(description = "Represents modern comment of slide")
public class SlideModernComment extends SlideCommentBase {
  @SerializedName(value = "textSelectionStart", alternate = { "TextSelectionStart" })
  private Integer textSelectionStart;

  @SerializedName(value = "textSelectionLength", alternate = { "TextSelectionLength" })
  private Integer textSelectionLength;

  /**
   * Returns or sets the status of the comment. Read/write ModernCommentStatus.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOTDEFINED("NotDefined"),
    
    ACTIVE("Active"),
    
    RESOLVED("Resolved"),
    
    CLOSED("Closed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "status", alternate = { "Status" })
  private StatusEnum status;


  public SlideModernComment() {
    super();
    setType(TypeEnum.MODERN);
  }

  public SlideModernComment textSelectionStart(Integer textSelectionStart) {
    this.textSelectionStart = textSelectionStart;
    return this;
  }

   /**
   * Returns or sets starting position of text selection in text frame if the comment associated with AutoShape. Read/write Int32.
   * @return textSelectionStart
  **/
  @ApiModelProperty(value = "Returns or sets starting position of text selection in text frame if the comment associated with AutoShape. Read/write Int32.")
  public Integer getTextSelectionStart() {
    return textSelectionStart;
  }

  public void setTextSelectionStart(Integer textSelectionStart) {
    this.textSelectionStart = textSelectionStart;
  }

  public SlideModernComment textSelectionLength(Integer textSelectionLength) {
    this.textSelectionLength = textSelectionLength;
    return this;
  }

   /**
   * Returns or sets text selection length in text frame if the comment associated with AutoShape. Read/write Int32.
   * @return textSelectionLength
  **/
  @ApiModelProperty(value = "Returns or sets text selection length in text frame if the comment associated with AutoShape. Read/write Int32.")
  public Integer getTextSelectionLength() {
    return textSelectionLength;
  }

  public void setTextSelectionLength(Integer textSelectionLength) {
    this.textSelectionLength = textSelectionLength;
  }

  public SlideModernComment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Returns or sets the status of the comment. Read/write ModernCommentStatus.
   * @return status
  **/
  @ApiModelProperty(value = "Returns or sets the status of the comment. Read/write ModernCommentStatus.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlideModernComment slideModernComment = (SlideModernComment) o;
    return true && Objects.equals(this.textSelectionStart, slideModernComment.textSelectionStart) && Objects.equals(this.textSelectionLength, slideModernComment.textSelectionLength) && Objects.equals(this.status, slideModernComment.status) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textSelectionStart, textSelectionLength, status, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlideModernComment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    textSelectionStart: ").append(toIndentedString(textSelectionStart)).append("\n");
    sb.append("    textSelectionLength: ").append(toIndentedString(textSelectionLength)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.MODERN);
  }
}
