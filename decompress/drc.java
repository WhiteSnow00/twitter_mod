import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drc
{
    public static int f = 20000;
    public static int g = 90000;
    public final nrc a;
    public final int b;
    public final int c;
    public final int d;
    public final File e;
    
    public drc() {
        final int g = drc.g;
        final int f = drc.f;
        this.a = null;
        this.b = f;
        this.c = g;
        this.d = 2097152;
        this.e = null;
    }
    
    public drc(final nrc a, final File e) {
        final int g = drc.g;
        final int f = drc.f;
        this.a = a;
        this.b = f;
        this.c = g;
        this.d = 2097152;
        this.e = e;
    }
    
    public static drc a() {
        return udu.c().Z5();
    }
}
