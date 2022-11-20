import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uf3
{
    public static final y4j<uf3> d;
    public final String a;
    public final String b;
    public final Map<String, String> c;
    
    static {
        uf3.d = new uf3.uf3$a();
    }
    
    public uf3(final String a, final String b, final Map<String, String> map) {
        this.a = a;
        this.b = b;
        this.c = kdd.c((Map)map);
    }
    
    public final boolean a() {
        return ikr.g((CharSequence)this.a) && ikr.g((CharSequence)this.b);
    }
}
