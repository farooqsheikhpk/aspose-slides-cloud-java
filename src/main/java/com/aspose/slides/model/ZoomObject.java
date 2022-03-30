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
import com.aspose.slides.model.ThreeDFormat;
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
 * Zoom object.
 */
@ApiModel(description = "Zoom object.")
public class ZoomObject extends ShapeBase {
  /**
   * Image type of a zoom object. 
   */
  @JsonAdapter(ImageTypeEnum.Adapter.class)
  public enum ImageTypeEnum {
    PREVIEW("Preview"),
    
    COVER("Cover");

    private String value;

    ImageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImageTypeEnum fromValue(String text) {
      for (ImageTypeEnum b : ImageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImageTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "imageType", alternate = { "ImageType" })
  private ImageTypeEnum imageType;

  @SerializedName(value = "returnToParent", alternate = { "ReturnToParent" })
  private Boolean returnToParent;

  @SerializedName(value = "showBackground", alternate = { "ShowBackground" })
  private Boolean showBackground;

  @SerializedName(value = "image", alternate = { "Image" })
  private ResourceUri image;

  @SerializedName(value = "transitionDuration", alternate = { "TransitionDuration" })
  private Double transitionDuration;


  public ZoomObject() {
    super();
  }

  public ZoomObject imageType(ImageTypeEnum imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * Image type of a zoom object. 
   * @return imageType
  **/
  @ApiModelProperty(value = "Image type of a zoom object. ")
  public ImageTypeEnum getImageType() {
    return imageType;
  }

  public void setImageType(ImageTypeEnum imageType) {
    this.imageType = imageType;
  }

  public ZoomObject returnToParent(Boolean returnToParent) {
    this.returnToParent = returnToParent;
    return this;
  }

   /**
   * Navigation behavior in slideshow. 
   * @return returnToParent
  **/
  @ApiModelProperty(value = "Navigation behavior in slideshow. ")
  public Boolean isReturnToParent() {
    return returnToParent;
  }

  public void setReturnToParent(Boolean returnToParent) {
    this.returnToParent = returnToParent;
  }

  public ZoomObject showBackground(Boolean showBackground) {
    this.showBackground = showBackground;
    return this;
  }

   /**
   * Specifies whether the Zoom will use the background of the destination slide.
   * @return showBackground
  **/
  @ApiModelProperty(value = "Specifies whether the Zoom will use the background of the destination slide.")
  public Boolean isShowBackground() {
    return showBackground;
  }

  public void setShowBackground(Boolean showBackground) {
    this.showBackground = showBackground;
  }

  public ZoomObject image(ResourceUri image) {
    this.image = image;
    return this;
  }

   /**
   * Internal image link for zoom object
   * @return image
  **/
  @ApiModelProperty(value = "Internal image link for zoom object")
  public ResourceUri getImage() {
    return image;
  }

  public void setImage(ResourceUri image) {
    this.image = image;
  }

  public ZoomObject transitionDuration(Double transitionDuration) {
    this.transitionDuration = transitionDuration;
    return this;
  }

   /**
   * Duration of the transition between Zoom and slide.
   * @return transitionDuration
  **/
  @ApiModelProperty(value = "Duration of the transition between Zoom and slide.")
  public Double getTransitionDuration() {
    return transitionDuration;
  }

  public void setTransitionDuration(Double transitionDuration) {
    this.transitionDuration = transitionDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoomObject zoomObject = (ZoomObject) o;
    return true && Objects.equals(this.imageType, zoomObject.imageType) && Objects.equals(this.returnToParent, zoomObject.returnToParent) && Objects.equals(this.showBackground, zoomObject.showBackground) && Objects.equals(this.image, zoomObject.image) && Objects.equals(this.transitionDuration, zoomObject.transitionDuration) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageType, returnToParent, showBackground, image, transitionDuration, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoomObject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    returnToParent: ").append(toIndentedString(returnToParent)).append("\n");
    sb.append("    showBackground: ").append(toIndentedString(showBackground)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    transitionDuration: ").append(toIndentedString(transitionDuration)).append("\n");
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
