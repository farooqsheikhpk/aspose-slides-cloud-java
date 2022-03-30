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
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Represents slide comment
 */
@ApiModel(description = "Represents slide comment")
public class SlideCommentBase {
  @SerializedName(value = "author", alternate = { "Author" })
  private String author;

  @SerializedName(value = "text", alternate = { "Text" })
  private String text;

  @SerializedName(value = "createdTime", alternate = { "CreatedTime" })
  private String createdTime;

  @SerializedName(value = "childComments", alternate = { "ChildComments" })
  private List<SlideCommentBase> childComments = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REGULAR("Regular"),
    
    MODERN("Modern");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "type", alternate = { "Type" })
  private TypeEnum type;


  public SlideCommentBase() {
    super();
  }

  public SlideCommentBase author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Author.
   * @return author
  **/
  @ApiModelProperty(value = "Author.")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public SlideCommentBase text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text.
   * @return text
  **/
  @ApiModelProperty(value = "Text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SlideCommentBase createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Creation time.
   * @return createdTime
  **/
  @ApiModelProperty(value = "Creation time.")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public SlideCommentBase childComments(List<SlideCommentBase> childComments) {
    this.childComments = childComments;
    return this;
  }

  public SlideCommentBase addChildCommentsItem(SlideCommentBase childCommentsItem) {
    if (this.childComments == null) {
      this.childComments = new ArrayList<SlideCommentBase>();
    }
    this.childComments.add(childCommentsItem);
    return this;
  }

   /**
   * Child comments.
   * @return childComments
  **/
  @ApiModelProperty(value = "Child comments.")
  public List<SlideCommentBase> getChildComments() {
    return childComments;
  }

  public void setChildComments(List<SlideCommentBase> childComments) {
    this.childComments = childComments;
  }

  public SlideCommentBase type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlideCommentBase slideCommentBase = (SlideCommentBase) o;
    return true && Objects.equals(this.author, slideCommentBase.author) && Objects.equals(this.text, slideCommentBase.text) && Objects.equals(this.createdTime, slideCommentBase.createdTime) && Objects.equals(this.childComments, slideCommentBase.childComments) && Objects.equals(this.type, slideCommentBase.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, text, createdTime, childComments, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlideCommentBase {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    childComments: ").append(toIndentedString(childComments)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
