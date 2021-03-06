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
import io.swagger.client.model.JsonData10;
import io.swagger.client.model.JsonData11;
import io.swagger.client.model.JsonData12;
import io.swagger.client.model.JsonData7;
import io.swagger.client.model.LibraryControl;
import io.swagger.client.model.LibraryUseCase;
import io.swagger.client.model.LibraryWeakness;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UseCasesApi
 */
@Ignore
public class UseCasesApiTest {

    private final UseCasesApi api = new UseCasesApi();

    
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
    
}
