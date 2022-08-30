package org.acme.static_.openapi.document.generator.extension.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class StaticOpenapiDocumentGeneratorExtensionProcessor {

    private static final String FEATURE = "static-openapi-document-generator-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
