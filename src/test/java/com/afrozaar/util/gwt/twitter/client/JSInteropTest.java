package com.afrozaar.util.gwt.twitter.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;

import org.junit.Before;
import org.junit.Test;

public class JSInteropTest extends GWTTestCase {

    public void testOkay() {

    }

    private TwitterText twitterText;

    @Override
    public String getModuleName() {
        return "com.afrozaar.util.gwt.twitter.TwitterTextTest";
    }

    @Before
    public void setup() {
        //ScriptInjector.fromString(Resources.INSTANCE.twitterText().getText()).inject();
    }

    public void testGo() {

    }

    @Test
    public void testTwitterText() {
        TwitterTextFactory factory = GWT.create(TwitterTextFactory.class);
        factory.loadScript();
        twitterText = TwitterTextFactory.create();
        String[] extractUrls = twitterText.extractUrls("xasdfsdf http://thisisthetest.org/path/to/the/path and this is not a path", null);

        for (String string : extractUrls) {
            System.out.println(string);
            GWT.log(string);
        }

    }

}
