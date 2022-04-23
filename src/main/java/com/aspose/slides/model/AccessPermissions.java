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
 * A set of properties specifying which access permissions should be granted when the document is opened with user access.
 */
@ApiModel(description = "A set of properties specifying which access permissions should be granted when the document is opened with user access.")
public class AccessPermissions {
  @SerializedName(value = "printDocument", alternate = { "PrintDocument" })
  private Boolean printDocument;

  @SerializedName(value = "modifyContent", alternate = { "ModifyContent" })
  private Boolean modifyContent;

  @SerializedName(value = "copyTextAndGraphics", alternate = { "CopyTextAndGraphics" })
  private Boolean copyTextAndGraphics;

  @SerializedName(value = "addOrModifyFields", alternate = { "AddOrModifyFields" })
  private Boolean addOrModifyFields;

  @SerializedName(value = "fillExistingFields", alternate = { "FillExistingFields" })
  private Boolean fillExistingFields;

  @SerializedName(value = "extractTextAndGraphics", alternate = { "ExtractTextAndGraphics" })
  private Boolean extractTextAndGraphics;

  @SerializedName(value = "assembleDocument", alternate = { "AssembleDocument" })
  private Boolean assembleDocument;

  @SerializedName(value = "highQualityPrint", alternate = { "HighQualityPrint" })
  private Boolean highQualityPrint;


  public AccessPermissions() {
    super();
  }

  public AccessPermissions printDocument(Boolean printDocument) {
    this.printDocument = printDocument;
    return this;
  }

   /**
   * The user may print the document (possibly not at the highest quality level, depending on whether bit HighQualityPrint is also set).
   * @return printDocument
  **/
  @ApiModelProperty(required = true, value = "The user may print the document (possibly not at the highest quality level, depending on whether bit HighQualityPrint is also set).")
  public Boolean isPrintDocument() {
    return printDocument;
  }

  public void setPrintDocument(Boolean printDocument) {
    this.printDocument = printDocument;
  }

  public AccessPermissions modifyContent(Boolean modifyContent) {
    this.modifyContent = modifyContent;
    return this;
  }

   /**
   * The user may modify the contents of the document by operations other than those controlled by bits AddOrModifyFields, FillExistingFields, AssembleDocument.
   * @return modifyContent
  **/
  @ApiModelProperty(required = true, value = "The user may modify the contents of the document by operations other than those controlled by bits AddOrModifyFields, FillExistingFields, AssembleDocument.")
  public Boolean isModifyContent() {
    return modifyContent;
  }

  public void setModifyContent(Boolean modifyContent) {
    this.modifyContent = modifyContent;
  }

  public AccessPermissions copyTextAndGraphics(Boolean copyTextAndGraphics) {
    this.copyTextAndGraphics = copyTextAndGraphics;
    return this;
  }

   /**
   * The user may copy or otherwise extract text and graphics from the document by operations other than that controlled by bit ExtractTextAndGraphics.
   * @return copyTextAndGraphics
  **/
  @ApiModelProperty(required = true, value = "The user may copy or otherwise extract text and graphics from the document by operations other than that controlled by bit ExtractTextAndGraphics.")
  public Boolean isCopyTextAndGraphics() {
    return copyTextAndGraphics;
  }

  public void setCopyTextAndGraphics(Boolean copyTextAndGraphics) {
    this.copyTextAndGraphics = copyTextAndGraphics;
  }

  public AccessPermissions addOrModifyFields(Boolean addOrModifyFields) {
    this.addOrModifyFields = addOrModifyFields;
    return this;
  }

   /**
   * The user may add or modify text annotations, fill in interactive form fields, and, if bit ModifyContent is also set, create or modify interactive form fields (including signature fields).
   * @return addOrModifyFields
  **/
  @ApiModelProperty(required = true, value = "The user may add or modify text annotations, fill in interactive form fields, and, if bit ModifyContent is also set, create or modify interactive form fields (including signature fields).")
  public Boolean isAddOrModifyFields() {
    return addOrModifyFields;
  }

  public void setAddOrModifyFields(Boolean addOrModifyFields) {
    this.addOrModifyFields = addOrModifyFields;
  }

  public AccessPermissions fillExistingFields(Boolean fillExistingFields) {
    this.fillExistingFields = fillExistingFields;
    return this;
  }

