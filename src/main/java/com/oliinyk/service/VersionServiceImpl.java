package com.oliinyk.service;

import com.oliinyk.entity.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VersionServiceImpl implements VersionService {

    @Autowired
    Version version;

    @Override
    public Version getVersion() {
        return version;
    }
}
