package com.afrozaar.util.gwt.twitter.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

interface Resources extends ClientBundle {

    /**
     * twitter-text is in code folder otherwise I get a compile error here in eclipse
     * @return
     */
    @Source("twitter-text-1.14.3.min.js")
    TextResource twitterText();
}