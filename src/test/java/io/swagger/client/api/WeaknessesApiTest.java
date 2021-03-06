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
import io.swagger.client.model.ComponentWeakness;
import io.swagger.client.model.Error;
import io.swagger.client.model.JsonData10;
import io.swagger.client.model.JsonData11;
import io.swagger.client.model.JsonData9;
import io.swagger.client.model.LibraryControl;
import io.swagger.client.model.LibraryWeakness;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WeaknessesApi
 */
@Ignore
public class WeaknessesApiTest {

    private final WeaknessesApi api = new WeaknessesApi();

    
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
     * Gets a list of all weaknesses of a product
     *
     * Returns a list of all the weaknesses of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsRefWeaknessesGetTest() throws ApiException {
        String apiToken = null;
        String ref = null;
        List<ComponentWeakness> response = api.productsRefWeaknessesGet(apiToken, ref);

        // TODO: test validations
    }
    
    /**
     * Gets a list of all weaknesses of a product filtered by test state
     *
     * Returns a list of all the weaknesses of a product. With the optional parameter &#x60;test_state&#x60; can filter the weakness by test state. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsRefWeaknessesTestStateGetTest() throws ApiException {
        String apiToken = null;
        String ref = null;
        String testState = null;
        List<ComponentWeakness> response = api.productsRefWeaknessesTestStateGet(apiToken, ref, testState);

        // TODO: test validations
    }
    
}
