import android.net.Uri;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier$Companion;
import java.lang.reflect.Type;
import androidx.work.impl.WorkDatabase;
import com.twitter.database.schema.TwitterSchema;
import android.content.Intent;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k5d implements Callable
{
    public final int F0;
    public final Object G0;
    
    public k5d(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() {
        final int f0 = this.F0;
        boolean b = true;
        switch (f0) {
            default: {
                final gzr gzr = (gzr)this.G0;
                final String string = gzr.d.getString("full_cache_map", (String)null);
                if (llr.a((CharSequence)string)) {
                    synchronized (gzr.f) {
                        gzr.e.clear();
                        return kni.a;
                    }
                }
                final Type type = ((nlv)new fzr()).type;
                try {
                    synchronized (gzr.f) {
                        gzr.e.putAll((Map)gzr.b.d(string, type));
                    }
                }
                catch (final JsonSyntaxException ex) {
                    t5j.fromCallable((Callable)new hi8((Object)gzr, 5)).subscribeOn(gzr.c).subscribe((ocj)new ko1());
                }
                return kni.a;
            }
            case 7: {
                final bdt bdt = (bdt)this.G0;
                e0e.f((Object)bdt, "$update");
                final UserIdentifier$Companion companion = UserIdentifier.Companion;
                final kbv d2 = kbv.d2(companion.c());
                final long id = companion.c().getId();
                Objects.requireNonNull(bdt.Companion);
                final net.a a = new net.a();
                a.a = bdt.a;
                a.b = bdt.b;
                a.c = bdt.c;
                a.d = bdt.d;
                a.e = bdt.e;
                a.f = bdt.f;
                a.g = bdt.g;
                a.i = bdt.h;
                a.j = bdt.i;
                a.k = bdt.j;
                a.l = bdt.k;
                a.m = bdt.l;
                a.n = bdt.m;
                a.o = bdt.n;
                a.p = bdt.o;
                a.q = bdt.p;
                a.r = bdt.q;
                a.o(bdt.r);
                d2.h4(id, (net)a.e());
                return vzv.a;
            }
            case 6: {
                return ((tdw)this.G0).a.i("", 4, 5000);
            }
            case 5: {
                final lup lup = (lup)this.G0;
                e0e.f((Object)lup, "this$0");
                final Bundle a2 = ((foa)lup.e).a(lup.d, lup.f);
                final Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.replaceExtras(a2);
                intent.setClassName(lup.b, lup.c);
                return intent;
            }
            case 4: {
                return ((gra)this.G0).a((Object)"av_event_processing_thread");
            }
            case 3: {
                final nec nec = (nec)this.G0;
                e0e.f((Object)nec, "this$0");
                if (!lmi.w() || !pdw.d().A().z || nec.F0.d(nec.G0, new Object[0]) <= 0) {
                    b = false;
                }
                return b;
            }
            case 2: {
                final z9k b2 = ((cak)this.G0).b;
                final long k = cak.k();
                Objects.requireNonNull(b2);
                fj1.e();
                b2.d().d("expiry_timestamp<?", new Object[] { k });
                return kni.a;
            }
            case 1: {
                final t9l t9l = (t9l)this.G0;
                final Uri a3 = t9l.a4;
                final xmq c = ((rmq)((oxo)((sp1)kbv.d2(((u9)t9l).M0)).T()).f((Class)cmw.class)).c();
                final zsl$a zsl$a = new zsl$a();
                ((lp1$a)zsl$a).t(ttl.c("user_id"), new Object[] { t9l.i3 });
                return c.e((zsl)((z4j)zsl$a).e());
            }
            case 0: {
                final dh3 dh3 = (dh3)this.G0;
                e0e.f((Object)dh3, "this$0");
                return amz.l((WorkDatabase)dh3.F0, "next_alarm_manager_id");
            }
        }
    }
}
