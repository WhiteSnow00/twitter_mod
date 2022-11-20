import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brw
{
    public final Context a;
    public final boolean b;
    public final n4s c;
    
    public brw(final adw adw, final Context a) {
        czd.f((Object)adw, "userInfo");
        czd.f((Object)a, "context");
        this.a = a;
        this.b = adw.getUser().N0;
        this.c = (n4s)pps.n((nsb)new nsb<List<? extends old>>(this) {
            public final brw D0;
            
            public final Object invoke() {
                final old$f old$f = new old$f(Integer.valueOf(2131959528));
                final old$i old$i = new old$i(2131959531, 2131167441);
                final old$e old$e = new old$e(2131959530, 0);
                Objects.requireNonNull(wqw.Companion);
                old old = null;
                final old$d old$d = new old$d("https://abs.twimg.com/images/verification-form-start.png", 2131167440, (Integer)null, 12);
                final old$i old$i2 = new old$i(2131959526, 2131167437);
                final oxm a = brw.a(this.D0, 2131959525);
                final xaa a2 = xaa.a;
                final old$h old$h = new old$h(a, new af4(xaa.d), 0, 0, 12, (rf8)null);
                final old$c old$c = new old$c(s9i.s(new old$c$a(joc.e0.getDrawableRes(), 2131959515, 2131959514), new old$c$a(joc.Y.getDrawableRes(), 2131959517, 2131959516), new old$c$a(joc.J1.getDrawableRes(), 2131959533, 2131959532)));
                final old$i old$i3 = new old$i(2131959535, 2131167437);
                final old$e old$e2 = new old$e(2131959534, 0);
                final old$a old$a = new old$a(2131233440, 2131959519, Integer.valueOf(2131959518));
                final old$a old$a2 = new old$a(2131233445, 2131959523, Integer.valueOf(2131959522));
                final old$a old$a3 = new old$a(2131233444, 2131959521, Integer.valueOf(2131959520));
                final old$h old$h2 = new old$h(brw.a(this.D0, 2131959527), new af4(xaa.c), 2131167435, 0, 8, (rf8)null);
                final old$b old$b = new old$b(2131959524, 2131232615);
                if (true ^ this.D0.b) {
                    old = (old)old$b;
                }
                final ArrayList list = new ArrayList();
                ct0.N0((Object[])new old[] { (old)old$f, (old)old$i, (old)old$e, (old)old$d, (old)old$i2, (old)old$h, (old)old$c, (old)old$i3, (old)old$e2, (old)old$a, (old)old$a2, (old)old$a3, (old)old$h2, old }, (Collection)list);
                return list;
            }
        });
    }
    
    public static final oxm a(final brw brw, final int n) {
        final String string = brw.a.getString(n);
        czd.e((Object)string, "context.getString(textId)");
        final String string2 = brw.a.getString(2131959512);
        czd.e((Object)string2, "context.getString(R.stri\u2026ducation_learn_more_link)");
        return nym.b(new String[] { string2 }, string);
    }
}
