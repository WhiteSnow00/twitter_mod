// 
// Decompiled by Procyon v0.6.0
// 

public final class mnr implements kvh<mnr.mnr$b>
{
    public static final mnr.mnr$a Companion;
    public final String a;
    public final moj<Boolean> b;
    public final moj<String> c;
    public final moj<exm> d;
    public final moj<String> e;
    
    static {
        Companion = new mnr.mnr$a();
    }
    
    public mnr(final String a, final moj c) {
        final moj$a a2 = moj$a.a;
        e0e.f((Object)a, "revue_account_id");
        this.a = a;
        this.b = (moj<Boolean>)a2;
        this.c = (moj<String>)c;
        this.d = (moj<exm>)a2;
        this.e = (moj<String>)a2;
    }
    
    public final void a(final yle yle, final lb7 lb7) {
        e0e.f((Object)lb7, "customScalarAdapters");
        pnr.a.c(yle, lb7, this);
    }
    
    public final String b() {
        return "AuyQTCe7q3_K54GthzeSHQ";
    }
    
    public final zq<mnr.mnr$b> c() {
        return (zq<mnr.mnr$b>)cr.c((zq)nnr.a, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mnr)) {
            return false;
        }
        final mnr mnr = (mnr)o;
        return e0e.a((Object)this.a, (Object)mnr.a) && e0e.a((Object)this.b, (Object)mnr.b) && e0e.a((Object)this.c, (Object)mnr.c) && e0e.a((Object)this.d, (Object)mnr.d) && e0e.a((Object)this.e, (Object)mnr.e);
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
        final moj<Boolean> b = this.b;
        final moj<String> c = this.c;
        final moj<exm> d = this.d;
        final moj<String> e = this.e;
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
}
