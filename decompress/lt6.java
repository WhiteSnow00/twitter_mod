import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lt6
{
    public static final a Companion;
    public static final s4j<lt6> i;
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final ls6<?> h;
    
    static {
        Companion = new a();
        lt6.i = b.b;
    }
    
    public lt6(final String a, final String b, final boolean c, final String d, final boolean e, final boolean f, final long g, final ls6<?> h) {
        zzd.f((Object)h, "entry");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lt6)) {
            return false;
        }
        final lt6 lt6 = (lt6)o;
        return zzd.a((Object)this.a, (Object)lt6.a) && zzd.a((Object)this.b, (Object)lt6.b) && this.c == lt6.c && zzd.a((Object)this.d, (Object)lt6.d) && this.e == lt6.e && this.f == lt6.f && this.g == lt6.g && zzd.a((Object)this.h, (Object)lt6.h);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int c = this.c ? 1 : 0;
        int n = 1;
        int n2 = c;
        if (c != 0) {
            n2 = 1;
        }
        final String d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final int f = this.f ? 1 : 0;
        if (f == 0) {
            n = f;
        }
        final long g = this.g;
        return this.h.hashCode() + ((((((hashCode2 * 31 + hashCode3) * 31 + n2) * 31 + hashCode) * 31 + e) * 31 + n) * 31 + (int)(g ^ g >>> 32)) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final boolean c = this.c;
        final String d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final long g = this.g;
        final ls6<?> h = this.h;
        final StringBuilder y = mb0.y("ConversationItem(senderName=", a, ", senderAvatar=", b, ", senderHasNftAvatar=");
        lf.z(y, c, ", senderUserName=", d, ", isUnread=");
        lo0.z(y, e, ", isFirstEntry=", f, ", eventId=");
        y.append(g);
        y.append(", entry=");
        y.append(h);
        y.append(")");
        return y.toString();
    }
    
    public static final class a
    {
    }
    
    public static final class b extends s4j<lt6>
    {
        public static final b b;
        
        static {
            b = new b();
        }
        
        public b() {
            super(2);
        }
        
        public final Object d(final elp elp, final int n) {
            zzd.f((Object)elp, "input");
            final long a = elp.A();
            final String i = elp.I();
            final String j = elp.I();
            final String k = elp.I();
            final int z = elp.z();
            boolean u = false;
            final boolean b = z == 1;
            final Object b2 = ((alp)ls6.a).b(elp);
            zzd.e(b2, "SERIALIZER.deserializeNotNull(input)");
            final ls6 ls6 = (ls6)b2;
            final boolean b3 = n >= 1 && elp.u();
            if (n >= 2) {
                u = elp.u();
            }
            return new lt6(i, j, u, k, b, b3, a, ls6);
        }
        
        public final void f(final flp flp, final Object o) {
            final lt6 lt6 = (lt6)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)lt6, "conversationItem");
            final flp z = flp.A(lt6.g).G(lt6.a).G(lt6.b).G(lt6.d).z((int)(lt6.e ? 1 : 0));
            final ls6<?> h = lt6.h;
            final jx6 a = ls6.a;
            Objects.requireNonNull(z);
            ((s4j)a).c(z, (Object)h);
            final int a2 = w4j.a;
            z.t(lt6.f).t(lt6.c);
        }
    }
}
