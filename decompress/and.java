import android.os.Bundle;
import android.content.res.Resources;
import android.net.Uri$Builder;
import com.twitter.util.user.UserIdentifier;
import android.content.pm.LabeledIntent;
import java.util.ArrayList;
import android.os.Build$VERSION;
import android.content.Intent;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class and implements zqa<Context, lwp, String, ksp, List<Intent>>
{
    public final Object a(final Object o, final Object o2, final Object o3, final Object o4) {
        final Context context = (Context)o;
        final lwp lwp = (lwp)o2;
        final String s = (String)o3;
        final ksp ksp = (ksp)o4;
        zzd.f((Object)context, "context");
        zzd.f((Object)lwp, "sharedItem");
        zzd.f((Object)s, "sessionToken");
        zzd.f((Object)ksp, "config");
        v2a c0;
        if (Build$VERSION.SDK_INT >= 29) {
            c0 = v2a.C0;
        }
        else {
            final ArrayList<LabeledIntent> list = new ArrayList<LabeledIntent>();
            final boolean b = lwp instanceof kxp;
            if ((!b || ksp.a) && UserIdentifier.Companion.c().isRegularUser()) {
                final Resources resources = context.getResources();
                zzd.e((Object)resources, "context.resources");
                final mwp a = lwp.c(resources).a(11, s);
                String s2;
                if (b) {
                    s2 = "share_via_dm";
                }
                else {
                    s2 = "dm_conversation";
                }
                final Intent setDataAndType = new Intent("android.intent.action.VIEW").setPackage(context.getPackageName()).setDataAndType(new Uri$Builder().scheme("twitter").authority(s2).build(), "text/plain");
                zzd.e((Object)setDataAndType, "Intent(Intent.ACTION_VIE\u2026.TEXT_PLAIN\n            )");
                if (b) {
                    yvj.c(setDataAndType, "quoted_tweet", (Object)new evl(((kxp)lwp).D0), (alp)evl.J);
                }
                else {
                    setDataAndType.putExtra("android.intent.extra.TEXT", a.d);
                }
                final Intent setData = new Intent().setComponent(setDataAndType.resolveActivity(context.getPackageManager())).setData(setDataAndType.getData());
                final Bundle extras = setDataAndType.getExtras();
                zzd.c((Object)extras);
                list.add(new LabeledIntent(setData.putExtras(extras), context.getPackageName(), 2131954504, 0));
            }
            c0 = (v2a)list;
        }
        return c0;
    }
}
