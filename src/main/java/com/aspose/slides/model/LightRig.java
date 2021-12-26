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
 * Light rig
 */
@ApiModel(description = "Light rig")
public class LightRig {
  /**
   * Light direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    TOPLEFT("TopLeft"),
    
    TOP("Top"),
    
    TOPRIGHT("TopRight"),
    
    RIGHT("Right"),
    
    BOTTOMRIGHT("BottomRight"),
    
    BOTTOM("Bottom"),
    
    BOTTOMLEFT("BottomLeft"),
    
    LEFT("Left"),
    
    NOTDEFINED("NotDefined");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "direction", alternate = { "Direction" })
  private DirectionEnum direction;

  /**
   * Light type
   */
  @JsonAdapter(LightTypeEnum.Adapter.class)
  public enum LightTypeEnum {
    BALANCED("Balanced"),
    
    BRIGHTROOM("BrightRoom"),
    
    CHILLY("Chilly"),
    
    CONTRASTING("Contrasting"),
    
    FLAT("Flat"),
    
    FLOOD("Flood"),
    
    FREEZING("Freezing"),
    
    GLOW("Glow"),
    
    HARSH("Harsh"),
    
    LEGACYFLAT1("LegacyFlat1"),
    
    LEGACYFLAT2("LegacyFlat2"),
    
    LEGACYFLAT3("LegacyFlat3"),
    
    LEGACYFLAT4("LegacyFlat4"),
    
    LEGACYHARSH1("LegacyHarsh1"),
    
    LEGACYHARSH2("LegacyHarsh2"),
    
    LEGACYHARSH3("LegacyHarsh3"),
    
    LEGACYHARSH4("LegacyHarsh4"),
    
    LEGACYNORMAL1("LegacyNormal1"),
    
    LEGACYNORMAL2("LegacyNormal2"),
    
    LEGACYNORMAL3("LegacyNormal3"),
    
    LEGACYNORMAL4("LegacyNormal4"),
    
    MORNING("Morning"),
    
    SOFT("Soft"),
    
    SUNRISE("Sunrise"),
    
    SUNSET("Sunset"),
    
    THREEPT("ThreePt"),
    
    TWOPT("TwoPt"),
    
    NOTDEFINED("NotDefined");

    private String value;

    LightTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LightTypeEnum fromValue(String text) {
      for (LightTypeEnum b : LightTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LightTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LightTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LightTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LightTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "lightType", alternate = { "LightType" })
  private LightTypeEnum lightType;

  @SerializedName(value = "xrotation", alternate = { "XRotation" })
  private Double xrotation;

  @SerializedName(value = "yrotation", alternate = { "YRotation" })
  private Double yrotation;

  @SerializedName(value = "zrotation", alternate = { "ZRotation" })
  private Double zrotation;


  public LightRig() {
    super();
  }

  public LightRig direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Light direction
   * @return direction
  **/
  @ApiModelProperty(value = "Light direction")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public LightRig lightType(LightTypeEnum lightType) {
    this.lightType = lightType;
    return this;
  }

   /**
   * Light type
   * @return lightType
  **/
  @ApiModelProperty(value = "Light type")
  public LightTypeEnum getLightType() {
    return lightType;
  }

  public void setLightType(LightTypeEnum lightType) {
    this.lightType = lightType;
  }

  public LightRig xrotation(Double xrotation) {
    this.xrotation = xrotation;
    return this;
  }

   /**
   * XRotation
   * @return xrotation
  **/
  @ApiModelProperty(value = "XRotation")
  public Double getXrotation() {
    return xrotation;
  }

  public void setXrotation(Double xrotation) {
    this.xrotation = xrotation;
  }

  public LightRig yrotation(Double yrotation) {
    this.yrotation = yrotation;
    return this;
  }

   /**
   * YRotation
   * @return yrotation
  **/
  @ApiModelProperty(value = "YRotation")
  public Double getYrotation() {
    return yrotation;
  }

  public void setYrotation(Double yrotation) {
    this.yrotation = yrotation;
  }

  public LightRig zrotation(Double zrotation) {
    this.zrotation = zrotation;
    return this;
  }

   /**
   * ZRotation
   * @return zrotation
  **/
  @ApiModelProperty(value = "ZRotation")
  public Double getZrotation() {
    return zrotation;
  }

  public void setZrotation(Double zrotation) {
    this.zrotation = zrotation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LightRig lightRig = (LightRig) o;
    return true && Objects.equals(this.direction, lightRig.direction) && Objects.equals(this.lightType, lightRig.lightType) && Objects.equals(this.xrotation, lightRig.xrotation) && Objects.equals(this.yrotation, lightRig.yrotation) && Objects.equals(this.zrotation, lightRig.zrotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, lightType, xrotation, yrotation, zrotation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LightRig {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    lightType: ").append(toIndentedString(lightType)).append("\n");
    sb.append("    xrotation: ").append(toIndentedString(xrotation)).append("\n");
    sb.append("    yrotation: ").append(toIndentedString(yrotation)).append("\n");
    sb.append("    zrotation: ").append(toIndentedString(zrotation)).append("\n");
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
