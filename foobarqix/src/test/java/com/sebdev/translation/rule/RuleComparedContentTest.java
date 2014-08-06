package com.sebdev.translation.rule;

import com.sebdev.translation.rule.RuleComparedContent;
import com.sebdev.translation.rule.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuleComparedContentTest {
    
    @Test
    public void testIsValidSuccess() {
        Rule rule = new RuleComparedContent(new int[]{3}, new String[]{"Foo"});
        assertEquals("3 should be a Foo valid content", "Foo", rule.translate("3"));
    }
    
    @Test
    public void testIsValidError() {
        Rule rule = new RuleComparedContent(new int[]{3}, new String[]{"Foo"});
        assertTrue("5 should not be a Foo valid content", rule.translate("1").isEmpty());
    }
}
