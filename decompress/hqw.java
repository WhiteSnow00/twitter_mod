import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqw
{
    public final Context a;
    public final boolean b;
    public final u3s c;
    
    public hqw(final ocw ocw, final Context a) {
        zzd.f((Object)ocw, "userInfo");
        zzd.f((Object)a, "context");
        this.a = a;
        this.b = ocw.getUser().M0;
        this.c = (u3s)rp2.z0((otb)new otb<List<? extends lmd>>() {
            public final /* synthetic */ hqw C0;
            
            public final Object invoke() {
                final lmd$f lmd$f = new lmd$f(Integer.valueOf(2131959526));
                final lmd$i lmd$i = new lmd$i(2131959529, 2131167441);
                final lmd$e lmd$e = new lmd$e(2131959528, 0);
                Objects.requireNonNull(cqw.Companion);
                lmd lmd = null;
                final lmd$d lmd$d = new lmd$d("https://abs.twimg.com/images/verification-form-start.png", 2131167440, (Integer)null, 12);
                final lmd$i lmd$i2 = new lmd$i(2131959524, 2131167437);
                final xwm a = hqw.a(this.C0, 2131959523);
                final oba a2 = oba.a;
                final lmd$h lmd$h = new lmd$h(a, new zf4(oba.d), 0, 0, 12, (hg8)null);
                final lmd$c lmd$c = new lmd$c(tdy.v0((Object[])new lmd$c$a[] { new lmd$c$a(gpc.f0.getDrawableRes(), 2131959513, 2131959512), new lmd$c$a(gpc.Z.getDrawableRes(), 2131959515, 2131959514), new lmd$c$a(gpc.J1.getDrawableRes(), 2131959531, 2131959530) }));
                final lmd$i lmd$i3 = new lmd$i(2131959533, 2131167437);
                final lmd$e lmd$e2 = new lmd$e(2131959532, 0);
                final lmd$a lmd$a = new lmd$a(2131233438, 2131959517, Integer.valueOf(2131959516));
                final lmd$a lmd$a2 = new lmd$a(2131233443, 2131959521, Integer.valueOf(2131959520));
                final lmd$a lmd$a3 = new lmd$a(2131233442, 2131959519, Integer.valueOf(2131959518));
                final lmd$h lmd$h2 = new lmd$h(hqw.a(this.C0, 2131959525), new zf4(oba.c), 2131167435, 0, 8, (hg8)null);
                final lmd$b lmd$b = new lmd$b(2131959522, 2131232613);
                if (true ^ this.C0.b) {
                    lmd = (lmd)lmd$b;
                }
                final ArrayList list = new ArrayList();
                jt0.C0((Object[])new lmd[] { (lmd)lmd$f, (lmd)lmd$i, (lmd)lmd$e, (lmd)lmd$d, (lmd)lmd$i2, (lmd)lmd$h, (lmd)lmd$c, (lmd)lmd$i3, (lmd)lmd$e2, (lmd)lmd$a, (lmd)lmd$a2, (lmd)lmd$a3, (lmd)lmd$h2, lmd }, (Collection)list);
                return list;
            }
        });
    }
    
    public static final xwm a(final hqw hqw, final int n) {
        final String string = hqw.a.getString(n);
        zzd.e((Object)string, "context.getString(textId)");
        final String string2 = hqw.a.getString(2131959510);
        zzd.e((Object)string2, "context.getString(R.stri\u2026ducation_learn_more_link)");
        return wxm.b(new String[] { string2 }, string);
    }
}
