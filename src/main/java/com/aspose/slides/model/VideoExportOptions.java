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
import com.aspose.slides.model.FontFallbackRule;
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
 * Provides options that control how a presentation is saved in an video format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in an video format.")
public class VideoExportOptions extends ExportOptions {
  @SerializedName(value = "slidesTransitionDuration", alternate = { "SlidesTransitionDuration" })
  private Integer slidesTransitionDuration;

  /**
   * Video transition type
   */
  @JsonAdapter(TransitionTypeEnum.Adapter.class)
  public enum TransitionTypeEnum {
    NONE("None"),
    
    FADE("Fade"),
    
    DISTANCE("Distance"),
    
    SLIDEDOWN("Slidedown"),
    
    SLIDERIGHT("Slideright"),
    
    SLIDELEFT("Slideleft"),
    
    SLIDEUP("Slideup"),
    
    SMOOTHLEFT("Smoothleft"),
    
    SMOOTHRIGHT("Smoothright"),
    
    SMOOTHUP("Smoothup"),
    
    SMOOTHDOWN("Smoothdown"),
    
    RECTCROP("Rectcrop"),
    
    CIRCLECROP("Circlecrop"),
    
    CIRCLECLOSE("Circleclose"),
    
    CIRCLEOPEN("Circleopen"),
    
    HORZCLOSE("Horzclose"),
    
    HORZOPEN("Horzopen"),
    
    VERTCLOSE("Vertclose"),
    
    VERTOPEN("Vertopen"),
    
    DIAGBL("Diagbl"),
    
    DIAGBR("Diagbr"),
    
    DIAGTL("Diagtl"),
    
    DIAGTR("Diagtr"),
    
    HLSLICE("Hlslice"),
    
    HRSLICE("Hrslice"),
    
    VUSLICE("Vuslice"),
    
    VDSLICE("Vdslice"),
    
    DISSOLVE("Dissolve"),
    
    PIXELIZE("Pixelize"),
    
    RADIAL("Radial");

    private String value;

    TransitionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransitionTypeEnum fromValue(String text) {
      for (TransitionTypeEnum b : TransitionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransitionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransitionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransitionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransitionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "transitionType", alternate = { "TransitionType" })
  private TransitionTypeEnum transitionType;

  @SerializedName(value = "transitionDuration", alternate = { "TransitionDuration" })
  private Integer transitionDuration;

  /**
   * Video resolution type
   */
  @JsonAdapter(VideoResolutionTypeEnum.Adapter.class)
  public enum VideoResolutionTypeEnum {
    FULLHD("FullHD"),
    
    SD("SD"),
    
    HD("HD"),
    
    QHD("QHD");

    private String value;

    VideoResolutionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoResolutionTypeEnum fromValue(String text) {
      for (VideoResolutionTypeEnum b : VideoResolutionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VideoResolutionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoResolutionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoResolutionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VideoResolutionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "videoResolutionType", alternate = { "VideoResolutionType" })
  private VideoResolutionTypeEnum videoResolutionType;


  public VideoExportOptions() {
    super();
    setFormat("MPEG4");
  }

  public VideoExportOptions slidesTransitionDuration(Integer slidesTransitionDuration) {
    this.slidesTransitionDuration = slidesTransitionDuration;
    return this;
  }

   /**
   * Slides transition duration.
   * @return slidesTransitionDuration
  **/
  @ApiModelProperty(value = "Slides transition duration.")
  public Integer getSlidesTransitionDuration() {
    return slidesTransitionDuration;
  }

  public void setSlidesTransitionDuration(Integer slidesTransitionDuration) {
    this.slidesTransitionDuration = slidesTransitionDuration;
  }

  public VideoExportOptions transitionType(TransitionTypeEnum transitionType) {
    this.transitionType = transitionType;
    return this;
  }

   /**
   * Video transition type
   * @return transitionType
  **/
  @ApiModelProperty(value = "Video transition type")
  public TransitionTypeEnum getTransitionType() {
    return transitionType;
  }

  public void setTransitionType(TransitionTypeEnum transitionType) {
    this.transitionType = transitionType;
  }

  public VideoExportOptions transitionDuration(Integer transitionDuration) {
    this.transitionDuration = transitionDuration;
    return this;
  }

   /**
   * Duration of transition defined in TransitionType property.
   * @return transitionDuration
  **/
  @ApiModelProperty(value = "Duration of transition defined in TransitionType property.")
  public Integer getTransitionDuration() {
    return transitionDuration;
  }

  public void setTransitionDuration(Integer transitionDuration) {
    this.transitionDuration = transitionDuration;
  }

  public VideoExportOptions videoResolutionType(VideoResolutionTypeEnum videoResolutionType) {
    this.videoResolutionType = videoResolutionType;
    return this;
  }

   /**
   * Video resolution type
   * @return videoResolutionType
  **/
  @ApiModelProperty(value = "Video resolution type")
  public VideoResolutionTypeEnum getVideoResolutionType() {
    return videoResolutionType;
  }

  public void setVideoResolutionType(VideoResolutionTypeEnum videoResolutionType) {
    this.videoResolutionType = videoResolutionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoExportOptions videoExportOptions = (VideoExportOptions) o;
    return true && Objects.equals(this.slidesTransitionDuration, videoExportOptions.slidesTransitionDuration) && Objects.equals(this.transitionType, videoExportOptions.transitionType) && Objects.equals(this.transitionDuration, videoExportOptions.transitionDuration) && Objects.equals(this.videoResolutionType, videoExportOptions.videoResolutionType) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slidesTransitionDuration, transitionType, transitionDuration, videoResolutionType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    slidesTransitionDuration: ").append(toIndentedString(slidesTransitionDuration)).append("\n");
    sb.append("    transitionType: ").append(toIndentedString(transitionType)).append("\n");
    sb.append("    transitionDuration: ").append(toIndentedString(transitionDuration)).append("\n");
    sb.append("    videoResolutionType: ").append(toIndentedString(videoResolutionType)).append("\n");
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
