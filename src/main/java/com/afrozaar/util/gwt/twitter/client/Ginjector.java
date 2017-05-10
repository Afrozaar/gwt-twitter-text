package com.afrozaar.util.gwt.twitter.client;

import com.google.gwt.inject.client.GinModules;

@GinModules({ TwitterTextModule.class, TestModule.class })
public interface Ginjector extends com.google.gwt.inject.client.Ginjector {

    TestTwitterText getTestTwitterText();

    TwitterText getTwitterText();
}