package com.afrozaar.util.gwt.twitter.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class TwitterText {

    @JsMethod
    public native String[] extractUrls(String text, Options options);

    @JsMethod
    public native String htmlEscape(String text);

    public native String autoLink(String text, Options options);

    public native int getTweetLength(String text, Options options);
}
