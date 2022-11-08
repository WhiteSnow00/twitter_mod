import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnw
{
    public static final a c;
    public final b a;
    public final xdj b;
    
    static {
        c = new a();
    }
    
    public lnw(final b a, final xdj b) {
        zzd.f((Object)a, "messageType");
        zzd.f((Object)b, "text");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lnw)) {
            return false;
        }
        final lnw lnw = (lnw)o;
        return this.a == lnw.a && zzd.a((Object)this.b, (Object)lnw.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final b a = this.a;
        final xdj b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ValidationMessage(messageType=");
        sb.append(a);
        sb.append(", text=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends s4j<lnw>
    {
        public final Object d(final elp elp, final int n) {
            zzd.f((Object)elp, "input");
            Objects.requireNonNull(lnw.b.Companion);
            final Object b = elp.B((alp)lnw.b.D0);
            zzd.e(b, "readNotNullObject(Type.SERIALIZER)");
            final b b2 = (b)b;
            final Object b3 = elp.B((alp)xdj.J0);
            zzd.e(b3, "readNotNullObject(OcfRichText.SERIALIZER)");
            return new lnw(b2, (xdj)b3);
        }
        
        public final void f(final flp flp, final Object o) {
            final lnw lnw = (lnw)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)lnw, "validationMessage");
            final b a = lnw.a;
            Objects.requireNonNull(lnw.b.Companion);
            ((s4j)lnw.b.D0).c(flp, (Object)a);
            final int a2 = w4j.a;
            flp.C((Object)lnw.b, (alp)xdj.J0);
        }
    }
    
    public enum b
    {
        public static final a Companion;
        public static final alp<b> D0;
        
        E0("unknown"), 
        F0("mismatch");
        
        public final String C0;
        
        static {
            Companion = new a();
            final hx6$h a = hx6.a;
            b.D0 = new ix6((Class)b.class);
        }
        
        public b(final String c0) {
            this.C0 = c0;
        }
        
        public static final class a
        {
        }
    }
}
