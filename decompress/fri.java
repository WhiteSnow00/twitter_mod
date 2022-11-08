// 
// Decompiled by Procyon v0.6.0
// 

public final class fri
{
    public static final a Companion;
    public final boolean a;
    public final nti b;
    public final xti c;
    
    static {
        Companion = new a();
    }
    
    public fri(final boolean a, final nti b, final xti c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fri)) {
            return false;
        }
        final fri fri = (fri)o;
        return this.a == fri.a && zzd.a((Object)this.b, (Object)fri.b) && zzd.a((Object)this.c, (Object)fri.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final nti b = this.b;
        final int n3 = 0;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        final xti c = this.c;
        if (c == null) {
            n = n3;
        }
        else {
            final int a2 = c.a ? 1 : 0;
            if (a2 == 0) {
                n = a2;
            }
        }
        return (n2 * 31 + hashCode) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final nti b = this.b;
        final xti c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationDisplayOptions(inlineActions=");
        sb.append(a);
        sb.append(", mediaPreview=");
        sb.append(b);
        sb.append(", quoteTweet=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
