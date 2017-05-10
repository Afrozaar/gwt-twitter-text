package com.afrozaar.util.gwt.twitter.client;

import com.google.gwt.core.client.GWT;

import org.junit.Before;
import org.junit.Test;

import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;
import com.googlecode.gwt.test.gin.GInjectorCreateHandler;

//@RunWith(JukitoGwtTestRunner.class)
@GwtModule("com.afrozaar.util.gwt.twitter.TwitterTextTest")
public class MyGinTest extends GwtTest {

    private TwitterText twitterText;

    @Before
    public void setupGIN() {
        addGwtCreateHandler(new GInjectorCreateHandler());
    }

    //@Inject

    @Test
    public void Go() {
        twitterText.extractUrls("xasdfsdf", null);
    }

    @Test
    public void swithoutGin() {
        TwitterTextFactory factory = GWT.create(TwitterTextFactory.class);
        factory.loadScript();
        twitterText = TwitterTextFactory.create();
        twitterText.extractUrls("xasdfsdf", null);
    }

}
