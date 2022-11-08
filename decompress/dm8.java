import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dm8 extends gue implements rtb<List<? extends jsi>, oyv>
{
    public final /* synthetic */ em8 C0;
    
    public dm8(final em8 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        final ArrayList c = nb0.C(list, "notificationInfos");
        for (final Object next : list) {
            final evi k = ((jsi)next).K;
            String a;
            if (k != null) {
                a = k.a;
            }
            else {
                a = null;
            }
            if (zzd.a((Object)a, (Object)"DELAY")) {
                c.add(next);
            }
        }
        final em8 c2 = this.C0;
        for (final jsi jsi : c) {
            c2.b.a(jsi, "delay_cancel");
            final eql c3 = c2.c;
            final UserIdentifier b = c2.d.b();
            zzd.e((Object)b, "userManager.current");
            c3.b(b, tdy.u0((Object)jsi.a));
        }
        return oyv.a;
    }
}
