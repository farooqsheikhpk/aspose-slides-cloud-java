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
import com.aspose.slides.model.MathElement;
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
 * Specifies the fraction object, consisting of a numerator and denominator separated by a fraction bar.
 */
@ApiModel(description = "Specifies the fraction object, consisting of a numerator and denominator separated by a fraction bar.")
public class FractionElement extends MathElement {
  /**
   * Fraction type
   */
  @JsonAdapter(FractionTypeEnum.Adapter.class)
  public enum FractionTypeEnum {
    BAR("Bar"),
    
    SKEWED("Skewed"),
    
    LINEAR("Linear"),
    
    NOBAR("NoBar");

    private String value;

    FractionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FractionTypeEnum fromValue(String text) {
      for (FractionTypeEnum b : FractionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FractionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FractionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FractionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FractionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName(value = "fractionType", alternate = { "FractionType" })
  private FractionTypeEnum fractionType;

  @SerializedName(value = "numerator", alternate = { "Numerator" })
  private MathElement numerator;

  @SerializedName(value = "denominator", alternate = { "Denominator" })
  private MathElement denominator;


  public FractionElement() {
    super();
    setType(TypeEnum.FRACTION);
  }

  public FractionElement fractionType(FractionTypeEnum fractionType) {
    this.fractionType = fractionType;
    return this;
  }

   /**
   * Fraction type
   * @return fractionType
  **/
  @ApiModelProperty(value = "Fraction type")
  public FractionTypeEnum getFractionType() {
    return fractionType;
  }

  public void setFractionType(FractionTypeEnum fractionType) {
    this.fractionType = fractionType;
  }

  public FractionElement numerator(MathElement numerator) {
    this.numerator = numerator;
    return this;
  }

   /**
   * Numerator
   * @return numerator
  **/
  @ApiModelProperty(value = "Numerator")
  public MathElement getNumerator() {
    return numerator;
  }

  public void setNumerator(MathElement numerator) {
    this.numerator = numerator;
  }

  public FractionElement denominator(MathElement denominator) {
    this.denominator = denominator;
    return this;
  }

   /**
   * Denominator
   * @return denominator
  **/
  @ApiModelProperty(value = "Denominator")
  public MathElement getDenominator() {
    return denominator;
  }

  public void setDenominator(MathElement denominator) {
    this.denominator = denominator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FractionElement fractionElement = (FractionElement) o;
    return true && Objects.equals(this.fractionType, fractionElement.fractionType) && Objects.equals(this.numerator, fractionElement.numerator) && Objects.equals(this.denominator, fractionElement.denominator) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fractionType, numerator, denominator, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FractionElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fractionType: ").append(toIndentedString(fractionType)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
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
      typeDeterminers.put("Type", TypeEnum.FRACTION);
  }
}
