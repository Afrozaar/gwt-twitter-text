package com.afrozaar.util.gwt.twitter.client;

import com.google.gwt.inject.client.AbstractGinModule;

public class TestModule extends AbstractGinModule {

    @Override
    protected void configure() {
        bind(TestTwitterText.class);
    }

}
