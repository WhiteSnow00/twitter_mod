import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c3 implements xv1
{
    public final int a;
    public final Object b;
    
    public c3(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final nnl nnl = (nnl)this.b;
                final cwc cwc = (cwc)o;
                final j6 j6 = (j6)o2;
                czd.f((Object)nnl, "$hydraAVEventPublishSubject");
                czd.f((Object)cwc, "event");
                nnl.onNext((Object)cwc);
                return;
            }
            case 7: {
                final jz0 jz0 = (jz0)this.b;
                final mmk mmk = (mmk)o;
                final j6 j7 = (j6)o2;
                czd.f((Object)jz0, "this$0");
                jz0.b.onNext((Object)mmk);
                return;
            }
            case 6: {
                final swk swk = (swk)this.b;
                final rwk rwk = (rwk)o;
                final j6 j8 = (j6)o2;
                swk.I0.l(rwk.b, rwk.c, rwk.d, rwk.e, ((jzg)rwk).a);
                return;
            }
            case 5: {
                final nnk nnk = (nnk)this.b;
                final vik vik = (vik)o;
                final j6 j9 = (j6)o2;
                if (nnk.J0) {
                    nnk.I0.a();
                    nnk.J0 = false;
                }
                return;
            }
            case 4: {
                final xxg xxg = (xxg)this.b;
                final yxg yxg = (yxg)o;
                final j6 j10 = (j6)o2;
                Objects.requireNonNull(xxg);
                final y3 a = yxg.a;
                if (a != null) {
                    xxg.I0.i(a);
                }
                else {
                    xxg.I0.b();
                }
                return;
            }
            case 3: {
                final sx0 sx0 = (sx0)this.b;
                final cp6 cp6 = (cp6)o;
                final j6 j11 = (j6)o2;
                sx0.J0.a();
                return;
            }
            case 2: {
                final t77 t77 = (t77)this.b;
                final s77 s77 = (s77)o;
                final j6 j12 = (j6)o2;
                t77.I0.h(s77.b);
                return;
            }
            case 1: {
                final rkc rkc = (rkc)this.b;
                final yyg yyg = (yyg)o;
                final j6 j13 = (j6)o2;
                czd.f((Object)rkc, "this$0");
                czd.e((Object)yyg, "event");
                czd.e((Object)j13, "snapshot");
                rkc.K0.W((f2)rkc);
                rkc.M0.unregisterOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)rkc);
                return;
            }
            case 0: {
                final a3$b a3$b = (a3$b)this.b;
                final n7r n7r = (n7r)o;
                final j6 j14 = (j6)o2;
                czd.f((Object)a3$b, "this$0");
                a3$b.J0.e = false;
            }
        }
    }
}
