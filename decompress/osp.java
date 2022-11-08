import android.content.res.Resources;
import android.os.Parcelable;
import java.util.Collection;
import android.app.PendingIntent;
import com.twitter.share.scribe.ShareBroadcastReceiver;
import android.os.Build$VERSION;
import android.content.ComponentName;
import android.os.Bundle;
import android.content.Intent;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osp implements msp
{
    public final zqa<Context, lwp, String, ksp, List<Intent>> a;
    public final yqa<Context, lwp, String, Bundle> b;
    public final bra<Intent, ComponentName[]> c;
    public final gtp d;
    
    public osp(final zqa<Context, lwp, String, ksp, List<Intent>> a, final yqa<Context, lwp, String, Bundle> b, final bra<Intent, ComponentName[]> c, final gtp d) {
        zzd.f((Object)a, "initialIntentsFactory");
        zzd.f((Object)b, "replacementExtrasFactory");
        zzd.f((Object)c, "excludeComponentsFactory");
        zzd.f((Object)d, "shareSessionTokenRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Intent a(final Context context, final lwp lwp, final sba sba, final ksp ksp, final List<? extends lev> list) {
        zzd.f((Object)context, "context");
        zzd.f((Object)lwp, "sharedItem");
        zzd.f((Object)sba, "scribePrefix");
        zzd.f((Object)ksp, "config");
        zzd.f((Object)list, "additionalItems");
        final String c = this.d.c();
        final Resources resources = context.getResources();
        zzd.e((Object)resources, "context.resources");
        final Intent putExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", lwp.c(resources).a(9, c).b);
        zzd.e((Object)putExtra, "Intent(Intent.ACTION_SEN\u2026nt.EXTRA_TEXT, shareText)");
        final Resources resources2 = context.getResources();
        zzd.e((Object)resources2, "context.resources");
        final String string = resources2.getString(2131959226);
        zzd.e((Object)string, "res.getString(R.string.tweets_share_status)");
        final int sdk_INT = Build$VERSION.SDK_INT;
        Intent intent2;
        if (sdk_INT >= 22) {
            final Intent intent = new Intent(context, (Class)ShareBroadcastReceiver.class);
            final Integer b = lwp.b();
            if (b != null) {
                intent.putExtra("item_type", b.intValue());
            }
            final Long a = lwp.a();
            if (a != null) {
                intent.putExtra("id", a.longValue());
            }
            yvj.c(intent, "scribe_prefix", (Object)sba, (alp)sba.d);
            yvj.c(intent, "additional_scribe_items", (Object)list, (alp)new xq4$a((alp)lev.w1));
            int n = 134217728;
            if (sdk_INT >= 31) {
                n = 167772160;
            }
            intent2 = Intent.createChooser(putExtra, (CharSequence)string, PendingIntent.getBroadcast(context, 1, intent, n).getIntentSender());
        }
        else {
            intent2 = Intent.createChooser(putExtra, (CharSequence)string);
        }
        if (ksp.b) {
            intent2.addFlags(268435456);
        }
        final Object a2 = this.a.a((Object)context, (Object)lwp, (Object)c, (Object)ksp);
        zzd.e(a2, "initialIntentsFactory.cr\u2026em, sessionToken, config)");
        final Object[] array = ((Collection)a2).toArray(new Intent[0]);
        zzd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])array);
        intent2.putExtra("android.intent.extra.REPLACEMENT_EXTRAS", (Bundle)this.b.a((Object)context, (Object)lwp, (Object)c));
        if (sdk_INT >= 24) {
            intent2.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (Parcelable[])this.c.a((Object)putExtra));
        }
        return intent2;
    }
    
    public final void b(final Context context, final lwp lwp, final sba sba, final ksp ksp, final List<? extends lev> list) {
        zzd.f((Object)context, "context");
        zzd.f((Object)lwp, "sharedItem");
        zzd.f((Object)sba, "scribePrefix");
        zzd.f((Object)ksp, "config");
        zzd.f((Object)list, "additionalItems");
        context.startActivity(this.a(context, lwp, sba, ksp, list));
    }
}
