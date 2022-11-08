import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yst implements prd
{
    public final List<String> b;
    public final List<String> c;
    
    public yst(final a a) {
        this.b = a.a;
        this.c = a.b;
    }
    
    public static final class a extends h4j<yst>
    {
        public List<String> a;
        public List<String> b;
        
        public final Object i() {
            return new yst(this);
        }
    }
}
