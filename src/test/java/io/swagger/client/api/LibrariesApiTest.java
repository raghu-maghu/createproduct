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
import io.swagger.client.model.ControlCommand;
import io.swagger.client.model.Error;
import java.io.File;
import io.swagger.client.model.JsonData10;
import io.swagger.client.model.JsonData11;
import io.swagger.client.model.JsonData12;
import io.swagger.client.model.JsonData5;
import io.swagger.client.model.JsonData6;
import io.swagger.client.model.JsonData7;
import io.swagger.client.model.JsonData8;
import io.swagger.client.model.JsonData9;
import io.swagger.client.model.Library;
import io.swagger.client.model.LibraryControl;
import io.swagger.client.model.LibraryThreat;
import io.swagger.client.model.LibraryUseCase;
import io.swagger.client.model.LibraryWeakness;
import io.swagger.client.model.ProductShort;
import io.swagger.client.model.RiskPattern;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LibrariesApi
 */
@Ignore
public class LibrariesApiTest {

    private final LibrariesApi api = new LibrariesApi();

    
    /**
     * Deletes a Library
     *
     * Deletes a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefDeleteTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        api.librariesLibraryRefDelete(apiToken, libraryRef);

        // TODO: test validations
    }
    
    /**
     * Gets library details
     *
     * Gets the library details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefGetTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        Library response = api.librariesLibraryRefGet(apiToken, libraryRef);

        // TODO: test validations
    }
    
    /**
     * Creates new Risk Pattern
     *
     * Creates new Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsPostTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        JsonData6 jsonData = null;
        RiskPattern response = api.librariesLibraryRefRiskpatternsPost(apiToken, libraryRef, jsonData);

        // TODO: test validations
    }
    
    /**
     * Creates new countermeasure in a risk pattern
     *
     * Creates new countermeasure in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        ControlCommand jsonData = null;
        LibraryControl response = api.librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(apiToken, libraryRef, riskPatternRef, jsonData);

        // TODO: test validations
    }
    
    /**
     * Deletes a Risk Pattern
     *
     * Deletes a Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefDeleteTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        api.librariesLibraryRefRiskpatternsRiskPatternRefDelete(apiToken, libraryRef, riskPatternRef);

        // TODO: test validations
    }
    
    /**
     * Gets Risk Pattern details
     *
     * Gets Risk Pattern details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefGetTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        RiskPattern response = api.librariesLibraryRefRiskpatternsRiskPatternRefGet(apiToken, libraryRef, riskPatternRef);

        // TODO: test validations
    }
    
    /**
     * Creates new use case in a library.
     *
     * Creates new use case in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPostTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        JsonData7 jsonData = null;
        LibraryUseCase response = api.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost(apiToken, libraryRef, riskPatternRef, jsonData);

        // TODO: test validations
    }
    
    /**
     * Creates a new threat in a library.
     *
     * Creates a new threat in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPostTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        String useCaseRef = null;
        JsonData8 jsonData = null;
        LibraryThreat response = api.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost(apiToken, libraryRef, riskPatternRef, useCaseRef, jsonData);

        // TODO: test validations
    }
    
    /**
     * Associates a countermeasure to a threat in a risk pattern.
     *
     * Associates a countermeasure to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPutTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        String useCaseRef = null;
        String threatRef = null;
        JsonData12 jsonData = null;
        LibraryControl response = api.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, jsonData);

        // TODO: test validations
    }
    
    /**
     * Associates weakness to a threat in a risk pattern.
     *
     * Associates weakness to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        String useCaseRef = null;
        String threatRef = null;
        JsonData10 jsonData = null;
        LibraryWeakness response = api.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, jsonData);

        // TODO: test validations
    }
    
    /**
     * Associates a countermeasure to a weakness in a risk pattern.
     *
     * Associates a countermeasure to a weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        String useCaseRef = null;
        String threatRef = null;
        String weaknessRef = null;
        JsonData11 jsonData = null;
        LibraryControl response = api.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, weaknessRef, jsonData);

        // TODO: test validations
    }
    
    /**
     * Creates a new weakness in a risk pattern
     *
     * Creates a new Weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostTest() throws ApiException {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        JsonData9 jsonData = null;
        LibraryWeakness response = api.librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(apiToken, libraryRef, riskPatternRef, jsonData);

        // TODO: test validations
    }
    
    /**
     * Creates a Library
     *
     * Creates a new empty Library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesPostTest() throws ApiException {
        String apiToken = null;
        JsonData5 jsonData = null;
        Library response = api.librariesPost(apiToken, jsonData);

        // TODO: test validations
    }
    
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
