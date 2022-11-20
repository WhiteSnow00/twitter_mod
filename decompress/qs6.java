// 
// Decompiled by Procyon v0.6.0
// 

public final class qs6
{
    public static final a Companion;
    public static final y4j<qs6> i;
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final qr6<?> h;
    
    static {
        Companion = new a();
        qs6.i = qs6.qs6$b.b;
    }
    
    public qs6(final String a, final String b, final boolean c, final String d, final boolean e, final boolean f, final long g, final qr6<?> h) {
        czd.f((Object)h, "entry");
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
        if (!(o instanceof qs6)) {
            return false;
        }
        final qs6 qs6 = (qs6)o;
        return czd.a((Object)this.a, (Object)qs6.a) && czd.a((Object)this.b, (Object)qs6.b) && this.c == qs6.c && czd.a((Object)this.d, (Object)qs6.d) && this.e == qs6.e && this.f == qs6.f && this.g == qs6.g && czd.a((Object)this.h, (Object)qs6.h);
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
        final qr6<?> h = this.h;
        final StringBuilder q = tqf.q("ConversationItem(senderName=", a, ", senderAvatar=", b, ", senderHasNftAvatar=");
        mw.C(q, c, ", senderUserName=", d, ", isUnread=");
        jg9.u(q, e, ", isFirstEntry=", f, ", eventId=");
        q.append(g);
        q.append(", entry=");
        q.append(h);
        q.append(")");
        return q.toString();
    }
    
    public static final class a
    {
    }
}
