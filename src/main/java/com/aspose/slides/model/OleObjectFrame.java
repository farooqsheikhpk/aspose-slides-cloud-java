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
import com.aspose.slides.model.PictureFill;
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
 * Represents OleObjectFrame resource.
 */
@ApiModel(description = "Represents OleObjectFrame resource.")
public class OleObjectFrame extends ShapeBase {
  @SerializedName(value = "isObjectIcon", alternate = { "IsObjectIcon" })
  private Boolean isObjectIcon;

  @SerializedName(value = "substitutePictureTitle", alternate = { "SubstitutePictureTitle" })
  private String substitutePictureTitle;

  @SerializedName(value = "substitutePictureFormat", alternate = { "SubstitutePictureFormat" })
  private PictureFill substitutePictureFormat;

  @SerializedName(value = "objectName", alternate = { "ObjectName" })
  private String objectName;

  @SerializedName(value = "embeddedFileBase64Data", alternate = { "EmbeddedFileBase64Data" })
  private String embeddedFileBase64Data;

  @SerializedName(value = "embeddedFileExtension", alternate = { "EmbeddedFileExtension" })
  private String embeddedFileExtension;

  @SerializedName(value = "objectProgId", alternate = { "ObjectProgId" })
  private String objectProgId;

  @SerializedName(value = "linkPath", alternate = { "LinkPath" })
  private String linkPath;

  @SerializedName(value = "updateAutomatic", alternate = { "UpdateAutomatic" })
  private Boolean updateAutomatic;


  public OleObjectFrame() {
    super();
    setType(TypeEnum.OLEOBJECTFRAME);
  }

  public OleObjectFrame isObjectIcon(Boolean isObjectIcon) {
    this.isObjectIcon = isObjectIcon;
    return this;
  }

   /**
   * True if an object is visible as icon.
   * @return isObjectIcon
  **/
  @ApiModelProperty(required = true, value = "True if an object is visible as icon.")
  public Boolean isIsObjectIcon() {
    return isObjectIcon;
  }

  public void setIsObjectIcon(Boolean isObjectIcon) {
    this.isObjectIcon = isObjectIcon;
  }

  public OleObjectFrame substitutePictureTitle(String substitutePictureTitle) {
    this.substitutePictureTitle = substitutePictureTitle;
    return this;
  }

   /**
   * The title for OleObject icon.             
   * @return substitutePictureTitle
  **/
  @ApiModelProperty(value = "The title for OleObject icon.             ")
  public String getSubstitutePictureTitle() {
    return substitutePictureTitle;
  }

  public void setSubstitutePictureTitle(String substitutePictureTitle) {
    this.substitutePictureTitle = substitutePictureTitle;
  }

  public OleObjectFrame substitutePictureFormat(PictureFill substitutePictureFormat) {
    this.substitutePictureFormat = substitutePictureFormat;
    return this;
  }

   /**
   * OleObject image fill properties.
   * @return substitutePictureFormat
  **/
  @ApiModelProperty(value = "OleObject image fill properties.")
  public PictureFill getSubstitutePictureFormat() {
    return substitutePictureFormat;
  }

  public void setSubstitutePictureFormat(PictureFill substitutePictureFormat) {
    this.substitutePictureFormat = substitutePictureFormat;
  }

  public OleObjectFrame objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

   /**
   * Returns or sets the name of an object.
   * @return objectName
  **/
  @ApiModelProperty(value = "Returns or sets the name of an object.")
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public OleObjectFrame embeddedFileBase64Data(String embeddedFileBase64Data) {
    this.embeddedFileBase64Data = embeddedFileBase64Data;
    return this;
  }

   /**
   * File data of embedded OLE object. 
   * @return embeddedFileBase64Data
  **/
  @ApiModelProperty(value = "File data of embedded OLE object. ")
  public String getEmbeddedFileBase64Data() {
    return embeddedFileBase64Data;
  }

  public void setEmbeddedFileBase64Data(String embeddedFileBase64Data) {
    this.embeddedFileBase64Data = embeddedFileBase64Data;
  }

