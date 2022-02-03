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
 * Rectangular or some other border around the MathElement. 
 */
@ApiModel(description = "Rectangular or some other border around the MathElement. ")
public class BorderBoxElement extends MathElement {
  @SerializedName(value = "base", alternate = { "Base" })
  private MathElement base;

  @SerializedName(value = "hideTop", alternate = { "HideTop" })
  private Boolean hideTop;

  @SerializedName(value = "hideBottom", alternate = { "HideBottom" })
  private Boolean hideBottom;

  @SerializedName(value = "hideLeft", alternate = { "HideLeft" })
  private Boolean hideLeft;

  @SerializedName(value = "hideRight", alternate = { "HideRight" })
  private Boolean hideRight;

  @SerializedName(value = "strikethroughHorizontal", alternate = { "StrikethroughHorizontal" })
  private Boolean strikethroughHorizontal;

  @SerializedName(value = "strikethroughVertical", alternate = { "StrikethroughVertical" })
  private Boolean strikethroughVertical;

  @SerializedName(value = "strikethroughBottomLeftToTopRight", alternate = { "StrikethroughBottomLeftToTopRight" })
  private Boolean strikethroughBottomLeftToTopRight;

  @SerializedName(value = "strikethroughTopLeftToBottomRight", alternate = { "StrikethroughTopLeftToBottomRight" })
  private Boolean strikethroughTopLeftToBottomRight;


  public BorderBoxElement() {
    super();
    setType(TypeEnum.BORDERBOX);
  }

