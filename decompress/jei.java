import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jei implements g61$a
{
    public final iei a;
    
    public jei(final iei a) {
        this.a = a;
    }
    
    public final void a(final f9p f9p) {
        final viw g = f9p.g;
        if (g != null) {
            final iei a = this.a;
            final String l = ikr.l(g.b);
            czd.c((Object)l);
            String e = f9p.e;
            if (e == null || e.length() == 0) {
                e = l;
            }
            ((TextView)a.O0).setText((CharSequence)e);
            final iei$a p = a.P0;
            if (p != null) {
                p.a(s9i.r(l));
            }
        }
    }
}
