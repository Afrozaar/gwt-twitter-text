package com.afrozaar.util.gwt.twitter.client;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class Options {

    @JsProperty(name = "extractUrlsWithoutProtocol")
    public boolean extractUrlsWithoutProtocol;

    public Options(boolean extractUrlsWithoutProtocol) {
        this.extractUrlsWithoutProtocol = extractUrlsWithoutProtocol;
    }
}
