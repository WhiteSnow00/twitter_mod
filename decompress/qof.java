// 
// Decompiled by Procyon v0.6.0
// 

public final class qof
{
    public static final rlp<qof> c;
    public final String a;
    public final String b;
    
    static {
        qof.c = (nw6)lw6.b(new glp[] { new glp((Class)qof.class, (rlp)new qof.qof$b()) });
    }
    
    public qof(final a a) {
        this.a = a.a;
        this.b = a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && qof.class == o.getClass()) {
            final qof qof = (qof)o;
            if (!c5j.a((Object)this.a, (Object)qof.a) || !c5j.a((Object)this.b, (Object)qof.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.a, (Object)this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("LiveEventAttribution{text='");
        toe.j(j, this.a, '\'', ", url='");
        j.append(this.b);
        j.append('\'');
        j.append('}');
        return j.toString();
    }
    
    public static final class a extends n4j<qof>
    {
        public final String a;
        public String b;
        
        public a(final String a) {
            this.a = a;
        }
        
        public final Object i() {
            return new qof(this);
        }
    }
}
