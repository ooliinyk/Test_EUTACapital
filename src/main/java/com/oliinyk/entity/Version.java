package com.oliinyk.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value = "application.properties")
public class Version {

    @Value("${version}")
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Version version1 = (Version) o;

        return version != null ? version.equals(version1.version) : version1.version == null;

    }

    @Override
    public int hashCode() {
        return version != null ? version.hashCode() : 0;
    }
}
