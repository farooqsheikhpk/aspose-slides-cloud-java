// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="PropertyTest.java">
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
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
        DocumentProperty updatedProperty = api.setDocumentProperty(
            c_fileName, c_builtinPropertyName, property, c_password, c_folderName, null);
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
        DocumentProperty updatedProperty = api.setDocumentProperty(
            c_fileName, c_customPropertyName, property, c_password, c_folderName, null);
        assertFalse(updatedProperty.isBuiltIn());
        assertEquals(c_updatedPropertyValue, updatedProperty.getValue());
        api.deleteDocumentProperty(c_fileName, c_customPropertyName, c_password, c_folderName, null);
        try {
            api.getDocumentProperty(c_fileName, c_customPropertyName, c_password, c_folderName, null);
        } catch (Exception ex) {
            assertTrue(ex instanceof ApiException);
        }
    }

    @Test
    public void documentPropertiesBulkUpdateTest() throws ApiException, IOException {
        initialize(null, null, null);
        int count = api.getDocumentProperties(c_fileName, c_password, c_folderName, null).getList().size();
        DocumentProperties properties = new DocumentProperties();
        List<DocumentProperty> list = new ArrayList<DocumentProperty>();
        DocumentProperty property1 = new DocumentProperty();
        property1.setName(c_builtinPropertyName);
        property1.setValue(c_updatedPropertyValue);
        list.add(property1);
        DocumentProperty property2 = new DocumentProperty();
        property2.setName(c_customPropertyName);
        property2.setValue(c_updatedPropertyValue);
        list.add(property2);
        properties.setList(list);
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
        assertEquals(852.0, (double)updatedProperties.getWidth(), 1);
        assertEquals(639.0, (double)updatedProperties.getHeight(), 1);
    }

    @Test
    public void slideSizeCustomTest() throws ApiException, IOException {
        int width = 800;
        int height = 500;
        initialize(null, null, null);
        SlideProperties dto = new SlideProperties();
        dto.setWidth(width);
        dto.setHeight(height);
        SlideProperties updatedProperties = api.setSlideProperties(c_fileName, dto, c_password, c_folderName, null);
        assertEquals(SlideProperties.SizeTypeEnum.CUSTOM, updatedProperties.getSizeType());
        assertEquals(width, (double)updatedProperties.getWidth(), 1);
        assertEquals(height, (double)updatedProperties.getHeight(), 1);
    }

    @Test
    public void protectionTest() throws ApiException, IOException {
        initialize(null, null, null);
        ProtectionProperties protectionProperties = api.getProtectionProperties(c_fileName, c_password, c_folderName, null);
        ProtectionProperties dto = new ProtectionProperties();
        dto.setReadOnlyRecommended(!protectionProperties.isReadOnlyRecommended());
        ProtectionProperties updatedProperties = api.setProtection(c_fileName, dto, c_password, c_folderName, null);
        assertNotEquals(protectionProperties.isReadOnlyRecommended(), updatedProperties.isReadOnlyRecommended());
        assertEquals(protectionProperties.isEncryptDocumentProperties(), updatedProperties.isEncryptDocumentProperties());
    }

    @Test
    public void protectionDeleteTest() throws ApiException, IOException {
        initialize(null, null, null);
        ProtectionProperties protectionProperties = api.deleteProtection(c_fileName, c_password, c_folderName, null);
        assertFalse(protectionProperties.isReadOnlyRecommended());
        assertFalse(protectionProperties.isIsEncrypted());
        assertNull(protectionProperties.getReadPassword());
    }

    @Test
    public void protectOnlineTest() throws ApiException, IOException {
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        ProtectionProperties dto = new ProtectionProperties();
        dto.setReadPassword("newPassword");
        File outputDocument = api.setProtectionOnline(document, dto, c_password);
        assertNotEquals(document.length, outputDocument.length());
    }

    @Test
    public void unprotectOnlineTest() throws ApiException, IOException {
        byte[] document = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File outputDocument = api.deleteProtectionOnline(document, c_password);
        assertNotEquals(document.length, outputDocument.length());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final String c_builtinPropertyName = "Author";
    private final String c_customPropertyName = "CustomProperty2";
    private final String c_updatedPropertyValue = "New Value";
}
