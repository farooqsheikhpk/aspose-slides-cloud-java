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
import com.aspose.slides.model.Camera;
import com.aspose.slides.model.LightRig;
import com.aspose.slides.model.ShapeBevel;
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
 * ThreeDFormat
 */
@ApiModel(description = "ThreeDFormat")
public class ThreeDFormat {
  @SerializedName(value = "bevelBottom", alternate = { "BevelBottom" })
  private ShapeBevel bevelBottom;

  @SerializedName(value = "bevelTop", alternate = { "BevelTop" })
  private ShapeBevel bevelTop;

  @SerializedName(value = "camera", alternate = { "Camera" })
  private Camera camera;

  @SerializedName(value = "contourColor", alternate = { "ContourColor" })
  private String contourColor;

  @SerializedName(value = "contourWidth", alternate = { "ContourWidth" })
  private Double contourWidth;

  @SerializedName(value = "depth", alternate = { "Depth" })
  private Double depth;

  @SerializedName(value = "extrusionColor", alternate = { "ExtrusionColor" })
  private String extrusionColor;

  @SerializedName(value = "extrusionHeight", alternate = { "ExtrusionHeight" })
  private Double extrusionHeight;

  @SerializedName(value = "lightRig", alternate = { "LightRig" })
  private LightRig lightRig;

  /**
   * Material
   */
  @JsonAdapter(MaterialEnum.Adapter.class)
  public enum MaterialEnum {
    CLEAR("Clear"),
    
    DKEDGE("DkEdge"),
    
    FLAT("Flat"),
    
    LEGACYMATTE("LegacyMatte"),
    
    LEGACYMETAL("LegacyMetal"),
    
    LEGACYPLASTIC("LegacyPlastic"),
    
    LEGACYWIREFRAME("LegacyWireframe"),
    
    MATTE("Matte"),
    
    METAL("Metal"),
    
    PLASTIC("Plastic"),
    
    POWDER("Powder"),
    
    SOFTEDGE("SoftEdge"),
    
    SOFTMETAL("Softmetal"),
    
    TRANSLUCENTPOWDER("TranslucentPowder"),
    
    WARMMATTE("WarmMatte"),
    
    NOTDEFINED("NotDefined");

    private String value;

    MaterialEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MaterialEnum fromValue(String text) {
      for (MaterialEnum b : MaterialEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MaterialEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MaterialEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MaterialEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MaterialEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "material", alternate = { "Material" })
  private MaterialEnum material;


  public ThreeDFormat() {
    super();
  }

  public ThreeDFormat bevelBottom(ShapeBevel bevelBottom) {
    this.bevelBottom = bevelBottom;
    return this;
  }

   /**
   * Type of a bottom 3D bevel.             
   * @return bevelBottom
  **/
  @ApiModelProperty(value = "Type of a bottom 3D bevel.             ")
  public ShapeBevel getBevelBottom() {
    return bevelBottom;
  }

  public void setBevelBottom(ShapeBevel bevelBottom) {
    this.bevelBottom = bevelBottom;
  }

  public ThreeDFormat bevelTop(ShapeBevel bevelTop) {
    this.bevelTop = bevelTop;
    return this;
  }

   /**
   * Type of a top 3D bevel.             
   * @return bevelTop
  **/
  @ApiModelProperty(value = "Type of a top 3D bevel.             ")
  public ShapeBevel getBevelTop() {
    return bevelTop;
  }

  public void setBevelTop(ShapeBevel bevelTop) {
    this.bevelTop = bevelTop;
  }

  public ThreeDFormat camera(Camera camera) {
    this.camera = camera;
    return this;
  }

   /**
   * Camera
   * @return camera
  **/
  @ApiModelProperty(value = "Camera")
  public Camera getCamera() {
    return camera;
  }

  public void setCamera(Camera camera) {
    this.camera = camera;
  }

  public ThreeDFormat contourColor(String contourColor) {
    this.contourColor = contourColor;
    return this;
  }

   /**
   * Contour color
   * @return contourColor
  **/
  @ApiModelProperty(value = "Contour color")
  public String getContourColor() {
    return contourColor;
  }

  public void setContourColor(String contourColor) {
    this.contourColor = contourColor;
  }

  public ThreeDFormat contourWidth(Double contourWidth) {
    this.contourWidth = contourWidth;
    return this;
  }

   /**
   * Contour width
   * @return contourWidth
  **/
  @ApiModelProperty(value = "Contour width")
  public Double getContourWidth() {
    return contourWidth;
  }

  public void setContourWidth(Double contourWidth) {
    this.contourWidth = contourWidth;
  }

  public ThreeDFormat depth(Double depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Depth
   * @return depth
  **/
  @ApiModelProperty(value = "Depth")
  public Double getDepth() {
    return depth;
  }

  public void setDepth(Double depth) {
    this.depth = depth;
  }

  public ThreeDFormat extrusionColor(String extrusionColor) {
    this.extrusionColor = extrusionColor;
    return this;
  }

   /**
   * Extrusion color
   * @return extrusionColor
  **/
  @ApiModelProperty(value = "Extrusion color")
  public String getExtrusionColor() {
    return extrusionColor;
  }

  public void setExtrusionColor(String extrusionColor) {
    this.extrusionColor = extrusionColor;
  }

  public ThreeDFormat extrusionHeight(Double extrusionHeight) {
    this.extrusionHeight = extrusionHeight;
    return this;
  }

   /**
   * Extrusion height
   * @return extrusionHeight
  **/
  @ApiModelProperty(value = "Extrusion height")
  public Double getExtrusionHeight() {
    return extrusionHeight;
  }

  public void setExtrusionHeight(Double extrusionHeight) {
    this.extrusionHeight = extrusionHeight;
  }

  public ThreeDFormat lightRig(LightRig lightRig) {
    this.lightRig = lightRig;
    return this;
  }

   /**
   * Light rig
   * @return lightRig
  **/
  @ApiModelProperty(value = "Light rig")
  public LightRig getLightRig() {
    return lightRig;
  }

  public void setLightRig(LightRig lightRig) {
    this.lightRig = lightRig;
  }

  public ThreeDFormat material(MaterialEnum material) {
    this.material = material;
    return this;
  }

   /**
   * Material
   * @return material
  **/
  @ApiModelProperty(value = "Material")
  public MaterialEnum getMaterial() {
    return material;
  }

  public void setMaterial(MaterialEnum material) {
    this.material = material;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDFormat threeDFormat = (ThreeDFormat) o;
    return true && Objects.equals(this.bevelBottom, threeDFormat.bevelBottom) && Objects.equals(this.bevelTop, threeDFormat.bevelTop) && Objects.equals(this.camera, threeDFormat.camera) && Objects.equals(this.contourColor, threeDFormat.contourColor) && Objects.equals(this.contourWidth, threeDFormat.contourWidth) && Objects.equals(this.depth, threeDFormat.depth) && Objects.equals(this.extrusionColor, threeDFormat.extrusionColor) && Objects.equals(this.extrusionHeight, threeDFormat.extrusionHeight) && Objects.equals(this.lightRig, threeDFormat.lightRig) && Objects.equals(this.material, threeDFormat.material);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bevelBottom, bevelTop, camera, contourColor, contourWidth, depth, extrusionColor, extrusionHeight, lightRig, material);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDFormat {\n");
    
    sb.append("    bevelBottom: ").append(toIndentedString(bevelBottom)).append("\n");
    sb.append("    bevelTop: ").append(toIndentedString(bevelTop)).append("\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
    sb.append("    contourColor: ").append(toIndentedString(contourColor)).append("\n");
    sb.append("    contourWidth: ").append(toIndentedString(contourWidth)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    extrusionColor: ").append(toIndentedString(extrusionColor)).append("\n");
    sb.append("    extrusionHeight: ").append(toIndentedString(extrusionHeight)).append("\n");
    sb.append("    lightRig: ").append(toIndentedString(lightRig)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
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
