import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zxl
{
    public static final a Companion;
    public static final b c;
    public final zyl a;
    public final Map<zyl, Integer> b;
    
    static {
        Companion = new a();
        c = new b();
    }
    
    public zxl(final zyl a, final Map<zyl, Integer> b) {
        zzd.f((Object)b, "reactionTypeMap");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!zzd.a((Object)class1, (Object)zxl.class)) {
            return false;
        }
        zzd.d(o, "null cannot be cast to non-null type com.twitter.model.reactions.ReactionMetadata");
        final zxl zxl = (zxl)o;
        if (this.a != zxl.a || !zzd.a((Object)this.b, (Object)zxl.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final zyl a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final zyl a = this.a;
        final Map<zyl, Integer> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ReactionMetadata(reactionPerspective=");
        sb.append(a);
        sb.append(", reactionTypeMap=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final zxl a(final boolean b, final int n) {
            final zyl g0 = zyl.G0;
            zyl zyl;
            if (b) {
                zyl = g0;
            }
            else {
                zyl = null;
            }
            return new zxl(zyl, kq9.X0(new gvj((Object)g0, (Object)n)));
        }
    }
    
    public static final class b extends s4j<zxl>
    {
        public final Object d(final elp elp, final int n) {
            zzd.f((Object)elp, "input");
            final hx6$h a = hx6.a;
            final zyl zyl = (zyl)((s4j)new ix6((Class)zyl.class)).a(elp);
            Object c0;
            if ((c0 = ((s4j)new cr4((alp)new ix6((Class)zyl.class), (alp)hx6.b)).a(elp)) == null) {
                c0 = a3a.C0;
            }
            return new zxl(zyl, (Map<zyl, Integer>)c0);
        }
        
        public final void f(final flp flp, final Object o) {
            final zxl zxl = (zxl)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)zxl, "reactionMetadata");
            final zyl a = zxl.a;
            final hx6$h a2 = hx6.a;
            ((s4j)new ix6((Class)zyl.class)).c(flp, (Object)a);
            final int a3 = w4j.a;
            ((s4j)new cr4((alp)new ix6((Class)zyl.class), (alp)hx6.b)).c(flp, (Object)zxl.b);
        }
    }
}
