import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ves
{
    public static final Pattern d;
    public static final led<String> e;
    public static final led<String> f;
    public static final led<String> g;
    public static final led<String> h;
    public final int a;
    public final int b;
    public final int c;
    
    static {
        d = Pattern.compile("\\s+");
        e = led.t("auto", "none");
        f = led.u("dot", "sesame", "circle");
        g = led.t("filled", "open");
        h = led.u("after", "before", "outside");
    }
    
    public ves(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
