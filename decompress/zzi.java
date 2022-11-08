// 
// Decompiled by Procyon v0.6.0
// 

public final class zzi
{
    public static final b Companion;
    public static final alp<zzi> i;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    
    static {
        Companion = new b();
        zzi.i = zzi.zzi$c.c;
    }
    
    public zzi(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h) {
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
        if (!(o instanceof zzi)) {
            return false;
        }
        final zzi zzi = (zzi)o;
        return zzd.a((Object)this.a, (Object)zzi.a) && zzd.a((Object)this.b, (Object)zzi.b) && zzd.a((Object)this.c, (Object)zzi.c) && zzd.a((Object)this.d, (Object)zzi.d) && zzd.a((Object)this.e, (Object)zzi.e) && zzd.a((Object)this.f, (Object)zzi.f) && zzd.a((Object)this.g, (Object)zzi.g) && zzd.a((Object)this.h, (Object)zzi.h);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        final int n = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final int a = l7k.a(this.f, l7k.a(this.e, l7k.a(this.d, ((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31, 31), 31), 31);
        final String g = this.g;
        int hashCode4;
        if (g == null) {
            hashCode4 = n;
        }
        else {
            hashCode4 = g.hashCode();
        }
        return this.h.hashCode() + (a + hashCode4) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final String h = this.h;
        final StringBuilder y = mb0.y("NudgeFeedbackContent(buttonText=", a, ", heading=", b, ", text=");
        mag.m(y, c, ", subheading=", d, ", optionPositive=");
        mag.m(y, e, ", optionNegative=", f, ", feedbackIconName=");
        return hi.J(y, g, ", postFeedbackText=", h, ")");
    }
    
    public static final class b
    {
    }
}
