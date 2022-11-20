import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qq9
{
    public static final a Companion;
    public static final qq9.qq9$b f;
    public final List<Long> a;
    public final long b;
    public final int c;
    public final boolean d;
    public final tw9 e;
    
    static {
        Companion = new a();
        f = new qq9.qq9$b();
    }
    
    public qq9(final List<Long> a, final long b, final int c, final boolean d, final tw9 e) {
        czd.f((Object)a, "editTweetIds");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qq9)) {
            return false;
        }
        final qq9 qq9 = (qq9)o;
        return czd.a((Object)this.a, (Object)qq9.a) && this.b == qq9.b && this.c == qq9.c && this.d == qq9.d && czd.a((Object)this.e, (Object)qq9.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final int c = this.c;
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        final tw9 e = this.e;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        return (((hashCode * 31 + n) * 31 + c) * 31 + d) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final List<Long> a = this.a;
        final long b = this.b;
        final int c = this.c;
        final boolean d = this.d;
        final tw9 e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("EditControl(editTweetIds=");
        sb.append(a);
        sb.append(", editableUntilMs=");
        sb.append(b);
        sb.append(", editsRemaining=");
        sb.append(c);
        sb.append(", isEditEligible=");
        sb.append(d);
        sb.append(", editedTweetInformation=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
