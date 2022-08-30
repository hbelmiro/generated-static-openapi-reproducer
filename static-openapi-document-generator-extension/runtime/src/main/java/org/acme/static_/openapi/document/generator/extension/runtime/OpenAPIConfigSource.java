package org.acme.static_.openapi.document.generator.extension.runtime;

import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Map;
import java.util.Set;

@SuppressWarnings("unused")
public final class OpenAPIConfigSource implements ConfigSource {

    private static final Map<String, String> configuration = Map.of("mp.openapi.filter", MyFilter.class.getName());

    @Override
    public int getOrdinal() {
        return 99;
    }

    @Override
    public String getValue(String s) {
        return configuration.get(s);
    }

    @Override
    public String getName() {
        return OpenAPIConfigSource.class.getSimpleName();
    }

    @Override
    public Set<String> getPropertyNames() {
        return configuration.keySet();
    }

}
