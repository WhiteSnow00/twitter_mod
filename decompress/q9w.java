// 
// Decompiled by Procyon v0.6.0
// 

public final class q9w
{
    public static final a Companion;
    public static final b b;
    public final r9w a;
    
    static {
        Companion = new a();
        b = new b();
    }
    
    public q9w(final r9w a) {
        czd.f((Object)a, "inviteActionResults");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof q9w && czd.a((Object)this.a, (Object)((q9w)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final r9w a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserCommunityActions(inviteActionResults=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
    
    public static final class b extends y4j<q9w>
    {
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            final Object a = ((y4j)r9w.a).a(vlp);
            czd.c(a);
            return new q9w((r9w)a);
        }
        
        public final void f(final wlp wlp, final Object o) {
            final q9w q9w = (q9w)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)q9w, "actions");
            ((y4j)r9w.a).c(wlp, (Object)q9w.a);
            final int a = c5j.a;
        }
    }
}
