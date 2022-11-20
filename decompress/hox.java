import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hox extends mm7
{
    public final List<bf7> e;
    
    public hox(final a a) {
        super((mm7$a)a, 6);
        Object e;
        if ((e = a.d) == null) {
            e = f2a.D0;
        }
        this.e = (List<bf7>)e;
    }
    
    public static final class a extends mm7$a<hox, a>
    {
        public List<bf7> d;
        
        public final Object i() {
            return new hox(this);
        }
    }
}
