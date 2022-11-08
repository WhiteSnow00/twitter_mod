import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6a extends lsr
{
    public final String j;
    public final List<xdj> k;
    
    public z6a(final a a) {
        super((lsr$a)a);
        String k;
        if ((k = a.k) == null) {
            k = "";
        }
        this.j = k;
        Object i;
        if ((i = a.l) == null) {
            i = v2a.C0;
        }
        this.k = (List<xdj>)i;
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new x6a(s, this);
    }
    
    public static final class a extends lsr$a<z6a, a>
    {
        public String k;
        public List<xdj> l;
        
        public final Object i() {
            return new z6a(this);
        }
    }
}
