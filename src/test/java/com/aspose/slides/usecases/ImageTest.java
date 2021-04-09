// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ImageTests.java">
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
import org.junit.Test;

import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipFile;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for image methods
 */
public class ImageTest extends ApiTest {
    @Test
    public void imagesGetTest() throws ApiException, IOException {
        initialize(null, null, null);
        Images images = api.getPresentationImages(c_fileName, c_password, c_folderName, null);
        Images slideImages = api.getSlideImages(c_fileName, 1, c_password, c_folderName, null);
        assertTrue(images.getList().size() > slideImages.getList().size());
    }

    @Test
    public void imagesDownloadStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        File images = api.downloadImagesDefaultFormat(c_fileName, c_password, c_folderName, null);
        File imagesPng = api.downloadImages(c_fileName, ImageExportFormat.PNG, c_password, c_folderName, null);
        assertTrue(images.canRead());
        assertTrue(imagesPng.canRead());
        assertNotEquals(images.length(), imagesPng.length());
        ZipFile zip = new ZipFile(images);
        ZipFile zipPng = new ZipFile(imagesPng);
        assertEquals(zip.size(), zipPng.size());
    }

    @Test
    public void imagesDownloadRequest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File images = api.downloadImagesDefaultFormatOnline(file, c_password);
        File imagesPng = api.downloadImagesOnline(file, ImageExportFormat.PNG, c_password);
        assertTrue(images.canRead());
        assertTrue(imagesPng.canRead());
        assertNotEquals(images.length(), imagesPng.length());
        ZipFile zip = new ZipFile(images);
        ZipFile zipPng = new ZipFile(imagesPng);
        assertEquals(zip.size(), zipPng.size());
    }

    @Test
    public void imageDownloadStorageTest() throws ApiException, IOException {
        initialize(null, null, null);
        File image = api.downloadImageDefaultFormat(c_fileName, c_imageIndex, c_password, c_folderName, null);
        File imagePng = api.downloadImage(c_fileName, c_imageIndex, ImageExportFormat.PNG, c_password, c_folderName, null);
        assertTrue(image.canRead());
        assertTrue(imagePng.canRead());
        assertNotEquals(image.length(), imagePng.length());
    }

    @Test
    public void imageDownloadRequestTest() throws ApiException, IOException {
        byte[] file = Files.readAllBytes(Paths.get(testDataFolderName + "/" + c_fileName));
        File image = api.downloadImageDefaultFormatOnline(file, c_imageIndex, c_password);
        File imagePng = api.downloadImageOnline(file, c_imageIndex, ImageExportFormat.PNG, c_password);
        assertTrue(image.canRead());
        assertTrue(imagePng.canRead());
        assertNotEquals(image.length(), imagePng.length());
    }

    private final String c_folderName = "TempSlidesSDK";
    private final String c_fileName = "test.pptx";
    private final String c_password = "password";
    private final int c_imageIndex = 1;
}
