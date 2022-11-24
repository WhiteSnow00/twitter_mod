import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class yx8 extends zp8
{
    public int m;
    
    public yx8(final jpx jpx) {
        super(jpx);
        if (jpx instanceof brc) {
            super.e = 2;
        }
        else {
            super.e = 3;
        }
    }
    
    public final void d(final int g) {
        if (super.j) {
            return;
        }
        super.j = true;
        super.g = g;
        for (final vp8 vp8 : super.k) {
            vp8.a(vp8);
        }
    }
}
