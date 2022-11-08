import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g3w implements qtd
{
    public static final a Companion;
    public final co1 a;
    public final vpl b;
    public final gfq c;
    
    static {
        Companion = new a();
    }
    
    public g3w(final co1 a, final vpl b, final gfq c) {
        zzd.f((Object)a, "notificationController");
        zzd.f((Object)b, "pushNotificationPresenter");
        zzd.f((Object)c, "actionScriber");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final jsi jsi, final List<jsi> list) {
        zzd.f((Object)jsi, "receivedPush");
        zzd.f((Object)list, "notificationsList");
        final evi k = jsi.K;
        zzd.c((Object)k);
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = k.b.a.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            final Iterator<Object> iterator2 = list.iterator();
            boolean b2 = false;
            while (iterator2.hasNext()) {
                final jsi jsi2 = iterator2.next();
                if (mo0.a(jsi2, s)) {
                    list2.add(jsi2.a);
                    this.c.a(jsi2, "delete");
                    b2 = true;
                }
            }
            if (b2) {
                b = true;
            }
            else {
                this.c.a(jsi, "delete_failure");
            }
        }
        this.a.d(list2, jsi.B);
        if (b) {
            this.b.b(jsi);
        }
    }
    
    public static final class a
    {
    }
}
