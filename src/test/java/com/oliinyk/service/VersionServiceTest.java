package com.oliinyk.service;

import com.oliinyk.configuration.ApplicationConfiguration;
import com.oliinyk.entity.Version;
import org.assertj.core.groups.Properties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfiguration.class})
public class VersionServiceTest {

    @Autowired
    VersionService service;

    @Test
    public void  versionService() throws IOException {

//        assertE
        Version version = new Version();
        version.setVersion("1.0.0");
        assertEquals("Wrong version", version, service.getVersion());

    }

    @Test
    public void  versionServiceNotNull() throws IOException {


        Assert.assertNotNull("expected notnull",service.getVersion());

    }

}
