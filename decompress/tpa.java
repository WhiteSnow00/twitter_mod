import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpa implements fa3
{
    public final upa$b a;
    public final String b;
    public final int[] c;
    
    public tpa(final upa$b a, final String b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    public final void a(final Object o) {
        final upa$b a = this.a;
        final String b = this.b;
        final int[] c = this.c;
        final fo fo = (fo)o;
        final Intent c2 = fo.c;
        if (c2 != null) {
            final x99 i = iwl.i(c2);
            if (i != null) {
                a.b(i, b, c);
            }
        }
        iwl.o(sc6.G0, fo.c);
    }
}
