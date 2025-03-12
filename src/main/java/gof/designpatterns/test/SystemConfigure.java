package gof.designpatterns.test;

public class SystemConfigure {
    private TestProperties testProperties;

    public void testprops(PropertiesConfigure<TestProperties.Builder> testPropertiesConfigure) {
        TestProperties.Builder builder = new TestProperties.Builder();
        testPropertiesConfigure.configure(builder);
        this.testProperties = builder.build();
    }
}