  public OleObjectFrame embeddedFileExtension(String embeddedFileExtension) {
    this.embeddedFileExtension = embeddedFileExtension;
    return this;
  }

   /**
   * File extension for the current embedded OLE object
   * @return embeddedFileExtension
  **/
  @ApiModelProperty(value = "File extension for the current embedded OLE object")
  public String getEmbeddedFileExtension() {
    return embeddedFileExtension;
  }

  public void setEmbeddedFileExtension(String embeddedFileExtension) {
    this.embeddedFileExtension = embeddedFileExtension;
  }

  public OleObjectFrame objectProgId(String objectProgId) {
    this.objectProgId = objectProgId;
    return this;
  }

   /**
   * ProgID of an object.
   * @return objectProgId
  **/
  @ApiModelProperty(value = "ProgID of an object.")
  public String getObjectProgId() {
    return objectProgId;
  }

  public void setObjectProgId(String objectProgId) {
    this.objectProgId = objectProgId;
  }

  public OleObjectFrame linkPath(String linkPath) {
    this.linkPath = linkPath;
    return this;
  }

   /**
   * Full path to a linked file.
   * @return linkPath
  **/
  @ApiModelProperty(value = "Full path to a linked file.")
  public String getLinkPath() {
    return linkPath;
  }

  public void setLinkPath(String linkPath) {
    this.linkPath = linkPath;
  }

  public OleObjectFrame updateAutomatic(Boolean updateAutomatic) {
    this.updateAutomatic = updateAutomatic;
    return this;
  }

   /**
   * Determines if the linked embedded object is automatically updated when the presentation is opened or printed. Read/write Boolean.
   * @return updateAutomatic
  **/
  @ApiModelProperty(value = "Determines if the linked embedded object is automatically updated when the presentation is opened or printed. Read/write Boolean.")
  public Boolean isUpdateAutomatic() {
    return updateAutomatic;
  }

  public void setUpdateAutomatic(Boolean updateAutomatic) {
    this.updateAutomatic = updateAutomatic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OleObjectFrame oleObjectFrame = (OleObjectFrame) o;
    return true && Objects.equals(this.isObjectIcon, oleObjectFrame.isObjectIcon) && Objects.equals(this.substitutePictureTitle, oleObjectFrame.substitutePictureTitle) && Objects.equals(this.substitutePictureFormat, oleObjectFrame.substitutePictureFormat) && Objects.equals(this.objectName, oleObjectFrame.objectName) && Objects.equals(this.embeddedFileBase64Data, oleObjectFrame.embeddedFileBase64Data) && Objects.equals(this.embeddedFileExtension, oleObjectFrame.embeddedFileExtension) && Objects.equals(this.objectProgId, oleObjectFrame.objectProgId) && Objects.equals(this.linkPath, oleObjectFrame.linkPath) && Objects.equals(this.updateAutomatic, oleObjectFrame.updateAutomatic) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isObjectIcon, substitutePictureTitle, substitutePictureFormat, objectName, embeddedFileBase64Data, embeddedFileExtension, objectProgId, linkPath, updateAutomatic, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OleObjectFrame {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isObjectIcon: ").append(toIndentedString(isObjectIcon)).append("\n");
    sb.append("    substitutePictureTitle: ").append(toIndentedString(substitutePictureTitle)).append("\n");
    sb.append("    substitutePictureFormat: ").append(toIndentedString(substitutePictureFormat)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    embeddedFileBase64Data: ").append(toIndentedString(embeddedFileBase64Data)).append("\n");
    sb.append("    embeddedFileExtension: ").append(toIndentedString(embeddedFileExtension)).append("\n");
    sb.append("    objectProgId: ").append(toIndentedString(objectProgId)).append("\n");
    sb.append("    linkPath: ").append(toIndentedString(linkPath)).append("\n");
    sb.append("    updateAutomatic: ").append(toIndentedString(updateAutomatic)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.OLEOBJECTFRAME);
  }
}
