import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwd implements vrd
{
    public final List<String> b;
    public final List<bb7> c;
    
    public jwd(final a a) {
        Object b;
        if ((b = a.a) == null) {
            b = h3a.F0;
        }
        this.b = (List<String>)b;
        Object c;
        if ((c = a.b) == null) {
            c = h3a.F0;
        }
        this.c = (List<bb7>)c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && jwd.class == o.getClass()) {
            final jwd jwd = (jwd)o;
            if (!o5j.a((Object)this.b, (Object)jwd.b) || !o5j.a((Object)this.c, (Object)jwd.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.b, (Object)this.c);
    }
    
    public static final class a extends z4j<jwd>
    {
        public List<String> a;
        public List<bb7> b;
        
        public final Object i() {
            return new jwd(this);
        }
    }
}
