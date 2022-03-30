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

  public VideoExportOptions transitionDuration(Integer transitionDuration) {
    this.transitionDuration = transitionDuration;
    return this;
  }

   /**
   * Transition duration.
   * @return transitionDuration
  **/
  @ApiModelProperty(value = "Transition duration.")
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
    return true && Objects.equals(this.transitionDuration, videoExportOptions.transitionDuration) && Objects.equals(this.videoResolutionType, videoExportOptions.videoResolutionType) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transitionDuration, videoResolutionType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
