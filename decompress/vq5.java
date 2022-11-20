// 
// Decompiled by Procyon v0.6.0
// 

public final class vq5
{
    public static final b Companion;
    public static final vq5.vq5$a c;
    public final yq5 a;
    public final wq5 b;
    
    static {
        Companion = new b();
        c = new vq5.vq5$a();
    }
    
    public vq5(final yq5 a, final wq5 b) {
        czd.f((Object)a, "type");
        czd.f((Object)b, "state");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vq5)) {
            return false;
        }
        final vq5 vq5 = (vq5)o;
        return this.a == vq5.a && this.b == vq5.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final yq5 a = this.a;
        final wq5 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityNotificationSetting(type=");
        sb.append(a);
        sb.append(", state=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
    }
}
