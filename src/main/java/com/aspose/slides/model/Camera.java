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
 * Camera
 */
@ApiModel(description = "Camera")
public class Camera {
  /**
   * Camera type
   */
  @JsonAdapter(CameraTypeEnum.Adapter.class)
  public enum CameraTypeEnum {
    ISOMETRICBOTTOMDOWN("IsometricBottomDown"),
    
    ISOMETRICBOTTOMUP("IsometricBottomUp"),
    
    ISOMETRICLEFTDOWN("IsometricLeftDown"),
    
    ISOMETRICLEFTUP("IsometricLeftUp"),
    
    ISOMETRICOFFAXIS1LEFT("IsometricOffAxis1Left"),
    
    ISOMETRICOFFAXIS1RIGHT("IsometricOffAxis1Right"),
    
    ISOMETRICOFFAXIS1TOP("IsometricOffAxis1Top"),
    
    ISOMETRICOFFAXIS2LEFT("IsometricOffAxis2Left"),
    
    ISOMETRICOFFAXIS2RIGHT("IsometricOffAxis2Right"),
    
    ISOMETRICOFFAXIS2TOP("IsometricOffAxis2Top"),
    
    ISOMETRICOFFAXIS3BOTTOM("IsometricOffAxis3Bottom"),
    
    ISOMETRICOFFAXIS3LEFT("IsometricOffAxis3Left"),
    
    ISOMETRICOFFAXIS3RIGHT("IsometricOffAxis3Right"),
    
    ISOMETRICOFFAXIS4BOTTOM("IsometricOffAxis4Bottom"),
    
    ISOMETRICOFFAXIS4LEFT("IsometricOffAxis4Left"),
    
    ISOMETRICOFFAXIS4RIGHT("IsometricOffAxis4Right"),
    
    ISOMETRICRIGHTDOWN("IsometricRightDown"),
    
    ISOMETRICRIGHTUP("IsometricRightUp"),
    
    ISOMETRICTOPDOWN("IsometricTopDown"),
    
    ISOMETRICTOPUP("IsometricTopUp"),
    
    LEGACYOBLIQUEBOTTOM("LegacyObliqueBottom"),
    
    LEGACYOBLIQUEBOTTOMLEFT("LegacyObliqueBottomLeft"),
    
    LEGACYOBLIQUEBOTTOMRIGHT("LegacyObliqueBottomRight"),
    
    LEGACYOBLIQUEFRONT("LegacyObliqueFront"),
    
    LEGACYOBLIQUELEFT("LegacyObliqueLeft"),
    
    LEGACYOBLIQUERIGHT("LegacyObliqueRight"),
    
    LEGACYOBLIQUETOP("LegacyObliqueTop"),
    
    LEGACYOBLIQUETOPLEFT("LegacyObliqueTopLeft"),
    
    LEGACYOBLIQUETOPRIGHT("LegacyObliqueTopRight"),
    
    LEGACYPERSPECTIVEBOTTOM("LegacyPerspectiveBottom"),
    
    LEGACYPERSPECTIVEBOTTOMLEFT("LegacyPerspectiveBottomLeft"),
    
    LEGACYPERSPECTIVEBOTTOMRIGHT("LegacyPerspectiveBottomRight"),
    
    LEGACYPERSPECTIVEFRONT("LegacyPerspectiveFront"),
    
    LEGACYPERSPECTIVELEFT("LegacyPerspectiveLeft"),
    
    LEGACYPERSPECTIVERIGHT("LegacyPerspectiveRight"),
    
    LEGACYPERSPECTIVETOP("LegacyPerspectiveTop"),
    
    LEGACYPERSPECTIVETOPLEFT("LegacyPerspectiveTopLeft"),
    
    LEGACYPERSPECTIVETOPRIGHT("LegacyPerspectiveTopRight"),
    
    OBLIQUEBOTTOM("ObliqueBottom"),
    
    OBLIQUEBOTTOMLEFT("ObliqueBottomLeft"),
    
    OBLIQUEBOTTOMRIGHT("ObliqueBottomRight"),
    
    OBLIQUELEFT("ObliqueLeft"),
    
    OBLIQUERIGHT("ObliqueRight"),
    
    OBLIQUETOP("ObliqueTop"),
    
    OBLIQUETOPLEFT("ObliqueTopLeft"),
    
    OBLIQUETOPRIGHT("ObliqueTopRight"),
    
    ORTHOGRAPHICFRONT("OrthographicFront"),
    
