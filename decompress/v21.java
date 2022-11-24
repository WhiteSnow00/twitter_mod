// 
// Decompiled by Procyon v0.6.0
// 

public final class v21
{
    public final boolean a;
    
    public v21(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof v21 && this.a == ((v21)o).a);
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return a;
    }
    
    @Override
    public final String toString() {
        return jba.o("AudioSpaceIsSubscribed(isSubscribed=", this.a, ")");
    }
}
