package TestSuit;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(org.junit.platform.runner.JUnitPlatform.class)


@SuiteDisplayName("Junit Suit Demo")
@SelectPackages("Examples")
@IncludeTags({"A","B"})
public class TestSuitDemo {
}
