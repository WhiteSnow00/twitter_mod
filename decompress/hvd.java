import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvd implements tqd
{
    public final List<String> b;
    public final List<v97> c;
    
    public hvd(final a a) {
        Object b;
        if ((b = a.a) == null) {
            b = f2a.D0;
        }
        this.b = (List<String>)b;
        Object c;
        if ((c = a.b) == null) {
            c = f2a.D0;
        }
        this.c = (List<v97>)c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hvd.class == o.getClass()) {
            final hvd hvd = (hvd)o;
            if (!c5j.a((Object)this.b, (Object)hvd.b) || !c5j.a((Object)this.c, (Object)hvd.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.b, (Object)this.c);
    }
    
    public static final class a extends n4j<hvd>
    {
        public List<String> a;
        public List<v97> b;
        
        public final Object i() {
            return new hvd(this);
        }
    }
}
