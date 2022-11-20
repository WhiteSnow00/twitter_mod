// 
// Decompiled by Procyon v0.6.0
// 

public final class m5h
{
    public static final a Companion;
    public static final m5h d;
    public final int a;
    public final int b;
    public final int c;
    
    static {
        Companion = new a();
        d = new m5h(0, 0);
    }
    
    public m5h(final int a, final int b) {
        this.a = a;
        this.b = b;
        this.c = a + b;
    }
    
    public final boolean a() {
        return this.c > 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m5h)) {
            return false;
        }
        final m5h m5h = (m5h)o;
        return this.a == m5h.a && this.b == m5h.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        return zh8.n("MergeCount(visibleEntryCount=", this.a, ", invisibleEntryCount=", this.b, ")");
    }
    
    public static final class a
    {
    }
}
