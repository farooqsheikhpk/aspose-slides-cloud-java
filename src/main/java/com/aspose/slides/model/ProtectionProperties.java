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
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
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
 * Protection properties.
 */
@ApiModel(description = "Protection properties.")
public class ProtectionProperties extends ResourceBase {
  @SerializedName(value = "encryptDocumentProperties", alternate = { "EncryptDocumentProperties" })
  private Boolean encryptDocumentProperties;

  @SerializedName(value = "readOnlyRecommended", alternate = { "ReadOnlyRecommended" })
  private Boolean readOnlyRecommended;

  @SerializedName(value = "readPassword", alternate = { "ReadPassword" })
  private String readPassword;

  @SerializedName(value = "writePassword", alternate = { "WritePassword" })
  private String writePassword;

  @SerializedName(value = "isWriteProtected", alternate = { "IsWriteProtected" })
  private Boolean isWriteProtected;

  @SerializedName(value = "isEncrypted", alternate = { "IsEncrypted" })
  private Boolean isEncrypted;


  public ProtectionProperties() {
    super();
  }

  public ProtectionProperties encryptDocumentProperties(Boolean encryptDocumentProperties) {
    this.encryptDocumentProperties = encryptDocumentProperties;
    return this;
  }

   /**
   * True if document properties are encrypted. Has effect only for password protected presentations.
   * @return encryptDocumentProperties
  **/
  @ApiModelProperty(value = "True if document properties are encrypted. Has effect only for password protected presentations.")
  public Boolean isEncryptDocumentProperties() {
    return encryptDocumentProperties;
  }

  public void setEncryptDocumentProperties(Boolean encryptDocumentProperties) {
    this.encryptDocumentProperties = encryptDocumentProperties;
  }

  public ProtectionProperties readOnlyRecommended(Boolean readOnlyRecommended) {
    this.readOnlyRecommended = readOnlyRecommended;
    return this;
  }

   /**
   * True if the document should be opened as read-only.
   * @return readOnlyRecommended
  **/
  @ApiModelProperty(value = "True if the document should be opened as read-only.")
  public Boolean isReadOnlyRecommended() {
    return readOnlyRecommended;
  }

  public void setReadOnlyRecommended(Boolean readOnlyRecommended) {
    this.readOnlyRecommended = readOnlyRecommended;
  }

  public ProtectionProperties readPassword(String readPassword) {
    this.readPassword = readPassword;
    return this;
  }

   /**
   * Password for read protection.
   * @return readPassword
  **/
  @ApiModelProperty(value = "Password for read protection.")
  public String getReadPassword() {
    return readPassword;
  }

  public void setReadPassword(String readPassword) {
    this.readPassword = readPassword;
  }

  public ProtectionProperties writePassword(String writePassword) {
    this.writePassword = writePassword;
    return this;
  }

   /**
   * Password for write protection.
   * @return writePassword
  **/
  @ApiModelProperty(value = "Password for write protection.")
  public String getWritePassword() {
    return writePassword;
  }

  public void setWritePassword(String writePassword) {
    this.writePassword = writePassword;
  }

  public ProtectionProperties isWriteProtected(Boolean isWriteProtected) {
    this.isWriteProtected = isWriteProtected;
    return this;
  }

   /**
   * Returns true if the presentation protected for editing. 
   * @return isWriteProtected
  **/
  @ApiModelProperty(required = true, value = "Returns true if the presentation protected for editing. ")
  public Boolean isIsWriteProtected() {
    return isWriteProtected;
  }

  public void setIsWriteProtected(Boolean isWriteProtected) {
    this.isWriteProtected = isWriteProtected;
  }

  public ProtectionProperties isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * Returns true if the presentation protected for reading. 
   * @return isEncrypted
  **/
  @ApiModelProperty(required = true, value = "Returns true if the presentation protected for reading. ")
  public Boolean isIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtectionProperties protectionProperties = (ProtectionProperties) o;
    return true && Objects.equals(this.encryptDocumentProperties, protectionProperties.encryptDocumentProperties) && Objects.equals(this.readOnlyRecommended, protectionProperties.readOnlyRecommended) && Objects.equals(this.readPassword, protectionProperties.readPassword) && Objects.equals(this.writePassword, protectionProperties.writePassword) && Objects.equals(this.isWriteProtected, protectionProperties.isWriteProtected) && Objects.equals(this.isEncrypted, protectionProperties.isEncrypted) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptDocumentProperties, readOnlyRecommended, readPassword, writePassword, isWriteProtected, isEncrypted, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectionProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encryptDocumentProperties: ").append(toIndentedString(encryptDocumentProperties)).append("\n");
    sb.append("    readOnlyRecommended: ").append(toIndentedString(readOnlyRecommended)).append("\n");
    sb.append("    readPassword: ").append(toIndentedString(readPassword)).append("\n");
    sb.append("    writePassword: ").append(toIndentedString(writePassword)).append("\n");
    sb.append("    isWriteProtected: ").append(toIndentedString(isWriteProtected)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
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
