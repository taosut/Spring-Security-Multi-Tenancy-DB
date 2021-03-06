package com.cicloi.eletronica.tenant;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "spring")
public class DataSourceProperties {
    private List<DataSourceProperty> datasources = new ArrayList<>();

    public List<DataSourceProperty> getDatasources() {
        return datasources;
    }

    public DataSourceProperties setDatasources(List<DataSourceProperty> datasources) {
        this.datasources = datasources;
        return this;
    }
}