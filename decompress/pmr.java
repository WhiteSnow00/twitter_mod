// 
// Decompiled by Procyon v0.6.0
// 

public final class pmr implements uuh<pmr.pmr$b>
{
    public static final a Companion;
    public final String a;
    public final xnj<Boolean> b;
    public final xnj<String> c;
    public final xnj<owm> d;
    public final xnj<String> e;
    
    static {
        Companion = new a();
    }
    
    public pmr(final String a, final xnj c) {
        final xnj$a a2 = xnj$a.a;
        czd.f((Object)a, "revue_account_id");
        this.a = a;
        this.b = (xnj<Boolean>)a2;
        this.c = (xnj<String>)c;
        this.d = (xnj<owm>)a2;
        this.e = (xnj<String>)a2;
    }
    
    public final void a(final ale ale, final fa7 fa7) {
        czd.f((Object)fa7, "customScalarAdapters");
        smr.a.c(ale, fa7, this);
    }
    
    public final String b() {
        return "AuyQTCe7q3_K54GthzeSHQ";
    }
    
    public final xq<pmr.pmr$b> c() {
        return (xq<pmr.pmr$b>)ar.c((xq)qmr.a, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pmr)) {
            return false;
        }
        final pmr pmr = (pmr)o;
        return czd.a((Object)this.a, (Object)pmr.a) && czd.a((Object)this.b, (Object)pmr.b) && czd.a((Object)this.c, (Object)pmr.c) && czd.a((Object)this.d, (Object)pmr.d) && czd.a((Object)this.e, (Object)pmr.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31) * 31;
    }
    
    public final String name() {
        return "SubscribeToRevueAccount";
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final xnj<Boolean> b = this.b;
        final xnj<String> c = this.c;
        final xnj<owm> d = this.d;
        final xnj<String> e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("SubscribeToRevueAccountMutation(revue_account_id=");
        sb.append(a);
        sb.append(", double_opt_in=");
        sb.append(b);
        sb.append(", via=");
        sb.append(c);
        sb.append(", client=");
        sb.append(d);
        sb.append(", element=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
    
    public static final class c
    {
        public final String a;
        public final qwm b;
        
        public c(final String a, final qwm b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return czd.a((Object)this.a, (Object)c.a) && this.b == c.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final qwm b = this.b;
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
            final String a = this.a;
            final qwm b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Subscribe_to_revue_account(revue_account_id=");
            sb.append(a);
            sb.append(", subscription_status=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
