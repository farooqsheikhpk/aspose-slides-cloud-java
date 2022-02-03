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

package com.aspose.slides;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.reflections.Reflections;
import org.threeten.bp.OffsetTime;

public class JSON {
    private Gson gson;
    private boolean isLenientOnJson = false;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();

    public JSON() {
        Map<String, RuntimeTypeAdapterFactory> typeAdapters = new HashMap<String, RuntimeTypeAdapterFactory>();
        Map<String, Map<String, String>> valueMap = new HashMap<String, Map<String, String>>();
        String currentValue = null;
        GsonBuilder gsonBuilder = new GsonBuilder()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.ACCENT.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.AccentElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.ADDLAYOUTSLIDE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.AddLayoutSlide.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.ADDMASTERSLIDE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.AddMasterSlide.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.ADDSHAPE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.AddShape.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.ADDSLIDE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.AddSlide.class, currentValue);
        }
        if (!typeAdapters.containsKey("PathSegment")) {
            typeAdapters.put("PathSegment", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.PathSegment.class, "type"));
            valueMap.put("PathSegment", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.PathSegment.TypeEnum.ARCTO.getValue();
        if (!valueMap.get("PathSegment").containsKey(currentValue)) {
            valueMap.get("PathSegment").put(currentValue, null);
            typeAdapters.get("PathSegment").registerSubtype(com.aspose.slides.model.ArcToPathSegment.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.ARRAY.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.ArrayElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.BAR.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.BarElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("InputFile")) {
            typeAdapters.put("InputFile", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.InputFile.class, "type"));
            valueMap.put("InputFile", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.InputFile.TypeEnum.BASE64.getValue();
        if (!valueMap.get("InputFile").containsKey(currentValue)) {
            valueMap.get("InputFile").put(currentValue, null);
            typeAdapters.get("InputFile").registerSubtype(com.aspose.slides.model.Base64InputFile.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.BLOCK.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.BlockElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.BORDERBOX.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.BorderBoxElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.BOX.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.BoxElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("Series")) {
            typeAdapters.put("Series", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Series.class, "dataPointType"));
            valueMap.put("Series", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Series.DataPointTypeEnum.BUBBLE.getValue();
        if (!valueMap.get("Series").containsKey(currentValue)) {
            valueMap.get("Series").put(currentValue, null);
            typeAdapters.get("Series").registerSubtype(com.aspose.slides.model.BubbleSeries.class, currentValue);
        }
        if (!typeAdapters.containsKey("PathSegment")) {
            typeAdapters.put("PathSegment", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.PathSegment.class, "type"));
            valueMap.put("PathSegment", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.PathSegment.TypeEnum.CLOSE.getValue();
        if (!valueMap.get("PathSegment").containsKey(currentValue)) {
            valueMap.get("PathSegment").put(currentValue, null);
            typeAdapters.get("PathSegment").registerSubtype(com.aspose.slides.model.ClosePathSegment.class, currentValue);
        }
        if (!typeAdapters.containsKey("PathSegment")) {
            typeAdapters.put("PathSegment", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.PathSegment.class, "type"));
            valueMap.put("PathSegment", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.PathSegment.TypeEnum.CUBICBEZIERTO.getValue();
        if (!valueMap.get("PathSegment").containsKey(currentValue)) {
            valueMap.get("PathSegment").put(currentValue, null);
            typeAdapters.get("PathSegment").registerSubtype(com.aspose.slides.model.CubicBezierToPathSegment.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.DELIMITER.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.DelimiterElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.FRACTION.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.FractionElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.FUNCTION.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.FunctionElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("FillFormat")) {
            typeAdapters.put("FillFormat", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.FillFormat.class, "type"));
            valueMap.put("FillFormat", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.FillFormat.TypeEnum.GRADIENT.getValue();
        if (!valueMap.get("FillFormat").containsKey(currentValue)) {
            valueMap.get("FillFormat").put(currentValue, null);
            typeAdapters.get("FillFormat").registerSubtype(com.aspose.slides.model.GradientFill.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.GROUPINGCHARACTER.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.GroupingCharacterElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.LEFTSUBSUPERSCRIPTELEMENT.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.LeftSubSuperscriptElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.LIMIT.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.LimitElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("PathSegment")) {
            typeAdapters.put("PathSegment", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.PathSegment.class, "type"));
            valueMap.put("PathSegment", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.PathSegment.TypeEnum.LINETO.getValue();
        if (!valueMap.get("PathSegment").containsKey(currentValue)) {
            valueMap.get("PathSegment").put(currentValue, null);
            typeAdapters.get("PathSegment").registerSubtype(com.aspose.slides.model.LineToPathSegment.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.MATRIX.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.MatrixElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.MERGE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.Merge.class, currentValue);
        }
        if (!typeAdapters.containsKey("PathSegment")) {
            typeAdapters.put("PathSegment", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.PathSegment.class, "type"));
            valueMap.put("PathSegment", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.PathSegment.TypeEnum.MOVETO.getValue();
        if (!valueMap.get("PathSegment").containsKey(currentValue)) {
            valueMap.get("PathSegment").put(currentValue, null);
            typeAdapters.get("PathSegment").registerSubtype(com.aspose.slides.model.MoveToPathSegment.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.NARYOPERATOR.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.NaryOperatorElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("FillFormat")) {
            typeAdapters.put("FillFormat", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.FillFormat.class, "type"));
            valueMap.put("FillFormat", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.FillFormat.TypeEnum.NOFILL.getValue();
        if (!valueMap.get("FillFormat").containsKey(currentValue)) {
            valueMap.get("FillFormat").put(currentValue, null);
            typeAdapters.get("FillFormat").registerSubtype(com.aspose.slides.model.NoFill.class, currentValue);
        }
        if (!typeAdapters.containsKey("Series")) {
            typeAdapters.put("Series", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Series.class, "dataPointType"));
            valueMap.put("Series", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Series.DataPointTypeEnum.ONEVALUE.getValue();
        if (!valueMap.get("Series").containsKey(currentValue)) {
            valueMap.get("Series").put(currentValue, null);
            typeAdapters.get("Series").registerSubtype(com.aspose.slides.model.OneValueSeries.class, currentValue);
        }
        if (!typeAdapters.containsKey("InputFile")) {
            typeAdapters.put("InputFile", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.InputFile.class, "type"));
            valueMap.put("InputFile", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.InputFile.TypeEnum.PATH.getValue();
        if (!valueMap.get("InputFile").containsKey(currentValue)) {
            valueMap.get("InputFile").put(currentValue, null);
            typeAdapters.get("InputFile").registerSubtype(com.aspose.slides.model.PathInputFile.class, currentValue);
        }
        if (!typeAdapters.containsKey("OutputFile")) {
            typeAdapters.put("OutputFile", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.OutputFile.class, "type"));
            valueMap.put("OutputFile", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.OutputFile.TypeEnum.PATH.getValue();
        if (!valueMap.get("OutputFile").containsKey(currentValue)) {
            valueMap.get("OutputFile").put(currentValue, null);
            typeAdapters.get("OutputFile").registerSubtype(com.aspose.slides.model.PathOutputFile.class, currentValue);
        }
        if (!typeAdapters.containsKey("FillFormat")) {
            typeAdapters.put("FillFormat", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.FillFormat.class, "type"));
            valueMap.put("FillFormat", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.FillFormat.TypeEnum.PATTERN.getValue();
        if (!valueMap.get("FillFormat").containsKey(currentValue)) {
            valueMap.get("FillFormat").put(currentValue, null);
            typeAdapters.get("FillFormat").registerSubtype(com.aspose.slides.model.PatternFill.class, currentValue);
        }
        if (!typeAdapters.containsKey("FillFormat")) {
            typeAdapters.put("FillFormat", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.FillFormat.class, "type"));
            valueMap.put("FillFormat", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.FillFormat.TypeEnum.PICTURE.getValue();
        if (!valueMap.get("FillFormat").containsKey(currentValue)) {
            valueMap.get("FillFormat").put(currentValue, null);
            typeAdapters.get("FillFormat").registerSubtype(com.aspose.slides.model.PictureFill.class, currentValue);
        }
        if (!typeAdapters.containsKey("PathSegment")) {
            typeAdapters.put("PathSegment", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.PathSegment.class, "type"));
            valueMap.put("PathSegment", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.PathSegment.TypeEnum.QUADBEZIERTO.getValue();
        if (!valueMap.get("PathSegment").containsKey(currentValue)) {
            valueMap.get("PathSegment").put(currentValue, null);
            typeAdapters.get("PathSegment").registerSubtype(com.aspose.slides.model.QuadraticBezierToPathSegment.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.RADICAL.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.RadicalElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.REMOVESHAPE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.RemoveShape.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.REMOVESLIDE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.RemoveSlide.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.REODERSLIDE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.ReorderSlide.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.REPLACETEXT.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.ReplaceText.class, currentValue);
        }
        if (!typeAdapters.containsKey("InputFile")) {
            typeAdapters.put("InputFile", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.InputFile.class, "type"));
            valueMap.put("InputFile", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.InputFile.TypeEnum.REQUEST.getValue();
        if (!valueMap.get("InputFile").containsKey(currentValue)) {
            valueMap.get("InputFile").put(currentValue, null);
            typeAdapters.get("InputFile").registerSubtype(com.aspose.slides.model.RequestInputFile.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.RESETSLIDE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.ResetSlide.class, currentValue);
        }
        if (!typeAdapters.containsKey("OutputFile")) {
            typeAdapters.put("OutputFile", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.OutputFile.class, "type"));
            valueMap.put("OutputFile", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.OutputFile.TypeEnum.RESPONSE.getValue();
        if (!valueMap.get("OutputFile").containsKey(currentValue)) {
            valueMap.get("OutputFile").put(currentValue, null);
            typeAdapters.get("OutputFile").registerSubtype(com.aspose.slides.model.ResponseOutputFile.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.RIGHTSUBSUPERSCRIPTELEMENT.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.RightSubSuperscriptElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.SAVE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.Save.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.SAVESHAPE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.SaveShape.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.SAVESLIDE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.SaveSlide.class, currentValue);
        }
        if (!typeAdapters.containsKey("Series")) {
            typeAdapters.put("Series", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Series.class, "dataPointType"));
            valueMap.put("Series", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Series.DataPointTypeEnum.SCATTER.getValue();
        if (!valueMap.get("Series").containsKey(currentValue)) {
            valueMap.get("Series").put(currentValue, null);
            typeAdapters.get("Series").registerSubtype(com.aspose.slides.model.ScatterSeries.class, currentValue);
        }
        if (!typeAdapters.containsKey("FillFormat")) {
            typeAdapters.put("FillFormat", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.FillFormat.class, "type"));
            valueMap.put("FillFormat", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.FillFormat.TypeEnum.SOLID.getValue();
        if (!valueMap.get("FillFormat").containsKey(currentValue)) {
            valueMap.get("FillFormat").put(currentValue, null);
            typeAdapters.get("FillFormat").registerSubtype(com.aspose.slides.model.SolidFill.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.SUBSCRIPTELEMENT.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.SubscriptElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.SUPERSCRIPTELEMENT.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.SuperscriptElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("MathElement")) {
            typeAdapters.put("MathElement", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.MathElement.class, "type"));
            valueMap.put("MathElement", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.MathElement.TypeEnum.TEXT.getValue();
        if (!valueMap.get("MathElement").containsKey(currentValue)) {
            valueMap.get("MathElement").put(currentValue, null);
            typeAdapters.get("MathElement").registerSubtype(com.aspose.slides.model.TextElement.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.UPDATEBACKGROUND.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.UpdateBackground.class, currentValue);
        }
        if (!typeAdapters.containsKey("Task")) {
            typeAdapters.put("Task", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.Task.class, "type"));
            valueMap.put("Task", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.Task.TypeEnum.UPDATESHAPE.getValue();
        if (!valueMap.get("Task").containsKey(currentValue)) {
            valueMap.get("Task").put(currentValue, null);
            typeAdapters.get("Task").registerSubtype(com.aspose.slides.model.UpdateShape.class, currentValue);
        }
        if (!typeAdapters.containsKey("OneValueSeries")) {
            typeAdapters.put("OneValueSeries", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.OneValueSeries.class, "dataPointType"));
            valueMap.put("OneValueSeries", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.OneValueSeries.DataPointTypeEnum.ONEVALUE.getValue();
        if (!valueMap.get("OneValueSeries").containsKey(currentValue)) {
            valueMap.get("OneValueSeries").put(currentValue, null);
            typeAdapters.get("OneValueSeries").registerSubtype(com.aspose.slides.model.BoxAndWhiskerSeries.class, currentValue);
        }
        if (!typeAdapters.containsKey("ShapeBase")) {
            typeAdapters.put("ShapeBase", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.ShapeBase.class, "type"));
            valueMap.put("ShapeBase", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.ShapeBase.TypeEnum.CHART.getValue();
        if (!valueMap.get("ShapeBase").containsKey(currentValue)) {
            valueMap.get("ShapeBase").put(currentValue, null);
            typeAdapters.get("ShapeBase").registerSubtype(com.aspose.slides.model.Chart.class, currentValue);
        }
        if (!typeAdapters.containsKey("ShapeBase")) {
            typeAdapters.put("ShapeBase", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.ShapeBase.class, "type"));
            valueMap.put("ShapeBase", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.ShapeBase.TypeEnum.GRAPHICALOBJECT.getValue();
        if (!valueMap.get("ShapeBase").containsKey(currentValue)) {
            valueMap.get("ShapeBase").put(currentValue, null);
            typeAdapters.get("ShapeBase").registerSubtype(com.aspose.slides.model.GraphicalObject.class, currentValue);
        }
        if (!typeAdapters.containsKey("ShapeBase")) {
            typeAdapters.put("ShapeBase", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.ShapeBase.class, "type"));
            valueMap.put("ShapeBase", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.ShapeBase.TypeEnum.GROUPSHAPE.getValue();
        if (!valueMap.get("ShapeBase").containsKey(currentValue)) {
            valueMap.get("ShapeBase").put(currentValue, null);
            typeAdapters.get("ShapeBase").registerSubtype(com.aspose.slides.model.GroupShape.class, currentValue);
        }
        if (!typeAdapters.containsKey("ShapeBase")) {
            typeAdapters.put("ShapeBase", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.ShapeBase.class, "type"));
            valueMap.put("ShapeBase", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.ShapeBase.TypeEnum.OLEOBJECTFRAME.getValue();
        if (!valueMap.get("ShapeBase").containsKey(currentValue)) {
            valueMap.get("ShapeBase").put(currentValue, null);
            typeAdapters.get("ShapeBase").registerSubtype(com.aspose.slides.model.OleObjectFrame.class, currentValue);
        }
        if (!typeAdapters.containsKey("ShapeBase")) {
            typeAdapters.put("ShapeBase", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.ShapeBase.class, "type"));
            valueMap.put("ShapeBase", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.ShapeBase.TypeEnum.SMARTART.getValue();
        if (!valueMap.get("ShapeBase").containsKey(currentValue)) {
            valueMap.get("ShapeBase").put(currentValue, null);
            typeAdapters.get("ShapeBase").registerSubtype(com.aspose.slides.model.SmartArt.class, currentValue);
        }
        if (!typeAdapters.containsKey("ShapeBase")) {
            typeAdapters.put("ShapeBase", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.ShapeBase.class, "type"));
            valueMap.put("ShapeBase", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.ShapeBase.TypeEnum.TABLE.getValue();
        if (!valueMap.get("ShapeBase").containsKey(currentValue)) {
            valueMap.get("ShapeBase").put(currentValue, null);
            typeAdapters.get("ShapeBase").registerSubtype(com.aspose.slides.model.Table.class, currentValue);
        }
        if (!typeAdapters.containsKey("OneValueSeries")) {
            typeAdapters.put("OneValueSeries", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.OneValueSeries.class, "dataPointType"));
            valueMap.put("OneValueSeries", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.OneValueSeries.DataPointTypeEnum.ONEVALUE.getValue();
        if (!valueMap.get("OneValueSeries").containsKey(currentValue)) {
            valueMap.get("OneValueSeries").put(currentValue, null);
            typeAdapters.get("OneValueSeries").registerSubtype(com.aspose.slides.model.WaterfallSeries.class, currentValue);
        }
        if (!typeAdapters.containsKey("GeometryShape")) {
            typeAdapters.put("GeometryShape", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.GeometryShape.class, "type"));
            valueMap.put("GeometryShape", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.GeometryShape.TypeEnum.AUDIOFRAME.getValue();
        if (!valueMap.get("GeometryShape").containsKey(currentValue)) {
            valueMap.get("GeometryShape").put(currentValue, null);
            typeAdapters.get("GeometryShape").registerSubtype(com.aspose.slides.model.AudioFrame.class, currentValue);
        }
        if (!typeAdapters.containsKey("GeometryShape")) {
            typeAdapters.put("GeometryShape", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.GeometryShape.class, "type"));
            valueMap.put("GeometryShape", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.GeometryShape.TypeEnum.CONNECTOR.getValue();
        if (!valueMap.get("GeometryShape").containsKey(currentValue)) {
            valueMap.get("GeometryShape").put(currentValue, null);
            typeAdapters.get("GeometryShape").registerSubtype(com.aspose.slides.model.Connector.class, currentValue);
        }
        if (!typeAdapters.containsKey("GeometryShape")) {
            typeAdapters.put("GeometryShape", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.GeometryShape.class, "type"));
            valueMap.put("GeometryShape", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.GeometryShape.TypeEnum.PICTUREFRAME.getValue();
        if (!valueMap.get("GeometryShape").containsKey(currentValue)) {
            valueMap.get("GeometryShape").put(currentValue, null);
            typeAdapters.get("GeometryShape").registerSubtype(com.aspose.slides.model.PictureFrame.class, currentValue);
        }
        if (!typeAdapters.containsKey("GeometryShape")) {
            typeAdapters.put("GeometryShape", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.GeometryShape.class, "type"));
            valueMap.put("GeometryShape", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.GeometryShape.TypeEnum.SHAPE.getValue();
        if (!valueMap.get("GeometryShape").containsKey(currentValue)) {
            valueMap.get("GeometryShape").put(currentValue, null);
            typeAdapters.get("GeometryShape").registerSubtype(com.aspose.slides.model.Shape.class, currentValue);
        }
        if (!typeAdapters.containsKey("GeometryShape")) {
            typeAdapters.put("GeometryShape", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.GeometryShape.class, "type"));
            valueMap.put("GeometryShape", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.GeometryShape.TypeEnum.SMARTARTSHAPE.getValue();
        if (!valueMap.get("GeometryShape").containsKey(currentValue)) {
            valueMap.get("GeometryShape").put(currentValue, null);
            typeAdapters.get("GeometryShape").registerSubtype(com.aspose.slides.model.SmartArtShape.class, currentValue);
        }
        if (!typeAdapters.containsKey("GeometryShape")) {
            typeAdapters.put("GeometryShape", RuntimeTypeAdapterFactory.of(com.aspose.slides.model.GeometryShape.class, "type"));
            valueMap.put("GeometryShape", new HashMap<String, String>());
        }
        currentValue = com.aspose.slides.model.GeometryShape.TypeEnum.VIDEOFRAME.getValue();
        if (!valueMap.get("GeometryShape").containsKey(currentValue)) {
            valueMap.get("GeometryShape").put(currentValue, null);
            typeAdapters.get("GeometryShape").registerSubtype(com.aspose.slides.model.VideoFrame.class, currentValue);
        }
        for (RuntimeTypeAdapterFactory factory : typeAdapters.values()) {
            gsonBuilder.registerTypeAdapterFactory(factory);
        }
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    public JSON setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
        return this;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            Type type = getObjectSubtype(returnType, body);
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, type);
            } else {
                return gson.fromJson(body, type);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class))
                return (T) body;
            else throw (e);
        }
    }

    @SuppressWarnings("unchecked")
    public Type getObjectSubtype(Type type, String data) {
        JsonParser parser = new JsonParser();
        JsonObject object = parser.parse(data).getAsJsonObject();
        Reflections reflections = new Reflections("com.aspose.slides.model");
        Set<Class<?>> classes = reflections.getSubTypesOf((Class)type);
        for (Class<?> aClass : classes) {
            if (isObjectSubtypeOf(aClass, object)) {
                return aClass;
            }
        }
        return type;
    }

    private boolean isObjectSubtypeOf(Class aClass, JsonObject object) {
        try {
            Field field = aClass.getDeclaredField("typeDeterminers");
            if (field == null) {
                return false;
            }
            field.setAccessible(true);
            Object determinersObject = field.get(null);
            if (determinersObject == null || !(determinersObject instanceof Map<?, ?>)) {
                return false;
            }
            Map<String, Object> determiners = (Map<String, Object>)determinersObject;
            if (determiners.isEmpty()) {
                return false;
            }
            for (String key : determiners.keySet()) {
                JsonElement objectKeyValue = object.get(key);
                if (objectKeyValue == null) {
                    objectKeyValue = object.get(key.substring(0, 1).toLowerCase() + key.substring(1));
                }
                if (objectKeyValue == null) {
                    objectKeyValue = object.get(key.substring(0, 1).toUpperCase() + key.substring(1));
                }
                if (objectKeyValue == null) {
                    return false;
                }
                if (!objectKeyValue.getAsString().equalsIgnoreCase(determiners.get(key).toString())) {
                    return false;
                }
            }
            return true;
        }
        catch (Exception ex) {
            //Reject the class in any unexpected case
            return false;
        }
    }
    
    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    try {
                        return OffsetDateTime.parse(date, formatter);
                    } catch (Exception ex) {
                        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                        return localDate.atTime(OffsetTime.MIN);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public JSON setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {
        }

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {
        }

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

}
