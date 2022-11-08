import com.google.android.material.timepicker.c;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bw2
{
    public static final a Companion;
    public final gv2 a;
    public final ov2 b;
    public final snd c;
    public final apb d;
    
    static {
        Companion = new a();
    }
    
    public bw2(final gv2 a, final ov2 b, final snd c) {
        zzd.f((Object)a, "businessHoursActionDispatcher");
        this.a = a;
        this.b = b;
        this.c = c;
        final p q = ((gob)c).Q();
        zzd.e((Object)q, "injectedFragmentActivity.supportFragmentManager");
        this.d = (apb)q;
    }
    
    public final c a(final c c) {
        c.P1.add(new hpa(this, c, 9));
        c.Q1.add(new u0p((Object)this, 17));
        return c;
    }
    
    public static final class a
    {
    }
}
