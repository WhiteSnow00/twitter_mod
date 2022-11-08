import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w9d
{
    public final hlv a;
    
    public w9d(final hlv a) {
        zzd.f((Object)a, "featureSwitches");
        this.a = a;
    }
    
    public final atu a(final atu atu) {
        final boolean b = this.b(((nws)atu).h());
        atu atu2 = null;
        final Long n = null;
        if (b) {
            final List s = ((nws)atu).c().s;
            zzd.e((Object)s, "item.entityInfo.feedbackActionPrompts");
            while (true) {
                for (final Object next : s) {
                    final String b2 = ((iva$c)next).b;
                    zzd.e((Object)b2, "it.prompt");
                    if (ckr.h1((CharSequence)b2) ^ true) {
                        final iva$c iva$c = (iva$c)next;
                        Long value = n;
                        if (iva$c != null) {
                            value = iva$c.c;
                        }
                        final a19.a a = new a19.a();
                        a.a = 10;
                        long longValue;
                        if (value != null) {
                            longValue = value;
                        }
                        else {
                            longValue = -1L;
                        }
                        a.b = longValue;
                        final a19 p = (a19)a.e();
                        final nus$a nus$a = new nus$a(((nws)atu).c());
                        nus$a.p = p;
                        final nus c = (nus)((h4j)nus$a).e();
                        final atu$b atu$b = new atu$b(atu);
                        ((nws$a)atu$b).c = c;
                        final int a2 = w4j.a;
                        atu2 = (atu)((h4j)atu$b).e();
                        return atu2;
                    }
                }
                Object next = null;
                continue;
            }
        }
        return atu2;
    }
    
    public final boolean b(final Integer n) {
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = -1;
        }
        final boolean b = n7t.b(intValue);
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (this.a.b("home_timeline_feedback_immediate_dismiss_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
}
