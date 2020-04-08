/*
 * IriusRisk API
 * Products API
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import java.io.File;
import io.swagger.client.model.ProductShort;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
@Ignore
public class TemplatesApiTest {

    private final TemplatesApi api = new TemplatesApi();

    
    /**
     * Creates a new product, library or template from a XML file upload.
     *
     * Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsUploadPostTest() throws ApiException {
        String apiToken = null;
        String ref = null;
        String name = null;
        File fileName = null;
        String type = null;
        ProductShort response = api.productsUploadPost(apiToken, ref, name, fileName, type);

        // TODO: test validations
    }
    
}
