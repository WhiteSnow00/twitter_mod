// 
// Decompiled by Procyon v0.6.0
// 

public final class bjg
{
    public static final b Companion;
    public static final rlp<bjg> c;
    public final aew a;
    public final String b;
    
    static {
        Companion = new b();
        bjg.c = bjg.c.c;
    }
    
    public bjg(final aew a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bjg)) {
            return false;
        }
        final bjg bjg = (bjg)o;
        return this.a == bjg.a && czd.a((Object)this.b, (Object)bjg.b);
    }
    
    @Override
    public final int hashCode() {
        final aew a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final aew a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ManagedLabelSettings(labelType=");
        sb.append(a);
        sb.append(", ownerScreenName=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends n4j<bjg>
    {
        public aew a;
        public String b;
        
        public final Object i() {
            return new bjg(this.a, this.b);
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c extends zr2<bjg, a>
    {
        public static final c c;
        
        static {
            c = new c();
        }
        
        public c() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) {
            final bjg bjg = (bjg)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)bjg, "managedLabel");
            final aew a = bjg.a;
            final lw6$h a2 = lw6.a;
            ((y4j)new mw6((Class)aew.class)).c(wlp, (Object)a);
            final int a3 = c5j.a;
            wlp.E(bjg.b);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) {
            final a a = (a)n4j;
            czd.f((Object)vlp, "input");
            czd.f((Object)a, "builder");
            final lw6$h a2 = lw6.a;
            a.a = (aew)((y4j)new mw6((Class)aew.class)).a(vlp);
            a.b = vlp.G();
        }
    }
}