   /**
   * The user may fill in existing interactive form fields (including signature fields), even if bit AddOrModifyFields is clear.
   * @return fillExistingFields
  **/
  @ApiModelProperty(required = true, value = "The user may fill in existing interactive form fields (including signature fields), even if bit AddOrModifyFields is clear.")
  public Boolean isFillExistingFields() {
    return fillExistingFields;
  }

  public void setFillExistingFields(Boolean fillExistingFields) {
    this.fillExistingFields = fillExistingFields;
  }

  public AccessPermissions extractTextAndGraphics(Boolean extractTextAndGraphics) {
    this.extractTextAndGraphics = extractTextAndGraphics;
    return this;
  }

   /**
   * The user may extract text and graphics in support of accessibility to users with disabilities or for other purposes.
   * @return extractTextAndGraphics
  **/
  @ApiModelProperty(required = true, value = "The user may extract text and graphics in support of accessibility to users with disabilities or for other purposes.")
  public Boolean isExtractTextAndGraphics() {
    return extractTextAndGraphics;
  }

  public void setExtractTextAndGraphics(Boolean extractTextAndGraphics) {
    this.extractTextAndGraphics = extractTextAndGraphics;
  }

  public AccessPermissions assembleDocument(Boolean assembleDocument) {
    this.assembleDocument = assembleDocument;
    return this;
  }

   /**
   * The user may assemble the document (insert, rotate, or delete pages and create bookmarks or thumbnail images), even if bit ModifyContent is clear.
   * @return assembleDocument
  **/
  @ApiModelProperty(required = true, value = "The user may assemble the document (insert, rotate, or delete pages and create bookmarks or thumbnail images), even if bit ModifyContent is clear.")
  public Boolean isAssembleDocument() {
    return assembleDocument;
  }

  public void setAssembleDocument(Boolean assembleDocument) {
    this.assembleDocument = assembleDocument;
  }

  public AccessPermissions highQualityPrint(Boolean highQualityPrint) {
    this.highQualityPrint = highQualityPrint;
    return this;
  }

   /**
   * The user may print the document to a representation from which a faithful digital copy of the PDF content could be generated. When this bit is clear (and bit PrintDocument is set), printing is limited to a low-level representation of the appearance, possibly of degraded quality.
   * @return highQualityPrint
  **/
  @ApiModelProperty(required = true, value = "The user may print the document to a representation from which a faithful digital copy of the PDF content could be generated. When this bit is clear (and bit PrintDocument is set), printing is limited to a low-level representation of the appearance, possibly of degraded quality.")
  public Boolean isHighQualityPrint() {
    return highQualityPrint;
  }

  public void setHighQualityPrint(Boolean highQualityPrint) {
    this.highQualityPrint = highQualityPrint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPermissions accessPermissions = (AccessPermissions) o;
    return true && Objects.equals(this.printDocument, accessPermissions.printDocument) && Objects.equals(this.modifyContent, accessPermissions.modifyContent) && Objects.equals(this.copyTextAndGraphics, accessPermissions.copyTextAndGraphics) && Objects.equals(this.addOrModifyFields, accessPermissions.addOrModifyFields) && Objects.equals(this.fillExistingFields, accessPermissions.fillExistingFields) && Objects.equals(this.extractTextAndGraphics, accessPermissions.extractTextAndGraphics) && Objects.equals(this.assembleDocument, accessPermissions.assembleDocument) && Objects.equals(this.highQualityPrint, accessPermissions.highQualityPrint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(printDocument, modifyContent, copyTextAndGraphics, addOrModifyFields, fillExistingFields, extractTextAndGraphics, assembleDocument, highQualityPrint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPermissions {\n");
    
    sb.append("    printDocument: ").append(toIndentedString(printDocument)).append("\n");
    sb.append("    modifyContent: ").append(toIndentedString(modifyContent)).append("\n");
    sb.append("    copyTextAndGraphics: ").append(toIndentedString(copyTextAndGraphics)).append("\n");
    sb.append("    addOrModifyFields: ").append(toIndentedString(addOrModifyFields)).append("\n");
    sb.append("    fillExistingFields: ").append(toIndentedString(fillExistingFields)).append("\n");
    sb.append("    extractTextAndGraphics: ").append(toIndentedString(extractTextAndGraphics)).append("\n");
    sb.append("    assembleDocument: ").append(toIndentedString(assembleDocument)).append("\n");
    sb.append("    highQualityPrint: ").append(toIndentedString(highQualityPrint)).append("\n");
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
