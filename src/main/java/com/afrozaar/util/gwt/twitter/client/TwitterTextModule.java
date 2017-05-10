package com.afrozaar.util.gwt.twitter.client;

import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class TwitterTextModule extends AbstractGinModule {

    @Override
    protected void configure() {
        bind(Resources.class);
        bind(TwitterTextFactory.class);
    }

    @Provides
    @Singleton
    TwitterText getTwitterText(Resources resources, TwitterTextFactory twitterTextFactory) {
        ScriptInjector.fromString(resources.twitterText().getText()).inject();
        return TwitterTextFactory.create();
        
    }

}
