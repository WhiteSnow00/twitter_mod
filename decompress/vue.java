import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vue
{
    public final Map<String, dml<tue>> a;
    public final dml<bi8> b;
    
    public vue(final Map<String, dml<tue>> a, final dml<bi8> b) {
        this.a = a;
        this.b = b;
    }
    
    public final tue a(final String s) {
        final dml dml = this.a.get(s);
        if (dml != null) {
            return (tue)dml.get();
        }
        return (tue)this.b.get();
    }
}
