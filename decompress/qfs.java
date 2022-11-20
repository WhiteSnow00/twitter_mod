import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qfs
{
    public static final Pattern d;
    public static final pdd<String> e;
    public static final pdd<String> f;
    public static final pdd<String> g;
    public static final pdd<String> h;
    public final int a;
    public final int b;
    public final int c;
    
    static {
        d = Pattern.compile("\\s+");
        e = pdd.t((Object)"auto", (Object)"none");
        f = pdd.u((Object)"dot", (Object)"sesame", (Object)"circle");
        g = pdd.t((Object)"filled", (Object)"open");
        h = pdd.u((Object)"after", (Object)"before", (Object)"outside");
    }
    
    public qfs(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
