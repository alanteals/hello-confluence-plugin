package ut.com.mruiz84.hello.confluence.plugin;

import org.junit.Test;
import com.mruiz84.hello.confluence.plugin.api.MyPluginComponent;
import com.mruiz84.hello.confluence.plugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}