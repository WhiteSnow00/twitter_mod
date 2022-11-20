// 
// Decompiled by Procyon v0.6.0
// 

public final class qbf
{
    public static final c Companion;
    public static final zr2<qbf, a> c;
    public final ccf a;
    public final tbf b;
    
    static {
        Companion = new c();
        qbf.c = new zr2<qbf, a>() {
            public final rlp<ccf> c;
            public final rlp<tbf> d;
            
            {
                final lw6$h a = lw6.a;
                this.c = new mw6((Class)ccf.class);
                this.d = tbf.a;
            }
            
            public final void f(final wlp wlp, final Object o) {
                final qbf qbf = (qbf)o;
                czd.f((Object)wlp, "output");
                czd.f((Object)qbf, "limitedAction");
                wlp.A((Object)qbf.a, (rlp)this.c);
                wlp.A((Object)qbf.b, (rlp)this.d);
            }
            
            public final n4j g() {
                return new a();
            }
            
            public final void h(final vlp vlp, final n4j n4j, final int n) {
                final a a = (a)n4j;
                czd.f((Object)vlp, "input");
                czd.f((Object)a, "builder");
                final Object z = vlp.z((rlp)this.c);
                czd.e(z, "input.readNotNullObject(\u2026itedActionTypeSerializer)");
                a.a = (ccf)z;
                a.b = (tbf)((y4j)this.d).a(vlp);
            }
        };
    }
    
    public qbf(final ccf a, final tbf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qbf)) {
            return false;
        }
        final qbf qbf = (qbf)o;
        return this.a == qbf.a && czd.a((Object)this.b, (Object)qbf.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final tbf b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final ccf a = this.a;
        final tbf b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("LimitedAction(limitedActionType=");
        sb.append(a);
        sb.append(", limitedActionPrompt=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends n4j<qbf>
    {
        public ccf a;
        public tbf b;
        
        public final Object i() {
            final ccf a = this.a;
            if (a != null) {
                return new qbf(a, this.b);
            }
            czd.m("limitedActionType");
            throw null;
        }
    }
    
    public static final class c
    {
    }
}
