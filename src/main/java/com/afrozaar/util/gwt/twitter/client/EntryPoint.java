package com.afrozaar.util.gwt.twitter.client;

import com.google.gwt.core.client.GWT;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

    private final Ginjector injector = GWT.create(Ginjector.class);

    @Override
    public void onModuleLoad() {
        injector.getTestTwitterText().test();
    }

}
