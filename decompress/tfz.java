// 
// Decompiled by Procyon v0.6.0
// 

public final class tfz extends yfz
{
    public static final tfz F0;
    
    static {
        F0 = new tfz();
    }
    
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
    
    public final boolean b() {
        return false;
    }
    
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    public final int hashCode() {
        return 2040732332;
    }
    
    public final String toString() {
        return "Optional.absent()";
    }
}
