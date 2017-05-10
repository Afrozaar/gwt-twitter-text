package com.afrozaar.util.gwt.twitter.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TwitterTextFactory {

    public void loadScript() {
        Resources resources = GWT.create(Resources.class);
        ScriptInjector.fromString(resources.twitterText().getText()).inject();
    }

    private void test() {
        TwitterText create = create();

        /*    GWT.log(Arrays.asList(create.extractUrls("http://hello.org hello.org/letsgo iafrica.com/letsgoagain", new Options(true))).toString());
        
        GWT.log(create.htmlEscape("&"));
        
        GWT.log(create.autoLink("http://hello.org/aslkjsdf this is the best time to be doing something @michaelwiles", null));
        
        GWT.log("" + create.getTweetLength("http://hello.org/aslkjsdf this is the best time to be doing something @michaelwiles", null));*/

    }

    public static native TwitterText create() /*-{
		return twttr.txt;
    }-*/;

}
