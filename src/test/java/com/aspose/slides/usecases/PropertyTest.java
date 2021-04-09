// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="PropertyTests.cs">
//   Copyright (c) 2018 Aspose.Slides for Cloud
// </copyright>
// <summary>
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
// 
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
// 
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.slides.usecases;

import com.aspose.slides.ApiException;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * API tests for property methods
 */
public class PropertyTest extends ApiTest {
    @Test
    public void documentPropertiesBuiltinTest() throws ApiException, IOException {
        initialize(null, null, null);
        DocumentProperty documentProperty = api.getDocumentProperty(c_fileName, c_builtinPropertyName, c_password, c_folderName, null);
        assertEquals(c_builtinPropertyName, documentProperty.getName());
        assertTrue(documentProperty.isBuiltIn());
        DocumentProperty property = new DocumentProperty();
        property.setValue(c_updatedPropertyValue);
        DocumentProperty updatedProperty = api.setDocumentProperty(c_fileName, c_builtinPropertyName, property, c_password, c_folderName, null);
        assertTrue(updatedProperty.isBuiltIn());
        assertEquals(c_updatedPropertyValue, updatedProperty.getValue());
        api.deleteDocumentProperty(c_fileName, c_builtinPropertyName, c_password, c_folderName, null);
        //built-in property is not actually deleted
        documentProperty = api.getDocumentProperty(c_fileName, c_builtinPropertyName, c_password, c_folderName, null);
        assertEquals(c_builtinPropertyName, documentProperty.getName());
        assertTrue(documentProperty.isBuiltIn());
        assertNotEquals(c_updatedPropertyValue, documentProperty.getValue());
    }

    @Test
    public void documentPropertiesCustomTest() throws ApiException, IOException {
        initialize(null, null, null);
        DocumentProperty property = new DocumentProperty();
        property.setValue(c_updatedPropertyValue);
        DocumentProperty updatedProperty = api.setDocumentProperty(c_fileName, c_customPropertyName, property, c_password, c_folderName, null);
        assertFalse(updatedProperty.isBuiltIn());
        assertEquals(c_updatedPropertyValue, updatedProperty.getValue());
        api.deleteDocumentProperty(c_fileName, c_customPropertyName, c_password, c_folderName, null);
        try {
            api.getDocumentProperty(c_fileName, c_customPropertyName, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
            assertEquals(404, ((ApiException)ex).getCode());
        }
    }

    @Test
    public void documentPropertiesBulkUpdateTest() throws ApiException, IOException {
        initialize(null, null, null);
        int count = api.getDocumentProperties(c_fileName, c_password, c_folderName, null).getList().size();
        DocumentProperties properties = new DocumentProperties();
        List<DocumentProperty> propertyList = new ArrayList<DocumentProperty>();
        DocumentProperty property1 = new DocumentProperty();
        property1.setName(c_builtinPropertyName);
        property1.setValue(c_updatedPropertyValue);
        propertyList.add(property1);
        DocumentProperty property2 = new DocumentProperty();
        property2.setName(c_customPropertyName);
        property2.setValue(c_updatedPropertyValue);
        propertyList.add(property2);
        properties.setList(propertyList);
        assertEquals(count + 1, api.setDocumentProperties(c_fileName, properties, c_password, c_folderName, null).getList().size());
        //One custom property was contained in the original presentation; it also must be deleted
        assertEquals(count - 1, api.deleteDocumentProperties(c_fileName, c_password, c_folderName, null).getList().size());
    }

    @Test
    public void slidePropertiesTest() throws ApiException, IOException {
        initialize(null, null, null);
        SlideProperties slideProperties = api.getSlideProperties(c_fileName, c_password, c_folderName, null);
        SlideProperties dto = new SlideProperties();
        dto.setFirstSlideNumber(slideProperties.getFirstSlideNumber() + 2);
        SlideProperties updatedProperties = api.setSlideProperties(c_fileName, dto, c_password, c_folderName, null);
        assertNotEquals(slideProperties.getFirstSlideNumber(), updatedProperties.getFirstSlideNumber());
        assertEquals(slideProperties.getOrientation(), updatedProperties.getOrientation());
    }

    @Test
    public void slideSizePresetTest() throws ApiException, IOException {
        initialize(null, null, null);
        SlideProperties dto = new SlideProperties();
        dto.setSizeType(SlideProperties.SizeTypeEnum.B4ISOPAPER);
        SlideProperties updatedProperties = api.setSlideProperties(c_fileName, dto, c_password, c_folderName, null);
        assertEquals(SlideProperties.SizeTypeEnum.B4ISOPAPER, updatedProperties.getSizeType());
        assertEquals(852, updatedProperties.getWidth().longValue());
        assertEquals(639, updatedProperties.getHeight().longValue());
    }

    @Test
    public void slideSizeCustomTest() throws ApiException, IOException {
        final int c_width = 800;
        final int c_height = 500;
        initialize(null, null, null);
        SlideProperties dto = new SlideProperties();
        dto.setWidth(c_width);
        dto.setHeight(c_height);
        SlideProperties updatedProperties = api.setSlideProperties(c_fileName, dto, c_password, c_folderName, null);
        assertEquals(SlideProperties.SizeTypeEnum.CUSTOM, updatedProperties.getSizeType());
        assertEquals(c_width, updatedProperties.getWidth().longValue());
        assertEquals(c_height, updatedProperties.getHeight().longValue());
    }

    @Test
    public void protectionPropertiesTest() throws ApiException, IOException {
        initialize(null, null, null);
        ProtectionProperties protectionProperties = api.getProtectionProperties(c_fileName, c_password, c_folderName, null);
        ProtectionProperties dto = new ProtectionProperties();
        dto.setReadOnlyRecommended(!protectionProperties.isReadOnlyRecommended());
        ProtectionProperties updatedProperties = api.setProtectionProperties(c_fileName, dto, c_password, c_folderName, null);
        assertNotEquals(protectionProperties.isReadOnlyRecommended(), updatedProperties.isReadOnlyRecommended());
        assertEquals(protectionProperties.isEncryptDocumentProperties(), updatedProperties.isEncryptDocumentProperties());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final String c_builtinPropertyName = "Author";
    private final String c_customPropertyName = "CustomProperty2";
    private final String c_updatedPropertyValue = "New Value";
}