    PERSPECTIVEABOVE("PerspectiveAbove"),
    
    PERSPECTIVEABOVELEFTFACING("PerspectiveAboveLeftFacing"),
    
    PERSPECTIVEABOVERIGHTFACING("PerspectiveAboveRightFacing"),
    
    PERSPECTIVEBELOW("PerspectiveBelow"),
    
    PERSPECTIVECONTRASTINGLEFTFACING("PerspectiveContrastingLeftFacing"),
    
    PERSPECTIVECONTRASTINGRIGHTFACING("PerspectiveContrastingRightFacing"),
    
    PERSPECTIVEFRONT("PerspectiveFront"),
    
    PERSPECTIVEHEROICEXTREMELEFTFACING("PerspectiveHeroicExtremeLeftFacing"),
    
    PERSPECTIVEHEROICEXTREMERIGHTFACING("PerspectiveHeroicExtremeRightFacing"),
    
    PERSPECTIVEHEROICLEFTFACING("PerspectiveHeroicLeftFacing"),
    
    PERSPECTIVEHEROICRIGHTFACING("PerspectiveHeroicRightFacing"),
    
    PERSPECTIVELEFT("PerspectiveLeft"),
    
    PERSPECTIVERELAXED("PerspectiveRelaxed"),
    
    PERSPECTIVERELAXEDMODERATELY("PerspectiveRelaxedModerately"),
    
    PERSPECTIVERIGHT("PerspectiveRight"),
    
    NOTDEFINED("NotDefined");

    private String value;

    CameraTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CameraTypeEnum fromValue(String text) {
      for (CameraTypeEnum b : CameraTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CameraTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CameraTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CameraTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CameraTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "cameraType", alternate = { "CameraType" })
  private CameraTypeEnum cameraType;

  @SerializedName(value = "fieldOfViewAngle", alternate = { "FieldOfViewAngle" })
  private Double fieldOfViewAngle;

  @SerializedName(value = "zoom", alternate = { "Zoom" })
  private Double zoom;

  @SerializedName(value = "xrotation", alternate = { "XRotation" })
  private Double xrotation;

  @SerializedName(value = "yrotation", alternate = { "YRotation" })
  private Double yrotation;

  @SerializedName(value = "zrotation", alternate = { "ZRotation" })
  private Double zrotation;


  public Camera() {
    super();
  }

  public Camera cameraType(CameraTypeEnum cameraType) {
    this.cameraType = cameraType;
    return this;
  }

   /**
   * Camera type
   * @return cameraType
  **/
  @ApiModelProperty(value = "Camera type")
  public CameraTypeEnum getCameraType() {
    return cameraType;
  }

  public void setCameraType(CameraTypeEnum cameraType) {
    this.cameraType = cameraType;
  }

  public Camera fieldOfViewAngle(Double fieldOfViewAngle) {
    this.fieldOfViewAngle = fieldOfViewAngle;
    return this;
  }

   /**
   * Camera FOV
   * @return fieldOfViewAngle
  **/
  @ApiModelProperty(value = "Camera FOV")
  public Double getFieldOfViewAngle() {
    return fieldOfViewAngle;
  }

  public void setFieldOfViewAngle(Double fieldOfViewAngle) {
    this.fieldOfViewAngle = fieldOfViewAngle;
  }

  public Camera zoom(Double zoom) {
    this.zoom = zoom;
    return this;
  }

   /**
   * Camera zoom
   * @return zoom
  **/
  @ApiModelProperty(value = "Camera zoom")
  public Double getZoom() {
    return zoom;
  }

  public void setZoom(Double zoom) {
    this.zoom = zoom;
  }

  public Camera xrotation(Double xrotation) {
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

  public Camera yrotation(Double yrotation) {
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

  public Camera zrotation(Double zrotation) {
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
    Camera camera = (Camera) o;
    return true && Objects.equals(this.cameraType, camera.cameraType) && Objects.equals(this.fieldOfViewAngle, camera.fieldOfViewAngle) && Objects.equals(this.zoom, camera.zoom) && Objects.equals(this.xrotation, camera.xrotation) && Objects.equals(this.yrotation, camera.yrotation) && Objects.equals(this.zrotation, camera.zrotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cameraType, fieldOfViewAngle, zoom, xrotation, yrotation, zrotation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Camera {\n");
    
    sb.append("    cameraType: ").append(toIndentedString(cameraType)).append("\n");
    sb.append("    fieldOfViewAngle: ").append(toIndentedString(fieldOfViewAngle)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
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
