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
import java.util.Hashtable;
import java.util.Map;

/**
 * Hyperlink
 */
@ApiModel(description = "Hyperlink")
public class Hyperlink {
  @SerializedName(value = "isDisabled", alternate = { "IsDisabled" })
  private Boolean isDisabled;

  /**
   * Type of HyperLink action             
   */
  @JsonAdapter(ActionTypeEnum.Adapter.class)
  public enum ActionTypeEnum {
    NOACTION("NoAction"),
    
    HYPERLINK("Hyperlink"),
    
    JUMPFIRSTSLIDE("JumpFirstSlide"),
    
    JUMPPREVIOUSSLIDE("JumpPreviousSlide"),
    
    JUMPNEXTSLIDE("JumpNextSlide"),
    
    JUMPLASTSLIDE("JumpLastSlide"),
    
    JUMPENDSHOW("JumpEndShow"),
    
    JUMPLASTVIEWEDSLIDE("JumpLastViewedSlide"),
    
    JUMPSPECIFICSLIDE("JumpSpecificSlide"),
    
    STARTCUSTOMSLIDESHOW("StartCustomSlideShow"),
    
    OPENFILE("OpenFile"),
    
    OPENPRESENTATION("OpenPresentation"),
    
    STARTSTOPMEDIA("StartStopMedia"),
    
    STARTMACRO("StartMacro"),
    
    STARTPROGRAM("StartProgram"),
    
    UNKNOWN("Unknown");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionTypeEnum fromValue(String text) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "actionType", alternate = { "ActionType" })
  private ActionTypeEnum actionType;

  @SerializedName(value = "externalUrl", alternate = { "ExternalUrl" })
  private String externalUrl;

  @SerializedName(value = "targetSlideIndex", alternate = { "TargetSlideIndex" })
  private Integer targetSlideIndex;

  @SerializedName(value = "targetFrame", alternate = { "TargetFrame" })
  private String targetFrame;

  @SerializedName(value = "tooltip", alternate = { "Tooltip" })
  private String tooltip;

  @SerializedName(value = "history", alternate = { "History" })
  private Boolean history;

  @SerializedName(value = "highlightClick", alternate = { "HighlightClick" })
  private Boolean highlightClick;

  @SerializedName(value = "stopSoundOnClick", alternate = { "StopSoundOnClick" })
  private Boolean stopSoundOnClick;

  /**
   * Represents the source of hyperlink color
   */
  @JsonAdapter(ColorSourceEnum.Adapter.class)
  public enum ColorSourceEnum {
    STYLES("Styles"),
    
    PORTIONFORMAT("PortionFormat");

    private String value;

    ColorSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorSourceEnum fromValue(String text) {
      for (ColorSourceEnum b : ColorSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColorSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "colorSource", alternate = { "ColorSource" })
  private ColorSourceEnum colorSource;


  public Hyperlink() {
    super();
  }

  public Hyperlink isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * If true Hypelink is not applied. 
   * @return isDisabled
  **/
  @ApiModelProperty(value = "If true Hypelink is not applied. ")
  public Boolean isIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public Hyperlink actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Type of HyperLink action             
   * @return actionType
  **/
  @ApiModelProperty(required = true, value = "Type of HyperLink action             ")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public Hyperlink externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * Specifies the external URL
   * @return externalUrl
  **/
  @ApiModelProperty(value = "Specifies the external URL")
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public Hyperlink targetSlideIndex(Integer targetSlideIndex) {
    this.targetSlideIndex = targetSlideIndex;
    return this;
  }

   /**
   * Index of the target slide
   * @return targetSlideIndex
  **/
  @ApiModelProperty(value = "Index of the target slide")
  public Integer getTargetSlideIndex() {
    return targetSlideIndex;
  }

  public void setTargetSlideIndex(Integer targetSlideIndex) {
    this.targetSlideIndex = targetSlideIndex;
  }

  public Hyperlink targetFrame(String targetFrame) {
    this.targetFrame = targetFrame;
    return this;
  }

   /**
   * Target frame
   * @return targetFrame
  **/
  @ApiModelProperty(value = "Target frame")
  public String getTargetFrame() {
    return targetFrame;
  }

  public void setTargetFrame(String targetFrame) {
    this.targetFrame = targetFrame;
  }

  public Hyperlink tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * Hyperlink tooltip
   * @return tooltip
  **/
  @ApiModelProperty(value = "Hyperlink tooltip")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public Hyperlink history(Boolean history) {
    this.history = history;
    return this;
  }

   /**
   * Makes hyperlink viewed when it is invoked.             
   * @return history
  **/
  @ApiModelProperty(value = "Makes hyperlink viewed when it is invoked.             ")
  public Boolean isHistory() {
    return history;
  }

  public void setHistory(Boolean history) {
    this.history = history;
  }

  public Hyperlink highlightClick(Boolean highlightClick) {
    this.highlightClick = highlightClick;
    return this;
  }

   /**
   * Determines whether the hyperlink should be highlighted on click.
   * @return highlightClick
  **/
  @ApiModelProperty(value = "Determines whether the hyperlink should be highlighted on click.")
  public Boolean isHighlightClick() {
    return highlightClick;
  }

  public void setHighlightClick(Boolean highlightClick) {
    this.highlightClick = highlightClick;
  }

  public Hyperlink stopSoundOnClick(Boolean stopSoundOnClick) {
    this.stopSoundOnClick = stopSoundOnClick;
    return this;
  }

   /**
   * Determines whether the sound should be stopped on hyperlink click
   * @return stopSoundOnClick
  **/
  @ApiModelProperty(value = "Determines whether the sound should be stopped on hyperlink click")
  public Boolean isStopSoundOnClick() {
    return stopSoundOnClick;
  }

  public void setStopSoundOnClick(Boolean stopSoundOnClick) {
    this.stopSoundOnClick = stopSoundOnClick;
  }

  public Hyperlink colorSource(ColorSourceEnum colorSource) {
    this.colorSource = colorSource;
    return this;
  }

   /**
   * Represents the source of hyperlink color
   * @return colorSource
  **/
  @ApiModelProperty(value = "Represents the source of hyperlink color")
  public ColorSourceEnum getColorSource() {
    return colorSource;
  }

  public void setColorSource(ColorSourceEnum colorSource) {
    this.colorSource = colorSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hyperlink hyperlink = (Hyperlink) o;
    return true && Objects.equals(this.isDisabled, hyperlink.isDisabled) && Objects.equals(this.actionType, hyperlink.actionType) && Objects.equals(this.externalUrl, hyperlink.externalUrl) && Objects.equals(this.targetSlideIndex, hyperlink.targetSlideIndex) && Objects.equals(this.targetFrame, hyperlink.targetFrame) && Objects.equals(this.tooltip, hyperlink.tooltip) && Objects.equals(this.history, hyperlink.history) && Objects.equals(this.highlightClick, hyperlink.highlightClick) && Objects.equals(this.stopSoundOnClick, hyperlink.stopSoundOnClick) && Objects.equals(this.colorSource, hyperlink.colorSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDisabled, actionType, externalUrl, targetSlideIndex, targetFrame, tooltip, history, highlightClick, stopSoundOnClick, colorSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hyperlink {\n");
    
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    targetSlideIndex: ").append(toIndentedString(targetSlideIndex)).append("\n");
    sb.append("    targetFrame: ").append(toIndentedString(targetFrame)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    highlightClick: ").append(toIndentedString(highlightClick)).append("\n");
    sb.append("    stopSoundOnClick: ").append(toIndentedString(stopSoundOnClick)).append("\n");
    sb.append("    colorSource: ").append(toIndentedString(colorSource)).append("\n");
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
