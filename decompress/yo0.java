// 
// Decompiled by Procyon v0.6.0
// 

public final class yo0 implements mwv
{
    public static final yo0.yo0$c Companion;
    public final lo0 b;
    public final boolean c;
    public final fr8 d;
    public final s33 e;
    public final faa f;
    
    static {
        Companion = new yo0.yo0$c();
    }
    
    public yo0(final lo0 b, final boolean c, final fr8 d, final s33 e) {
        final faa e2 = faa.E0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = e2;
    }
    
    public yo0(final lo0 b, final boolean c, final fr8 d, final s33 e, final faa f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final fr8 a() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yo0)) {
            return false;
        }
        final yo0 yo0 = (yo0)o;
        return czd.a((Object)this.b, (Object)yo0.b) && this.c == yo0.c && czd.a((Object)this.d, (Object)yo0.d) && czd.a((Object)this.e, (Object)yo0.e) && this.f == yo0.f;
    }
    
    public final faa getName() {
        return this.f;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final fr8 d = this.d;
        int hashCode2 = 0;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final s33 e = this.e;
        if (e != null) {
            hashCode2 = e.hashCode();
        }
        return this.f.hashCode() + (((hashCode * 31 + c) * 31 + hashCode3) * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final lo0 b = this.b;
        final boolean c = this.c;
        final fr8 d = this.d;
        final s33 e = this.e;
        final faa f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("AppStoreDetailsComponent(appStoreData=");
        sb.append(b);
        sb.append(", useDominantColor=");
        sb.append(c);
        sb.append(", destination=");
        sb.append(d);
        sb.append(", button=");
        sb.append(e);
        sb.append(", name=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends zr2<yo0, yo0$b>
    {
        public static final a c;
        
        static {
            c = new a();
        }
        
        public a() {
            super(3);
        }
        
        public final void f(final wlp wlp, final Object o) {
            final yo0 yo0 = (yo0)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)yo0, "appStoreDetailsComponent");
            wlp.A((Object)yo0.d, (rlp)fr8.a);
            wlp.A((Object)yo0.b, (rlp)lo0.o);
            wlp.r(yo0.c);
            wlp.A((Object)yo0.e, (rlp)s33.a);
        }
        
        public final n4j g() {
            return (n4j)new yo0$b((lo0)null, false, (s33)null, 7, (rf8)null);
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) {
            final yo0$b yo0$b = (yo0$b)n4j;
            czd.f((Object)vlp, "input");
            czd.f((Object)yo0$b, "builder");
            final Object z = vlp.z((rlp)fr8.a);
            czd.e(z, "input.readNotNullObject(Destination.SERIALIZER)");
            final fr8 a = (fr8)z;
            ((mwv$a)yo0$b).a = a;
            if (n < 2) {
                vlp.G();
                vlp.G();
            }
            if (n < 1) {
                klp.d(vlp);
            }
            if (n < 2) {
                if (a instanceof to0) {
                    yo0$b.o(((to0)a).b);
                }
                else if (a instanceof cp0) {
                    yo0$b.o(((cp0)a).b);
                }
            }
            else {
                final Object z2 = vlp.z((rlp)lo0.o);
                czd.e(z2, "input.readNotNullObject(AppStoreData.SERIALIZER)");
                yo0$b.b = (lo0)z2;
            }
            yo0$b.c = vlp.s();
            if (n >= 3) {
                yo0$b.d = (s33)((y4j)s33.a).a(vlp);
            }
        }
    }
}
