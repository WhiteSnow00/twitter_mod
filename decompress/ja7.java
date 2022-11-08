// 
// Decompiled by Procyon v0.6.0
// 

public final class ja7
{
    public final String a;
    public final otb<Boolean> b;
    
    public ja7(final String a, final otb<Boolean> b) {
        zzd.f((Object)a, "label");
        zzd.f((Object)b, "action");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ja7)) {
            return false;
        }
        final String a = this.a;
        final ja7 ja7 = (ja7)o;
        return zzd.a((Object)a, (Object)ja7.a) && zzd.a((Object)this.b, (Object)ja7.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("CustomAccessibilityAction(label=");
        g.append(this.a);
        g.append(", action=");
        g.append(this.b);
        g.append(')');
        return g.toString();
    }
}
