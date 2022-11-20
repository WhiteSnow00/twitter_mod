// 
// Decompiled by Procyon v0.6.0
// 

public final class bfz extends zez
{
    public final Object D0;
    
    public bfz(final Object d0) {
        this.D0 = d0;
    }
    
    public final Object a() {
        return this.D0;
    }
    
    public final boolean b() {
        return true;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof bfz && this.D0.equals(((bfz)o).D0);
    }
    
    public final int hashCode() {
        return this.D0.hashCode() + 1502476572;
    }
    
    public final String toString() {
        final StringBuilder j = fu8.j("Optional.of(");
        j.append(this.D0);
        j.append(")");
        return j.toString();
    }
}
