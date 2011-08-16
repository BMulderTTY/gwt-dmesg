package org.gwt.dmesg;

import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: berend
 * Date: 8/16/11
 * Time: 10:49 AM
 */
public class EscapeTest {

    @Test
    public void testEscaping(){
        final String escapeQuotes = "Deze regel bevat 'aanhalingstekens' en \"aanhalingstekens\"";
        String escapedQuotes = escapeQuotes.replaceAll("\"", Matcher.quoteReplacement("\\\""));
        assertTrue(escapedQuotes.contains("\""));
        assertTrue(escapedQuotes.contains("\\\""));
    }
}
