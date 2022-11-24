import android.widget.Magnifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kik implements jik
{
    public static final kik a;
    
    static {
        a = new kik();
    }
    
    @Override
    public final iik a(final bgg bgg, final View view, final rp8 rp8, final float n) {
        e0e.f((Object)bgg, "style");
        e0e.f((Object)view, "view");
        e0e.f((Object)rp8, "density");
        return (iik)new a(new Magnifier(view));
    }
    
    @Override
    public final boolean b() {
        return false;
    }
    
    public static class a implements iik
    {
        public final Magnifier a;
        
        public a(final Magnifier a) {
            this.a = a;
        }
        
        public final long a() {
            return shw.f(this.a.getWidth(), this.a.getHeight());
        }
        
        public void b(final long n, final long n2, final float n3) {
            this.a.show(kgj.d(n), kgj.e(n));
        }
        
        public final void c() {
            this.a.update();
        }
        
        public final void dismiss() {
            this.a.dismiss();
        }
    }
}
