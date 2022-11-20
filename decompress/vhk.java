import android.widget.Magnifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vhk implements uhk
{
    public static final vhk a;
    
    static {
        a = new vhk();
    }
    
    @Override
    public final thk a(final ifg ifg, final View view, final lo8 lo8, final float n) {
        czd.f((Object)ifg, "style");
        czd.f((Object)view, "view");
        czd.f((Object)lo8, "density");
        return (thk)new a(new Magnifier(view));
    }
    
    @Override
    public final boolean b() {
        return false;
    }
    
    public static class a implements thk
    {
        public final Magnifier a;
        
        public a(final Magnifier a) {
            this.a = a;
        }
        
        public final long a() {
            return rp9.t(this.a.getWidth(), this.a.getHeight());
        }
        
        public void b(final long n, final long n2, final float n3) {
            this.a.show(wfj.d(n), wfj.e(n));
        }
        
        public final void c() {
            this.a.update();
        }
        
        public final void dismiss() {
            this.a.dismiss();
        }
    }
}