  public BorderBoxElement base(MathElement base) {
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

  public BorderBoxElement hideTop(Boolean hideTop) {
    this.hideTop = hideTop;
    return this;
  }

   /**
   * Hide Top Edge
   * @return hideTop
  **/
  @ApiModelProperty(value = "Hide Top Edge")
  public Boolean isHideTop() {
    return hideTop;
  }

  public void setHideTop(Boolean hideTop) {
    this.hideTop = hideTop;
  }

  public BorderBoxElement hideBottom(Boolean hideBottom) {
    this.hideBottom = hideBottom;
    return this;
  }

   /**
   * Hide Bottom Edge
   * @return hideBottom
  **/
  @ApiModelProperty(value = "Hide Bottom Edge")
  public Boolean isHideBottom() {
    return hideBottom;
  }

  public void setHideBottom(Boolean hideBottom) {
    this.hideBottom = hideBottom;
  }

  public BorderBoxElement hideLeft(Boolean hideLeft) {
    this.hideLeft = hideLeft;
    return this;
  }

   /**
   * Hide Left Edge
   * @return hideLeft
  **/
  @ApiModelProperty(value = "Hide Left Edge")
  public Boolean isHideLeft() {
    return hideLeft;
  }

  public void setHideLeft(Boolean hideLeft) {
    this.hideLeft = hideLeft;
  }

  public BorderBoxElement hideRight(Boolean hideRight) {
    this.hideRight = hideRight;
    return this;
  }

   /**
   * Hide Right Edge
   * @return hideRight
  **/
  @ApiModelProperty(value = "Hide Right Edge")
  public Boolean isHideRight() {
    return hideRight;
  }

  public void setHideRight(Boolean hideRight) {
    this.hideRight = hideRight;
  }

  public BorderBoxElement strikethroughHorizontal(Boolean strikethroughHorizontal) {
    this.strikethroughHorizontal = strikethroughHorizontal;
    return this;
  }

   /**
   * Strikethrough Horizontal
   * @return strikethroughHorizontal
  **/
  @ApiModelProperty(value = "Strikethrough Horizontal")
  public Boolean isStrikethroughHorizontal() {
    return strikethroughHorizontal;
  }

  public void setStrikethroughHorizontal(Boolean strikethroughHorizontal) {
    this.strikethroughHorizontal = strikethroughHorizontal;
  }

  public BorderBoxElement strikethroughVertical(Boolean strikethroughVertical) {
    this.strikethroughVertical = strikethroughVertical;
    return this;
  }

   /**
   * Strikethrough Vertical
   * @return strikethroughVertical
  **/
  @ApiModelProperty(value = "Strikethrough Vertical")
  public Boolean isStrikethroughVertical() {
    return strikethroughVertical;
  }

  public void setStrikethroughVertical(Boolean strikethroughVertical) {
    this.strikethroughVertical = strikethroughVertical;
  }

  public BorderBoxElement strikethroughBottomLeftToTopRight(Boolean strikethroughBottomLeftToTopRight) {
    this.strikethroughBottomLeftToTopRight = strikethroughBottomLeftToTopRight;
    return this;
  }

   /**
   * Strikethrough Bottom-Left to Top-Right
   * @return strikethroughBottomLeftToTopRight
  **/
  @ApiModelProperty(value = "Strikethrough Bottom-Left to Top-Right")
  public Boolean isStrikethroughBottomLeftToTopRight() {
    return strikethroughBottomLeftToTopRight;
  }

  public void setStrikethroughBottomLeftToTopRight(Boolean strikethroughBottomLeftToTopRight) {
    this.strikethroughBottomLeftToTopRight = strikethroughBottomLeftToTopRight;
  }

  public BorderBoxElement strikethroughTopLeftToBottomRight(Boolean strikethroughTopLeftToBottomRight) {
    this.strikethroughTopLeftToBottomRight = strikethroughTopLeftToBottomRight;
    return this;
  }

   /**
   * Strikethrough Top-Left to Bottom-Right.
   * @return strikethroughTopLeftToBottomRight
  **/
  @ApiModelProperty(value = "Strikethrough Top-Left to Bottom-Right.")
  public Boolean isStrikethroughTopLeftToBottomRight() {
    return strikethroughTopLeftToBottomRight;
  }

  public void setStrikethroughTopLeftToBottomRight(Boolean strikethroughTopLeftToBottomRight) {
    this.strikethroughTopLeftToBottomRight = strikethroughTopLeftToBottomRight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BorderBoxElement borderBoxElement = (BorderBoxElement) o;
    return true && Objects.equals(this.base, borderBoxElement.base) && Objects.equals(this.hideTop, borderBoxElement.hideTop) && Objects.equals(this.hideBottom, borderBoxElement.hideBottom) && Objects.equals(this.hideLeft, borderBoxElement.hideLeft) && Objects.equals(this.hideRight, borderBoxElement.hideRight) && Objects.equals(this.strikethroughHorizontal, borderBoxElement.strikethroughHorizontal) && Objects.equals(this.strikethroughVertical, borderBoxElement.strikethroughVertical) && Objects.equals(this.strikethroughBottomLeftToTopRight, borderBoxElement.strikethroughBottomLeftToTopRight) && Objects.equals(this.strikethroughTopLeftToBottomRight, borderBoxElement.strikethroughTopLeftToBottomRight) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, hideTop, hideBottom, hideLeft, hideRight, strikethroughHorizontal, strikethroughVertical, strikethroughBottomLeftToTopRight, strikethroughTopLeftToBottomRight, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BorderBoxElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    hideTop: ").append(toIndentedString(hideTop)).append("\n");
    sb.append("    hideBottom: ").append(toIndentedString(hideBottom)).append("\n");
    sb.append("    hideLeft: ").append(toIndentedString(hideLeft)).append("\n");
    sb.append("    hideRight: ").append(toIndentedString(hideRight)).append("\n");
    sb.append("    strikethroughHorizontal: ").append(toIndentedString(strikethroughHorizontal)).append("\n");
    sb.append("    strikethroughVertical: ").append(toIndentedString(strikethroughVertical)).append("\n");
    sb.append("    strikethroughBottomLeftToTopRight: ").append(toIndentedString(strikethroughBottomLeftToTopRight)).append("\n");
    sb.append("    strikethroughTopLeftToBottomRight: ").append(toIndentedString(strikethroughTopLeftToBottomRight)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.BORDERBOX);
  }
}
