import com.twitter.android.liveevent.dock.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nvf extends y7q<mzf>
{
    public final b a;
    public final oyf b;
    public final om c;
    public final ym d;
    
    public nvf(final b a, final oyf b, final om c, final ym d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a(final x59 x59) {
        return mzf.class.isInstance(x59);
    }
    
    public final k2j b(final x59 x59) {
        final mzf mzf = (mzf)x59;
        return (k2j)new mvf(this, (snj)this.c.b(), (snj)this.d.b());
    }
    
    public final void c(final x59 x59, final y49 y49) {
        final mzf mzf = (mzf)x59;
        final zjt a = this.b.a;
        if (a != null) {
            a.y0();
        }
    }
}
