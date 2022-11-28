package com.reactapp.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import com.adobe.cq.export.json.ComponentExporter;
import org.apache.sling.models.annotations.Exporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {ComponentExporter.class},
        resourceType = PageNotFound.RESOURCE_TYPE)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class PageNotFound implements ComponentExporter {
    protected static final String RESOURCE_TYPE = "reactapp/components/pageNotFound";

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String text;
    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String fileReference;
    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String buttonText;
    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String alt;
    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String buttonLink;
    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String firstMessage;
    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String secondMessage;


    public String getText() {
        return text;
    }
    public String getFileReference() {
        return fileReference;
    }

    public String getExportedType() {
        return RESOURCE_TYPE;
    }

    public String getAlt() {
        return alt;
    }
    
    public String getButtonText() {
        return buttonText;
    }

    public String getButtonLink() {
        return buttonLink;
    }
    public String getFirstMessage() {
        return firstMessage;
    } 
    public String getSecondMessage() {
        return secondMessage;
    } 

}
