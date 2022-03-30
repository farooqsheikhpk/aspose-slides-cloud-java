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
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.AccentElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.ACCENT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.AddLayoutSlide.class, "type", com.aspose.slides.model.Task.TypeEnum.ADDLAYOUTSLIDE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.AddMasterSlide.class, "type", com.aspose.slides.model.Task.TypeEnum.ADDMASTERSLIDE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.AddShape.class, "type", com.aspose.slides.model.Task.TypeEnum.ADDSHAPE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.AddSlide.class, "type", com.aspose.slides.model.Task.TypeEnum.ADDSLIDE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.PathSegment.class, com.aspose.slides.model.ArcToPathSegment.class, "type", com.aspose.slides.model.PathSegment.TypeEnum.ARCTO.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.ArrayElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.ARRAY.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.BarElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.BAR.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.InputFile.class, com.aspose.slides.model.Base64InputFile.class, "type", com.aspose.slides.model.InputFile.TypeEnum.BASE64.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.BlockElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.BLOCK.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.BorderBoxElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.BORDERBOX.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.BoxElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.BOX.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.PathSegment.class, com.aspose.slides.model.ClosePathSegment.class, "type", com.aspose.slides.model.PathSegment.TypeEnum.CLOSE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.PathSegment.class, com.aspose.slides.model.CubicBezierToPathSegment.class, "type", com.aspose.slides.model.PathSegment.TypeEnum.CUBICBEZIERTO.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.DelimiterElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.DELIMITER.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.FractionElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.FRACTION.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.FunctionElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.FUNCTION.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.FillFormat.class, com.aspose.slides.model.GradientFill.class, "type", com.aspose.slides.model.FillFormat.TypeEnum.GRADIENT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.GroupingCharacterElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.GROUPINGCHARACTER.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.LeftSubSuperscriptElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.LEFTSUBSUPERSCRIPTELEMENT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.LimitElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.LIMIT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.PathSegment.class, com.aspose.slides.model.LineToPathSegment.class, "type", com.aspose.slides.model.PathSegment.TypeEnum.LINETO.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.MatrixElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.MATRIX.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.Merge.class, "type", com.aspose.slides.model.Task.TypeEnum.MERGE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.PathSegment.class, com.aspose.slides.model.MoveToPathSegment.class, "type", com.aspose.slides.model.PathSegment.TypeEnum.MOVETO.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.NaryOperatorElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.NARYOPERATOR.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.FillFormat.class, com.aspose.slides.model.NoFill.class, "type", com.aspose.slides.model.FillFormat.TypeEnum.NOFILL.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Series.class, com.aspose.slides.model.OneValueSeries.class, "dataPointType", com.aspose.slides.model.Series.DataPointTypeEnum.ONEVALUE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.InputFile.class, com.aspose.slides.model.PathInputFile.class, "type", com.aspose.slides.model.InputFile.TypeEnum.PATH.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.OutputFile.class, com.aspose.slides.model.PathOutputFile.class, "type", com.aspose.slides.model.OutputFile.TypeEnum.PATH.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.FillFormat.class, com.aspose.slides.model.PatternFill.class, "type", com.aspose.slides.model.FillFormat.TypeEnum.PATTERN.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.FillFormat.class, com.aspose.slides.model.PictureFill.class, "type", com.aspose.slides.model.FillFormat.TypeEnum.PICTURE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.PathSegment.class, com.aspose.slides.model.QuadraticBezierToPathSegment.class, "type", com.aspose.slides.model.PathSegment.TypeEnum.QUADBEZIERTO.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.RadicalElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.RADICAL.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.RemoveShape.class, "type", com.aspose.slides.model.Task.TypeEnum.REMOVESHAPE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.RemoveSlide.class, "type", com.aspose.slides.model.Task.TypeEnum.REMOVESLIDE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.ReorderSlide.class, "type", com.aspose.slides.model.Task.TypeEnum.REODERSLIDE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.ReplaceText.class, "type", com.aspose.slides.model.Task.TypeEnum.REPLACETEXT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.InputFile.class, com.aspose.slides.model.RequestInputFile.class, "type", com.aspose.slides.model.InputFile.TypeEnum.REQUEST.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.ResetSlide.class, "type", com.aspose.slides.model.Task.TypeEnum.RESETSLIDE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.OutputFile.class, com.aspose.slides.model.ResponseOutputFile.class, "type", com.aspose.slides.model.OutputFile.TypeEnum.RESPONSE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.RightSubSuperscriptElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.RIGHTSUBSUPERSCRIPTELEMENT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.Save.class, "type", com.aspose.slides.model.Task.TypeEnum.SAVE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.SaveShape.class, "type", com.aspose.slides.model.Task.TypeEnum.SAVESHAPE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.SaveSlide.class, "type", com.aspose.slides.model.Task.TypeEnum.SAVESLIDE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.SlideCommentBase.class, com.aspose.slides.model.SlideComment.class, "type", com.aspose.slides.model.SlideCommentBase.TypeEnum.REGULAR.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.SlideCommentBase.class, com.aspose.slides.model.SlideModernComment.class, "type", com.aspose.slides.model.SlideCommentBase.TypeEnum.MODERN.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.FillFormat.class, com.aspose.slides.model.SolidFill.class, "type", com.aspose.slides.model.FillFormat.TypeEnum.SOLID.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.SubscriptElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.SUBSCRIPTELEMENT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.SuperscriptElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.SUPERSCRIPTELEMENT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.MathElement.class, com.aspose.slides.model.TextElement.class, "type", com.aspose.slides.model.MathElement.TypeEnum.TEXT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.UpdateBackground.class, "type", com.aspose.slides.model.Task.TypeEnum.UPDATEBACKGROUND.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.Task.class, com.aspose.slides.model.UpdateShape.class, "type", com.aspose.slides.model.Task.TypeEnum.UPDATESHAPE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.OneValueSeries.class, com.aspose.slides.model.BoxAndWhiskerSeries.class, "dataPointType", com.aspose.slides.model.OneValueSeries.DataPointTypeEnum.ONEVALUE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.XYSeries.class, com.aspose.slides.model.BubbleSeries.class, "dataPointType", com.aspose.slides.model.XYSeries.DataPointTypeEnum.BUBBLE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.ShapeBase.class, com.aspose.slides.model.Chart.class, "type", com.aspose.slides.model.ShapeBase.TypeEnum.CHART.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.ShapeBase.class, com.aspose.slides.model.GraphicalObject.class, "type", com.aspose.slides.model.ShapeBase.TypeEnum.GRAPHICALOBJECT.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.ShapeBase.class, com.aspose.slides.model.GroupShape.class, "type", com.aspose.slides.model.ShapeBase.TypeEnum.GROUPSHAPE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.ShapeBase.class, com.aspose.slides.model.OleObjectFrame.class, "type", com.aspose.slides.model.ShapeBase.TypeEnum.OLEOBJECTFRAME.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.XYSeries.class, com.aspose.slides.model.ScatterSeries.class, "dataPointType", com.aspose.slides.model.XYSeries.DataPointTypeEnum.SCATTER.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.ShapeBase.class, com.aspose.slides.model.SmartArt.class, "type", com.aspose.slides.model.ShapeBase.TypeEnum.SMARTART.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.ShapeBase.class, com.aspose.slides.model.SummaryZoomFrame.class, "type", com.aspose.slides.model.ShapeBase.TypeEnum.SUMMARYZOOMFRAME.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.ShapeBase.class, com.aspose.slides.model.Table.class, "type", com.aspose.slides.model.ShapeBase.TypeEnum.TABLE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.OneValueSeries.class, com.aspose.slides.model.WaterfallSeries.class, "dataPointType", com.aspose.slides.model.OneValueSeries.DataPointTypeEnum.ONEVALUE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.GeometryShape.class, com.aspose.slides.model.AudioFrame.class, "type", com.aspose.slides.model.GeometryShape.TypeEnum.AUDIOFRAME.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.GeometryShape.class, com.aspose.slides.model.Connector.class, "type", com.aspose.slides.model.GeometryShape.TypeEnum.CONNECTOR.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.GeometryShape.class, com.aspose.slides.model.PictureFrame.class, "type", com.aspose.slides.model.GeometryShape.TypeEnum.PICTUREFRAME.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.ZoomObject.class, com.aspose.slides.model.SectionZoomFrame.class, "type", com.aspose.slides.model.ZoomObject.TypeEnum.SECTIONZOOMFRAME.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.GeometryShape.class, com.aspose.slides.model.Shape.class, "type", com.aspose.slides.model.GeometryShape.TypeEnum.SHAPE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.GeometryShape.class, com.aspose.slides.model.SmartArtShape.class, "type", com.aspose.slides.model.GeometryShape.TypeEnum.SMARTARTSHAPE.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.GeometryShape.class, com.aspose.slides.model.VideoFrame.class, "type", com.aspose.slides.model.GeometryShape.TypeEnum.VIDEOFRAME.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.ZoomObject.class, com.aspose.slides.model.ZoomFrame.class, "type", com.aspose.slides.model.ZoomObject.TypeEnum.ZOOMFRAME.getValue(), typeAdapters, valueMap);
        registerType(com.aspose.slides.model.SectionZoomFrame.class, com.aspose.slides.model.SummaryZoomSection.class, "type", com.aspose.slides.model.SectionZoomFrame.TypeEnum.SUMMARYZOOMSECTION.getValue(), typeAdapters, valueMap);
        for (RuntimeTypeAdapterFactory factory : typeAdapters.values()) {
            gsonBuilder.registerTypeAdapterFactory(factory);
        }
        gson = gsonBuilder.create();
    }

    private void registerType(
        Class classObject,
        Class subclass,
        String propertyName,
        String propertyValue,
        Map<String, RuntimeTypeAdapterFactory> typeAdapters,
        Map<String, Map<String, String>> valueMap) {
        String name = classObject.getSimpleName();
        if (classObject.getPackage().getName().equals("com.aspose.slides.model")) {
            if (!typeAdapters.containsKey(name)) {
                typeAdapters.put(name, RuntimeTypeAdapterFactory.of(classObject, propertyName));
                valueMap.put(name, new HashMap<String, String>());
            }
            if (!valueMap.get(name).containsKey(propertyValue)) {
                valueMap.get(name).put(propertyValue, null);
                typeAdapters.get(name).registerSubtype(subclass, propertyValue);
            }
            registerType(classObject.getSuperclass(), subclass, propertyName, propertyValue, typeAdapters, valueMap);
        }
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
