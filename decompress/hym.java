// 
// Decompiled by Procyon v0.6.0
// 

public final class hym implements sfs
{
    public static final hym.hym$b E0;
    public final i8t D0;
    
    static {
        E0 = new hym.hym$b();
    }
    
    public hym(final a a) {
        final i8t a2 = a.a;
        jee.l((Object)a2);
        this.D0 = a2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("RichTextUrlEntity{url=");
        j.append(this.D0);
        j.append('}');
        return j.toString();
    }
    
    public static final class a extends n4j<hym>
    {
        public i8t a;
        
        public final Object i() {
            return new hym(this);
        }
        
        public final boolean l() {
            return this.a != null;
        }
    }
}
