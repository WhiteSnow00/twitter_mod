import android.os.BaseBundle;
import androidx.fragment.app.Fragment$InstantiationException;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import android.content.Intent;
import android.app.Dialog;
import kotlin.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006" }, d2 = { "Lcvh;", "Lpl;", "Lxv8;", "<init>", "()V", "a", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class cvh extends pl implements xv8
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public cvh() {
        ((wk1)this).U1 = (xv8)this;
        final int a = c5j.a;
    }
    
    public final xk1 h2() {
        return (xk1)new dvh(((Fragment)this).J0);
    }
    
    public final void k0(final Dialog dialog, int b, int m0) {
        czd.f((Object)dialog, "dialog");
        final dvh dvh = new dvh(((Fragment)this).J0);
        final Object j = ((tlp)dvh).j();
        czd.e(j, "args.viewOptions");
        final tl a = ((dm)j).a(m0);
        final Intent intent = new Intent();
        final Bundle a2 = ((vl1)dvh).a;
        final qo7.b w = qo7.w;
        final Object f = dwj.f(a2, "dm_inbox_item", (rlp)w);
        czd.d(f, "null cannot be cast to non-null type com.twitter.model.dm.DMInboxItem");
        dwj.c(intent, "dm_inbox_item", (Object)f, (rlp)w);
        final Bundle a3 = ((vl1)dvh).a;
        final cgv$d n1 = cgv.N1;
        dwj.c(intent, "recipient_user", (Object)dwj.f(a3, "recipient_user", (rlp)n1), (rlp)n1);
        intent.putExtra("dm_inbox_item_position", ((BaseBundle)((vl1)dvh).a).getInt("dm_inbox_item_position"));
        final Fragment y0 = ((Fragment)this).Y0(true);
        if (y0 != null) {
            final oob a4 = oob.a;
            final GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation((Fragment)this);
            final oob a5 = oob.a;
            oob.c((Violation)getTargetFragmentRequestCodeUsageViolation);
            final oob$c a6 = oob.a((Fragment)this);
            if (a6.a.contains(oob$a.J0) && oob.f(a6, (Class)cvh.class, (Class)GetTargetFragmentRequestCodeUsageViolation.class)) {
                oob.b(a6, (Violation)getTargetFragmentRequestCodeUsageViolation);
            }
            m0 = ((Fragment)this).M0;
            if (a != null) {
                b = a.b;
            }
            else {
                b = 0;
            }
            y0.h1(m0, b, intent);
        }
    }
    
    public static final class a
    {
        public final cvh a(final Context context, final qo7 qo7, final boolean b, final cgv cgv, final int n) {
            czd.f((Object)context, "context");
            czd.f((Object)qo7, "dmInboxItem");
            final dm$a l = dm.l;
            final Bundle a = nh.A("twitter:id", 80);
            final dm$b dm$b = new dm$b();
            if (!b) {
                String s;
                if (qo7.g) {
                    s = context.getString(2131955071);
                }
                else {
                    s = context.getString(2131955068);
                }
                czd.e((Object)s, "if (isGroup) context.get\u2026sages_leave_conversation)");
                final String string = context.getString(2131955069);
                czd.e((Object)string, "context.getString(Common\u2026onversation_confirmation)");
                final tl$b tl$b = new tl$b(2131232513, s);
                tl$b.f = string;
                tl$b.b = 2131099845;
                dm$b.o((tl)((n4j)tl$b).e());
            }
            if (!qo7.g) {
                czd.c((Object)cgv);
                if (chw.Y(cgv.I1)) {
                    final String string2 = context.getString(2131953501, new Object[] { cgv.K0 });
                    czd.e((Object)string2, "context.getString(R.stri\u2026_name_action, userHandle)");
                    dm$b.o(new tl(2131232273, 5, string2, "", 0, (String)null, (String)null, 2032));
                }
                else {
                    final String string3 = context.getString(2131952215, new Object[] { cgv.K0 });
                    czd.e((Object)string3, "context.getString(Common\u2026_user_handle, userHandle)");
                    final String string4 = context.getString(2131952204);
                    czd.e((Object)string4, "context.getString(Common\u2026string.block_description)");
                    dm$b.o(new tl(2131232273, 1, string3, string4, 0, (String)null, (String)null, 2032));
                }
            }
            String k0;
            if (cgv != null) {
                k0 = cgv.K0;
            }
            else {
                k0 = null;
            }
            String s2;
            if (k0 == null) {
                s2 = context.getString(2131953389);
            }
            else {
                s2 = context.getString(2131957140, new Object[] { k0 });
            }
            czd.e((Object)s2, "if (userHandle == null) \u2026_user_handle, userHandle)");
            final String string5 = context.getString(2131957121);
            czd.e((Object)string5, "context.getString(Common\u2026tring.report_description)");
            dm$b.o(new tl(2131232086, 2, s2, string5, 0, (String)null, (String)null, 2032));
            dwj.k(a, "serializer_fragment_arg", (Object)((n4j)dm$b).e(), (rlp)l);
            final int a2 = c5j.a;
            dwj.k(a, "dm_inbox_item", (Object)qo7, (rlp)qo7.w);
            dwj.k(a, "recipient_user", (Object)cgv, (rlp)cgv.N1);
            ((BaseBundle)a).putInt("dm_inbox_item_position", n);
            if (((BaseBundle)a).containsKey("twitter:id")) {
                final cvh cvh = new cvh();
                ((Fragment)cvh).N1(a);
                return cvh;
            }
            throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
        }
    }
}
