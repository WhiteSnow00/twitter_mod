import android.widget.Magnifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phk implements ohk
{
    public static final phk a;
    
    static {
        a = new phk();
    }
    
    public final nhk a(final rfg rfg, final View view, final dp8 dp8, final float n) {
        zzd.f((Object)rfg, "style");
        zzd.f((Object)view, "view");
        zzd.f((Object)dp8, "density");
        return (nhk)new a(new Magnifier(view));
    }
    
    public final boolean b() {
        return false;
    }
    
    public static class a implements nhk
    {
        public final Magnifier a;
        
        public a(final Magnifier a) {
            this.a = a;
        }
        
        public final long a() {
            return lr0.b(this.a.getWidth(), this.a.getHeight());
        }
        
        public void b(final long n, final long n2, final float n3) {
            this.a.show(qfj.d(n), qfj.e(n));
        }
        
        public final void c() {
            this.a.update();
        }
        
        public final void dismiss() {
            this.a.dismiss();
        }
    }
}
