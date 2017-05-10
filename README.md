# gwt-twitter-text
Gwt jsinterop bindings onto js twitter-text

# Usage:

Best way to use this is if you are using GIN to simply install the module.

1. Add the artifact to your pom file (at the mo' it is not on maven repository so you'll need to download and install manually)
2. Add <inherits name="com.afrozaar.util.gwt.twitter.TwitterText" /> to your module file
3. run install(new TwitterTextModule());

Once this is done you can inject the TwitterText bean and use it.
