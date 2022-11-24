// 
// Decompiled by Procyon v0.6.0
// 

public final class ta7
{
    public final String a;
    public final ptb<Boolean> b;
    
    public ta7(final String a, final ptb<Boolean> b) {
        e0e.f((Object)a, "label");
        e0e.f((Object)b, "action");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ta7)) {
            return false;
        }
        final String a = this.a;
        final ta7 ta7 = (ta7)o;
        return e0e.a((Object)a, (Object)ta7.a) && e0e.a((Object)this.b, (Object)ta7.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("CustomAccessibilityAction(label=");
        f.append(this.a);
        f.append(", action=");
        f.append(this.b);
        f.append(')');
        return f.toString();
    }
}
