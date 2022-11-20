// 
// Decompiled by Procyon v0.6.0
// 

public final class of<T extends ssb<? extends Boolean>>
{
    public final String a;
    public final T b;
    
    public of(final String a, final T b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof of)) {
            return false;
        }
        final String a = this.a;
        final of of = (of)o;
        return czd.a((Object)a, (Object)of.a) && czd.a((Object)this.b, (Object)of.b);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final ssb<? extends Boolean> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("AccessibilityAction(label=");
        j.append(this.a);
        j.append(", action=");
        j.append(this.b);
        j.append(')');
        return j.toString();
    }
}
