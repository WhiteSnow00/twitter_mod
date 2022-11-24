// 
// Decompiled by Procyon v0.6.0
// 

public final class ai3
{
    public static final a Companion;
    public final boolean a;
    
    static {
        Companion = new a();
    }
    
    public ai3() {
        this(false);
    }
    
    public ai3(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ai3 && this.a == ((ai3)o).a);
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
        return jba.o("CaptureVideoScribeMetadata(wasHandsFree=", this.a, ")");
    }
    
    public static final class a
    {
    }
}
