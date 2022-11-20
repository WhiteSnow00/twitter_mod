// 
// Decompiled by Procyon v0.6.0
// 

public final class vqd
{
    public static final rlp<vqd> e;
    public final String a;
    public final f7b b;
    public final long c;
    public final String d;
    
    static {
        vqd.e = new vqd.vqd$b();
    }
    
    public vqd(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && vqd.class == o.getClass()) {
            final vqd vqd = (vqd)o;
            if (!c5j.a((Object)this.a, (Object)vqd.a) || !c5j.a((Object)this.b, (Object)vqd.b) || !c5j.a((Object)this.c, (Object)vqd.c) || !c5j.a((Object)this.d, (Object)vqd.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends n4j<vqd>
    {
        public String a;
        public f7b b;
        public long c;
        public String d;
        
        public a() {
        }
        
        public a(final vqd vqd) {
            if (vqd != null) {
                this.a = vqd.a;
                this.b = vqd.b;
                this.c = vqd.c;
                this.d = vqd.d;
            }
        }
        
        public final Object i() {
            return new vqd(this);
        }
    }
}
