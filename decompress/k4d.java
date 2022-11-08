// 
// Decompiled by Procyon v0.6.0
// 

public final class k4d
{
    public static final a Companion;
    public static final k4d.k4d$b c;
    public final uov a;
    public final xwm<xes> b;
    
    static {
        Companion = new a();
        c = new k4d.k4d$b();
    }
    
    public k4d(final uov a, final xwm<xes> b) {
        zzd.f((Object)a, "icon");
        zzd.f((Object)b, "text");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k4d)) {
            return false;
        }
        final k4d k4d = (k4d)o;
        return this.a == k4d.a && zzd.a((Object)this.b, (Object)k4d.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final uov a = this.a;
        final xwm<xes> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("IconLabel(icon=");
        sb.append(a);
        sb.append(", text=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
