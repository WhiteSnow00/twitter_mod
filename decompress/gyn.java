import android.widget.TextView;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyn extends gue implements rtb<qzn, oyv>
{
    public final /* synthetic */ qxn C0;
    
    public gyn(final qxn c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qzn qzn = (qzn)o;
        zzd.f((Object)qzn, "$this$distinct");
        final Long m = qzn.m;
        if (m != null) {
            final qxn c0 = this.C0;
            final long longValue = m.longValue();
            final StringBuilder text = new StringBuilder();
            Objects.requireNonNull(c0);
            final t3s a = mq1.a;
            String s;
            if (System.currentTimeMillis() - longValue >= 604800000L) {
                s = c0.C0.getResources().getString(2131956957, new Object[] { hqs.o(c0.C0.getResources(), longValue) });
                zzd.e((Object)s, "{\n            // Display\u2026,\n            )\n        }");
            }
            else {
                s = c0.C0.getResources().getString(2131956958, new Object[] { hqs.q(c0.C0.getResources(), longValue) });
                zzd.e((Object)s, "{\n            rootView.r\u2026,\n            )\n        }");
            }
            text.append(s);
            if (qzn.H > 0L) {
                text.append(" \u2022 ");
                text.append(c0.C0.getResources().getString(2131956954, new Object[] { j2d.h(c0.C0.getResources(), qzn.H, true) }));
            }
            ((TextView)c0.e1).setText((CharSequence)text);
        }
        return oyv.a;
    }
}
